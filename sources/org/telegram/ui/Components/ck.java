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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ck extends yh {
    public final yy n;
    public final zk0 r;
    public final f2.k0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public ck(gi giVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, giVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        boolean z11 = !z10;
        yy yyVar = new yy(n2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.n = yyVar;
        yyVar.s0 = false;
        yyVar.K(z11, z10, false, false);
        yyVar.k2 = true;
        lw lwVar = yyVar.x;
        if (lwVar != null) {
            lwVar.setVisibility(8);
        }
        yyVar.l2 = true;
        ImageView imageView = yyVar.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yyVar.I2 = true;
        addView(yyVar, h7.z5.c(-1.0f, -1));
        HorizontalScrollView z12 = yyVar.z(z11 ? 1 : 0);
        this.v = z12;
        zk0 y10 = yyVar.y(z11 ? 1 : 0);
        this.r = y10;
        y10.j(new ag.z2(this, 28));
        this.s = (f2.k0) y10.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        gi giVar = this.b;
        try {
            giVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        giVar.T0.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        zk0 zk0Var = this.r;
        if (zk0Var.getChildCount() <= 0) {
            zk0Var.setTopGlowOffset(zk0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = zk0Var.getChildAt(0);
        lk0 lk0Var = (lk0) zk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = dp;
        }
        zk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.yh
    public final int h() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(xx xxVar) {
        this.n.setDelegate(xxVar);
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
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        zk0 zk0Var;
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
                zk0Var = this.r;
                if (zk0Var.getPaddingTop() == dp2) {
                    zk0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        zk0Var = this.r;
        if (zk0Var.getPaddingTop() == dp2) {
        }
    }
}
