package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq0 b;

    public /* synthetic */ qp0(wq0 wq0Var, int i10) {
        this.a = i10;
        this.b = wq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        wq0 wq0Var = this.b;
        wq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.a.f(519);
        if (!wq0Var.G0.equals(f7)) {
            wq0Var.G0 = f7;
            wq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                wq0 wq0Var = this.b;
                wq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = wq0Var.J0) != null && m1Var.isShowing()) {
                    wq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                wq0 wq0Var2 = this.b;
                wq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = wq0Var2.J0) != null && m1Var2.isShowing()) {
                    wq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
