package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq0 b;

    public /* synthetic */ gq0(tq0 tq0Var, int i10) {
        this.a = i10;
        this.b = tq0Var;
    }

    @Override // org.telegram.ui.Components.d5
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

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        tq0 tq0Var = this.b;
        if (tq0Var.Y) {
            tq0Var.a0(view, tq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.yl0 yl0Var = tq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        tq0Var.X = z10;
        yl0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        tq0 tq0Var = this.b;
        xq0 xq0Var = tq0Var.t0;
        if (xq0Var == null) {
            tq0Var.Z();
            return;
        }
        switch (xq0Var.a) {
            case 0:
                yq0 yq0Var = xq0Var.b;
                yq0Var.a.Z();
                yq0Var.b.Z();
                break;
            default:
                yq0 yq0Var2 = xq0Var.b;
                yq0Var2.a.Z();
                yq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        tq0 tq0Var = this.b;
        tq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = tq0Var.m0) != null && m1Var.isShowing()) {
            tq0Var.m0.d(true);
        }
    }
}
