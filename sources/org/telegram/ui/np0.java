package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class np0 implements iq0 {
    public final /* synthetic */ sp0 a;

    public np0(sp0 sp0Var) {
        this.a = sp0Var;
    }

    @Override // org.telegram.ui.iq0
    public final void a() {
        sp0 sp0Var = this.a;
        if (sp0Var.b.size() != 0) {
            sp0Var.Q.invalidate();
            sp0Var.W(true);
        } else {
            sp0Var.Q.setPivotX(0.0f);
            sp0Var.Q.setPivotY(0.0f);
            sp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.iq0
    public final void b(Editable editable) {
        sp0 sp0Var = this.a;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.iq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.iq0
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.a;
        sp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        sp0Var.V(sp0Var.b, sp0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.iq0
    public final /* synthetic */ void g() {
    }
}
