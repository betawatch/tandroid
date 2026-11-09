package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x90 extends org.telegram.ui.Cells.j9 {
    public final /* synthetic */ da0 w0;

    public x90(da0 da0Var) {
        this.w0 = da0Var;
        this.g0 = da0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.sm smVar;
        org.telegram.messenger.ij ijVar2;
        da0 da0Var = this.w0;
        x90 x90Var = da0Var.e;
        int i11 = x90Var.v - x90Var.u;
        ja0 ja0Var = da0Var.c0;
        if (i11 > org.telegram.messenger.qp.s1(ja0Var.x).o4) {
            da0Var.g();
            return;
        }
        org.telegram.messenger.mj mjVar = ja0Var.d;
        mjVar.e = x90Var.u;
        mjVar.f = x90Var.v;
        org.telegram.messenger.ij c10 = da0Var.c(ijVar);
        if (c10 != null && ((smVar = ja0Var.d.d) == null || smVar.m || (ijVar2 = smVar.a) == null || ijVar2.e1() != c10.e1())) {
            ja0Var.d.d = org.telegram.ui.sm.b(i7, i10, c10);
        }
        ja0Var.b();
        ja0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        da0 da0Var = this.w0;
        if (da0Var.a == 0 && (c10 = da0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.mj mjVar = da0Var.c0.d;
        return mjVar == null || !mjVar.s;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        da0 da0Var = this.w0;
        int i7 = da0Var.a;
        if (i7 != 0 || da0Var.c0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = da0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.ov.c(da0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.v9
    public final org.telegram.ui.ActionBar.g6 q() {
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
        da0 da0Var = this.w0;
        return da0Var.a == 0 && !da0Var.c0.d.i && x();
    }
}
