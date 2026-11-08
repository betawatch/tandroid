package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w90 extends org.telegram.ui.Cells.j9 {
    public final /* synthetic */ ca0 w0;

    public w90(ca0 ca0Var) {
        this.w0 = ca0Var;
        this.g0 = ca0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.ij ijVar2;
        ca0 ca0Var = this.w0;
        w90 w90Var = ca0Var.e;
        int i11 = w90Var.v - w90Var.u;
        ia0 ia0Var = ca0Var.c0;
        if (i11 > org.telegram.messenger.qp.s1(ia0Var.x).o4) {
            ca0Var.g();
            return;
        }
        org.telegram.messenger.mj mjVar = ia0Var.d;
        mjVar.e = w90Var.u;
        mjVar.f = w90Var.v;
        org.telegram.messenger.ij c10 = ca0Var.c(ijVar);
        if (c10 != null && ((qmVar = ia0Var.d.d) == null || qmVar.m || (ijVar2 = qmVar.a) == null || ijVar2.f1() != c10.f1())) {
            ia0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ia0Var.b();
        ia0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.w0;
        if (ca0Var.a == 0 && (c10 = ca0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.mj mjVar = ca0Var.c0.d;
        return mjVar == null || !mjVar.s;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.w0;
        int i7 = ca0Var.a;
        if (i7 != 0 || ca0Var.c0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = ca0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.ov.c(ca0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.v9
    public final org.telegram.ui.ActionBar.f6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.j9, org.telegram.ui.Cells.v9
    public final void w() {
        super.w();
        bi.q1 q1Var = this.w0.f;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean z(org.telegram.messenger.ij ijVar) {
        ca0 ca0Var = this.w0;
        return ca0Var.a == 0 && !ca0Var.c0.d.i && x();
    }
}
