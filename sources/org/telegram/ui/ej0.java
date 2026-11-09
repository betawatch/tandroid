package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ej0 extends pq0 {
    public final /* synthetic */ dk0 a;

    public ej0(dk0 dk0Var) {
        this.a = dk0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void B(int i7) {
        dk0 dk0Var = this.a;
        int i10 = dk0Var.S0;
        org.telegram.messenger.ew ewVar = i10 == 1 ? dk0Var.j1 : i10 == 4 ? (org.telegram.messenger.ew) dk0Var.k1.get(i7) : i10 == 2 ? dk0Var.l1 : i10 == 3 ? dk0Var.m1 : (org.telegram.messenger.ew) dk0Var.i1.get(i7);
        bk0 bk0Var = (bk0) dk0Var.n1.remove(ewVar);
        if (bk0Var == null) {
            return;
        }
        String r12 = dk0.r1(ewVar);
        int i11 = dk0Var.S0;
        String str = null;
        if (i11 == 1) {
            dk0Var.j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            dk0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            dk0Var.m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = dk0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = dk0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        dk0Var.X1(dk0Var.S0);
        dk0Var.i0.removeView(bk0Var);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 < 0) {
            return null;
        }
        dk0 dk0Var = this.a;
        if (i7 >= dk0Var.i0.getChildCount()) {
            return null;
        }
        bk0 bk0Var = (bk0) dk0Var.i0.getChildAt(i7);
        int[] iArr = new int[2];
        bk0Var.c.getLocationInWindow(iArr);
        yq0 yq0Var = new yq0();
        yq0Var.b = iArr[0];
        yq0Var.c = iArr[1];
        yq0Var.d = dk0Var.i0;
        ImageReceiver imageReceiver = bk0Var.c.getImageReceiver();
        yq0Var.a = imageReceiver;
        yq0Var.e = imageReceiver.p();
        return yq0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final String b0() {
        return this.a.S0 == 1 ? org.telegram.messenger.id.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]) : org.telegram.messenger.id.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
