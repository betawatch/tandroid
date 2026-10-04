package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements li.i, r0.n, org.telegram.ui.ActionBar.l1, li.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq0 b;

    public /* synthetic */ up0(zq0 zq0Var, int i10) {
        this.a = i10;
        this.b = zq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        zq0 zq0Var = this.b;
        zq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.a.f(519);
        if (!zq0Var.G0.equals(f7)) {
            zq0Var.G0 = f7;
            zq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // li.j
    public int f() {
        zq0 zq0Var = this.b;
        zq0Var.getClass();
        return zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
    }

    @Override // li.i
    public void k(int i10) {
        zq0.m(this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 2:
                zq0 zq0Var = this.b;
                zq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = zq0Var.J0) != null && n1Var.isShowing()) {
                    zq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                zq0 zq0Var2 = this.b;
                zq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = zq0Var2.J0) != null && n1Var2.isShowing()) {
                    zq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
