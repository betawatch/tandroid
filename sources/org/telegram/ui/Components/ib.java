package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ib extends fb implements org.telegram.messenger.is {
    public final gb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.e2 f;
    public final int h;
    public xb n;

    public ib(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        super(e2Var.getContext(), e2Var.getResourceProvider());
        this.f = e2Var;
        this.h = i7;
        this.b.setLayoutParams(c8.ja.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(c8.ja.h(56.0f, 48.0f, 8388659));
        gb gbVar = new gb(this, e2Var, getContext(), e2Var.getCurrentAccount(), e2Var.getResourceProvider());
        this.d = gbVar;
        gbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new hb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.hd.M0(2131745875, null));
        addView(this.d, c8.ja.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.k3) {
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

    @Override // org.telegram.ui.Components.cb
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.b.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0).c(this, org.telegram.messenger.ns.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0).n(this, org.telegram.messenger.ns.k3);
    }

    public void setBulletin(xb xbVar) {
        this.n = xbVar;
    }
}
