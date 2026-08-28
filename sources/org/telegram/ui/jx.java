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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jx extends rt0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ dy b;

    public jx(dy dyVar, boolean[] zArr) {
        this.b = dyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final CharSequence C(int i9) {
        dy dyVar = this.b;
        if (i9 < 0 || i9 >= dyVar.z2.size() || !((MediaController.PhotoEntry) dyVar.z2.get(i9)).isVideo) {
            return dy.s2(dyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        int i9;
        dy dyVar = this.b;
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            wp0Var.i(i9, dyVar.z2);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        dy dyVar = this.b;
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        org.telegram.ui.Components.o9 f10 = wp0Var != null ? wp0Var.f(i9) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = dyVar.C2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        bu0Var.a = imageReceiver;
        bu0Var.e = imageReceiver.getBitmapSafe();
        bu0Var.k = f10.getScaleX();
        bu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final long a() {
        dy dyVar = this.b;
        if (dyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) dyVar.E2.get(0)).longValue();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean b() {
        dy dyVar = this.b;
        if (dyVar.E2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = dyVar.E2;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || dyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final CharSequence b0(int i9) {
        dy dyVar = this.b;
        ArrayList arrayList = dyVar.z2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = dyVar.z2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) dyVar.z2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = dyVar.z2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((MediaController.PhotoEntry) obj).isVideo) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]) : i11 == 0 ? LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]) : LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void e(CharSequence charSequence) {
        dy dyVar = this.b;
        ow owVar = dyVar.x1;
        if (owVar != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = dyVar.z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean h() {
        TLRPC.User user;
        dy dyVar = this.b;
        if (dyVar.E2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = dyVar.getMessagesController();
        ArrayList arrayList = dyVar.E2;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Long l10 = (Long) obj;
            if (!DialogObject.isUserDialog(l10.longValue()) || (user = messagesController.getUser(l10)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Components.wp0 wp0Var = this.b.C2;
        org.telegram.ui.Components.o9 f10 = wp0Var != null ? wp0Var.f(i9) : null;
        if (f10 != null) {
            return f10.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        dy dyVar = this.b;
        ArrayList arrayList2 = dyVar.E2;
        if (dyVar.x1 != null && (arrayList = dyVar.z2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) dyVar.z2.get(0);
            ow owVar = dyVar.x1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            owVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            wp0Var.i(i12, dyVar.z2);
        }
        if ((z10 && i10 == 0) || dyVar.y2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().F0(true, false);
            return;
        }
        dyVar.F2 = z10;
        dyVar.G2 = i10;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.t1().F0(true, false);
        dyVar.y2.v(dyVar, arrayList3, dyVar.x1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void s() {
        ow owVar;
        org.telegram.ui.Components.ad f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        dy dyVar = this.b;
        if (charSequence != null && (owVar = dyVar.x1) != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = dyVar.z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean x(int i9) {
        return this.a[i9];
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        return i9;
    }
}
