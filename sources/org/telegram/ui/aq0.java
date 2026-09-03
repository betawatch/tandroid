package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ aq0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z4);
                break;
            default:
                this.b.e0(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        mq0 mq0Var = this.b;
        if (mq0Var.V) {
            mq0Var.a0(view, mq0Var.G.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.vl0 vl0Var = mq0Var.S;
        boolean z4 = !((org.telegram.ui.Cells.t5) view).a();
        mq0Var.U = z4;
        vl0Var.d(view, i10, z4);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        mq0 mq0Var = this.b;
        qq0 qq0Var = mq0Var.q0;
        if (qq0Var == null) {
            mq0Var.Z();
            return;
        }
        switch (qq0Var.a) {
            case 0:
                rq0 rq0Var = qq0Var.b;
                rq0Var.a.Z();
                rq0Var.b.Z();
                break;
            default:
                rq0 rq0Var2 = qq0Var.b;
                rq0Var2.a.Z();
                rq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        mq0 mq0Var = this.b;
        mq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = mq0Var.j0) != null && p1Var.isShowing()) {
            mq0Var.j0.d(true);
        }
    }
}
