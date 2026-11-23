package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ha0 extends org.telegram.ui.Cells.j9 {
    public final /* synthetic */ na0 w0;

    public ha0(na0 na0Var) {
        this.w0 = na0Var;
        this.g0 = na0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        na0 na0Var = this.w0;
        ha0 ha0Var = na0Var.e;
        int i11 = ha0Var.v - ha0Var.u;
        ta0 ta0Var = na0Var.d0;
        if (i11 > org.telegram.messenger.mp.u1(ta0Var.x).r4) {
            na0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = ta0Var.d;
        jjVar.e = ha0Var.u;
        jjVar.f = ha0Var.v;
        org.telegram.messenger.fj c10 = na0Var.c(fjVar);
        if (c10 != null && ((rmVar = ta0Var.d.d) == null || rmVar.m || (fjVar2 = rmVar.a) == null || fjVar2.e1() != c10.e1())) {
            ta0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        ta0Var.b();
        ta0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        na0 na0Var = this.w0;
        if (na0Var.a == 0 && (c10 = na0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = na0Var.d0.d;
        return jjVar == null || !jjVar.s;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        na0 na0Var = this.w0;
        int i7 = na0Var.a;
        if (i7 != 0 || na0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = na0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.iv.c(na0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.v9
    public final org.telegram.ui.ActionBar.i6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.j9, org.telegram.ui.Cells.v9
    public final void w() {
        super.w();
        di.b1 b1Var = this.w0.f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean z(org.telegram.messenger.fj fjVar) {
        na0 na0Var = this.w0;
        return na0Var.a == 0 && !na0Var.d0.d.i && x();
    }
}
