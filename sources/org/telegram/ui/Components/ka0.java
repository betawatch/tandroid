package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Cells.k9 {
    public final /* synthetic */ qa0 w0;

    public ka0(qa0 qa0Var) {
        this.w0 = qa0Var;
        this.g0 = qa0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.gj gjVar2;
        qa0 qa0Var = this.w0;
        ka0 ka0Var = qa0Var.e;
        int i11 = ka0Var.v - ka0Var.u;
        wa0 wa0Var = qa0Var.d0;
        if (i11 > org.telegram.messenger.np.u1(wa0Var.x).r4) {
            qa0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = wa0Var.d;
        kjVar.e = ka0Var.u;
        kjVar.f = ka0Var.v;
        org.telegram.messenger.gj c10 = qa0Var.c(gjVar);
        if (c10 != null && ((rmVar = wa0Var.d.d) == null || rmVar.m || (gjVar2 = rmVar.a) == null || gjVar2.e1() != c10.e1())) {
            wa0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        wa0Var.b();
        wa0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.w0;
        if (qa0Var.a == 0 && (c10 = qa0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = qa0Var.d0.d;
        return kjVar == null || !kjVar.s;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.w0;
        int i7 = qa0Var.a;
        if (i7 != 0 || qa0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = qa0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.jv.c(qa0Var.c(null));
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
    public final boolean z(org.telegram.messenger.gj gjVar) {
        qa0 qa0Var = this.w0;
        return qa0Var.a == 0 && !qa0Var.d0.d.i && x();
    }
}
