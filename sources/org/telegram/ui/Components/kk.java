package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kk extends ei {
    public final mz n;
    public final tl0 r;
    public final f2.j0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public kk(mi miVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, miVar);
        this.w = z4;
        this.f = true;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        boolean z10 = !z4;
        mz mzVar = new mz(p2Var, z10, z4, false, getContext(), true, null, null, false, g6Var, false, true);
        this.n = mzVar;
        mzVar.t0 = false;
        mzVar.J(z10, z4, false, false);
        mzVar.l2 = true;
        yw ywVar = mzVar.x;
        if (ywVar != null) {
            ywVar.setVisibility(8);
        }
        mzVar.m2 = true;
        ImageView imageView = mzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mzVar.J2 = true;
        addView(mzVar, k7.c6.c(-1.0f, -1));
        HorizontalScrollView y10 = mzVar.y(z10 ? 1 : 0);
        this.v = y10;
        tl0 x10 = mzVar.x(z10 ? 1 : 0);
        this.r = x10;
        x10.j(new fg.e2(this, 21));
        this.s = (f2.j0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        mi miVar = this.b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        miVar.U0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        tl0 tl0Var = this.r;
        if (tl0Var.getChildCount() <= 0) {
            tl0Var.setTopGlowOffset(tl0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = tl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        tl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(my myVar) {
        this.n.setDelegate(myVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        tl0 tl0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                dp = i12 - AndroidUtilities.dp(52.0f);
                if (dp < 0) {
                    dp = 0;
                }
                dp2 = AndroidUtilities.dp(36.0f) + dp;
                tl0Var = this.r;
                if (tl0Var.getPaddingTop() == dp2) {
                    tl0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        dp = i12 - AndroidUtilities.dp(52.0f);
        if (dp < 0) {
        }
        dp2 = AndroidUtilities.dp(36.0f) + dp;
        tl0Var = this.r;
        if (tl0Var.getPaddingTop() == dp2) {
        }
    }
}
