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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lx extends pt0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ fy b;

    public lx(fy fyVar, boolean[] zArr) {
        this.b = fyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final CharSequence C(int i10) {
        fy fyVar = this.b;
        if (i10 < 0 || i10 >= fyVar.z2.size() || !((MediaController.PhotoEntry) fyVar.z2.get(i10)).isVideo) {
            return fy.s2(fyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void D() {
        int i10;
        fy fyVar = this.b;
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            iq0Var.i(i10, fyVar.z2);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fy fyVar = this.b;
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        org.telegram.ui.Components.t9 f9 = iq0Var != null ? iq0Var.f(i10) : null;
        if (f9 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f9.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = fyVar.C2;
        ImageReceiver imageReceiver = f9.getImageReceiver();
        zt0Var.a = imageReceiver;
        zt0Var.e = imageReceiver.getBitmapSafe();
        zt0Var.k = f9.getScaleX();
        zt0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final long a() {
        fy fyVar = this.b;
        if (fyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) fyVar.E2.get(0)).longValue();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean b() {
        fy fyVar = this.b;
        if (fyVar.E2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = fyVar.E2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || fyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final CharSequence b0(int i10) {
        fy fyVar = this.b;
        ArrayList arrayList = fyVar.z2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = fyVar.z2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) fyVar.z2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = fyVar.z2;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void e(CharSequence charSequence) {
        fy fyVar = this.b;
        qw qwVar = fyVar.x1;
        if (qwVar != null) {
            qwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = fyVar.z2;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean h() {
        TLRPC.User user;
        fy fyVar = this.b;
        if (fyVar.E2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = fyVar.getMessagesController();
        ArrayList arrayList = fyVar.E2;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.iq0 iq0Var = this.b.C2;
        org.telegram.ui.Components.t9 f9 = iq0Var != null ? iq0Var.f(i10) : null;
        if (f9 != null) {
            return f9.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        fy fyVar = this.b;
        ArrayList arrayList2 = fyVar.E2;
        if (fyVar.x1 != null && (arrayList = fyVar.z2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) fyVar.z2.get(0);
            qw qwVar = fyVar.x1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            qwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            iq0Var.i(i13, fyVar.z2);
        }
        if ((z10 && i11 == 0) || fyVar.y2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        fyVar.F2 = z10;
        fyVar.G2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        fyVar.y2.v(fyVar, arrayList3, fyVar.x1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void s() {
        qw qwVar;
        org.telegram.ui.Components.ed f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        fy fyVar = this.b;
        if (charSequence != null && (qwVar = fyVar.x1) != null) {
            qwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = fyVar.z2;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
