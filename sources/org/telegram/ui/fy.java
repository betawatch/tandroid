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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fy extends zu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ yy b;

    public fy(yy yyVar, boolean[] zArr) {
        this.b = yyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final CharSequence C(int i10) {
        yy yyVar = this.b;
        if (i10 < 0 || i10 >= yyVar.D2.size() || !((MediaController.PhotoEntry) yyVar.D2.get(i10)).isVideo) {
            return yy.p2(yyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void D() {
        int i10;
        yy yyVar = this.b;
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            nr0Var.i(i10, yyVar.D2);
        }
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        yy yyVar = this.b;
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        org.telegram.ui.Components.z9 f7 = nr0Var != null ? nr0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = yyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        jv0Var.a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.k = f7.getScaleX();
        jv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return jv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean I() {
        return this.b.l3();
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final long a() {
        yy yyVar = this.b;
        if (yyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) yyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean b() {
        yy yyVar = this.b;
        if (yyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = yyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || yyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final CharSequence c0(int i10) {
        yy yyVar = this.b;
        ArrayList arrayList = yyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = yyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) yyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = yyVar.D2;
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

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void e(CharSequence charSequence) {
        yy yyVar = this.b;
        ix ixVar = yyVar.B1;
        if (ixVar != null) {
            ixVar.setFieldText(charSequence);
        }
        ArrayList arrayList = yyVar.D2;
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

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean h() {
        TLRPC.User user;
        yy yyVar = this.b;
        if (yyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = yyVar.getMessagesController();
        ArrayList arrayList = yyVar.I2;
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

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.nr0 nr0Var = this.b.G2;
        org.telegram.ui.Components.z9 f7 = nr0Var != null ? nr0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        yy yyVar = this.b;
        ArrayList arrayList2 = yyVar.I2;
        if (yyVar.B1 != null && (arrayList = yyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) yyVar.D2.get(0);
            ix ixVar = yyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            ixVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            nr0Var.i(i13, yyVar.D2);
        }
        if ((z10 && i11 == 0 && !z11) || yyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        yyVar.J2 = z10;
        yyVar.K2 = i11;
        yyVar.M2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        yyVar.C2.w(yyVar, arrayList3, yyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void s() {
        ix ixVar;
        org.telegram.ui.Components.md f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        yy yyVar = this.b;
        if (charSequence != null && (ixVar = yyVar.B1) != null) {
            ixVar.setFieldText(charSequence);
        }
        ArrayList arrayList = yyVar.D2;
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

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
