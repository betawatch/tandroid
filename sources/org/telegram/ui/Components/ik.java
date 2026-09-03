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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ik extends di {
    public final kz n;
    public final rl0 r;
    public final f2.i0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public ik(li liVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, liVar);
        this.w = z4;
        this.f = true;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        boolean z10 = !z4;
        kz kzVar = new kz(p2Var, z10, z4, false, getContext(), true, null, null, false, f6Var, false, true);
        this.n = kzVar;
        kzVar.t0 = false;
        kzVar.J(z10, z4, false, false);
        kzVar.l2 = true;
        ww wwVar = kzVar.x;
        if (wwVar != null) {
            wwVar.setVisibility(8);
        }
        kzVar.m2 = true;
        ImageView imageView = kzVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.J2 = true;
        addView(kzVar, k7.b6.c(-1.0f, -1));
        HorizontalScrollView y10 = kzVar.y(z10 ? 1 : 0);
        this.v = y10;
        rl0 x10 = kzVar.x(z10 ? 1 : 0);
        this.r = x10;
        x10.j(new eg.f2(this, 21));
        this.s = (f2.i0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        li liVar = this.b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        liVar.U0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        rl0 rl0Var = this.r;
        if (rl0Var.getChildCount() <= 0) {
            rl0Var.setTopGlowOffset(rl0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = rl0Var.getChildAt(0);
        dl0 dl0Var = (dl0) rl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || dl0Var == null || dl0Var.b() != 0) {
            top = dp;
        }
        rl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ky kyVar) {
        this.n.setDelegate(kyVar);
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
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        rl0 rl0Var;
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
                rl0Var = this.r;
                if (rl0Var.getPaddingTop() == dp2) {
                    rl0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        rl0Var = this.r;
        if (rl0Var.getPaddingTop() == dp2) {
        }
    }
}
