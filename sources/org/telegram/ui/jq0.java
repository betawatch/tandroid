package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jq0 implements er0 {
    public final /* synthetic */ oq0 a;

    public jq0(oq0 oq0Var) {
        this.a = oq0Var;
    }

    @Override // org.telegram.ui.er0
    public final void a() {
        oq0 oq0Var = this.a;
        if (oq0Var.b.size() != 0) {
            oq0Var.Q.invalidate();
            oq0Var.W(true);
        } else {
            oq0Var.Q.setPivotX(0.0f);
            oq0Var.Q.setPivotY(0.0f);
            oq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.er0
    public final void b(Editable editable) {
        oq0 oq0Var = this.a;
        org.telegram.ui.Components.vu vuVar = oq0Var.M;
        oq0Var.a = editable;
        vuVar.setText(editable);
    }

    @Override // org.telegram.ui.er0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.er0
    public final void h(int i10, boolean z10, boolean z11) {
        oq0 oq0Var = this.a;
        oq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        oq0Var.V(oq0Var.b, oq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.er0
    public final /* synthetic */ void g() {
    }
}
