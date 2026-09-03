package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements r0.o, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ ep0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        lq0 lq0Var = this.b;
        lq0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.a.f(519);
        if (!lq0Var.D0.equals(f10)) {
            lq0Var.D0 = f10;
            lq0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 1:
                lq0 lq0Var = this.b;
                lq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = lq0Var.G0) != null && p1Var.isShowing()) {
                    lq0Var.G0.d(true);
                    break;
                }
                break;
            default:
                lq0 lq0Var2 = this.b;
                lq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = lq0Var2.G0) != null && p1Var2.isShowing()) {
                    lq0Var2.G0.d(true);
                    break;
                }
                break;
        }
    }
}
