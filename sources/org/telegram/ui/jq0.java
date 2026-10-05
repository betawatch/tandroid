package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq0 b;

    public /* synthetic */ jq0(wq0 wq0Var, int i10) {
        this.a = i10;
        this.b = wq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
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
        wq0 wq0Var = this.b;
        if (wq0Var.Y) {
            wq0Var.Z(view, wq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.dm0 dm0Var = wq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        wq0Var.X = z10;
        dm0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        wq0 wq0Var = this.b;
        ar0 ar0Var = wq0Var.t0;
        if (ar0Var == null) {
            wq0Var.Y();
            return;
        }
        switch (ar0Var.a) {
            case 0:
                br0 br0Var = ar0Var.b;
                br0Var.a.Y();
                br0Var.b.Y();
                break;
            default:
                br0 br0Var2 = ar0Var.b;
                br0Var2.a.Y();
                br0Var2.b.Y();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        wq0 wq0Var = this.b;
        wq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = wq0Var.m0) != null && n1Var.isShowing()) {
            wq0Var.m0.d(true);
        }
    }
}
