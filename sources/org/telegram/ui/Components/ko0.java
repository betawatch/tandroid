package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements r0.o, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ ko0(rp0 rp0Var, int i9) {
        this.a = i9;
        this.b = rp0Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        rp0 rp0Var = this.b;
        rp0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.a.f(519);
        if (!rp0Var.C0.equals(f10)) {
            rp0Var.C0 = f10;
            rp0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 1:
                rp0 rp0Var = this.b;
                rp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = rp0Var.F0) != null && o1Var.isShowing()) {
                    rp0Var.F0.d(true);
                    break;
                }
                break;
            default:
                rp0 rp0Var2 = this.b;
                rp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = rp0Var2.F0) != null && o1Var2.isShowing()) {
                    rp0Var2.F0.d(true);
                    break;
                }
                break;
        }
    }
}
