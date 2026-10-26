package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq0 b;

    public /* synthetic */ eq0(rq0 rq0Var, int i10) {
        this.a = i10;
        this.b = rq0Var;
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

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        rq0 rq0Var = this.b;
        if (rq0Var.Y) {
            rq0Var.b0(view, rq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.x5)) {
            return false;
        }
        org.telegram.ui.Components.qm0 qm0Var = rq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.x5) view).a();
        rq0Var.X = z10;
        qm0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        rq0 rq0Var = this.b;
        uq0 uq0Var = rq0Var.t0;
        if (uq0Var == null) {
            rq0Var.a0();
            return;
        }
        switch (uq0Var.a) {
            case 0:
                vq0 vq0Var = uq0Var.b;
                vq0Var.a.a0();
                vq0Var.b.a0();
                break;
            default:
                vq0 vq0Var2 = uq0Var.b;
                vq0Var2.a.a0();
                vq0Var2.b.a0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        rq0 rq0Var = this.b;
        rq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = rq0Var.m0) != null && o1Var.isShowing()) {
            rq0Var.m0.d(true);
        }
    }
}
