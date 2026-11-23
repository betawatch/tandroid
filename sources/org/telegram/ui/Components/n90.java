package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ s90 b;

    public n90(s90 s90Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.b = s90Var;
        this.a = g2Var;
    }

    public final void a(boolean z10) {
        s90 s90Var = this.b;
        if (s90Var.getNeededLayoutManager() != s90Var.getCurrentLayoutManager() && s90Var.a()) {
            if (s90Var.f.N0 > 0) {
                s90Var.O = true;
                s90Var.o(false);
                return;
            }
            s90Var.b.setLayoutManager(s90Var.getNeededLayoutManager());
        }
        if (z10 && !s90Var.a()) {
            z10 = false;
        }
        s90Var.o((!z10 || s90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        s90 s90Var = this.b;
        lo loVar = s90Var.K;
        if (s90Var.b.getLayoutManager() == s90Var.d || !s90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(loVar);
        org.telegram.messenger.g0.h3(loVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
