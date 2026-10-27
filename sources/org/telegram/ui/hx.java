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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hx extends iu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ ey b;

    public hx(ey eyVar, boolean[] zArr) {
        this.b = eyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final CharSequence C(int i10) {
        ey eyVar = this.b;
        if (i10 < 0 || i10 >= eyVar.D2.size() || !((MediaController.PhotoEntry) eyVar.D2.get(i10)).isVideo) {
            return ey.t2(eyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void D() {
        int i10;
        ey eyVar = this.b;
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            rr0Var.i(i10, eyVar.D2);
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ey eyVar = this.b;
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        org.telegram.ui.Components.y9 f7 = rr0Var != null ? rr0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        su0 su0Var = new su0();
        su0Var.b = iArr[0];
        su0Var.c = iArr[1];
        su0Var.d = eyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        su0Var.a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        su0Var.k = f7.getScaleX();
        su0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return su0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean I() {
        return this.b.u3();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final long a() {
        ey eyVar = this.b;
        if (eyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) eyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean b() {
        ey eyVar = this.b;
        if (eyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = eyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || eyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final CharSequence c0(int i10) {
        ey eyVar = this.b;
        ArrayList arrayList = eyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = eyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) eyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = eyVar.D2;
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

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void e(CharSequence charSequence) {
        ey eyVar = this.b;
        lw lwVar = eyVar.B1;
        if (lwVar != null) {
            lwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = eyVar.D2;
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

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean h() {
        TLRPC.User user;
        ey eyVar = this.b;
        if (eyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = eyVar.getMessagesController();
        ArrayList arrayList = eyVar.I2;
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

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.rr0 rr0Var = this.b.G2;
        org.telegram.ui.Components.y9 f7 = rr0Var != null ? rr0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ey eyVar = this.b;
        ArrayList arrayList2 = eyVar.I2;
        if (eyVar.B1 != null && (arrayList = eyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) eyVar.D2.get(0);
            lw lwVar = eyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            lwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            rr0Var.i(i13, eyVar.D2);
        }
        if ((z10 && i11 == 0 && !z11) || eyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.v1().H0(true, false);
            return;
        }
        eyVar.J2 = z10;
        eyVar.K2 = i11;
        eyVar.M2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.v1().H0(true, false);
        eyVar.C2.v(eyVar, arrayList3, eyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void s() {
        lw lwVar;
        org.telegram.ui.Components.jd h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        ey eyVar = this.b;
        if (charSequence != null && (lwVar = eyVar.B1) != null) {
            lwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = eyVar.D2;
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

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
