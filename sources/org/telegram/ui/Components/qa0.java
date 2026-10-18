package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qa0 extends jw0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ FrameLayout x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa0(org.telegram.ui.ActionBar.n2 n2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.w0 = i10;
        this.y0 = n2Var;
        this.x0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.jw0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                ((wa0) this.y0).V.Q(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lu0[] lu0VarArr;
        lu0 lu0Var;
        switch (this.w0) {
            case 0:
                wa0 wa0Var = (wa0) this.y0;
                ta0 ta0Var = wa0Var.V;
                if (ta0Var != null && (lu0Var = (lu0VarArr = ta0Var.k0)[0]) != null && lu0Var.h.getFastScroll() != null && lu0VarArr[0].h.getFastScroll().n) {
                    return wa0Var.V.O(motionEvent);
                }
                ta0 ta0Var2 = wa0Var.V;
                if (ta0Var2 == null || !ta0Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.x0;
                if (visibility == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.v.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.f0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                S();
                break;
            case 2:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.x0;
                xf1 xf1Var = (xf1) this.y0;
                if (xf1Var.e0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (xf1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        m0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        m0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (xf1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    m0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    m0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                xf1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.w0) {
            case 0:
                wa0 wa0Var = (wa0) this.y0;
                q6[] q6VarArr = wa0Var.x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = wa0Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wa0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) wa0Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x0.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.n2) wa0Var).actionBar;
                layoutParams2.topMargin = kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (j5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) j5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.kk.A(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (q6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) q6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) wa0Var.y.getLayoutParams()).topMargin = org.telegram.messenger.kk.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.y0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.x0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                xf1 xf1Var = (xf1) this.y0;
                if (xf1Var.e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.m0) this.x0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                xf1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
