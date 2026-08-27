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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mx extends st0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ gy b;

    public mx(gy gyVar, boolean[] zArr) {
        this.b = gyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final CharSequence C(int i10) {
        gy gyVar = this.b;
        if (i10 < 0 || i10 >= gyVar.z2.size() || !((MediaController.PhotoEntry) gyVar.z2.get(i10)).isVideo) {
            return gy.s2(gyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        int i10;
        gy gyVar = this.b;
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        if (xp0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            xp0Var.i(i10, gyVar.z2);
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        gy gyVar = this.b;
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        org.telegram.ui.Components.n9 f10 = xp0Var != null ? xp0Var.f(i10) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = gyVar.C2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        cu0Var.a = imageReceiver;
        cu0Var.e = imageReceiver.getBitmapSafe();
        cu0Var.k = f10.getScaleX();
        cu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return cu0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final long a() {
        gy gyVar = this.b;
        if (gyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) gyVar.E2.get(0)).longValue();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean b() {
        gy gyVar = this.b;
        if (gyVar.E2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = gyVar.E2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || gyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final CharSequence b0(int i10) {
        gy gyVar = this.b;
        ArrayList arrayList = gyVar.z2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = gyVar.z2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) gyVar.z2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = gyVar.z2;
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void e(CharSequence charSequence) {
        gy gyVar = this.b;
        rw rwVar = gyVar.x1;
        if (rwVar != null) {
            rwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = gyVar.z2;
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean h() {
        TLRPC.User user;
        gy gyVar = this.b;
        if (gyVar.E2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = gyVar.getMessagesController();
        ArrayList arrayList = gyVar.E2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (!DialogObject.isUserDialog(l10.longValue()) || (user = messagesController.getUser(l10)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.xp0 xp0Var = this.b.C2;
        org.telegram.ui.Components.n9 f10 = xp0Var != null ? xp0Var.f(i10) : null;
        if (f10 != null) {
            return f10.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        gy gyVar = this.b;
        ArrayList arrayList2 = gyVar.E2;
        if (gyVar.x1 != null && (arrayList = gyVar.z2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) gyVar.z2.get(0);
            rw rwVar = gyVar.x1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            rwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        if (xp0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            xp0Var.i(i13, gyVar.z2);
        }
        if ((z10 && i11 == 0) || gyVar.y2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        gyVar.F2 = z10;
        gyVar.G2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        gyVar.y2.w(gyVar, arrayList3, gyVar.x1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void s() {
        rw rwVar;
        org.telegram.ui.Components.xc f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        gy gyVar = this.b;
        if (charSequence != null && (rwVar = gyVar.x1) != null) {
            rwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = gyVar.z2;
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
