package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vj extends th {
    public final ey n;
    public final tj0 r;
    public final u4.b0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public vj(bi biVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, biVar);
        this.x = z10;
        this.f = true;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z11 = !z10;
        ey eyVar = new ey(d2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.n = eyVar;
        eyVar.x0 = false;
        eyVar.I(z11, z10, false, false);
        eyVar.p2 = true;
        vv vvVar = eyVar.y;
        if (vvVar != null) {
            vvVar.setVisibility(8);
        }
        eyVar.q2 = true;
        ImageView imageView = eyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        eyVar.T2 = true;
        addView(eyVar, b8.mf.c(-1.0f, -1));
        HorizontalScrollView y9 = eyVar.y(z11 ? 1 : 0);
        this.w = y9;
        tj0 x10 = eyVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new ji(this, 4));
        this.s = (u4.b0) x10.getLayoutManager();
        y9.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int i11;
        int L;
        int L2;
        tj0 tj0Var;
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
                tj0Var = this.r;
                if (tj0Var.getPaddingTop() == L2) {
                    tj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
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
        tj0Var = this.r;
        if (tj0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        bi biVar = this.b;
        try {
            biVar.S2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.S2.setTitle(org.telegram.messenger.bd.M0(this.x ? 2131745662 : 2131745668, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        tj0 tj0Var = this.r;
        if (tj0Var.getChildCount() <= 0) {
            tj0Var.setTopGlowOffset(tj0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = tj0Var.getChildAt(0);
        bj0 bj0Var = (bj0) tj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        tj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(fx fxVar) {
        this.n.setDelegate(fxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
