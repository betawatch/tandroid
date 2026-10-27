package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq0 b;

    public /* synthetic */ gq0(tq0 tq0Var, int i10) {
        this.a = i10;
        this.b = tq0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.f0(i10, z10);
                break;
            default:
                this.b.f0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        tq0 tq0Var = this.b;
        if (tq0Var.Y) {
            tq0Var.b0(view, tq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.x5)) {
            return false;
        }
        org.telegram.ui.Components.rm0 rm0Var = tq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.x5) view).a();
        tq0Var.X = z10;
        rm0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        tq0 tq0Var = this.b;
        wq0 wq0Var = tq0Var.t0;
        if (wq0Var == null) {
            tq0Var.a0();
            return;
        }
        switch (wq0Var.a) {
            case 0:
                xq0 xq0Var = wq0Var.b;
                xq0Var.a.a0();
                xq0Var.b.a0();
                break;
            default:
                xq0 xq0Var2 = wq0Var.b;
                xq0Var2.a.a0();
                xq0Var2.b.a0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        tq0 tq0Var = this.b;
        tq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = tq0Var.m0) != null && o1Var.isShowing()) {
            tq0Var.m0.d(true);
        }
    }
}
