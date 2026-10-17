package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ tp0 a;

    public mp0(tp0 tp0Var) {
        this.a = tp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        tp0 tp0Var = this.a;
        if (i10 == -1) {
            tp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                tp0.U(tp0Var, null);
            }
        } else if (tp0Var.V != null) {
            tp0Var.finishFragment(false);
            tp0Var.V.b();
        }
    }
}
