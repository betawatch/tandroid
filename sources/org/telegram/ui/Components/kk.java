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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kk extends fi {
    public final fz n;
    public final jl0 r;
    public final f2.j0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public kk(ni niVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, niVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        boolean z11 = !z10;
        fz fzVar = new fz(o2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.n = fzVar;
        fzVar.s0 = false;
        fzVar.J(z11, z10, false, false);
        fzVar.k2 = true;
        sw swVar = fzVar.x;
        if (swVar != null) {
            swVar.setVisibility(8);
        }
        fzVar.l2 = true;
        ImageView imageView = fzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        fzVar.I2 = true;
        addView(fzVar, i7.f6.c(-1.0f, -1));
        HorizontalScrollView y8 = fzVar.y(z11 ? 1 : 0);
        this.v = y8;
        jl0 x4 = fzVar.x(z11 ? 1 : 0);
        this.r = x4;
        x4.j(new cg.g2(this, 23));
        this.s = (f2.j0) x4.getLayoutManager();
        y8.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        ni niVar = this.b;
        try {
            niVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        niVar.T0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        jl0 jl0Var = this.r;
        if (jl0Var.getChildCount() <= 0) {
            jl0Var.setTopGlowOffset(jl0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = jl0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        jl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.fi
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(fy fyVar) {
        this.n.setDelegate(fyVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        jl0 jl0Var;
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
                jl0Var = this.r;
                if (jl0Var.getPaddingTop() == dp2) {
                    jl0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        jl0Var = this.r;
        if (jl0Var.getPaddingTop() == dp2) {
        }
    }
}
