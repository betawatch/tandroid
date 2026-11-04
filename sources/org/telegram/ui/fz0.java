package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz0 implements r0.m, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz0 b;

    public /* synthetic */ fz0(iz0 iz0Var, int i3) {
        this.a = i3;
        this.b = iz0Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        iz0 iz0Var = this.b;
        iz0Var.e = I0;
        iz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        iz0Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.b.d0;
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                    break;
                }
                break;
            default:
                iz0 iz0Var = this.b;
                org.telegram.ui.ActionBar.s1 s1Var3 = iz0Var.d0;
                if (s1Var3 != null) {
                    s1Var3.dismiss();
                    iz0Var.d0 = null;
                }
                iz0Var.dismiss();
                break;
        }
    }
}
