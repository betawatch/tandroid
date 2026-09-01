package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class em0 extends au0 {
    public final /* synthetic */ fn0 a;

    public em0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
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
            str = yh.k("selfie", n12);
        } else if (i12 == 4) {
            str = yh.k("translation", n12);
        } else if (i12 == 2) {
            fn0Var.i1 = null;
            str = yh.k("front", n12);
        } else if (i12 == 3) {
            fn0Var.j1 = null;
            str = yh.k("reverse", n12);
        } else if (i12 == 0) {
            str = yh.k("files", n12);
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

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
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
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = fn0Var.f0;
        ImageReceiver imageReceiver = dn0Var.c.getImageReceiver();
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        return lu0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final String a0() {
        return this.a.P0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
