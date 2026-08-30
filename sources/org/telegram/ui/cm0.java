package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cm0 extends yt0 {
    public final /* synthetic */ dn0 a;

    public cm0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void B(int i10) {
        dn0 dn0Var = this.a;
        int i11 = dn0Var.P0;
        SecureDocument secureDocument = i11 == 1 ? dn0Var.g1 : i11 == 4 ? (SecureDocument) dn0Var.h1.get(i10) : i11 == 2 ? dn0Var.i1 : i11 == 3 ? dn0Var.j1 : (SecureDocument) dn0Var.f1.get(i10);
        bn0 bn0Var = (bn0) dn0Var.k1.remove(secureDocument);
        if (bn0Var == null) {
            return;
        }
        String n12 = dn0.n1(secureDocument);
        int i12 = dn0Var.P0;
        String str = null;
        if (i12 == 1) {
            dn0Var.g1 = null;
            str = vh.v2.e("selfie", n12);
        } else if (i12 == 4) {
            str = vh.v2.e("translation", n12);
        } else if (i12 == 2) {
            dn0Var.i1 = null;
            str = vh.v2.e("front", n12);
        } else if (i12 == 3) {
            dn0Var.j1 = null;
            str = vh.v2.e("reverse", n12);
        } else if (i12 == 0) {
            str = vh.v2.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = dn0Var.u1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = dn0Var.v1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        dn0Var.S1(dn0Var.P0);
        dn0Var.f0.removeView(bn0Var);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 < 0) {
            return null;
        }
        dn0 dn0Var = this.a;
        if (i10 >= dn0Var.f0.getChildCount()) {
            return null;
        }
        bn0 bn0Var = (bn0) dn0Var.f0.getChildAt(i10);
        int[] iArr = new int[2];
        bn0Var.c.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = dn0Var.f0;
        ImageReceiver imageReceiver = bn0Var.c.getImageReceiver();
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        return ju0Var;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final String a0() {
        return this.a.P0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
