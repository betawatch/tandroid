package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lp0 implements eq0 {
    public final /* synthetic */ pp0 a;

    public lp0(pp0 pp0Var) {
        this.a = pp0Var;
    }

    @Override // org.telegram.ui.eq0
    public final void a() {
        pp0 pp0Var = this.a;
        if (pp0Var.b.size() != 0) {
            pp0Var.N.invalidate();
            pp0Var.W(true);
        } else {
            pp0Var.N.setPivotX(0.0f);
            pp0Var.N.setPivotY(0.0f);
            pp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.eq0
    public final void b(Editable editable) {
        pp0 pp0Var = this.a;
        org.telegram.ui.Components.du duVar = pp0Var.J;
        pp0Var.a = editable;
        duVar.setText(editable);
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.eq0
    public final void f(int i10, boolean z4, boolean z10) {
        pp0 pp0Var = this.a;
        pp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        pp0Var.V(pp0Var.b, pp0Var.c, z10, i10);
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ void c() {
    }
}
