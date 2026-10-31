package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;

    public /* synthetic */ e11(i11 i11Var, int i10) {
        this.a = i10;
        this.b = i11Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        i11 i11Var = this.b;
        i11Var.e = I0;
        i11Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        i11Var.b.requestLayout();
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.b.c0;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    break;
                }
                break;
            default:
                i11 i11Var = this.b;
                org.telegram.ui.ActionBar.x1 x1Var3 = i11Var.c0;
                if (x1Var3 != null) {
                    x1Var3.dismiss();
                    i11Var.c0 = null;
                }
                i11Var.dismiss();
                break;
        }
    }
}
