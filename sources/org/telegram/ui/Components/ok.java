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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ok extends li {
    public final tz n;
    public final mm0 r;
    public final s4.b0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, tiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
        boolean z11 = !z10;
        tz tzVar = new tz(o2Var, z11, z10, false, getContext(), true, null, null, false, g6Var, false, true);
        this.n = tzVar;
        tzVar.w0 = false;
        tzVar.I(z11, z10, false, false);
        tzVar.o2 = true;
        hx hxVar = tzVar.x;
        if (hxVar != null) {
            hxVar.setVisibility(8);
        }
        tzVar.p2 = true;
        ImageView imageView = tzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tzVar.S2 = true;
        addView(tzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView z12 = tzVar.z(z11 ? 1 : 0);
        this.v = z12;
        mm0 y3 = tzVar.y(z11 ? 1 : 0);
        this.r = y3;
        y3.j(new ah.d0(this, 25));
        this.s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.li
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

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        ti tiVar = this.b;
        try {
            tiVar.a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.a1.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.li
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

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(uy uyVar) {
        this.n.setDelegate(uyVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }
}
