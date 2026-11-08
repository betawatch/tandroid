package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cj0 extends nq0 {
    public final /* synthetic */ bk0 a;

    public cj0(bk0 bk0Var) {
        this.a = bk0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void B(int i7) {
        bk0 bk0Var = this.a;
        int i10 = bk0Var.S0;
        org.telegram.messenger.ew ewVar = i10 == 1 ? bk0Var.j1 : i10 == 4 ? (org.telegram.messenger.ew) bk0Var.k1.get(i7) : i10 == 2 ? bk0Var.l1 : i10 == 3 ? bk0Var.m1 : (org.telegram.messenger.ew) bk0Var.i1.get(i7);
        zj0 zj0Var = (zj0) bk0Var.n1.remove(ewVar);
        if (zj0Var == null) {
            return;
        }
        String r12 = bk0.r1(ewVar);
        int i11 = bk0Var.S0;
        String str = null;
        if (i11 == 1) {
            bk0Var.j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            bk0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            bk0Var.m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = bk0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = bk0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        bk0Var.X1(bk0Var.S0);
        bk0Var.i0.removeView(zj0Var);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 < 0) {
            return null;
        }
        bk0 bk0Var = this.a;
        if (i7 >= bk0Var.i0.getChildCount()) {
            return null;
        }
        zj0 zj0Var = (zj0) bk0Var.i0.getChildAt(i7);
        int[] iArr = new int[2];
        zj0Var.c.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = bk0Var.i0;
        ImageReceiver imageReceiver = zj0Var.c.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        return wq0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final String b0() {
        return this.a.S0 == 1 ? org.telegram.messenger.id.a0("PassportDeleteSelfieAlert", null, 2131747582, new Object[0]) : org.telegram.messenger.id.a0("PassportDeleteScanAlert", null, 2131747584, new Object[0]);
    }
}
