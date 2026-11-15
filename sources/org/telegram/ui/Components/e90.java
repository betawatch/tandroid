package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ j90 b;

    public e90(j90 j90Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = j90Var;
        this.a = e2Var;
    }

    public final void a(boolean z10) {
        j90 j90Var = this.b;
        if (j90Var.getNeededLayoutManager() != j90Var.getCurrentLayoutManager() && j90Var.a()) {
            if (j90Var.f.N0 > 0) {
                j90Var.O = true;
                j90Var.o(false);
                return;
            }
            j90Var.b.setLayoutManager(j90Var.getNeededLayoutManager());
        }
        if (z10 && !j90Var.a()) {
            z10 = false;
        }
        j90Var.o((!z10 || j90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        j90 j90Var = this.b;
        fo foVar = j90Var.K;
        if (j90Var.b.getLayoutManager() == j90Var.d || !j90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(foVar);
        org.telegram.messenger.g0.i3(foVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
