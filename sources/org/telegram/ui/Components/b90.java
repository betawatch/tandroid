package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ g90 b;

    public b90(g90 g90Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = g90Var;
        this.a = f2Var;
    }

    public final void a(boolean z9) {
        g90 g90Var = this.b;
        if (g90Var.getNeededLayoutManager() != g90Var.getCurrentLayoutManager() && g90Var.a()) {
            if (g90Var.f.M0 > 0) {
                g90Var.N = true;
                g90Var.o(false);
                return;
            }
            g90Var.b.setLayoutManager(g90Var.getNeededLayoutManager());
        }
        if (z9 && !g90Var.a()) {
            z9 = false;
        }
        g90Var.o((!z9 || g90Var.f.K() > 0) ? z9 : false);
    }

    public final void b(boolean z9) {
        this.b.l(z9);
    }

    public final void c() {
        g90 g90Var = this.b;
        gp gpVar = g90Var.J;
        if (g90Var.b.getLayoutManager() == g90Var.d || !g90Var.I) {
            return;
        }
        org.telegram.messenger.g0.r(gpVar);
        org.telegram.messenger.g0.i3(gpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
