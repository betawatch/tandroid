package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 a;
    public final /* synthetic */ t90 b;

    public o90(t90 t90Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.b = t90Var;
        this.a = h2Var;
    }

    public final void a(boolean z10) {
        t90 t90Var = this.b;
        if (t90Var.getNeededLayoutManager() != t90Var.getCurrentLayoutManager() && t90Var.a()) {
            if (t90Var.f.N0 > 0) {
                t90Var.O = true;
                t90Var.o(false);
                return;
            }
            t90Var.b.setLayoutManager(t90Var.getNeededLayoutManager());
        }
        if (z10 && !t90Var.a()) {
            z10 = false;
        }
        t90Var.o((!z10 || t90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        t90 t90Var = this.b;
        mo moVar = t90Var.K;
        if (t90Var.b.getLayoutManager() == t90Var.d || !t90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(moVar);
        org.telegram.messenger.g0.h3(moVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
