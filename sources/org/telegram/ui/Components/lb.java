package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lb extends ib implements org.telegram.messenger.cs {
    public final jb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.d2 f;
    public final int h;
    public ac n;

    public lb(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getContext(), d2Var.getResourceProvider());
        this.f = d2Var;
        this.h = i3;
        this.b.setLayoutParams(b8.mf.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(b8.mf.h(56.0f, 48.0f, 8388659));
        jb jbVar = new jb(this, d2Var, getContext(), d2Var.getCurrentAccount(), d2Var.getResourceProvider());
        this.d = jbVar;
        jbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new kb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.bd.M0(2131745885, null));
        addView(this.d, b8.mf.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.k3) {
            this.e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().a != null) {
                this.d.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override // org.telegram.ui.Components.fb
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.b.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).c(this, org.telegram.messenger.hs.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).n(this, org.telegram.messenger.hs.k3);
    }

    public void setBulletin(ac acVar) {
        this.n = acVar;
    }
}
