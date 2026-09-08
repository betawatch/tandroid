package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ay extends su0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ uy b;

    public ay(uy uyVar, boolean[] zArr) {
        this.b = uyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final CharSequence C(int i10) {
        uy uyVar = this.b;
        if (i10 < 0 || i10 >= uyVar.D2.size() || !((MediaController.PhotoEntry) uyVar.D2.get(i10)).isVideo) {
            return uy.s2(uyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        int i10;
        uy uyVar = this.b;
        org.telegram.ui.Components.mq0 mq0Var = uyVar.G2;
        if (mq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            mq0Var.i(i10, uyVar.D2);
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        uy uyVar = this.b;
        org.telegram.ui.Components.mq0 mq0Var = uyVar.G2;
        org.telegram.ui.Components.x9 f7 = mq0Var != null ? mq0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = uyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        cv0Var.a = imageReceiver;
        cv0Var.e = imageReceiver.getBitmapSafe();
        cv0Var.k = f7.getScaleX();
        cv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return cv0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final long a() {
        uy uyVar = this.b;
        if (uyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) uyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean b() {
        uy uyVar = this.b;
        if (uyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = uyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || uyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final CharSequence b0(int i10) {
        uy uyVar = this.b;
        ArrayList arrayList = uyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = uyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) uyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = uyVar.D2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((MediaController.PhotoEntry) obj).isVideo) {
                i11++;
            } else {
                i12++;
            }
        }
        return i11 == 0 ? LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]) : i12 == 0 ? LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]) : LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void e(CharSequence charSequence) {
        uy uyVar = this.b;
        ex exVar = uyVar.B1;
        if (exVar != null) {
            exVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uyVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean h() {
        TLRPC.User user;
        uy uyVar = this.b;
        if (uyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = uyVar.getMessagesController();
        ArrayList arrayList = uyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (!DialogObject.isUserDialog(l4.longValue()) || (user = messagesController.getUser(l4)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.mq0 mq0Var = this.b.G2;
        org.telegram.ui.Components.x9 f7 = mq0Var != null ? mq0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        uy uyVar = this.b;
        ArrayList arrayList2 = uyVar.I2;
        if (uyVar.B1 != null && (arrayList = uyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) uyVar.D2.get(0);
            ex exVar = uyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            exVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.mq0 mq0Var = uyVar.G2;
        if (mq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            mq0Var.i(i13, uyVar.D2);
        }
        if ((z10 && i11 == 0) || uyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        uyVar.J2 = z10;
        uyVar.K2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        uyVar.C2.u(uyVar, arrayList3, uyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void s() {
        ex exVar;
        org.telegram.ui.Components.ld f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        uy uyVar = this.b;
        if (charSequence != null && (exVar = uyVar.B1) != null) {
            exVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uyVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
