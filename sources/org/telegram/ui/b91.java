package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b91 extends u4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ m91 H;

    public b91(m91 m91Var) {
        this.H = m91Var;
    }

    @Override // u4.k
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

    @Override // u4.k
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.F = null;
        }
        a91 a91Var = new a91(this, 0);
        this.F = a91Var;
        org.telegram.messenger.g0.h3(a91Var);
    }

    @Override // u4.k, u4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        a91 a91Var = new a91(this, 1);
        this.F = a91Var;
        org.telegram.messenger.g0.h3(a91Var);
    }

    @Override // u4.k
    public final void z(u4.d1 d1Var) {
        m91 m91Var = this.H;
        View view = m91Var.d1;
        if (view == d1Var.a) {
            view.setTranslationX(0.0f);
            s81 s81Var = m91Var.P;
            if (s81Var != null) {
                s81Var.G.clear();
            }
            View view2 = m91Var.d1;
            if (view2 instanceof j91) {
                j91 j91Var = (j91) view2;
                j91Var.setTopicIcon(j91Var.d5);
            }
            m91Var.d1 = null;
        }
    }
}
