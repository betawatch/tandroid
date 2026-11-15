package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ek extends ci {
    public final ly n;
    public final uj0 r;
    public final v4.b0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public ek(ki kiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, kiVar);
        this.x = z10;
        this.f = true;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        boolean z11 = !z10;
        ly lyVar = new ly(e2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.n = lyVar;
        lyVar.x0 = false;
        lyVar.J(z11, z10, false, false);
        lyVar.p2 = true;
        cw cwVar = lyVar.y;
        if (cwVar != null) {
            cwVar.setVisibility(8);
        }
        lyVar.q2 = true;
        ImageView imageView = lyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        lyVar.T2 = true;
        addView(lyVar, c8.ja.c(-1.0f, -1));
        HorizontalScrollView y10 = lyVar.y(z11 ? 1 : 0);
        this.w = y10;
        uj0 x10 = lyVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new ri(this, 4));
        this.s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int L;
        int L2;
        uj0 uj0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                L = i11 - org.telegram.messenger.g0.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                L2 = org.telegram.messenger.g0.L(36.0f) + L;
                uj0Var = this.r;
                if (uj0Var.getPaddingTop() == L2) {
                    uj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        L = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L < 0) {
        }
        L2 = org.telegram.messenger.g0.L(36.0f) + L;
        uj0Var = this.r;
        if (uj0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        ki kiVar = this.b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(this.x ? 2131745652 : 2131745658, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        uj0 uj0Var = this.r;
        if (uj0Var.getChildCount() <= 0) {
            uj0Var.setTopGlowOffset(uj0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = uj0Var.getChildAt(0);
        cj0 cj0Var = (cj0) uj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        uj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(mx mxVar) {
        this.n.setDelegate(mxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
