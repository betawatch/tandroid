package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp0 b;

    public /* synthetic */ lp0(zp0 zp0Var, int i10) {
        this.a = i10;
        this.b = zp0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        zp0 zp0Var = this.b;
        if (zp0Var.U) {
            zp0Var.a0(view, zp0Var.F.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.r5)) {
            return false;
        }
        org.telegram.ui.Components.ll0 ll0Var = zp0Var.R;
        boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
        zp0Var.T = z10;
        ll0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        zp0 zp0Var = this.b;
        dq0 dq0Var = zp0Var.p0;
        if (dq0Var == null) {
            zp0Var.Z();
            return;
        }
        switch (dq0Var.a) {
            case 0:
                eq0 eq0Var = dq0Var.b;
                eq0Var.a.Z();
                eq0Var.b.Z();
                break;
            default:
                eq0 eq0Var2 = dq0Var.b;
                eq0Var2.a.Z();
                eq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        zp0 zp0Var = this.b;
        zp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = zp0Var.i0) != null && o1Var.isShowing()) {
            zp0Var.i0.d(true);
        }
    }
}
