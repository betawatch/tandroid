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
import org.telegram.ui.ag1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e90 extends xu0 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ FrameLayout t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e90(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i9) {
        super(context, null);
        this.s0 = i9;
        this.u0 = o2Var;
        this.t0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.xu0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.s0) {
            case 0:
                ((k90) this.u0).R.Q(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xs0[] xs0VarArr;
        xs0 xs0Var;
        switch (this.s0) {
            case 0:
                k90 k90Var = (k90) this.u0;
                h90 h90Var = k90Var.R;
                if (h90Var != null && (xs0Var = (xs0VarArr = h90Var.g0)[0]) != null && xs0Var.h.getFastScroll() != null && xs0VarArr[0].h.getFastScroll().n) {
                    return k90Var.R.O(motionEvent);
                }
                h90 h90Var2 = k90Var.R;
                if (h90Var2 == null || !h90Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.s0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.u0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.t0;
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
                } else if (passcodeActivity.b0()) {
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
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.t0;
                ag1 ag1Var = (ag1) this.u0;
                if (ag1Var.a0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (ag1Var.a0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        m0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        m0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (ag1Var.u0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    m0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    m0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                ag1Var.a0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.s0) {
            case 0:
                k90 k90Var = (k90) this.u0;
                j6[] j6VarArr = k90Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = k90Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k90Var.R.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) k90Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.t0.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.o2) k90Var).actionBar;
                layoutParams2.topMargin = kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (h5VarArr[i11] != null) {
                        ((FrameLayout.LayoutParams) h5VarArr[i11].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.ll.y(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (j6VarArr[i11] != null) {
                        ((FrameLayout.LayoutParams) j6VarArr[i11].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) k90Var.y.getLayoutParams()).topMargin = org.telegram.messenger.ll.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i9, i10);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.u0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                ag1 ag1Var = (ag1) this.u0;
                if (ag1Var.a0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.m0) this.t0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                ag1Var.a0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
