package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ij extends li {
    public bi.r1 n;
    public int r;
    public ei.k s;
    public za v;
    public int w;
    public q0.a x;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        bi.r1 r1Var = this.n;
        za zaVar = this.v;
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
            zaVar.l();
        }
        this.s.z1(Math.max(1, ((this.w - 1) * AndroidUtilities.dp(5.0f)) + (this.w * dp)));
        int ceil = (int) Math.ceil((((ArrayList) zaVar.e).size() - 1) / this.w);
        Math.max(0, ((i11 - ((AndroidUtilities.dp(5.0f) * (ceil - 1)) + (dp * ceil))) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(60.0f));
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                int dp2 = i12 - AndroidUtilities.dp(52.0f);
                i13 = dp2 >= 0 ? dp2 : 0;
                if (r1Var.getPaddingTop() == i13) {
                    r1Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp22 = i12 - AndroidUtilities.dp(52.0f);
        if (dp22 >= 0) {
        }
        if (r1Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        ti tiVar = this.b;
        try {
            tiVar.a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.n.y0(0);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.n;
        if (r1Var.getChildCount() <= 0) {
            r1Var.setTopGlowOffset(r1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        r1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.x = aVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }
}
