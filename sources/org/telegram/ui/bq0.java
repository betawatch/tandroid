package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq0 b;

    public /* synthetic */ bq0(jq0 jq0Var, int i10) {
        this.a = i10;
        this.b = jq0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                jq0 jq0Var = this.b;
                jq0Var.V(jq0Var.b, jq0Var.c, z10, i10);
                jq0Var.finishFragment();
                break;
            default:
                jq0 jq0Var2 = this.b;
                jq0Var2.V(jq0Var2.b, jq0Var2.c, z10, i10);
                jq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        jq0 jq0Var = this.b;
        jq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = jq0Var.I) != null && n1Var.isShowing()) {
            jq0Var.I.d(true);
        }
    }
}
