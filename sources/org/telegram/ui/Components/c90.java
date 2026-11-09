package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ h90 b;

    public c90(h90 h90Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = h90Var;
        this.a = f2Var;
    }

    public final void a(boolean z9) {
        h90 h90Var = this.b;
        if (h90Var.getNeededLayoutManager() != h90Var.getCurrentLayoutManager() && h90Var.a()) {
            if (h90Var.f.M0 > 0) {
                h90Var.N = true;
                h90Var.o(false);
                return;
            }
            h90Var.b.setLayoutManager(h90Var.getNeededLayoutManager());
        }
        if (z9 && !h90Var.a()) {
            z9 = false;
        }
        h90Var.o((!z9 || h90Var.f.K() > 0) ? z9 : false);
    }

    public final void b(boolean z9) {
        this.b.l(z9);
    }

    public final void c() {
        h90 h90Var = this.b;
        gp gpVar = h90Var.J;
        if (h90Var.b.getLayoutManager() == h90Var.d || !h90Var.I) {
            return;
        }
        org.telegram.messenger.g0.r(gpVar);
        org.telegram.messenger.g0.i3(gpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
