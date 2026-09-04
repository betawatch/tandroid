package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ cp0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        hq0 hq0Var = this.b;
        hq0Var.processLegacyContainerInsets(g10);
        i0.c f7 = l1Var.a.f(519);
        if (!hq0Var.G0.equals(f7)) {
            hq0Var.G0 = f7;
            hq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 1:
                hq0 hq0Var = this.b;
                hq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = hq0Var.J0) != null && n1Var.isShowing()) {
                    hq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                hq0 hq0Var2 = this.b;
                hq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = hq0Var2.J0) != null && n1Var2.isShowing()) {
                    hq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
