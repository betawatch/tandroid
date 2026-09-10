package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gc1 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc1(Context context) {
        super(context);
        this.a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                si1 si1Var = (si1) this.b;
                Camera camera = si1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = si1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f7 = -width;
                float f10 = -height;
                matrix.preTranslate(f7, f10);
                float f11 = width;
                float f12 = height;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = si1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f7, f10);
                matrix2.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 18:
                wh.o1 o1Var = (wh.o1) this.b;
                RectF rectF = o1Var.h;
                RectF rectF2 = o1Var.f;
                RectF rectF3 = o1Var.e;
                Paint paint = o1Var.n;
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.c6, false)));
                float d = o1Var.c.d(o1Var.b, false);
                double d10 = d;
                int floor = (int) Math.floor(d10);
                ArrayList arrayList = o1Var.d;
                int clamp = Utilities.clamp(floor, arrayList.size() - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                if (clamp < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp));
                } else if (clamp2 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp2));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (clamp2 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp2));
                } else if (clamp < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                float height2 = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height2, height2, paint);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        View view;
        switch (this.a) {
            case 1:
                if (((ci.j) this.b).e0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 9:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.n0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            view = getChildAt(i11);
                            if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y3 < view.getY() || y3 > view.getY() + view.getHeight()) {
                                i11++;
                            }
                        } else {
                            view = null;
                        }
                    }
                    scrollSlidingTextTabStrip.c0 = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.c0));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.c0 = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.c0;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.c0);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.c0.getX();
                        int width2 = scrollSlidingTextTabStrip.c0.getWidth();
                        if (width < 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            while (true) {
                                if (i10 < getChildCount()) {
                                    View childAt = getChildAt(i10);
                                    float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                        i10++;
                                    }
                                } else {
                                    i10 = getChildCount() - 1;
                                }
                            }
                        }
                        if (i10 != indexOfChild) {
                            org.telegram.ui.Components.vm0 vm0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i10);
                            vm0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.c0;
                    if (view3 != null) {
                        final int i12 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.tm0
                            public final /* synthetic */ gc1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        gc1 gc1Var = this.b;
                                        gc1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) gc1Var.b).invalidate();
                                        break;
                                    default:
                                        gc1 gc1Var2 = this.b;
                                        gc1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) gc1Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.wr.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.c0;
                    if (view4 != null) {
                        final int i13 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.tm0
                            public final /* synthetic */ gc1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        gc1 gc1Var = this.b;
                                        gc1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) gc1Var.b).invalidate();
                                        break;
                                    default:
                                        gc1 gc1Var2 = this.b;
                                        gc1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) gc1Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.wr.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                }
                return scrollSlidingTextTabStrip.c0 != null || super.dispatchTouchEvent(motionEvent);
            case 19:
                if (((xh.u3) this.b).U.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 20:
                if (((xh.z7) this.b).f0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 14:
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (getChildAt(i10).getVisibility() == 0) {
                        super.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 5:
                if (view == ((org.telegram.ui.Components.d9) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 8:
                org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) this.b;
                if (view instanceof org.telegram.ui.Components.ox0) {
                    ((org.telegram.ui.Components.ox0) view).a(sm0Var.i0);
                }
                if (view == sm0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                boolean drawChild = super.drawChild(canvas, view, j3);
                k70 k70Var = (k70) this.b;
                if (view == k70Var.b && k70Var.x != null) {
                    int measuredHeight = k70Var.s.getMeasuredHeight();
                    k70Var.x.setBounds(0, measuredHeight, getMeasuredWidth(), k70Var.x.getIntrinsicHeight() + measuredHeight);
                    k70Var.x.draw(canvas);
                }
                return drawChild;
            case 17:
                qg.m1 m1Var = ((qg.l1) this.b).c;
                if (view == m1Var.r0 && m1Var.H0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) this.b;
                    if (i10 >= y0VarArr.length) {
                        break;
                    } else {
                        y0VarArr[i10].invalidate();
                        i10++;
                    }
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((zi1) this.b).B0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                return org.telegram.ui.ActionBar.x4.b((org.telegram.ui.ActionBar.x4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 6:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.ew) this.b).s.F && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.a2.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 7:
                ((org.telegram.ui.Components.k20) this.b).c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 8:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.l0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Size size;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), TLObject.FLAG_30));
                break;
            case 2:
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                hi.g2 g2Var = (hi.g2) this.b;
                LinearLayout linearLayout = g2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g2Var.m0.getLayoutParams();
                    paddingRight += g2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = g2Var.n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g2Var.n0.getLayoutParams();
                    paddingRight += g2Var.n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = g2Var.o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) g2Var.o0.getLayoutParams();
                    paddingRight += g2Var.o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                g2Var.k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i10, i11);
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                hi.e4 e4Var = (hi.e4) this.b;
                LinearLayout linearLayout4 = e4Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) e4Var.L.getLayoutParams();
                    paddingRight2 += e4Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = e4Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) e4Var.M.getLayoutParams();
                    paddingRight2 += e4Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = e4Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) e4Var.N.getLayoutParams();
                    paddingRight2 += e4Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                e4Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i10, i11);
                break;
            case 4:
                org.telegram.ui.ActionBar.x4 x4Var = (org.telegram.ui.ActionBar.x4) this.b;
                if (org.telegram.ui.ActionBar.x4.b(x4Var) && (size = x4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.ew) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.g41) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 14:
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i12++;
                    }
                }
                int size4 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size5 = View.MeasureSpec.getSize(i11);
                if (i12 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size4 / i12);
                    if (((PhotoViewer) this.b).j1.getVisibility() == 0) {
                        int max = Math.max(0, (min - AndroidUtilities.dp(((PhotoViewer) this.b).X7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).j1.setPadding(max, 0, max, 0);
                    }
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i12), size5);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size4, size5);
                    break;
                }
            case 15:
                super.onMeasure(i10, i11);
                mh1 mh1Var = (mh1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) mh1Var.c.getLayoutParams();
                int i15 = 0;
                int dp = AndroidUtilities.dp(8.0f) + (mh1Var.a.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0);
                if (mh1Var.O == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i15 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = dp + i15;
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 9:
                super.setAlpha(f7);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 10:
                org.telegram.ui.Components.jx0 jx0Var = (org.telegram.ui.Components.jx0) this.b;
                org.telegram.ui.Components.w9 w9Var = jx0Var.b;
                if (getVisibility() == 8 && i10 == 0) {
                    jx0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        w9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    w9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }
}
