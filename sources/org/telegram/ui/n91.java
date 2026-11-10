package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n91 extends v4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ z91 H;

    public n91(z91 z91Var) {
        this.H = z91Var;
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
        m91 m91Var = new m91(this, 0);
        this.F = m91Var;
        org.telegram.messenger.g0.h3(m91Var);
    }

    @Override // v4.k, v4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        m91 m91Var = new m91(this, 1);
        this.F = m91Var;
        org.telegram.messenger.g0.h3(m91Var);
    }

    @Override // v4.k
    public final void z(v4.d1 d1Var) {
        z91 z91Var = this.H;
        View view = z91Var.c1;
        if (view == d1Var.a) {
            view.setTranslationX(0.0f);
            e91 e91Var = z91Var.O;
            if (e91Var != null) {
                e91Var.F.clear();
            }
            View view2 = z91Var.c1;
            if (view2 instanceof w91) {
                w91 w91Var = (w91) view2;
                w91Var.setTopicIcon(w91Var.c5);
            }
            z91Var.c1 = null;
        }
    }
}
