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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ok extends li {
    public final sz n;
    public final mm0 r;
    public final s4.c0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, tiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        boolean z11 = !z10;
        sz szVar = new sz(r2Var, z11, z10, false, getContext(), true, null, null, false, u6Var, false, true);
        this.n = szVar;
        szVar.w0 = false;
        szVar.I(z11, z10, false, false);
        szVar.o2 = true;
        gx gxVar = szVar.x;
        if (gxVar != null) {
            gxVar.setVisibility(8);
        }
        szVar.p2 = true;
        ImageView imageView = szVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        szVar.Q2 = true;
        addView(szVar, gb1.g(-1.0f, -1));
        HorizontalScrollView y3 = szVar.y(z11 ? 1 : 0);
        this.v = y3;
        mm0 x9 = szVar.x(z11 ? 1 : 0);
        this.r = x9;
        x9.j(new ai.b(this, 29));
        this.s = (s4.c0) x9.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
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
    public final void G(li liVar) {
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
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        mm0 mm0Var = this.r;
        if (mm0Var.getChildCount() <= 0) {
            mm0Var.setTopGlowOffset(mm0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = mm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
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

    public void setDelegate(ty tyVar) {
        this.n.setDelegate(tyVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }
}
