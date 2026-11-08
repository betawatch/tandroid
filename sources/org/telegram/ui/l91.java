package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l91 extends v4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ w91 H;

    public l91(w91 w91Var) {
        this.H = w91Var;
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
        k91 k91Var = new k91(this, 0);
        this.F = k91Var;
        org.telegram.messenger.g0.h3(k91Var);
    }

    @Override // v4.k, v4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        k91 k91Var = new k91(this, 1);
        this.F = k91Var;
        org.telegram.messenger.g0.h3(k91Var);
    }

    @Override // v4.k
    public final void z(v4.d1 d1Var) {
        w91 w91Var = this.H;
        View view = w91Var.c1;
        if (view == d1Var.a) {
            view.setTranslationX(0.0f);
            c91 c91Var = w91Var.O;
            if (c91Var != null) {
                c91Var.F.clear();
            }
            View view2 = w91Var.c1;
            if (view2 instanceof t91) {
                t91 t91Var = (t91) view2;
                t91Var.setTopicIcon(t91Var.c5);
            }
            w91Var.c1 = null;
        }
    }
}
