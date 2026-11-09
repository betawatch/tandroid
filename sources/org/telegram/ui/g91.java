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
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.tt0 {
    public boolean f0;
    public final Paint g0;
    public final /* synthetic */ y91 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(y91 y91Var, Context context) {
        super(context, null);
        this.h0 = y91Var;
        setWillNotDraw(false);
        this.g0 = new Paint();
    }

    @Override // org.telegram.ui.Components.tt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            y91 y91Var = this.h0;
            if (y91Var.h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                y91Var.h1.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(org.telegram.messenger.qs.I2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.tt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            y91 y91Var = this.h0;
            if (i7 >= y91Var.N.getChildCount()) {
                return;
            }
            View childAt = y91Var.N.getChildAt(i7);
            if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + y91Var.N.getX(), childAt.getY() + y91Var.N.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.qt0)) {
                    arrayList.add((org.telegram.ui.Components.qt0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        y91 y91Var = this.h0;
        ri.f fVar = y91Var.i1;
        ri.f fVar2 = y91Var.h1;
        dh.g gVar = y91Var.g1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            y91Var.B0();
            yw ywVar = y91Var.M0;
            int measuredWidth = ywVar != null ? ywVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            yw ywVar2 = y91Var.M0;
            int measuredHeight = ywVar2 != null ? ywVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (fVar2 != null && !fVar2.r && fVar2.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.i(measuredWidth, measuredHeight), -3);
                fVar2.j();
            }
            if (fVar != null && !fVar.r && fVar.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar.i(measuredWidth, measuredHeight), -2);
                fVar.j();
            }
        }
        super.dispatchDraw(canvas);
        if (y91Var.isInPreviewMode()) {
            int themedColor = y91Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6);
            Paint paint = this.g0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (y91Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.l6.k0);
        } else {
            canvas2 = canvas;
        }
        if (y91Var.M0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, y91Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6), y91Var.f1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        y91 y91Var = this.h0;
        kVar = ((org.telegram.ui.ActionBar.f2) y91Var).actionBar;
        if (view == kVar && !y91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) y91Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.f2) y91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.v61 v61Var = y91Var.a1;
            int measuredHeight = (int) (y10 + ((int) ((((v61Var == null || v61Var.getVisibility() == 8) ? 0.0f : y91Var.a1.getMeasuredHeight()) * y91Var.W) + height)));
            ((ActionBarLayout) y91Var.getParentLayout()).p(canvas, (int) ((1.0f - y91Var.W) * 255.0f), measuredHeight);
            float f10 = y91Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.l6.k0.getAlpha();
                    org.telegram.ui.ActionBar.l6.k0.setAlpha((int) (alpha * y91Var.W));
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.l6.k0);
                    org.telegram.ui.ActionBar.l6.k0.setAlpha(alpha);
                } else {
                    float f12 = measuredHeight;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.l6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i11 - i7) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection());
                int i21 = i20 & org.telegram.messenger.qs.x1;
                int i22 = absoluteGravity & 7;
                if (i22 == 1) {
                    i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = layoutParams.leftMargin + paddingLeft;
                    if (i21 != 16) {
                        i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i21 != 80) {
                        i18 = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof org.telegram.ui.ActionBar.k)) {
                            y91 y91Var = this.h0;
                            if (!y91Var.isInPreviewMode()) {
                                kVar = ((org.telegram.ui.ActionBar.f2) y91Var).actionBar;
                                int top = kVar.getTop();
                                kVar2 = ((org.telegram.ui.ActionBar.f2) y91Var).actionBar;
                                i18 += kVar2.getMeasuredHeight() + top;
                            }
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = paddingBottom - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                } else {
                    i13 = paddingRight - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i21 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        y91 y91Var = this.h0;
        uq0 uq0Var = y91Var.o0;
        if (uq0Var != null) {
            this.f0 = true;
            ViewGroup.LayoutParams layoutParams = uq0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = y91Var.f1;
            layoutParams.height = L + i12;
            y91Var.o0.setPadding(0, 0, 0, i12);
            this.f0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i7, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i7, 0, i10, i11);
                    i15++;
                    i13 = i11;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }
}
