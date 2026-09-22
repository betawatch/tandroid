package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dq0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jq0 a;

    public dq0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        jq0 jq0Var = this.a;
        if (i10 == -1) {
            jq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                jq0.U(jq0Var, null);
            }
        } else if (jq0Var.V != null) {
            jq0Var.finishFragment(false);
            jq0Var.V.b();
        }
    }
}
