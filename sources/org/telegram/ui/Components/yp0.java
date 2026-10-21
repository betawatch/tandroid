package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    public /* synthetic */ yp0(fr0 fr0Var, int i10) {
        this.a = i10;
        this.b = fr0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        fr0 fr0Var = this.b;
        fr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.a.f(519);
        if (!fr0Var.H0.equals(f7)) {
            fr0Var.H0 = f7;
            fr0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                fr0 fr0Var = this.b;
                fr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = fr0Var.K0) != null && m1Var.isShowing()) {
                    fr0Var.K0.d(true);
                    break;
                }
                break;
            default:
                fr0 fr0Var2 = this.b;
                fr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = fr0Var2.K0) != null && m1Var2.isShowing()) {
                    fr0Var2.K0.d(true);
                    break;
                }
                break;
        }
    }
}
