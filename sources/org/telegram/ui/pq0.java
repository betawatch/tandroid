package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr0 b;

    public /* synthetic */ pq0(cr0 cr0Var, int i10) {
        this.a = i10;
        this.b = cr0Var;
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

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        cr0 cr0Var = this.b;
        if (cr0Var.Y) {
            cr0Var.a0(view, cr0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.ol0 ol0Var = cr0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        cr0Var.X = z10;
        ol0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        cr0 cr0Var = this.b;
        hr0 hr0Var = cr0Var.t0;
        if (hr0Var == null) {
            cr0Var.Z();
            return;
        }
        switch (hr0Var.a) {
            case 0:
                ir0 ir0Var = hr0Var.b;
                ir0Var.a.Z();
                ir0Var.b.Z();
                break;
            default:
                ir0 ir0Var2 = hr0Var.b;
                ir0Var2.a.Z();
                ir0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        cr0 cr0Var = this.b;
        cr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = cr0Var.m0) != null && o1Var.isShowing()) {
            cr0Var.m0.d(true);
        }
    }
}
