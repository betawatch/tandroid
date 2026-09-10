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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uk extends qi {
    public final rz n;
    public final vl0 r;
    public final s4.c0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public uk(yi yiVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, yiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        boolean z11 = !z10;
        rz rzVar = new rz(p2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.n = rzVar;
        rzVar.w0 = false;
        rzVar.K(z11, z10, false, false);
        rzVar.o2 = true;
        fx fxVar = rzVar.x;
        if (fxVar != null) {
            fxVar.setVisibility(8);
        }
        rzVar.p2 = true;
        ImageView imageView = rzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rzVar.M2 = true;
        addView(rzVar, w7.a6.c(-1.0f, -1));
        HorizontalScrollView y3 = rzVar.y(z11 ? 1 : 0);
        this.v = y3;
        vl0 x10 = rzVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new bi.a2(this, 18));
        this.s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
        yi yiVar = this.b;
        try {
            yiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        yiVar.X0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        vl0 vl0Var = this.r;
        if (vl0Var.getChildCount() <= 0) {
            vl0Var.setTopGlowOffset(vl0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        vl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.qi
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(sy syVar) {
        this.n.setDelegate(syVar);
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
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        vl0 vl0Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                dp = i12 - AndroidUtilities.dp(52.0f);
                if (dp < 0) {
                    dp = 0;
                }
                dp2 = AndroidUtilities.dp(36.0f) + dp;
                vl0Var = this.r;
                if (vl0Var.getPaddingTop() == dp2) {
                    vl0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        vl0Var = this.r;
        if (vl0Var.getPaddingTop() == dp2) {
        }
    }
}
