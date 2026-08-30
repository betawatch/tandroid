package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pp0 a;

    public jp0(pp0 pp0Var) {
        this.a = pp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        pp0 pp0Var = this.a;
        if (i10 == -1) {
            pp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                pp0.U(pp0Var, null);
            }
        } else if (pp0Var.S != null) {
            pp0Var.finishFragment(false);
            pp0Var.S.b();
        }
    }
}
