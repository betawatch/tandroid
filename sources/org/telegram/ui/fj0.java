package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fj0 extends qq0 {
    public final /* synthetic */ ek0 a;

    public fj0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void B(int i7) {
        ek0 ek0Var = this.a;
        int i10 = ek0Var.S0;
        org.telegram.messenger.ew ewVar = i10 == 1 ? ek0Var.j1 : i10 == 4 ? (org.telegram.messenger.ew) ek0Var.k1.get(i7) : i10 == 2 ? ek0Var.l1 : i10 == 3 ? ek0Var.m1 : (org.telegram.messenger.ew) ek0Var.i1.get(i7);
        ck0 ck0Var = (ck0) ek0Var.n1.remove(ewVar);
        if (ck0Var == null) {
            return;
        }
        String r12 = ek0.r1(ewVar);
        int i11 = ek0Var.S0;
        String str = null;
        if (i11 == 1) {
            ek0Var.j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            ek0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            ek0Var.m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = ek0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ek0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ek0Var.X1(ek0Var.S0);
        ek0Var.i0.removeView(ck0Var);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 < 0) {
            return null;
        }
        ek0 ek0Var = this.a;
        if (i7 >= ek0Var.i0.getChildCount()) {
            return null;
        }
        ck0 ck0Var = (ck0) ek0Var.i0.getChildAt(i7);
        int[] iArr = new int[2];
        ck0Var.c.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = ek0Var.i0;
        ImageReceiver imageReceiver = ck0Var.c.getImageReceiver();
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        return zq0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final String b0() {
        return this.a.S0 == 1 ? org.telegram.messenger.id.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]) : org.telegram.messenger.id.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
