package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lq0 implements gr0 {
    public final /* synthetic */ qq0 a;

    public lq0(qq0 qq0Var) {
        this.a = qq0Var;
    }

    @Override // org.telegram.ui.gr0
    public final void a() {
        qq0 qq0Var = this.a;
        if (qq0Var.b.size() != 0) {
            qq0Var.Q.invalidate();
            qq0Var.W(true);
        } else {
            qq0Var.Q.setPivotX(0.0f);
            qq0Var.Q.setPivotY(0.0f);
            qq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.gr0
    public final void b(Editable editable) {
        qq0 qq0Var = this.a;
        org.telegram.ui.Components.vu vuVar = qq0Var.M;
        qq0Var.a = editable;
        vuVar.setText(editable);
    }

    @Override // org.telegram.ui.gr0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.gr0
    public final void h(int i10, boolean z10, boolean z11) {
        qq0 qq0Var = this.a;
        qq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        qq0Var.V(qq0Var.b, qq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.gr0
    public final /* synthetic */ void g() {
    }
}
