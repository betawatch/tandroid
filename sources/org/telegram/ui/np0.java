package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements org.telegram.ui.Components.x4, org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ np0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        aq0 aq0Var = this.b;
        if (aq0Var.U) {
            aq0Var.a0(view, aq0Var.F.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.bl0 bl0Var = aq0Var.R;
        boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
        aq0Var.T = z10;
        bl0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        aq0 aq0Var = this.b;
        eq0 eq0Var = aq0Var.p0;
        if (eq0Var == null) {
            aq0Var.Z();
            return;
        }
        switch (eq0Var.a) {
            case 0:
                fq0 fq0Var = eq0Var.b;
                fq0Var.a.Z();
                fq0Var.b.Z();
                break;
            default:
                fq0 fq0Var2 = eq0Var.b;
                fq0Var2.a.Z();
                fq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        aq0 aq0Var = this.b;
        aq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = aq0Var.i0) != null && n1Var.isShowing()) {
            aq0Var.i0.d(true);
        }
    }
}
