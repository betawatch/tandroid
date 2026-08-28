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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ce1 extends org.telegram.ui.Components.xu0 {
    public boolean s0;
    public final Paint t0;
    public final /* synthetic */ we1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce1(we1 we1Var, Context context) {
        super(context, null);
        this.u0 = we1Var;
        setWillNotDraw(false);
        this.t0 = new Paint();
    }

    @Override // org.telegram.ui.Components.xu0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            we1 we1Var = this.u0;
            if (we1Var.c1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                we1Var.c1.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
    @Override // org.telegram.ui.Components.xu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            we1 we1Var = this.u0;
            if (i9 >= we1Var.J.getChildCount()) {
                return;
            }
            View childAt = we1Var.J.getChildAt(i9);
            if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + we1Var.J.getX(), childAt.getY() + we1Var.J.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.uu0)) {
                    arrayList.add((org.telegram.ui.Components.uu0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        we1 we1Var = this.u0;
        ng.d dVar = we1Var.d1;
        ng.d dVar2 = we1Var.c1;
        ig.e eVar = we1Var.b1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            we1Var.w0();
            dy dyVar = we1Var.I0;
            int measuredWidth = dyVar != null ? dyVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            dy dyVar2 = we1Var.I0;
            int measuredHeight = dyVar2 != null ? dyVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
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
        if (we1Var.isInPreviewMode()) {
            int themedColor = we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6);
            Paint paint = this.t0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (we1Var.S * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.f6.k0);
        } else {
            canvas2 = canvas;
        }
        if (we1Var.I0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6), we1Var.a1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        we1 we1Var = this.u0;
        kVar = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
        if (view == kVar && !we1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.m71 m71Var = we1Var.W0;
            int measuredHeight = (int) (y10 + ((int) ((((m71Var == null || m71Var.getVisibility() == 8) ? 0.0f : we1Var.W0.getMeasuredHeight()) * we1Var.S) + height)));
            ((ActionBarLayout) we1Var.getParentLayout()).p(canvas, (int) ((1.0f - we1Var.S) * 255.0f), measuredHeight);
            float f10 = we1Var.S;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.f6.k0.getAlpha();
                    org.telegram.ui.ActionBar.f6.k0.setAlpha((int) (alpha * we1Var.S));
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.f6.k0);
                    org.telegram.ui.ActionBar.f6.k0.setAlpha(alpha);
                } else {
                    float f12 = measuredHeight;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.f6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
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
        int paddingRight = (i11 - i9) - getPaddingRight();
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
                int i21 = i20 & 112;
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
                            we1 we1Var = this.u0;
                            if (!we1Var.isInPreviewMode()) {
                                kVar = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
                                int top = kVar.getTop();
                                kVar2 = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        we1 we1Var = this.u0;
        b81 b81Var = we1Var.k0;
        if (b81Var != null) {
            this.s0 = true;
            ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i12 = we1Var.a1;
            layoutParams.height = dp + i12;
            we1Var.k0.setPadding(0, 0, 0, i12);
            this.s0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i9, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i9, 0, i10, i11);
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
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
