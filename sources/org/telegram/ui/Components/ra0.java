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
import org.telegram.ui.bg1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ra0 extends ow0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ FrameLayout x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra0(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.w0 = i10;
        this.y0 = o2Var;
        this.x0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.ow0
    public void K(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                ((xa0) this.y0).V.R(canvas, arrayList);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qu0[] qu0VarArr;
        qu0 qu0Var;
        switch (this.w0) {
            case 0:
                xa0 xa0Var = (xa0) this.y0;
                ua0 ua0Var = xa0Var.V;
                if (ua0Var != null && (qu0Var = (qu0VarArr = ua0Var.k0)[0]) != null && qu0Var.h.getFastScroll() != null && qu0VarArr[0].h.getFastScroll().n) {
                    return xa0Var.V.P(motionEvent);
                }
                ua0 ua0Var2 = xa0Var.V;
                if (ua0Var2 == null || !ua0Var2.I(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.x0;
                if (visibility == 8 || Q() < AndroidUtilities.dp(20.0f)) {
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
                    measuredHeight = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                R();
                break;
            case 2:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.x0;
                bg1 bg1Var = (bg1) this.y0;
                if (bg1Var.e0.getVisibility() == 8 || Q() < AndroidUtilities.dp(20.0f)) {
                    if (bg1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (bg1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                bg1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
                xa0 xa0Var = (xa0) this.y0;
                q6[] q6VarArr = xa0Var.x;
                org.telegram.ui.ActionBar.n5[] n5VarArr = xa0Var.w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xa0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) xa0Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x0.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.o2) xa0Var).actionBar;
                layoutParams2.topMargin = kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (n5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) n5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.sl.A(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (q6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) q6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) xa0Var.y.getLayoutParams()).topMargin = org.telegram.messenger.sl.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.y0;
                if (passcodeActivity.v.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.x0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                bg1 bg1Var = (bg1) this.y0;
                if (bg1Var.e0.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.l0) this.x0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                bg1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
