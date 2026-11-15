package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x90 extends org.telegram.ui.Cells.i9 {
    public final /* synthetic */ da0 w0;

    public x90(da0 da0Var) {
        this.w0 = da0Var;
        this.g0 = da0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.gj gjVar2;
        da0 da0Var = this.w0;
        x90 x90Var = da0Var.e;
        int i11 = x90Var.v - x90Var.u;
        ja0 ja0Var = da0Var.d0;
        if (i11 > org.telegram.messenger.np.s1(ja0Var.x).p4) {
            da0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = ja0Var.d;
        kjVar.e = x90Var.u;
        kjVar.f = x90Var.v;
        org.telegram.messenger.gj c10 = da0Var.c(gjVar);
        if (c10 != null && ((qmVar = ja0Var.d.d) == null || qmVar.m || (gjVar2 = qmVar.a) == null || gjVar2.e1() != c10.e1())) {
            ja0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ja0Var.b();
        ja0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        da0 da0Var = this.w0;
        if (da0Var.a == 0 && (c10 = da0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = da0Var.d0.d;
        return kjVar == null || !kjVar.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        da0 da0Var = this.w0;
        int i7 = da0Var.a;
        if (i7 != 0 || da0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = da0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.mv.c(da0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.u9
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.i9, org.telegram.ui.Cells.u9
    public final void w() {
        super.w();
        di.c1 c1Var = this.w0.f;
        if (c1Var != null) {
            c1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean z(org.telegram.messenger.gj gjVar) {
        da0 da0Var = this.w0;
        return da0Var.a == 0 && !da0Var.d0.d.i && x();
    }
}
