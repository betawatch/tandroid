package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ee1 extends org.telegram.ui.Components.hv0 {
    public boolean s0;
    public final Paint t0;
    public final /* synthetic */ ze1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(ze1 ze1Var, Context context) {
        super(context, null);
        this.u0 = ze1Var;
        setWillNotDraw(false);
        this.t0 = new Paint();
    }

    @Override // org.telegram.ui.Components.hv0
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ze1 ze1Var = this.u0;
            if (ze1Var.c1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f9);
                ze1Var.c1.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.hv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ze1 ze1Var = this.u0;
            if (i10 >= ze1Var.J.getChildCount()) {
                return;
            }
            View childAt = ze1Var.J.getChildAt(i10);
            if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + ze1Var.J.getX(), childAt.getY() + ze1Var.J.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.ev0)) {
                    arrayList.add((org.telegram.ui.Components.ev0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ze1 ze1Var = this.u0;
        qg.d dVar = ze1Var.d1;
        qg.d dVar2 = ze1Var.c1;
        lg.e eVar = ze1Var.b1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ze1Var.x0();
            fy fyVar = ze1Var.I0;
            int measuredWidth = fyVar != null ? fyVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            fy fyVar2 = ze1Var.I0;
            int measuredHeight = fyVar2 != null ? fyVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (dVar2 != null && !dVar2.n && dVar2.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.n && dVar.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (ze1Var.isInPreviewMode()) {
            int themedColor = ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            Paint paint = this.t0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (ze1Var.S * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.g6.k0);
        } else {
            canvas2 = canvas;
        }
        if (ze1Var.I0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6), ze1Var.a1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        ze1 ze1Var = this.u0;
        lVar = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
        if (view == lVar && !ze1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
            float y8 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.y71 y71Var = ze1Var.W0;
            int measuredHeight = (int) (y8 + ((int) ((((y71Var == null || y71Var.getVisibility() == 8) ? 0.0f : ze1Var.W0.getMeasuredHeight()) * ze1Var.S) + height)));
            ((ActionBarLayout) ze1Var.getParentLayout()).p(canvas, (int) ((1.0f - ze1Var.S) * 255.0f), measuredHeight);
            float f9 = ze1Var.S;
            if (f9 > 0.0f) {
                if (f9 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.g6.k0.getAlpha();
                    org.telegram.ui.ActionBar.g6.k0.setAlpha((int) (alpha * ze1Var.S));
                    float f10 = measuredHeight;
                    canvas.drawLine(0.0f, f10, getMeasuredWidth(), f10, org.telegram.ui.ActionBar.g6.k0);
                    org.telegram.ui.ActionBar.g6.k0.setAlpha(alpha);
                } else {
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.g6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & 112;
                int i23 = absoluteGravity & 7;
                if (i23 == 1) {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = layoutParams.leftMargin + paddingLeft;
                    if (i22 != 16) {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i22 != 80) {
                        i19 = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof org.telegram.ui.ActionBar.l)) {
                            ze1 ze1Var = this.u0;
                            if (!ze1Var.isInPreviewMode()) {
                                lVar = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
                                int top = lVar.getTop();
                                lVar2 = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
                                i19 += lVar2.getMeasuredHeight() + top;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = paddingBottom - measuredHeight;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i22 != 16) {
                }
                i19 = i17 - i18;
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ze1 ze1Var = this.u0;
        n31 n31Var = ze1Var.k0;
        if (n31Var != null) {
            this.s0 = true;
            ViewGroup.LayoutParams layoutParams = n31Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = ze1Var.a1;
            layoutParams.height = dp + i13;
            ze1Var.k0.setPadding(0, 0, 0, i13);
            this.s0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, 0);
                } else {
                    i12 = i14;
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                    i16++;
                    i14 = i12;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
