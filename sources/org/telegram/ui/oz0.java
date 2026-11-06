package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz0 b;

    public /* synthetic */ oz0(rz0 rz0Var, int i7) {
        this.a = i7;
        this.b = rz0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        rz0 rz0Var = this.b;
        rz0Var.e = I0;
        rz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        rz0Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.b.c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    break;
                }
                break;
            default:
                rz0 rz0Var = this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = rz0Var.c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    rz0Var.c0 = null;
                }
                rz0Var.dismiss();
                break;
        }
    }
}
