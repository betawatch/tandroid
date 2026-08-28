package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yi extends ci {
    public gh.f1 n;
    public int r;
    public jh.k s;
    public ra v;
    public int w;
    public q0.a x;

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        ki kiVar = this.b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.T0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.n.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        gh.f1 f1Var = this.n;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
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
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int i11;
        int i12;
        gh.f1 f1Var = this.n;
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
        int dp = ((i9 - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(10.0f)) / this.w;
        if (this.r != dp) {
            this.r = dp;
            raVar.l();
        }
        this.s.y1(Math.max(1, ((this.w - 1) * AndroidUtilities.dp(5.0f)) + (this.w * dp)));
        int ceil = (int) Math.ceil((((ArrayList) raVar.e).size() - 1) / this.w);
        Math.max(0, ((i10 - ((AndroidUtilities.dp(5.0f) * (ceil - 1)) + (dp * ceil))) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(60.0f));
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                int dp2 = i11 - AndroidUtilities.dp(52.0f);
                i12 = dp2 >= 0 ? dp2 : 0;
                if (f1Var.getPaddingTop() == i12) {
                    f1Var.setPadding(AndroidUtilities.dp(6.0f), i12, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int dp22 = i11 - AndroidUtilities.dp(52.0f);
        if (dp22 >= 0) {
        }
        if (f1Var.getPaddingTop() == i12) {
        }
    }
}
