package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ aq0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z4);
                break;
            default:
                this.b.e0(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        mq0 mq0Var = this.b;
        if (mq0Var.V) {
            mq0Var.a0(view, mq0Var.G.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.ul0 ul0Var = mq0Var.S;
        boolean z4 = !((org.telegram.ui.Cells.s5) view).a();
        mq0Var.U = z4;
        ul0Var.d(view, i10, z4);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
