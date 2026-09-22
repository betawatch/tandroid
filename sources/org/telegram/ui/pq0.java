package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq0 implements org.telegram.ui.Components.c5, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr0 b;

    public /* synthetic */ pq0(cr0 cr0Var, int i10) {
        this.a = i10;
        this.b = cr0Var;
    }

    @Override // org.telegram.ui.Components.c5
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

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        cr0 cr0Var = this.b;
        if (cr0Var.Y) {
            cr0Var.a0(view, cr0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.u5)) {
            return false;
        }
        org.telegram.ui.Components.am0 am0Var = cr0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.u5) view).a();
        cr0Var.X = z10;
        am0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cr0 cr0Var = this.b;
        gr0 gr0Var = cr0Var.t0;
        if (gr0Var == null) {
            cr0Var.Z();
            return;
        }
        switch (gr0Var.a) {
            case 0:
                hr0 hr0Var = gr0Var.b;
                hr0Var.a.Z();
                hr0Var.b.Z();
                break;
            default:
                hr0 hr0Var2 = gr0Var.b;
                hr0Var2.a.Z();
                hr0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        cr0 cr0Var = this.b;
        cr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = cr0Var.m0) != null && n1Var.isShowing()) {
            cr0Var.m0.d(true);
        }
    }
}
