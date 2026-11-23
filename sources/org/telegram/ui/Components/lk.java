package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lk extends li {
    public final qy n;
    public final ek0 r;
    public final v4.c0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public lk(ti tiVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, tiVar);
        this.x = z10;
        this.f = true;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        boolean z11 = !z10;
        qy qyVar = new qy(g2Var, z11, z10, false, getContext(), true, null, null, false, i6Var, false, true);
        this.n = qyVar;
        qyVar.x0 = false;
        qyVar.I(z11, z10, false, false);
        qyVar.p2 = true;
        hw hwVar = qyVar.y;
        if (hwVar != null) {
            hwVar.setVisibility(8);
        }
        qyVar.q2 = true;
        ImageView imageView = qyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        qyVar.T2 = true;
        addView(qyVar, c8.na.c(-1.0f, -1));
        HorizontalScrollView y10 = qyVar.y(z11 ? 1 : 0);
        this.w = y10;
        ek0 x10 = qyVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new na(this, 5));
        this.s = (v4.c0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int L;
        int L2;
        ek0 ek0Var;
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
                ek0Var = this.r;
                if (ek0Var.getPaddingTop() == L2) {
                    ek0Var.setPadding(org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
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
        ek0Var = this.r;
        if (ek0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void H(li liVar) {
        ti tiVar = this.b;
        try {
            tiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.V2.setTitle(org.telegram.messenger.gd.N0(this.x ? 2131745456 : 2131745462, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ek0 ek0Var = this.r;
        if (ek0Var.getChildCount() <= 0) {
            ek0Var.setTopGlowOffset(ek0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = ek0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ek0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        ek0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(qx qxVar) {
        this.n.setDelegate(qxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
