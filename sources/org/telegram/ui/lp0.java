package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ sp0 a;

    public lp0(sp0 sp0Var) {
        this.a = sp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        sp0 sp0Var = this.a;
        if (i10 == -1) {
            sp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                sp0.U(sp0Var, null);
            }
        } else if (sp0Var.V != null) {
            sp0Var.finishFragment(false);
            sp0Var.V.b();
        }
    }
}
