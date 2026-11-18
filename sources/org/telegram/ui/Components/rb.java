package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rb extends ob implements org.telegram.messenger.fs {
    public final pb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.h2 f;
    public final int h;
    public gc n;

    public rb(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        super(h2Var.getContext(), h2Var.getResourceProvider());
        this.f = h2Var;
        this.h = i7;
        this.b.setLayoutParams(c8.ma.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(c8.ma.h(56.0f, 48.0f, 8388659));
        pb pbVar = new pb(this, h2Var, getContext(), h2Var.getCurrentAccount(), h2Var.getResourceProvider());
        this.d = pbVar;
        pbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new qb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.gd.M0(2131745680, null));
        addView(this.d, c8.ma.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.m3) {
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

    @Override // org.telegram.ui.Components.lb
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.b.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).c(this, org.telegram.messenger.ks.m3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).n(this, org.telegram.messenger.ks.m3);
    }

    public void setBulletin(gc gcVar) {
        this.n = gcVar;
    }
}
