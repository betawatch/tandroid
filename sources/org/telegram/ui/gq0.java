package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class gq0 implements ar0 {
    public final /* synthetic */ kq0 a;

    public gq0(kq0 kq0Var) {
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
        org.telegram.ui.Components.hu huVar = kq0Var.M;
        kq0Var.a = editable;
        huVar.setText(editable);
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
