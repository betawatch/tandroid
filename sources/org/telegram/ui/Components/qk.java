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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qk extends oi {
    public final lz n;
    public final wl0 r;
    public final s4.c0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public qk(wi wiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, wiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
        boolean z11 = !z10;
        lz lzVar = new lz(m2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.n = lzVar;
        lzVar.w0 = false;
        lzVar.I(z11, z10, false, false);
        lzVar.n2 = true;
        bx bxVar = lzVar.x;
        if (bxVar != null) {
            bxVar.setVisibility(8);
        }
        lzVar.o2 = true;
        ImageView imageView = lzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        lzVar.M2 = true;
        addView(lzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = lzVar.y(z11 ? 1 : 0);
        this.v = y3;
        wl0 x10 = lzVar.x(z11 ? 1 : 0);
        this.r = x10;
        x10.j(new ai.r(this, 20));
        this.s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.oi
    public final void E(oi oiVar) {
        wi wiVar = this.b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        wiVar.X0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.oi
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        wl0 wl0Var = this.r;
        if (wl0Var.getChildCount() <= 0) {
            wl0Var.setTopGlowOffset(wl0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = wl0Var.getChildAt(0);
        gl0 gl0Var = (gl0) wl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gl0Var == null || gl0Var.b() != 0) {
            top = dp;
        }
        wl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.oi
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(my myVar) {
        this.n.setDelegate(myVar);
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
    @Override // org.telegram.ui.Components.oi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        wl0 wl0Var;
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
                wl0Var = this.r;
                if (wl0Var.getPaddingTop() == dp2) {
                    wl0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        wl0Var = this.r;
        if (wl0Var.getPaddingTop() == dp2) {
        }
    }
}
