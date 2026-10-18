package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pp0 implements kq0 {
    public final /* synthetic */ up0 a;

    public pp0(up0 up0Var) {
        this.a = up0Var;
    }

    @Override // org.telegram.ui.kq0
    public final void a() {
        up0 up0Var = this.a;
        if (up0Var.b.size() != 0) {
            up0Var.Q.invalidate();
            up0Var.W(true);
        } else {
            up0Var.Q.setPivotX(0.0f);
            up0Var.Q.setPivotY(0.0f);
            up0Var.W(false);
        }
    }

    @Override // org.telegram.ui.kq0
    public final void b(Editable editable) {
        up0 up0Var = this.a;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.kq0
    public final void h(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.a;
        up0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        up0Var.V(up0Var.b, up0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ void g() {
    }
}
