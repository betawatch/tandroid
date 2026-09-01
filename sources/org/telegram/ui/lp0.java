package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ rp0 a;

    public lp0(rp0 rp0Var) {
        this.a = rp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        rp0 rp0Var = this.a;
        if (i10 == -1) {
            rp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                rp0.U(rp0Var, null);
            }
        } else if (rp0Var.S != null) {
            rp0Var.finishFragment(false);
            rp0Var.S.b();
        }
    }
}
