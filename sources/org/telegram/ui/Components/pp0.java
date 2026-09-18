package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ pp0(vq0 vq0Var, int i10) {
        this.a = i10;
        this.b = vq0Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        vq0 vq0Var = this.b;
        vq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = m1Var.a.f(519);
        if (!vq0Var.G0.equals(f7)) {
            vq0Var.G0 = f7;
            vq0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 1:
                vq0 vq0Var = this.b;
                vq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = vq0Var.J0) != null && n1Var.isShowing()) {
                    vq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                vq0 vq0Var2 = this.b;
                vq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = vq0Var2.J0) != null && n1Var2.isShowing()) {
                    vq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
