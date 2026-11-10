package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mb extends jb implements org.telegram.messenger.ls {
    public final kb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.f2 f;
    public final int h;
    public bc n;

    public mb(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getContext(), f2Var.getResourceProvider());
        this.f = f2Var;
        this.h = i7;
        this.b.setLayoutParams(c8.ha.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(c8.ha.h(56.0f, 48.0f, 8388659));
        kb kbVar = new kb(this, f2Var, getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider());
        this.d = kbVar;
        kbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new lb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.id.M0(2131745875, null));
        addView(this.d, c8.ha.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.k3) {
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
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).c(this, org.telegram.messenger.qs.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).n(this, org.telegram.messenger.qs.k3);
    }

    public void setBulletin(bc bcVar) {
        this.n = bcVar;
    }
}
