package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp0 b;

    public /* synthetic */ mp0(vp0 vp0Var, int i10) {
        this.a = i10;
        this.b = vp0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                vp0 vp0Var = this.b;
                vp0Var.V(vp0Var.b, vp0Var.c, z10, i10);
                vp0Var.finishFragment();
                break;
            default:
                vp0 vp0Var2 = this.b;
                vp0Var2.V(vp0Var2.b, vp0Var2.c, z10, i10);
                vp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        vp0 vp0Var = this.b;
        vp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = vp0Var.I) != null && m1Var.isShowing()) {
            vp0Var.I.d(true);
        }
    }
}
