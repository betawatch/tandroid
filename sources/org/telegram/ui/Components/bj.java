package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bj extends ei {
    public mh.d1 n;
    public int r;
    public zi s;
    public ra v;
    public int w;
    public q0.a x;

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        mi miVar = this.b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        miVar.U0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.n.x0(0);
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        mh.d1 d1Var = this.n;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = d1Var.getChildAt(0);
        el0 el0Var = (el0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        d1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.x = aVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        mh.d1 d1Var = this.n;
        ra raVar = this.v;
        if (AndroidUtilities.isTablet()) {
            this.w = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.w = 4;
            } else {
                this.w = 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int dp = ((i10 - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(10.0f)) / this.w;
        if (this.r != dp) {
            this.r = dp;
            raVar.l();
        }
        this.s.y1(Math.max(1, ((this.w - 1) * AndroidUtilities.dp(5.0f)) + (this.w * dp)));
        int ceil = (int) Math.ceil((((ArrayList) raVar.e).size() - 1) / this.w);
        Math.max(0, ((i11 - ((AndroidUtilities.dp(5.0f) * (ceil - 1)) + (dp * ceil))) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(60.0f));
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                int dp2 = i12 - AndroidUtilities.dp(52.0f);
                i13 = dp2 >= 0 ? dp2 : 0;
                if (d1Var.getPaddingTop() == i13) {
                    d1Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp22 = i12 - AndroidUtilities.dp(52.0f);
        if (dp22 >= 0) {
        }
        if (d1Var.getPaddingTop() == i13) {
        }
    }
}
