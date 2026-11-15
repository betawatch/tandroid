package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y90 extends org.telegram.ui.Cells.i9 {
    public final /* synthetic */ ea0 w0;

    public y90(ea0 ea0Var) {
        this.w0 = ea0Var;
        this.g0 = ea0Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.gj gjVar2;
        ea0 ea0Var = this.w0;
        y90 y90Var = ea0Var.e;
        int i11 = y90Var.v - y90Var.u;
        ka0 ka0Var = ea0Var.d0;
        if (i11 > org.telegram.messenger.np.s1(ka0Var.x).p4) {
            ea0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = ka0Var.d;
        kjVar.e = y90Var.u;
        kjVar.f = y90Var.v;
        org.telegram.messenger.gj c10 = ea0Var.c(gjVar);
        if (c10 != null && ((qmVar = ka0Var.d.d) == null || qmVar.m || (gjVar2 = qmVar.a) == null || gjVar2.e1() != c10.e1())) {
            ka0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ka0Var.b();
        ka0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        ea0 ea0Var = this.w0;
        if (ea0Var.a == 0 && (c10 = ea0Var.c(null)) != null && (message = c10.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = ea0Var.d0.d;
        return kjVar == null || !kjVar.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        ea0 ea0Var = this.w0;
        int i7 = ea0Var.a;
        if (i7 != 0 || ea0Var.d0.d.i) {
            return false;
        }
        return i7 != 0 || (c10 = ea0Var.c(null)) == null || (message = c10.k) == null || message.rich_message == null || org.telegram.messenger.mv.c(ea0Var.c(null));
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
        ea0 ea0Var = this.w0;
        return ea0Var.a == 0 && !ea0Var.d0.d.i && x();
    }
}
