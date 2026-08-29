package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ hp0 a;

    public bp0(hp0 hp0Var) {
        this.a = hp0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        hp0 hp0Var = this.a;
        if (i10 == -1) {
            hp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                hp0.U(hp0Var, null);
            }
        } else if (hp0Var.R != null) {
            hp0Var.finishFragment(false);
            hp0Var.R.b();
        }
    }
}
