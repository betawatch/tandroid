package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fp0 implements zp0 {
    public final /* synthetic */ jp0 a;

    public fp0(jp0 jp0Var) {
        this.a = jp0Var;
    }

    @Override // org.telegram.ui.zp0
    public final void a() {
        jp0 jp0Var = this.a;
        if (jp0Var.b.size() != 0) {
            jp0Var.M.invalidate();
            jp0Var.W(true);
        } else {
            jp0Var.M.setPivotX(0.0f);
            jp0Var.M.setPivotY(0.0f);
            jp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.zp0
    public final void b(Editable editable) {
        jp0 jp0Var = this.a;
        org.telegram.ui.Components.tt ttVar = jp0Var.I;
        jp0Var.a = editable;
        ttVar.setText(editable);
    }

    @Override // org.telegram.ui.zp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.zp0
    public final void i(int i10, boolean z10, boolean z11) {
        jp0 jp0Var = this.a;
        jp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jp0Var.V(jp0Var.b, jp0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.zp0
    public final /* synthetic */ void h() {
    }
}
