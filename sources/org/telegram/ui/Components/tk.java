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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tk extends qi {
    public final a00 n;
    public final qm0 r;
    public final s4.d0 s;
    public final HorizontalScrollView v;
    public final boolean w;

    public tk(yi yiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, yiVar);
        this.w = z10;
        this.f = true;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        boolean z11 = !z10;
        a00 a00Var = new a00(n2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.n = a00Var;
        a00Var.w0 = false;
        a00Var.I(z11, z10, false, false);
        a00Var.n2 = true;
        px pxVar = a00Var.x;
        if (pxVar != null) {
            pxVar.setVisibility(8);
        }
        a00Var.o2 = true;
        ImageView imageView = a00Var.y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        a00Var.M2 = true;
        addView(a00Var, w7.x5.d(-1.0f, -1));
        HorizontalScrollView z12 = a00Var.z(z11 ? 1 : 0);
        this.v = z12;
        qm0 y3 = a00Var.y(z11 ? 1 : 0);
        this.r = y3;
        y3.j(new ai.r(this, 20));
        this.s = (s4.d0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        qm0 qm0Var;
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
                qm0Var = this.r;
                if (qm0Var.getPaddingTop() == dp2) {
                    qm0Var.setPadding(AndroidUtilities.dp(6.0f), dp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
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
        qm0Var = this.r;
        if (qm0Var.getPaddingTop() == dp2) {
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void G(qi qiVar) {
        yi yiVar = this.b;
        try {
            yiVar.a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        yiVar.a1.setTitle(LocaleController.getString(this.w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        qm0 qm0Var = this.r;
        if (qm0Var.getChildCount() <= 0) {
            qm0Var.setTopGlowOffset(qm0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = qm0Var.getChildAt(0);
        am0 am0Var = (am0) qm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
            top = dp;
        }
        qm0Var.setTopGlowOffset(top);
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
    public final int i() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(az azVar) {
        this.n.setDelegate(azVar);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }
}
