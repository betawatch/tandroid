package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yj extends uh {
    public final vy n;
    public final tk0 r;
    public final s4.a0 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public yj(bi biVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, biVar);
        this.x = z10;
        this.f = true;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z11 = !z10;
        vy vyVar = new vy(k2Var, z11, z10, false, getContext(), true, null, null, false, p6Var, false, true);
        this.n = vyVar;
        vyVar.w0 = false;
        vyVar.J(z11, z10, false, false);
        vyVar.o2 = true;
        jw jwVar = vyVar.y;
        if (jwVar != null) {
            jwVar.setVisibility(8);
        }
        vyVar.p2 = true;
        ImageView imageView = vyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        vyVar.S2 = true;
        addView(vyVar, w7.b6.c(-1.0f, -1));
        HorizontalScrollView z12 = vyVar.z(z11 ? 1 : 0);
        this.w = z12;
        tk0 y3 = vyVar.y(z11 ? 1 : 0);
        this.r = y3;
        y3.j(new ag.u(this, 17));
        this.s = (s4.a0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int L;
        int L2;
        tk0 tk0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                L = i12 - org.telegram.messenger.i0.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                L2 = org.telegram.messenger.i0.L(36.0f) + L;
                tk0Var = this.r;
                if (tk0Var.getPaddingTop() == L2) {
                    tk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), L2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        L = i12 - org.telegram.messenger.i0.L(52.0f);
        if (L < 0) {
        }
        L2 = org.telegram.messenger.i0.L(36.0f) + L;
        tk0Var = this.r;
        if (tk0Var.getPaddingTop() == L2) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        bi biVar = this.b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.R2.setTitle(org.telegram.messenger.cd.L0(this.x ? 2131745669 : 2131745675, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        tk0 tk0Var = this.r;
        if (tk0Var.getChildCount() <= 0) {
            tk0Var.setTopGlowOffset(tk0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = tk0Var.getChildAt(0);
        ck0 ck0Var = (ck0) tk0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(36.0f);
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        tk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(vx vxVar) {
        this.n.setDelegate(vxVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
        invalidate();
    }
}
