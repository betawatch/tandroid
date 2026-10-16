package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hq0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oq0 a;

    public hq0(oq0 oq0Var) {
        this.a = oq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        oq0 oq0Var = this.a;
        if (i10 == -1) {
            oq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                oq0.U(oq0Var, null);
            }
        } else if (oq0Var.V != null) {
            oq0Var.finishFragment(false);
            oq0Var.V.b();
        }
    }
}
