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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dy extends tu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ wy b;

    public dy(wy wyVar, boolean[] zArr) {
        this.b = wyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final CharSequence C(int i10) {
        wy wyVar = this.b;
        if (i10 < 0 || i10 >= wyVar.D2.size() || !((MediaController.PhotoEntry) wyVar.D2.get(i10)).isVideo) {
            return wy.s2(wyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void D() {
        int i10;
        wy wyVar = this.b;
        org.telegram.ui.Components.xq0 xq0Var = wyVar.G2;
        if (xq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
            xq0Var.i(i10, wyVar.D2);
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        wy wyVar = this.b;
        org.telegram.ui.Components.xq0 xq0Var = wyVar.G2;
        org.telegram.ui.Components.w9 f7 = xq0Var != null ? xq0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = wyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.k = f7.getScaleX();
        ev0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ev0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final long a() {
        wy wyVar = this.b;
        if (wyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) wyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean b() {
        wy wyVar = this.b;
        if (wyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = wyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || wyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final CharSequence b0(int i10) {
        wy wyVar = this.b;
        ArrayList arrayList = wyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = wyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) wyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = wyVar.D2;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void e(CharSequence charSequence) {
        wy wyVar = this.b;
        gx gxVar = wyVar.B1;
        if (gxVar != null) {
            gxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wyVar.D2;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean h() {
        TLRPC.User user;
        wy wyVar = this.b;
        if (wyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = wyVar.getMessagesController();
        ArrayList arrayList = wyVar.I2;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.xq0 xq0Var = this.b.G2;
        org.telegram.ui.Components.w9 f7 = xq0Var != null ? xq0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        wy wyVar = this.b;
        ArrayList arrayList2 = wyVar.I2;
        if (wyVar.B1 != null && (arrayList = wyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) wyVar.D2.get(0);
            gx gxVar = wyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            gxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.xq0 xq0Var = wyVar.G2;
        if (xq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
            xq0Var.i(i13, wyVar.D2);
        }
        if ((z10 && i11 == 0) || wyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        wyVar.J2 = z10;
        wyVar.K2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        wyVar.C2.v(wyVar, arrayList3, wyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void s() {
        gx gxVar;
        org.telegram.ui.Components.jd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        wy wyVar = this.b;
        if (charSequence != null && (gxVar = wyVar.B1) != null) {
            gxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wyVar.D2;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
