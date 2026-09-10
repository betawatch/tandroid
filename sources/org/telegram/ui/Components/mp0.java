package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements r0.n, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;

    public /* synthetic */ mp0(sq0 sq0Var, int i10) {
        this.a = i10;
        this.b = sq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        sq0 sq0Var = this.b;
        sq0Var.processLegacyContainerInsets(g10);
        i0.c f7 = l1Var.a.f(519);
        if (!sq0Var.G0.equals(f7)) {
            sq0Var.G0 = f7;
            sq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 1:
                sq0 sq0Var = this.b;
                sq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = sq0Var.J0) != null && p1Var.isShowing()) {
                    sq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                sq0 sq0Var2 = this.b;
                sq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = sq0Var2.J0) != null && p1Var2.isShowing()) {
                    sq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
