package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class np0 implements gq0 {
    public final /* synthetic */ rp0 a;

    public np0(rp0 rp0Var) {
        this.a = rp0Var;
    }

    @Override // org.telegram.ui.gq0
    public final void a() {
        rp0 rp0Var = this.a;
        if (rp0Var.b.size() != 0) {
            rp0Var.N.invalidate();
            rp0Var.W(true);
        } else {
            rp0Var.N.setPivotX(0.0f);
            rp0Var.N.setPivotY(0.0f);
            rp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.gq0
    public final void c(Editable editable) {
        rp0 rp0Var = this.a;
        org.telegram.ui.Components.fu fuVar = rp0Var.J;
        rp0Var.a = editable;
        fuVar.setText(editable);
    }

    @Override // org.telegram.ui.gq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.gq0
    public final void f(int i10, boolean z4, boolean z10) {
        rp0 rp0Var = this.a;
        rp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        rp0Var.V(rp0Var.b, rp0Var.c, z10, i10);
    }

    @Override // org.telegram.ui.gq0
    public final /* synthetic */ void d() {
    }
}
