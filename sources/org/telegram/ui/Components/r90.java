package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r90 extends org.telegram.ui.Cells.i9 {
    public final /* synthetic */ x90 w0;

    public r90(x90 x90Var) {
        this.w0 = x90Var;
        this.g0 = x90Var.d0.G;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void I(int i3, int i10, org.telegram.messenger.zi ziVar) {
        org.telegram.ui.mm mmVar;
        org.telegram.messenger.zi ziVar2;
        x90 x90Var = this.w0;
        r90 r90Var = x90Var.e;
        int i11 = r90Var.v - r90Var.u;
        da0 da0Var = x90Var.d0;
        if (i11 > org.telegram.messenger.hp.s1(da0Var.x).o4) {
            x90Var.g();
            return;
        }
        org.telegram.messenger.dj djVar = da0Var.d;
        djVar.e = r90Var.u;
        djVar.f = r90Var.v;
        org.telegram.messenger.zi c2 = x90Var.c(ziVar);
        if (c2 != null && ((mmVar = da0Var.d.d) == null || mmVar.m || (ziVar2 = mmVar.a) == null || ziVar2.f1() != c2.f1())) {
            da0Var.d.d = org.telegram.ui.mm.b(i3, i10, c2);
        }
        da0Var.b();
        da0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean b() {
        org.telegram.messenger.zi c2;
        TLRPC.Message message;
        x90 x90Var = this.w0;
        if (x90Var.a == 0 && (c2 = x90Var.c(null)) != null && (message = c2.k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.dj djVar = x90Var.d0.d;
        return djVar == null || !djVar.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean e() {
        org.telegram.messenger.zi c2;
        TLRPC.Message message;
        x90 x90Var = this.w0;
        int i3 = x90Var.a;
        if (i3 != 0 || x90Var.d0.d.i) {
            return false;
        }
        return i3 != 0 || (c2 = x90Var.c(null)) == null || (message = c2.k) == null || message.rich_message == null || org.telegram.messenger.gv.c(x90Var.c(null));
    }

    @Override // org.telegram.ui.Cells.u9
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.i9, org.telegram.ui.Cells.u9
    public final void w() {
        super.w();
        ci.j1 j1Var = this.w0.f;
        if (j1Var != null) {
            j1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean z(org.telegram.messenger.zi ziVar) {
        x90 x90Var = this.w0;
        return x90Var.a == 0 && !x90Var.d0.d.i && x();
    }
}
