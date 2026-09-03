package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class em0 extends fu0 {
    public final /* synthetic */ fn0 a;

    public em0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void B(int i10) {
        fn0 fn0Var = this.a;
        int i11 = fn0Var.P0;
        SecureDocument secureDocument = i11 == 1 ? fn0Var.g1 : i11 == 4 ? (SecureDocument) fn0Var.h1.get(i10) : i11 == 2 ? fn0Var.i1 : i11 == 3 ? fn0Var.j1 : (SecureDocument) fn0Var.f1.get(i10);
        dn0 dn0Var = (dn0) fn0Var.k1.remove(secureDocument);
        if (dn0Var == null) {
            return;
        }
        String n12 = fn0.n1(secureDocument);
        int i12 = fn0Var.P0;
        String str = null;
        if (i12 == 1) {
            fn0Var.g1 = null;
            str = vh.w2.e("selfie", n12);
        } else if (i12 == 4) {
            str = vh.w2.e("translation", n12);
        } else if (i12 == 2) {
            fn0Var.i1 = null;
            str = vh.w2.e("front", n12);
        } else if (i12 == 3) {
            fn0Var.j1 = null;
            str = vh.w2.e("reverse", n12);
        } else if (i12 == 0) {
            str = vh.w2.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = fn0Var.u1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = fn0Var.v1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        fn0Var.S1(fn0Var.P0);
        fn0Var.f0.removeView(dn0Var);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 < 0) {
            return null;
        }
        fn0 fn0Var = this.a;
        if (i10 >= fn0Var.f0.getChildCount()) {
            return null;
        }
        dn0 dn0Var = (dn0) fn0Var.f0.getChildAt(i10);
        int[] iArr = new int[2];
        dn0Var.c.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = fn0Var.f0;
        ImageReceiver imageReceiver = dn0Var.c.getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        return qu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final String a0() {
        return this.a.P0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
