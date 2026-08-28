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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gk extends ci {
    public final wy n;
    public final wk0 r;
    public final f2.m0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public gk(ki kiVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, kiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        boolean z11 = !z10;
        wy wyVar = new wy(o2Var, z11, z10, false, getContext(), true, null, null, false, b6Var, false, true);
        this.n = wyVar;
        wyVar.s0 = false;
        wyVar.J(z11, z10, false, false);
        wyVar.k2 = true;
        mw mwVar = wyVar.x;
        if (mwVar != null) {
            mwVar.setVisibility(8);
        }
        wyVar.l2 = true;
        ImageView imageView = wyVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        wyVar.I2 = true;
        addView(wyVar, g7.e6.c(-1.0f, -1));
        HorizontalScrollView y10 = wyVar.y(z11 ? 1 : 0);
        this.v = y10;
        wk0 x10 = wyVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new bg.o2(this, 27));
        this.s = (f2.m0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        ki kiVar = this.b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.T0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        wk0 wk0Var = this.r;
        if (wk0Var.getChildCount() <= 0) {
            wk0Var.setTopGlowOffset(wk0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = wk0Var.getChildAt(0);
        ik0 ik0Var = (ik0) wk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        wk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(wx wxVar) {
        this.n.setDelegate(wxVar);
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
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int i11;
        int dp;
        int dp2;
        wk0 wk0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                dp = i11 - AndroidUtilities.dp(52.0f);
                if (dp < 0) {
                    dp = 0;
                }
                dp2 = AndroidUtilities.dp(36.0f) + dp;
                wk0Var = this.r;
                if (wk0Var.getPaddingTop() == dp2) {
                    wk0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        dp = i11 - AndroidUtilities.dp(52.0f);
        if (dp < 0) {
        }
        dp2 = AndroidUtilities.dp(36.0f) + dp;
        wk0Var = this.r;
        if (wk0Var.getPaddingTop() == dp2) {
        }
    }
}
