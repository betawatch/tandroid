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
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ha0 extends aw0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ FrameLayout x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha0(org.telegram.ui.ActionBar.m2 m2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.w0 = i10;
        this.y0 = m2Var;
        this.x0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.aw0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                ((na0) this.y0).V.Q(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cu0[] cu0VarArr;
        cu0 cu0Var;
        switch (this.w0) {
            case 0:
                na0 na0Var = (na0) this.y0;
                ka0 ka0Var = na0Var.V;
                if (ka0Var != null && (cu0Var = (cu0VarArr = ka0Var.k0)[0]) != null && cu0Var.h.getFastScroll() != null && cu0VarArr[0].h.getFastScroll().n) {
                    return na0Var.V.O(motionEvent);
                }
                ka0 ka0Var2 = na0Var.V;
                if (ka0Var2 == null || !ka0Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                } else if (passcodeActivity.c0()) {
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
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.x0;
                zg1 zg1Var = (zg1) this.y0;
                if (zg1Var.e0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (zg1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (zg1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                zg1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
                na0 na0Var = (na0) this.y0;
                p6[] p6VarArr = na0Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = na0Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) na0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) na0Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x0.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.m2) na0Var).actionBar;
                layoutParams2.topMargin = kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (h5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) h5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.ok.A(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (p6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) p6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) na0Var.y.getLayoutParams()).topMargin = org.telegram.messenger.ok.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
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
                zg1 zg1Var = (zg1) this.y0;
                if (zg1Var.e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.k0) this.x0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                zg1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
