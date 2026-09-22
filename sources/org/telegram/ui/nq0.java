package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ar0 b;

    public /* synthetic */ nq0(ar0 ar0Var, int i10) {
        this.a = i10;
        this.b = ar0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        ar0 ar0Var = this.b;
        if (ar0Var.Y) {
            ar0Var.a0(view, ar0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.nl0 nl0Var = ar0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        ar0Var.X = z10;
        nl0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ar0 ar0Var = this.b;
        fr0 fr0Var = ar0Var.t0;
        if (fr0Var == null) {
            ar0Var.Z();
            return;
        }
        switch (fr0Var.a) {
            case 0:
                gr0 gr0Var = fr0Var.b;
                gr0Var.a.Z();
                gr0Var.b.Z();
                break;
            default:
                gr0 gr0Var2 = fr0Var.b;
                gr0Var2.a.Z();
                gr0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        ar0 ar0Var = this.b;
        ar0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = ar0Var.m0) != null && n1Var.isShowing()) {
            ar0Var.m0.d(true);
        }
    }
}
