package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements r0.o, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    public /* synthetic */ vo0(dq0 dq0Var, int i10) {
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        dq0 dq0Var = this.b;
        dq0Var.processLegacyContainerInsets(g10);
        i0.b f9 = m1Var.a.f(519);
        if (!dq0Var.C0.equals(f9)) {
            dq0Var.C0 = f9;
            dq0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 1:
                dq0 dq0Var = this.b;
                dq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = dq0Var.F0) != null && o1Var.isShowing()) {
                    dq0Var.F0.d(true);
                    break;
                }
                break;
            default:
                dq0 dq0Var2 = this.b;
                dq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = dq0Var2.F0) != null && o1Var2.isShowing()) {
                    dq0Var2.F0.d(true);
                    break;
                }
                break;
        }
    }
}
