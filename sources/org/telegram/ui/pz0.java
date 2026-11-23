package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz0 b;

    public /* synthetic */ pz0(sz0 sz0Var, int i7) {
        this.a = i7;
        this.b = sz0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.b.d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    break;
                }
                break;
            default:
                sz0 sz0Var = this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = sz0Var.d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    sz0Var.d0 = null;
                }
                sz0Var.dismiss();
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        sz0 sz0Var = this.b;
        sz0Var.e = I0;
        sz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        sz0Var.b.requestLayout();
        return r0.l1.b;
    }
}
