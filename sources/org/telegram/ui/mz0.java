package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ mz0(pz0 pz0Var, int i7) {
        this.a = i7;
        this.b = pz0Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        pz0 pz0Var = this.b;
        pz0Var.e = I0;
        pz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        pz0Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.b.d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    break;
                }
                break;
            default:
                pz0 pz0Var = this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = pz0Var.d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    pz0Var.d0 = null;
                }
                pz0Var.dismiss();
                break;
        }
    }
}
