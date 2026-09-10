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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pf1 extends org.telegram.ui.Components.aw0 {
    public boolean w0;
    public final Paint x0;
    public final /* synthetic */ ig1 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf1(ig1 ig1Var, Context context) {
        super(context, null);
        this.y0 = ig1Var;
        setWillNotDraw(false);
        this.x0 = new Paint();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ig1 ig1Var = this.y0;
            if (ig1Var.g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                ig1Var.g1.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
    @Override // org.telegram.ui.Components.aw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ig1 ig1Var = this.y0;
            if (i10 >= ig1Var.N.getChildCount()) {
                return;
            }
            View childAt = ig1Var.N.getChildAt(i10);
            if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + ig1Var.N.getX(), childAt.getY() + ig1Var.N.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.xv0)) {
                    arrayList.add((org.telegram.ui.Components.xv0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ig1 ig1Var = this.y0;
        eh.d dVar = ig1Var.h1;
        eh.d dVar2 = ig1Var.g1;
        zg.e eVar = ig1Var.f1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ig1Var.x0();
            wy wyVar = ig1Var.M0;
            int measuredWidth = wyVar != null ? wyVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            wy wyVar2 = ig1Var.M0;
            int measuredHeight = wyVar2 != null ? wyVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (dVar2 != null && !dVar2.n && dVar2.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.n && dVar.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (ig1Var.isInPreviewMode()) {
            int themedColor = ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            Paint paint = this.x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (ig1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.k0);
        } else {
            canvas2 = canvas;
        }
        if (ig1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), ig1Var.e1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        ig1 ig1Var = this.y0;
        lVar = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
        if (view == lVar && !ig1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
            float y3 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.u81 u81Var = ig1Var.a1;
            int measuredHeight = (int) (y3 + ((int) ((((u81Var == null || u81Var.getVisibility() == 8) ? 0.0f : ig1Var.a1.getMeasuredHeight()) * ig1Var.W) + height)));
            ((ActionBarLayout) ig1Var.getParentLayout()).p(canvas, (int) ((1.0f - ig1Var.W) * 255.0f), measuredHeight);
            float f7 = ig1Var.W;
            if (f7 > 0.0f) {
                if (f7 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.k0.setAlpha((int) (alpha * ig1Var.W));
                    float f10 = measuredHeight;
                    canvas.drawLine(0.0f, f10, getMeasuredWidth(), f10, org.telegram.ui.ActionBar.j6.k0);
                    org.telegram.ui.ActionBar.j6.k0.setAlpha(alpha);
                } else {
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.j6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                            ig1 ig1Var = this.y0;
                            if (!ig1Var.isInPreviewMode()) {
                                lVar = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
                                int top = lVar.getTop();
                                lVar2 = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
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
        ig1 ig1Var = this.y0;
        m91 m91Var = ig1Var.o0;
        if (m91Var != null) {
            this.w0 = true;
            ViewGroup.LayoutParams layoutParams = m91Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = ig1Var.e1;
            layoutParams.height = dp + i13;
            ig1Var.o0.setPadding(0, 0, 0, i13);
            this.w0 = false;
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
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }
}
