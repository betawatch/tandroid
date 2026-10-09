package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fq0 implements ar0 {
    public final /* synthetic */ kq0 a;

    public fq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // org.telegram.ui.ar0
    public final void a() {
        kq0 kq0Var = this.a;
        if (kq0Var.b.size() != 0) {
            kq0Var.Q.invalidate();
            kq0Var.W(true);
        } else {
            kq0Var.Q.setPivotX(0.0f);
            kq0Var.Q.setPivotY(0.0f);
            kq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.ar0
    public final void b(Editable editable) {
        kq0 kq0Var = this.a;
        org.telegram.ui.Components.zu zuVar = kq0Var.M;
        kq0Var.a = editable;
        zuVar.setText(editable);
    }

    @Override // org.telegram.ui.ar0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ar0
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.a;
        kq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        kq0Var.V(kq0Var.b, kq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.ar0
    public final /* synthetic */ void g() {
    }
}
