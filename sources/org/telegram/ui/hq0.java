package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hq0 implements br0 {
    public final /* synthetic */ lq0 a;

    public hq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.br0
    public final void a() {
        lq0 lq0Var = this.a;
        if (lq0Var.b.size() != 0) {
            lq0Var.Q.invalidate();
            lq0Var.W(true);
        } else {
            lq0Var.Q.setPivotX(0.0f);
            lq0Var.Q.setPivotY(0.0f);
            lq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.br0
    public final void b(Editable editable) {
        lq0 lq0Var = this.a;
        org.telegram.ui.Components.ju juVar = lq0Var.M;
        lq0Var.a = editable;
        juVar.setText(editable);
    }

    @Override // org.telegram.ui.br0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.br0
    public final void i(int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.a;
        lq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        lq0Var.V(lq0Var.b, lq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.br0
    public final /* synthetic */ void g() {
    }
}
