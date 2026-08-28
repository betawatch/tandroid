package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements org.telegram.ui.Components.x4, org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp0 b;

    public /* synthetic */ mp0(zp0 zp0Var, int i9) {
        this.a = i9;
        this.b = zp0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.d0(i9, z10);
                break;
            default:
                this.b.d0(i9, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        zp0 zp0Var = this.b;
        if (zp0Var.U) {
            zp0Var.Z(view, zp0Var.F.photos.get(i9));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.yk0 yk0Var = zp0Var.R;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        zp0Var.T = z10;
        yk0Var.d(view, i9, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        zp0 zp0Var = this.b;
        dq0 dq0Var = zp0Var.p0;
        if (dq0Var == null) {
            zp0Var.Y();
            return;
        }
        switch (dq0Var.a) {
            case 0:
                eq0 eq0Var = dq0Var.b;
                eq0Var.a.Y();
                eq0Var.b.Y();
                break;
            default:
                eq0 eq0Var2 = dq0Var.b;
                eq0Var2.a.Y();
                eq0Var2.b.Y();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        zp0 zp0Var = this.b;
        zp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = zp0Var.i0) != null && o1Var.isShowing()) {
            zp0Var.i0.d(true);
        }
    }
}
