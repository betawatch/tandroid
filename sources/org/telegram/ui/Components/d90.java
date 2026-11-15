package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ i90 b;

    public d90(i90 i90Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = i90Var;
        this.a = e2Var;
    }

    public final void a(boolean z10) {
        i90 i90Var = this.b;
        if (i90Var.getNeededLayoutManager() != i90Var.getCurrentLayoutManager() && i90Var.a()) {
            if (i90Var.f.N0 > 0) {
                i90Var.O = true;
                i90Var.o(false);
                return;
            }
            i90Var.b.setLayoutManager(i90Var.getNeededLayoutManager());
        }
        if (z10 && !i90Var.a()) {
            z10 = false;
        }
        i90Var.o((!z10 || i90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        i90 i90Var = this.b;
        fo foVar = i90Var.K;
        if (i90Var.b.getLayoutManager() == i90Var.d || !i90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(foVar);
        org.telegram.messenger.g0.i3(foVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
