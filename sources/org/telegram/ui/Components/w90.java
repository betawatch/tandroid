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
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w90 extends ov0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ FrameLayout x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w90(org.telegram.ui.ActionBar.n2 n2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.w0 = i10;
        this.y0 = n2Var;
        this.x0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.ov0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                ((ca0) this.y0).V.Q(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        switch (this.w0) {
            case 0:
                ca0 ca0Var = (ca0) this.y0;
                z90 z90Var = ca0Var.V;
                if (z90Var != null && (qt0Var = (qt0VarArr = z90Var.k0)[0]) != null && qt0Var.h.getFastScroll() != null && qt0VarArr[0].h.getFastScroll().n) {
                    return ca0Var.V.O(motionEvent);
                }
                z90 z90Var2 = ca0Var.V;
                if (z90Var2 == null || !z90Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                org.telegram.ui.j0 j0Var = (org.telegram.ui.j0) this.x0;
                hh1 hh1Var = (hh1) this.y0;
                if (hh1Var.e0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (hh1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        j0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        j0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (hh1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    j0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    j0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                hh1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
                ca0 ca0Var = (ca0) this.y0;
                q6[] q6VarArr = ca0Var.x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = ca0Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ca0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) ca0Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x0.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.n2) ca0Var).actionBar;
                layoutParams2.topMargin = kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (j5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) j5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.wl.y(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (q6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) q6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) ca0Var.y.getLayoutParams()).topMargin = org.telegram.messenger.wl.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
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
                hh1 hh1Var = (hh1) this.y0;
                if (hh1Var.e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.j0) this.x0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                hh1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
