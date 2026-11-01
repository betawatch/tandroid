package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements org.telegram.ui.Components.q4, org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.i1, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;

    public /* synthetic */ ao0(jo0 jo0Var, int i10) {
        this.a = i10;
        this.b = jo0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.j0(i10, z10);
                break;
            default:
                this.b.j0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        jo0 jo0Var = this.b;
        if (jo0Var.Y) {
            jo0Var.f0(view, jo0Var.J.e.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.v5)) {
            return false;
        }
        org.telegram.ui.Components.yk0 yk0Var = jo0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.v5) view).a();
        jo0Var.X = z10;
        yk0Var.d(i10, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        jo0 jo0Var = this.b;
        ko0 ko0Var = jo0Var.t0;
        if (ko0Var == null) {
            jo0Var.e0();
            return;
        }
        switch (ko0Var.a) {
            case 1:
                mo0 mo0Var = ko0Var.b;
                mo0Var.a.e0();
                mo0Var.b.e0();
                break;
            default:
                mo0 mo0Var2 = ko0Var.b;
                mo0Var2.a.e0();
                mo0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        jo0 jo0Var = this.b;
        jo0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = jo0Var.m0) != null && k1Var.isShowing()) {
            jo0Var.m0.d(true);
        }
    }
}
