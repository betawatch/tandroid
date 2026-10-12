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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qk extends ni {
    public final wz n;
    public final mm0 r;
    public final s4.b0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public qk(vi viVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, viVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        boolean z11 = !z10;
        wz wzVar = new wz(m2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.n = wzVar;
        wzVar.w0 = false;
        wzVar.I(z11, z10, false, false);
        wzVar.n2 = true;
        lx lxVar = wzVar.x;
        if (lxVar != null) {
            lxVar.setVisibility(8);
        }
        wzVar.o2 = true;
        ImageView imageView = wzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        wzVar.M2 = true;
        addView(wzVar, w7.a6.d(-1.0f, -1));
        HorizontalScrollView z12 = wzVar.z(z11 ? 1 : 0);
        this.v = z12;
        mm0 y3 = wzVar.y(z11 ? 1 : 0);
        this.r = y3;
        y3.j(new ah.d0(this, 21));
        this.s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        mm0 mm0Var;
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
                mm0Var = this.r;
                if (mm0Var.getPaddingTop() == dp2) {
                    mm0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        mm0Var = this.r;
        if (mm0Var.getPaddingTop() == dp2) {
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
        vi viVar = this.b;
        try {
            viVar.a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        viVar.a1.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        mm0 mm0Var = this.r;
        if (mm0Var.getChildCount() <= 0) {
            mm0Var.setTopGlowOffset(mm0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = mm0Var.getChildAt(0);
        wl0 wl0Var = (wl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        mm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ni
    public final int i() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(wy wyVar) {
        this.n.setDelegate(wyVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }
}
