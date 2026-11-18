package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ia0 extends org.telegram.ui.Cells.j9 {
    public final /* synthetic */ oa0 w0;

    public ia0(oa0 oa0Var) {
        this.w0 = oa0Var;
        this.g0 = oa0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        oa0 oa0Var = this.w0;
        ia0 ia0Var = oa0Var.e;
        int i11 = ia0Var.v - ia0Var.u;
        ua0 ua0Var = oa0Var.d0;
        if (i11 > org.telegram.messenger.mp.u1(ua0Var.x).r4) {
            oa0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = ua0Var.d;
        jjVar.e = ia0Var.u;
        jjVar.f = ia0Var.v;
        org.telegram.messenger.fj c10 = oa0Var.c(fjVar);
        if (c10 != null && ((rmVar = ua0Var.d.d) == null || rmVar.m || (fjVar2 = rmVar.a) == null || fjVar2.e1() != c10.e1())) {
            ua0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        ua0Var.b();
        ua0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        oa0 oa0Var = this.w0;
        if (oa0Var.a == 0 && (c10 = oa0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = oa0Var.d0.d;
        return jjVar == null || !jjVar.s;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        oa0 oa0Var = this.w0;
        int i7 = oa0Var.a;
        if (i7 != 0 || oa0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = oa0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.iv.c(oa0Var.c(null));
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
        oa0 oa0Var = this.w0;
        return oa0Var.a == 0 && !oa0Var.d0.d.i && x();
    }
}
