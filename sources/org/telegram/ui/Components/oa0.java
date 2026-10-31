package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oa0 extends org.telegram.ui.Cells.l9 {
    public final /* synthetic */ ua0 w0;

    public oa0(ua0 ua0Var) {
        this.w0 = ua0Var;
        this.g0 = ua0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void I(int i10, int i11, org.telegram.messenger.jj jjVar) {
        org.telegram.ui.kn knVar;
        org.telegram.messenger.jj jjVar2;
        ua0 ua0Var = this.w0;
        oa0 oa0Var = ua0Var.e;
        int i12 = oa0Var.v - oa0Var.u;
        ab0 ab0Var = ua0Var.c0;
        if (i12 > org.telegram.messenger.vp.r1(ab0Var.x).p4) {
            ua0Var.g();
            return;
        }
        org.telegram.messenger.nj njVar = ab0Var.d;
        njVar.e = oa0Var.u;
        njVar.f = oa0Var.v;
        org.telegram.messenger.jj c10 = ua0Var.c(jjVar);
        if (c10 != null && ((knVar = ab0Var.d.d) == null || knVar.m || (jjVar2 = knVar.a) == null || jjVar2.f1() != c10.f1())) {
            ab0Var.d.d = org.telegram.ui.kn.b(i10, i11, c10);
        }
        ab0Var.b();
        ab0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        org.telegram.messenger.jj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.w0;
        if (ua0Var.a == 0 && (c10 = ua0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.nj njVar = ua0Var.c0.d;
        return njVar == null || !njVar.s;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        org.telegram.messenger.jj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.w0;
        int i10 = ua0Var.a;
        if (i10 != 0 || ua0Var.c0.d.i) {
            return false;
        }
        return i10 != 0 || (c10 = ua0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.zv.c(ua0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.w9
    public final org.telegram.ui.ActionBar.p6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.l9, org.telegram.ui.Cells.w9
    public final void w() {
        super.w();
        ag.b1 b1Var = this.w0.f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean z(org.telegram.messenger.jj jjVar) {
        ua0 ua0Var = this.w0;
        return ua0Var.a == 0 && !ua0Var.c0.d.i && x();
    }
}
