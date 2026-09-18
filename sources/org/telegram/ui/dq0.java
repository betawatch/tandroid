package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ dq0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.V(lq0Var.b, lq0Var.c, z10, i10);
                lq0Var.finishFragment();
                break;
            default:
                lq0 lq0Var2 = this.b;
                lq0Var2.V(lq0Var2.b, lq0Var2.c, z10, i10);
                lq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        lq0 lq0Var = this.b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = lq0Var.I) != null && o1Var.isShowing()) {
            lq0Var.I.d(true);
        }
    }
}
