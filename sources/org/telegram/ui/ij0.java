package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ij0 extends oq0 {
    public final /* synthetic */ hk0 a;

    public ij0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void B(int i7) {
        hk0 hk0Var = this.a;
        int i10 = hk0Var.T0;
        org.telegram.messenger.yv yvVar = i10 == 1 ? hk0Var.k1 : i10 == 4 ? (org.telegram.messenger.yv) hk0Var.l1.get(i7) : i10 == 2 ? hk0Var.m1 : i10 == 3 ? hk0Var.n1 : (org.telegram.messenger.yv) hk0Var.j1.get(i7);
        fk0 fk0Var = (fk0) hk0Var.o1.remove(yvVar);
        if (fk0Var == null) {
            return;
        }
        String r12 = hk0.r1(yvVar);
        int i11 = hk0Var.T0;
        String str = null;
        if (i11 == 1) {
            hk0Var.k1 = null;
            str = p5.c.k("selfie", r12);
        } else if (i11 == 4) {
            str = p5.c.k("translation", r12);
        } else if (i11 == 2) {
            hk0Var.m1 = null;
            str = p5.c.k("front", r12);
        } else if (i11 == 3) {
            hk0Var.n1 = null;
            str = p5.c.k("reverse", r12);
        } else if (i11 == 0) {
            str = p5.c.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = hk0Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = hk0Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        hk0Var.X1(hk0Var.T0);
        hk0Var.j0.removeView(fk0Var);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 < 0) {
            return null;
        }
        hk0 hk0Var = this.a;
        if (i7 >= hk0Var.j0.getChildCount()) {
            return null;
        }
        fk0 fk0Var = (fk0) hk0Var.j0.getChildAt(i7);
        int[] iArr = new int[2];
        fk0Var.c.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = hk0Var.j0;
        ImageReceiver imageReceiver = fk0Var.c.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final String b0() {
        return this.a.T0 == 1 ? org.telegram.messenger.gd.a0("PassportDeleteSelfieAlert", null, 2131747387, new Object[0]) : org.telegram.messenger.gd.a0("PassportDeleteScanAlert", null, 2131747389, new Object[0]);
    }
}
