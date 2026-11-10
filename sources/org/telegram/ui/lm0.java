package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm0 implements org.telegram.ui.Components.s4, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm0 b;

    public /* synthetic */ lm0(pm0 pm0Var, int i7) {
        this.a = i7;
        this.b = pm0Var;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                pm0 pm0Var = this.b;
                pm0Var.a0(pm0Var.b, pm0Var.c, z9, i7);
                pm0Var.finishFragment();
                break;
            default:
                pm0 pm0Var2 = this.b;
                pm0Var2.a0(pm0Var2.b, pm0Var2.c, z9, i7);
                pm0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        pm0 pm0Var = this.b;
        pm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = pm0Var.I) != null && g1Var.isShowing()) {
            pm0Var.I.d(true);
        }
    }
}
