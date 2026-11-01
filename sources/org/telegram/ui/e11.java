package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ e11(h11 h11Var, int i10) {
        this.a = i10;
        this.b = h11Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        h11 h11Var = this.b;
        h11Var.e = I0;
        h11Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        h11Var.b.requestLayout();
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
                h11 h11Var = this.b;
                org.telegram.ui.ActionBar.x1 x1Var3 = h11Var.c0;
                if (x1Var3 != null) {
                    x1Var3.dismiss();
                    h11Var.c0 = null;
                }
                h11Var.dismiss();
                break;
        }
    }
}
