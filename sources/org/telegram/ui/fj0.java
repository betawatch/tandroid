package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fj0 extends mq0 {
    public final /* synthetic */ ek0 a;

    public fj0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void B(int i7) {
        ek0 ek0Var = this.a;
        int i10 = ek0Var.T0;
        org.telegram.messenger.cw cwVar = i10 == 1 ? ek0Var.k1 : i10 == 4 ? (org.telegram.messenger.cw) ek0Var.l1.get(i7) : i10 == 2 ? ek0Var.m1 : i10 == 3 ? ek0Var.n1 : (org.telegram.messenger.cw) ek0Var.j1.get(i7);
        ck0 ck0Var = (ck0) ek0Var.o1.remove(cwVar);
        if (ck0Var == null) {
            return;
        }
        String r12 = ek0.r1(cwVar);
        int i11 = ek0Var.T0;
        String str = null;
        if (i11 == 1) {
            ek0Var.k1 = null;
            str = r.b.k("selfie", r12);
        } else if (i11 == 4) {
            str = r.b.k("translation", r12);
        } else if (i11 == 2) {
            ek0Var.m1 = null;
            str = r.b.k("front", r12);
        } else if (i11 == 3) {
            ek0Var.n1 = null;
            str = r.b.k("reverse", r12);
        } else if (i11 == 0) {
            str = r.b.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = ek0Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ek0Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ek0Var.X1(ek0Var.T0);
        ek0Var.j0.removeView(ck0Var);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 < 0) {
            return null;
        }
        ek0 ek0Var = this.a;
        if (i7 >= ek0Var.j0.getChildCount()) {
            return null;
        }
        ck0 ck0Var = (ck0) ek0Var.j0.getChildAt(i7);
        int[] iArr = new int[2];
        ck0Var.c.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = ek0Var.j0;
        ImageReceiver imageReceiver = ck0Var.c.getImageReceiver();
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final String b0() {
        return this.a.T0 == 1 ? org.telegram.messenger.hd.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]) : org.telegram.messenger.hd.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
