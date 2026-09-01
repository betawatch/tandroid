package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements r0.o, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ gp0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        mq0 mq0Var = this.b;
        mq0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.a.f(519);
        if (!mq0Var.D0.equals(f10)) {
            mq0Var.D0 = f10;
            mq0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 1:
                mq0 mq0Var = this.b;
                mq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = mq0Var.G0) != null && p1Var.isShowing()) {
                    mq0Var.G0.d(true);
                    break;
                }
                break;
            default:
                mq0 mq0Var2 = this.b;
                mq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = mq0Var2.G0) != null && p1Var2.isShowing()) {
                    mq0Var2.G0.d(true);
                    break;
                }
                break;
        }
    }
}
