package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ hq0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        uq0 uq0Var = this.b;
        if (uq0Var.Y) {
            uq0Var.a0(view, uq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.ol0 ol0Var = uq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        uq0Var.X = z10;
        ol0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        uq0 uq0Var = this.b;
        zq0 zq0Var = uq0Var.t0;
        if (zq0Var == null) {
            uq0Var.Z();
            return;
        }
        switch (zq0Var.a) {
            case 0:
                ar0 ar0Var = zq0Var.b;
                ar0Var.a.Z();
                ar0Var.b.Z();
                break;
            default:
                ar0 ar0Var2 = zq0Var.b;
                ar0Var2.a.Z();
                ar0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        uq0 uq0Var = this.b;
        uq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = uq0Var.m0) != null && n1Var.isShowing()) {
            uq0Var.m0.d(true);
        }
    }
}
