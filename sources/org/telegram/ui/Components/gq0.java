package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ gq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        mr0 mr0Var = this.b;
        mr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.a.f(519);
        if (!mr0Var.G0.equals(f7)) {
            mr0Var.G0 = f7;
            mr0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 1:
                mr0 mr0Var = this.b;
                mr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = mr0Var.J0) != null && n1Var.isShowing()) {
                    mr0Var.J0.d(true);
                    break;
                }
                break;
            default:
                mr0 mr0Var2 = this.b;
                mr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = mr0Var2.J0) != null && n1Var2.isShowing()) {
                    mr0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
