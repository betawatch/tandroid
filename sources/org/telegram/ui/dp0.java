package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dp0 implements yp0 {
    public final /* synthetic */ hp0 a;

    public dp0(hp0 hp0Var) {
        this.a = hp0Var;
    }

    @Override // org.telegram.ui.yp0
    public final void a() {
        hp0 hp0Var = this.a;
        if (hp0Var.b.size() != 0) {
            hp0Var.M.invalidate();
            hp0Var.W(true);
        } else {
            hp0Var.M.setPivotX(0.0f);
            hp0Var.M.setPivotY(0.0f);
            hp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.yp0
    public final void b(Editable editable) {
        hp0 hp0Var = this.a;
        org.telegram.ui.Components.au auVar = hp0Var.I;
        hp0Var.a = editable;
        auVar.setText(editable);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.yp0
    public final void h(int i10, boolean z10, boolean z11) {
        hp0 hp0Var = this.a;
        hp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        hp0Var.V(hp0Var.b, hp0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ void g() {
    }
}
