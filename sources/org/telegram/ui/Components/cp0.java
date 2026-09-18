package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements r0.n, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;

    public /* synthetic */ cp0(iq0 iq0Var, int i10) {
        this.a = i10;
        this.b = iq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        iq0 iq0Var = this.b;
        iq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.a.f(519);
        if (!iq0Var.G0.equals(f7)) {
            iq0Var.G0 = f7;
            iq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 1:
                iq0 iq0Var = this.b;
                iq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = iq0Var.J0) != null && o1Var.isShowing()) {
                    iq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                iq0 iq0Var2 = this.b;
                iq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = iq0Var2.J0) != null && o1Var2.isShowing()) {
                    iq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
