package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eb1 extends s4.j {
    public Runnable F;
    public int G;
    public final /* synthetic */ pb1 H;

    public eb1(pb1 pb1Var) {
        this.H = pb1Var;
    }

    @Override // s4.j
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().q(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.F = null;
            }
        }
    }

    @Override // s4.j
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.F = null;
        }
        db1 db1Var = new db1(this, 0);
        this.F = db1Var;
        org.telegram.messenger.i0.g3(db1Var);
    }

    @Override // s4.j, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        db1 db1Var = new db1(this, 1);
        this.F = db1Var;
        org.telegram.messenger.i0.g3(db1Var);
    }

    @Override // s4.j
    public final void z(s4.c1 c1Var) {
        pb1 pb1Var = this.H;
        View view = pb1Var.c1;
        if (view == c1Var.a) {
            view.setTranslationX(0.0f);
            ua1 ua1Var = pb1Var.O;
            if (ua1Var != null) {
                ua1Var.F.clear();
            }
            View view2 = pb1Var.c1;
            if (view2 instanceof mb1) {
                mb1 mb1Var = (mb1) view2;
                mb1Var.setTopicIcon(mb1Var.c5);
            }
            pb1Var.c1 = null;
        }
    }
}
