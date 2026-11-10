package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vj extends uh {
    public final gy n;
    public final pj0 r;
    public final v4.b0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public vj(ci ciVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, ciVar);
        this.x = z9;
        this.f = true;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        boolean z10 = !z9;
        gy gyVar = new gy(f2Var, z10, z9, false, getContext(), true, null, null, false, h6Var, false, true);
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
        x10.j(new ti(this, 2));
        this.s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int L;
        int L2;
        pj0 pj0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        ci ciVar = this.b;
        try {
            ciVar.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        ciVar.U2.setTitle(org.telegram.messenger.id.M0(this.x ? 2131745652 : 2131745658, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
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

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
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
