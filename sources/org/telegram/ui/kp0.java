package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ kp0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                tp0 tp0Var = this.b;
                tp0Var.V(tp0Var.b, tp0Var.c, z10, i10);
                tp0Var.finishFragment();
                break;
            default:
                tp0 tp0Var2 = this.b;
                tp0Var2.V(tp0Var2.b, tp0Var2.c, z10, i10);
                tp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        tp0 tp0Var = this.b;
        tp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = tp0Var.I) != null && m1Var.isShowing()) {
            tp0Var.I.d(true);
        }
    }
}
