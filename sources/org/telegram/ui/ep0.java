package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ep0 implements yp0 {
    public final /* synthetic */ ip0 a;

    public ep0(ip0 ip0Var) {
        this.a = ip0Var;
    }

    @Override // org.telegram.ui.yp0
    public final void a() {
        ip0 ip0Var = this.a;
        if (ip0Var.b.size() != 0) {
            ip0Var.M.invalidate();
            ip0Var.V(true);
        } else {
            ip0Var.M.setPivotX(0.0f);
            ip0Var.M.setPivotY(0.0f);
            ip0Var.V(false);
        }
    }

    @Override // org.telegram.ui.yp0
    public final void b(Editable editable) {
        ip0 ip0Var = this.a;
        org.telegram.ui.Components.ut utVar = ip0Var.I;
        ip0Var.a = editable;
        utVar.setText(editable);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.yp0
    public final void i(int i9, boolean z10, boolean z11) {
        ip0 ip0Var = this.a;
        ip0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        ip0Var.U(ip0Var.b, ip0Var.c, z11, i9);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ void h() {
    }
}
