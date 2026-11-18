package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class lk extends ki {
    public final ry n;
    public final ck0 r;
    public final v4.c0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public lk(si siVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, siVar);
        this.x = z10;
        this.f = true;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        boolean z11 = !z10;
        ry ryVar = new ry(h2Var, z11, z10, false, getContext(), true, null, null, false, i6Var, false, true);
        this.n = ryVar;
        ryVar.x0 = false;
        ryVar.J(z11, z10, false, false);
        ryVar.p2 = true;
        iw iwVar = ryVar.y;
        if (iwVar != null) {
            iwVar.setVisibility(8);
        }
        ryVar.q2 = true;
        ImageView imageView = ryVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ryVar.T2 = true;
        addView(ryVar, c8.ma.c(-1.0f, -1));
        HorizontalScrollView y10 = ryVar.y(z11 ? 1 : 0);
        this.w = y10;
        ck0 x10 = ryVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new oa(this, 5));
        this.s = (v4.c0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int L;
        int L2;
        ck0 ck0Var;
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
                ck0Var = this.r;
                if (ck0Var.getPaddingTop() == L2) {
                    ck0Var.setPadding(org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
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
        ck0Var = this.r;
        if (ck0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        si siVar = this.b;
        try {
            siVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        siVar.V2.setTitle(org.telegram.messenger.gd.M0(this.x ? 2131745457 : 2131745463, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        ck0 ck0Var = this.r;
        if (ck0Var.getChildCount() <= 0) {
            ck0Var.setTopGlowOffset(ck0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = ck0Var.getChildAt(0);
        kj0 kj0Var = (kj0) ck0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        ck0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(rx rxVar) {
        this.n.setDelegate(rxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
