package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements org.telegram.ui.Components.c5, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ oq0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // org.telegram.ui.Components.c5
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

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        br0 br0Var = this.b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.xl0 xl0Var = br0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        br0Var.X = z10;
        xl0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        br0 br0Var = this.b;
        fr0 fr0Var = br0Var.t0;
        if (fr0Var == null) {
            br0Var.Z();
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

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        br0 br0Var = this.b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = br0Var.m0) != null && p1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
