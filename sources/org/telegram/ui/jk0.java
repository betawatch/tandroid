package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jk0 extends xr0 {
    public final /* synthetic */ jl0 a;

    public jk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void B(int i10) {
        jl0 jl0Var = this.a;
        int i11 = jl0Var.S0;
        org.telegram.messenger.qw qwVar = i11 == 1 ? jl0Var.j1 : i11 == 4 ? (org.telegram.messenger.qw) jl0Var.k1.get(i10) : i11 == 2 ? jl0Var.l1 : i11 == 3 ? jl0Var.m1 : (org.telegram.messenger.qw) jl0Var.i1.get(i10);
        hl0 hl0Var = (hl0) jl0Var.n1.remove(qwVar);
        if (hl0Var == null) {
            return;
        }
        String r12 = jl0.r1(qwVar);
        int i12 = jl0Var.S0;
        String str = null;
        if (i12 == 1) {
            jl0Var.j1 = null;
            str = sc.e.h("selfie", r12);
        } else if (i12 == 4) {
            str = sc.e.h("translation", r12);
        } else if (i12 == 2) {
            jl0Var.l1 = null;
            str = sc.e.h("front", r12);
        } else if (i12 == 3) {
            jl0Var.m1 = null;
            str = sc.e.h("reverse", r12);
        } else if (i12 == 0) {
            str = sc.e.h("files", r12);
        }
        if (str != null) {
            HashMap hashMap = jl0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = jl0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        jl0Var.X1(jl0Var.S0);
        jl0Var.i0.removeView(hl0Var);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        jl0 jl0Var = this.a;
        if (i10 >= jl0Var.i0.getChildCount()) {
            return null;
        }
        hl0 hl0Var = (hl0) jl0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        hl0Var.c.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = jl0Var.i0;
        ImageReceiver imageReceiver = hl0Var.c.getImageReceiver();
        fs0Var.a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        return fs0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final String b0() {
        return this.a.S0 == 1 ? org.telegram.messenger.dd.a0("PassportDeleteSelfieAlert", null, 2131747597, new Object[0]) : org.telegram.messenger.dd.a0("PassportDeleteScanAlert", null, 2131747599, new Object[0]);
    }
}
