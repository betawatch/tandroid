package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i91 extends v4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ u91 H;

    public i91(u91 u91Var) {
        this.H = u91Var;
    }

    @Override // v4.k
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().q(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.F = null;
            }
        }
    }

    @Override // v4.k
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.F = null;
        }
        h91 h91Var = new h91(this, 0);
        this.F = h91Var;
        org.telegram.messenger.g0.h3(h91Var);
    }

    @Override // v4.k, v4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        h91 h91Var = new h91(this, 1);
        this.F = h91Var;
        org.telegram.messenger.g0.h3(h91Var);
    }

    @Override // v4.k
    public final void z(v4.e1 e1Var) {
        u91 u91Var = this.H;
        View view = u91Var.d1;
        if (view == e1Var.a) {
            view.setTranslationX(0.0f);
            z81 z81Var = u91Var.P;
            if (z81Var != null) {
                z81Var.G.clear();
            }
            View view2 = u91Var.d1;
            if (view2 instanceof r91) {
                r91 r91Var = (r91) view2;
                r91Var.setTopicIcon(r91Var.d5);
            }
            u91Var.d1 = null;
        }
    }
}
