package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g90 b;

    public /* synthetic */ y80(g90 g90Var, int i10) {
        this.a = i10;
        this.b = g90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                f90 f90Var = this.b.r;
                if (f90Var != null) {
                    f90Var.i();
                    break;
                }
                break;
            default:
                f90 f90Var2 = this.b.r;
                if (f90Var2 != null) {
                    f90Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        g90 g90Var = this.b;
        g90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g90Var.s.isShowing()) {
            g90Var.s.d(true);
        }
    }
}
