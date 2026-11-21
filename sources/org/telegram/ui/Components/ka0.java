package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Cells.k9 {
    public final /* synthetic */ qa0 w0;

    public ka0(qa0 qa0Var) {
        this.w0 = qa0Var;
        this.g0 = qa0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        qa0 qa0Var = this.w0;
        ka0 ka0Var = qa0Var.e;
        int i11 = ka0Var.v - ka0Var.u;
        wa0 wa0Var = qa0Var.d0;
        if (i11 > org.telegram.messenger.mp.u1(wa0Var.x).r4) {
            qa0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = wa0Var.d;
        jjVar.e = ka0Var.u;
        jjVar.f = ka0Var.v;
        org.telegram.messenger.fj c10 = qa0Var.c(fjVar);
        if (c10 != null && ((rmVar = wa0Var.d.d) == null || rmVar.m || (fjVar2 = rmVar.a) == null || fjVar2.e1() != c10.e1())) {
            wa0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        wa0Var.b();
        wa0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.w0;
        if (qa0Var.a == 0 && (c10 = qa0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = qa0Var.d0.d;
        return jjVar == null || !jjVar.s;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.w0;
        int i7 = qa0Var.a;
        if (i7 != 0 || qa0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = qa0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.iv.c(qa0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.w9
    public final org.telegram.ui.ActionBar.h6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.k9, org.telegram.ui.Cells.w9
    public final void w() {
        super.w();
        di.b1 b1Var = this.w0.f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean z(org.telegram.messenger.fj fjVar) {
        qa0 qa0Var = this.w0;
        return qa0Var.a == 0 && !qa0Var.d0.d.i && x();
    }
}
