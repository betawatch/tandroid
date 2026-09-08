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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pk extends ni {
    public final kz n;
    public final ll0 r;
    public final s4.c0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        boolean z11 = !z10;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.n = kzVar;
        kzVar.w0 = false;
        kzVar.K(z11, z10, false, false);
        kzVar.o2 = true;
        ax axVar = kzVar.x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        kzVar.p2 = true;
        ImageView imageView = kzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ll0 x10 = kzVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new ah.e0(this, 21));
        this.s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        vi viVar = this.b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        viVar.X0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        ll0 ll0Var = this.r;
        if (ll0Var.getChildCount() <= 0) {
            ll0Var.setTopGlowOffset(ll0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = ll0Var.getChildAt(0);
        vk0 vk0Var = (vk0) ll0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        ll0Var.setTopGlowOffset(top);
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
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ly lyVar) {
        this.n.setDelegate(lyVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        ll0 ll0Var;
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
                ll0Var = this.r;
                if (ll0Var.getPaddingTop() == dp2) {
                    ll0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        ll0Var = this.r;
        if (ll0Var.getPaddingTop() == dp2) {
        }
    }
}
