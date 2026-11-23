package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gj0 extends oq0 {
    public final /* synthetic */ fk0 a;

    public gj0(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void B(int i7) {
        fk0 fk0Var = this.a;
        int i10 = fk0Var.T0;
        org.telegram.messenger.yv yvVar = i10 == 1 ? fk0Var.k1 : i10 == 4 ? (org.telegram.messenger.yv) fk0Var.l1.get(i7) : i10 == 2 ? fk0Var.m1 : i10 == 3 ? fk0Var.n1 : (org.telegram.messenger.yv) fk0Var.j1.get(i7);
        dk0 dk0Var = (dk0) fk0Var.o1.remove(yvVar);
        if (dk0Var == null) {
            return;
        }
        String r12 = fk0.r1(yvVar);
        int i11 = fk0Var.T0;
        String str = null;
        if (i11 == 1) {
            fk0Var.k1 = null;
            str = p5.c.k("selfie", r12);
        } else if (i11 == 4) {
            str = p5.c.k("translation", r12);
        } else if (i11 == 2) {
            fk0Var.m1 = null;
            str = p5.c.k("front", r12);
        } else if (i11 == 3) {
            fk0Var.n1 = null;
            str = p5.c.k("reverse", r12);
        } else if (i11 == 0) {
            str = p5.c.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = fk0Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = fk0Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        fk0Var.X1(fk0Var.T0);
        fk0Var.j0.removeView(dk0Var);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 < 0) {
            return null;
        }
        fk0 fk0Var = this.a;
        if (i7 >= fk0Var.j0.getChildCount()) {
            return null;
        }
        dk0 dk0Var = (dk0) fk0Var.j0.getChildAt(i7);
        int[] iArr = new int[2];
        dk0Var.c.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = fk0Var.j0;
        ImageReceiver imageReceiver = dk0Var.c.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final String b0() {
        return this.a.T0 == 1 ? org.telegram.messenger.gd.a0("PassportDeleteSelfieAlert", null, 2131747387, new Object[0]) : org.telegram.messenger.gd.a0("PassportDeleteScanAlert", null, 2131747389, new Object[0]);
    }
}
