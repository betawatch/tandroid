package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lk0 extends yr0 {
    public final /* synthetic */ ll0 a;

    public lk0(ll0 ll0Var) {
        this.a = ll0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void B(int i10) {
        ll0 ll0Var = this.a;
        int i11 = ll0Var.S0;
        org.telegram.messenger.pw pwVar = i11 == 1 ? ll0Var.j1 : i11 == 4 ? (org.telegram.messenger.pw) ll0Var.k1.get(i10) : i11 == 2 ? ll0Var.l1 : i11 == 3 ? ll0Var.m1 : (org.telegram.messenger.pw) ll0Var.i1.get(i10);
        jl0 jl0Var = (jl0) ll0Var.n1.remove(pwVar);
        if (jl0Var == null) {
            return;
        }
        String q12 = ll0.q1(pwVar);
        int i12 = ll0Var.S0;
        String str = null;
        if (i12 == 1) {
            ll0Var.j1 = null;
            str = sc.e.h("selfie", q12);
        } else if (i12 == 4) {
            str = sc.e.h("translation", q12);
        } else if (i12 == 2) {
            ll0Var.l1 = null;
            str = sc.e.h("front", q12);
        } else if (i12 == 3) {
            ll0Var.m1 = null;
            str = sc.e.h("reverse", q12);
        } else if (i12 == 0) {
            str = sc.e.h("files", q12);
        }
        if (str != null) {
            HashMap hashMap = ll0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ll0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ll0Var.W1(ll0Var.S0);
        ll0Var.i0.removeView(jl0Var);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        ll0 ll0Var = this.a;
        if (i10 >= ll0Var.i0.getChildCount()) {
            return null;
        }
        jl0 jl0Var = (jl0) ll0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        jl0Var.c.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = ll0Var.i0;
        ImageReceiver imageReceiver = jl0Var.c.getImageReceiver();
        gs0Var.a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        return gs0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final String b0() {
        return this.a.S0 == 1 ? org.telegram.messenger.cd.a0("PassportDeleteSelfieAlert", null, 2131747597, new Object[0]) : org.telegram.messenger.cd.a0("PassportDeleteScanAlert", null, 2131747599, new Object[0]);
    }
}
