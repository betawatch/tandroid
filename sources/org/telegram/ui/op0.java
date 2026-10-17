package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class op0 implements jq0 {
    public final /* synthetic */ tp0 a;

    public op0(tp0 tp0Var) {
        this.a = tp0Var;
    }

    @Override // org.telegram.ui.jq0
    public final void a() {
        tp0 tp0Var = this.a;
        if (tp0Var.b.size() != 0) {
            tp0Var.Q.invalidate();
            tp0Var.W(true);
        } else {
            tp0Var.Q.setPivotX(0.0f);
            tp0Var.Q.setPivotY(0.0f);
            tp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.jq0
    public final void b(Editable editable) {
        tp0 tp0Var = this.a;
        org.telegram.ui.Components.qu quVar = tp0Var.M;
        tp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.jq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.jq0
    public final void h(int i10, boolean z10, boolean z11) {
        tp0 tp0Var = this.a;
        tp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        tp0Var.V(tp0Var.b, tp0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.jq0
    public final /* synthetic */ void g() {
    }
}
