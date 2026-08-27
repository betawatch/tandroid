package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo0 implements r0.o, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public /* synthetic */ lo0(sp0 sp0Var, int i10) {
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        sp0 sp0Var = this.b;
        sp0Var.processLegacyContainerInsets(g10);
        i0.c f10 = m1Var.a.f(519);
        if (!sp0Var.C0.equals(f10)) {
            sp0Var.C0 = f10;
            sp0Var.container.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 1:
                sp0 sp0Var = this.b;
                sp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = sp0Var.F0) != null && n1Var.isShowing()) {
                    sp0Var.F0.d(true);
                    break;
                }
                break;
            default:
                sp0 sp0Var2 = this.b;
                sp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = sp0Var2.F0) != null && n1Var2.isShowing()) {
                    sp0Var2.F0.d(true);
                    break;
                }
                break;
        }
    }
}
