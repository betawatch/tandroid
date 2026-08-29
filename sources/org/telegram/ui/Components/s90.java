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
import org.telegram.ui.cg1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s90 extends hv0 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ FrameLayout t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s90(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.s0 = i10;
        this.u0 = o2Var;
        this.t0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.hv0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.s0) {
            case 0:
                ((y90) this.u0).R.Q(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        it0[] it0VarArr;
        it0 it0Var;
        switch (this.s0) {
            case 0:
                y90 y90Var = (y90) this.u0;
                v90 v90Var = y90Var.R;
                if (v90Var != null && (it0Var = (it0VarArr = v90Var.g0)[0]) != null && it0Var.h.getFastScroll() != null && it0VarArr[0].h.getFastScroll().n) {
                    return y90Var.R.O(motionEvent);
                }
                v90 v90Var2 = y90Var.R;
                if (v90Var2 == null || !v90Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) this.t0;
                cg1 cg1Var = (cg1) this.u0;
                if (cg1Var.a0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (cg1Var.a0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        n0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        n0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (cg1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    n0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    n0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                cg1Var.a0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.s0) {
            case 0:
                y90 y90Var = (y90) this.u0;
                o6[] o6VarArr = y90Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = y90Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y90Var.R.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar = ((org.telegram.ui.ActionBar.o2) y90Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.t0.getLayoutParams();
                lVar2 = ((org.telegram.ui.ActionBar.o2) y90Var).actionBar;
                layoutParams2.topMargin = lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (h5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) h5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.ui.b.x(22.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (o6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) o6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) y90Var.y.getLayoutParams()).topMargin = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.u0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                cg1 cg1Var = (cg1) this.u0;
                if (cg1Var.a0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.n0) this.t0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                cg1Var.a0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
