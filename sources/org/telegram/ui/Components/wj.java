package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wj extends vh {
    public final gy n;
    public final pj0 r;
    public final v4.b0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public wj(di diVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, diVar);
        this.x = z9;
        this.f = true;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z10 = !z9;
        gy gyVar = new gy(f2Var, z10, z9, false, getContext(), true, null, null, false, f6Var, false, true);
        this.n = gyVar;
        gyVar.w0 = false;
        gyVar.I(z10, z9, false, false);
        gyVar.o2 = true;
        wv wvVar = gyVar.y;
        if (wvVar != null) {
            wvVar.setVisibility(8);
        }
        gyVar.p2 = true;
        ImageView imageView = gyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        gyVar.S2 = true;
        addView(gyVar, c8.ha.c(-1.0f, -1));
        HorizontalScrollView y10 = gyVar.y(z10 ? 1 : 0);
        this.w = y10;
        pj0 x10 = gyVar.x(z10 ? 1 : 0);
        this.r = x10;
        x10.j(new ui(this, 2));
        this.s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int L;
        int L2;
        pj0 pj0Var;
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
                pj0Var = this.r;
                if (pj0Var.getPaddingTop() == L2) {
                    pj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
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
        pj0Var = this.r;
        if (pj0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        di diVar = this.b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        diVar.R2.setTitle(org.telegram.messenger.hd.M0(this.x ? 2131745653 : 2131745659, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        pj0 pj0Var = this.r;
        if (pj0Var.getChildCount() <= 0) {
            pj0Var.setTopGlowOffset(pj0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = pj0Var.getChildAt(0);
        xi0 xi0Var = (xi0) pj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        pj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(hx hxVar) {
        this.n.setDelegate(hxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
