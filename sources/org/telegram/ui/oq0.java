package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ oq0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // org.telegram.ui.Components.f5
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

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        br0 br0Var = this.b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.sm0 sm0Var = br0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        br0Var.X = z10;
        sm0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        br0 br0Var = this.b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.m0) != null && n1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
