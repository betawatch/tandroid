package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fq0 implements zq0 {
    public final /* synthetic */ jq0 a;

    public fq0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // org.telegram.ui.zq0
    public final void a() {
        jq0 jq0Var = this.a;
        if (jq0Var.b.size() != 0) {
            jq0Var.Q.invalidate();
            jq0Var.W(true);
        } else {
            jq0Var.Q.setPivotX(0.0f);
            jq0Var.Q.setPivotY(0.0f);
            jq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.zq0
    public final void b(Editable editable) {
        jq0 jq0Var = this.a;
        org.telegram.ui.Components.ju juVar = jq0Var.M;
        jq0Var.a = editable;
        juVar.setText(editable);
    }

    @Override // org.telegram.ui.zq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.zq0
    public final void i(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.a;
        jq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jq0Var.V(jq0Var.b, jq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.zq0
    public final /* synthetic */ void g() {
    }
}
