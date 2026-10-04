package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bq0 implements vq0 {
    public final /* synthetic */ fq0 a;

    public bq0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // org.telegram.ui.vq0
    public final void a() {
        fq0 fq0Var = this.a;
        if (fq0Var.b.size() != 0) {
            fq0Var.Q.invalidate();
            fq0Var.U(true);
        } else {
            fq0Var.Q.setPivotX(0.0f);
            fq0Var.Q.setPivotY(0.0f);
            fq0Var.U(false);
        }
    }

    @Override // org.telegram.ui.vq0
    public final void b(Editable editable) {
        fq0 fq0Var = this.a;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.a = editable;
        muVar.setText(editable);
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.vq0
    public final void i(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.a;
        fq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        fq0Var.T(fq0Var.b, fq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ void g() {
    }
}
