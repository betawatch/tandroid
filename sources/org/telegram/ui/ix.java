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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ix extends zt0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ cy b;

    public ix(cy cyVar, boolean[] zArr) {
        this.b = cyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final CharSequence C(int i10) {
        cy cyVar = this.b;
        if (i10 < 0 || i10 >= cyVar.D2.size() || !((MediaController.PhotoEntry) cyVar.D2.get(i10)).isVideo) {
            return cy.p2(cyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void D() {
        int i10;
        cy cyVar = this.b;
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        if (jr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            jr0Var.i(i10, cyVar.D2);
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        cy cyVar = this.b;
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        org.telegram.ui.Components.w9 f7 = jr0Var != null ? jr0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = cyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.k = f7.getScaleX();
        ju0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ju0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean I() {
        return this.b.l3();
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final long a() {
        cy cyVar = this.b;
        if (cyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) cyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean b() {
        cy cyVar = this.b;
        if (cyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = cyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || cyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final CharSequence c0(int i10) {
        cy cyVar = this.b;
        ArrayList arrayList = cyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = cyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) cyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = cyVar.D2;
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void e(CharSequence charSequence) {
        cy cyVar = this.b;
        mw mwVar = cyVar.B1;
        if (mwVar != null) {
            mwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cyVar.D2;
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean h() {
        TLRPC.User user;
        cy cyVar = this.b;
        if (cyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = cyVar.getMessagesController();
        ArrayList arrayList = cyVar.I2;
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.jr0 jr0Var = this.b.G2;
        org.telegram.ui.Components.w9 f7 = jr0Var != null ? jr0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        cy cyVar = this.b;
        ArrayList arrayList2 = cyVar.I2;
        if (cyVar.B1 != null && (arrayList = cyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) cyVar.D2.get(0);
            mw mwVar = cyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            mwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        if (jr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            jr0Var.i(i13, cyVar.D2);
        }
        if ((z10 && i11 == 0 && !z11) || cyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        cyVar.J2 = z10;
        cyVar.K2 = i11;
        cyVar.M2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        cyVar.C2.w(cyVar, arrayList3, cyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void s() {
        mw mwVar;
        org.telegram.ui.Components.kd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        cy cyVar = this.b;
        if (charSequence != null && (mwVar = cyVar.B1) != null) {
            mwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cyVar.D2;
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
