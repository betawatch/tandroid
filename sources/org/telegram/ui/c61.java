package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c61 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c61(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                ai.w wVar = (ai.w) this.b;
                c61 c61Var = wVar.c;
                int i7 = wVar.e;
                if (i7 >= 0 && i7 < c61Var.getChildCount()) {
                    float width = (r2.getWidth() / 2.0f) + r2.getLeft();
                    if (c61Var.getChildAt(wVar.e).getWidth() != 0) {
                        if (Float.isNaN(wVar.f)) {
                            wVar.f = width;
                        } else {
                            float f10 = wVar.f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + wVar.f;
                                }
                                wVar.f = width;
                                c61Var.invalidate();
                            }
                        }
                        canvas.drawCircle(wVar.f, c61Var.getHeight() / 2.0f, (wVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, wVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 17:
                int width2 = getWidth() / 2;
                int height = getHeight() / 2;
                yb1 yb1Var = (yb1) this.b;
                Camera camera = yb1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = yb1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f12 = -width2;
                float f13 = -height;
                matrix.preTranslate(f12, f13);
                float f14 = width2;
                float f15 = height;
                matrix.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = yb1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f12, f13);
                matrix2.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 25:
                zh.g1 g1Var = (zh.g1) this.b;
                RectF rectF = g1Var.h;
                RectF rectF2 = g1Var.f;
                RectF rectF3 = g1Var.e;
                Paint paint = g1Var.n;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c6, false)));
                float e10 = g1Var.c.e(false, g1Var.b);
                double d = e10;
                int floor = (int) Math.floor(d);
                ArrayList arrayList = g1Var.d;
                int j3 = Utilities.j(floor, arrayList.size() - 1, 0);
                int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (j3 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j3));
                } else if (j10 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j10));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (j10 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j10));
                } else if (j3 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j3));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                org.telegram.messenger.g0.Z1(rectF3, rectF2, e10 - j3, rectF);
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
        int i7;
        View view;
        switch (this.a) {
            case 2:
                if (((bi.e7) this.b).a0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 3:
                if (((bi.dd) this.b).t0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 4:
                if (((gi.f) this.b).s0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 14:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.n0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            view = getChildAt(i10);
                            if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y10 < view.getY() || y10 > view.getY() + view.getHeight()) {
                                i10++;
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
                        if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.c0.getX();
                        int width2 = scrollSlidingTextTabStrip.c0.getWidth();
                        if (width < 0.0f) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                            while (true) {
                                if (i7 < getChildCount()) {
                                    View childAt = getChildAt(i7);
                                    float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                        i7++;
                                    }
                                } else {
                                    i7 = getChildCount() - 1;
                                }
                            }
                        }
                        if (i7 != indexOfChild) {
                            org.telegram.ui.Components.uk0 uk0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i7);
                            uk0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.c0;
                    if (view3 != null) {
                        final int i11 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.sk0
                            public final /* synthetic */ org.telegram.ui.c61 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        org.telegram.ui.c61 c61Var = this.b;
                                        c61Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) c61Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.c61 c61Var2 = this.b;
                                        c61Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) c61Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.c0;
                    if (view4 != null) {
                        final int i12 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.sk0
                            public final /* synthetic */ org.telegram.ui.c61 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.c61 c61Var = this.b;
                                        c61Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) c61Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.c61 c61Var2 = this.b;
                                        c61Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) c61Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                }
                return scrollSlidingTextTabStrip.c0 != null || super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 19:
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getVisibility() == 0) {
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
            case 8:
                if (!(view instanceof org.telegram.ui.ActionBar.d1) || ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).N == null) {
                    return super.drawChild(canvas, view, j3);
                }
                return false;
            case 10:
                if (view == ((org.telegram.ui.Components.t8) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) this.b;
                if (view instanceof org.telegram.ui.Components.fv0) {
                    ((org.telegram.ui.Components.fv0) view).a(rk0Var.i0);
                }
                if (view == rk0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 18:
                boolean drawChild = super.drawChild(canvas, view, j3);
                d50 d50Var = (d50) this.b;
                if (view == d50Var.b && d50Var.y != null) {
                    int measuredHeight = d50Var.s.getMeasuredHeight();
                    d50Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), d50Var.y.getIntrinsicHeight() + measuredHeight);
                    d50Var.y.draw(canvas);
                }
                return drawChild;
            case 24:
                ug.f1 f1Var = (ug.f1) ((bi.k5) this.b).d;
                if (view == f1Var.j2 && f1Var.z2) {
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
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) this.b;
                    if (i7 >= v0VarArr.length) {
                        break;
                    } else {
                        v0VarArr[i7].invalidate();
                        i7++;
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
            case 22:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((ec1) this.b).A0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 9:
                return org.telegram.ui.ActionBar.i4.b((org.telegram.ui.ActionBar.i4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 11:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.yu) this.b).s.F && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.k5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 12:
                ((org.telegram.ui.Components.r00) this.b).c.a(getMeasuredWidth());
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 13:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.l0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        Size size;
        int i11 = i10;
        int i12 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), TLObject.FLAG_30));
                break;
            case 6:
                int size2 = View.MeasureSpec.getSize(i7);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                li.b2 b2Var = (li.b2) this.b;
                LinearLayout linearLayout = b2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2Var.m0.getLayoutParams();
                    paddingRight += b2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = b2Var.n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) b2Var.n0.getLayoutParams();
                    paddingRight += b2Var.n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = b2Var.o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) b2Var.o0.getLayoutParams();
                    paddingRight += b2Var.o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                b2Var.k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                break;
            case 7:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                li.y3 y3Var = (li.y3) this.b;
                LinearLayout linearLayout4 = y3Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) y3Var.L.getLayoutParams();
                    paddingRight2 += y3Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = y3Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) y3Var.M.getLayoutParams();
                    paddingRight2 += y3Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = y3Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) y3Var.N.getLayoutParams();
                    paddingRight2 += y3Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                y3Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                break;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.O) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < childCount) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(R.id.width_tag);
                            Object tag2 = childAt.getTag(R.id.object_tag);
                            Object tag3 = childAt.getTag(R.id.fit_width_tag);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i7, 0, i11, 0);
                            if (tag3 == null) {
                                boolean z9 = tag instanceof Integer;
                                if (!z9 && tag2 == null) {
                                    i14 = Math.max(i14, childAt.getMeasuredWidth());
                                } else if (z9) {
                                    i15 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.E;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i13++;
                        i11 = i10;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i12 < size4) {
                            ((View) arrayList.get(i12)).getLayoutParams().width = Math.max(i14, i15);
                            i12++;
                        }
                    }
                }
                super.onMeasure(i7, i10);
                break;
            case 9:
                org.telegram.ui.ActionBar.i4 i4Var = (org.telegram.ui.ActionBar.i4) this.b;
                super.onMeasure((!org.telegram.ui.ActionBar.i4.b(i4Var) || (size = i4Var.J) == null) ? i7 : View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30), i11);
                break;
            case 11:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.yu) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i11);
                break;
            case 16:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.hd.a0) {
                    ((org.telegram.ui.Components.c21) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 19:
                int childCount2 = getChildCount();
                int i16 = 0;
                for (int i17 = 0; i17 < childCount2; i17++) {
                    if (getChildAt(i17).getVisibility() == 0) {
                        i16++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i11);
                if (i16 != 0) {
                    int min = Math.min(org.telegram.messenger.g0.L(56.0f), size5 / i16);
                    if (((PhotoViewer) this.b).j1.getVisibility() == 0) {
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(((PhotoViewer) this.b).X7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).j1.setPadding(max, 0, max, 0);
                    }
                    while (i12 < childCount2) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                        }
                        i12++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i16), size6);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                    break;
                }
            case 21:
                super.onMeasure(i7, i10);
                ya1 ya1Var = (ya1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) ya1Var.c.getLayoutParams();
                int L = org.telegram.messenger.g0.L(8.0f) + (ya1Var.a.getVisibility() == 8 ? org.telegram.messenger.g0.m : 0);
                if (ya1Var.O == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x <= point.y) {
                        i12 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i12;
                break;
            case 23:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.y5) this.b).A0) * getMeasuredHeight()));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 14:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 15:
                org.telegram.ui.Components.av0 av0Var = (org.telegram.ui.Components.av0) this.b;
                org.telegram.ui.Components.l9 l9Var = av0Var.b;
                if (getVisibility() == 8 && i7 == 0) {
                    av0Var.c();
                    if (org.telegram.messenger.rc.e(3)) {
                        l9Var.getImageReceiver().P0(false);
                    }
                } else if (i7 == 8) {
                    l9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c61(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(ContextThemeWrapper contextThemeWrapper, final ln0 ln0Var) {
        super(contextThemeWrapper);
        this.a = 20;
        this.b = new org.telegram.ui.ActionBar.z0[]{r0, r0, r0, r0, r0};
        final int i7 = 1;
        setOrientation(1);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_0_2, org.telegram.messenger.hd.M0(2131745264, null), false, null);
        c10.d(-328966, -328966);
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ln0 ln0Var2 = ln0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_slow, org.telegram.messenger.hd.M0(2131745267, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i7;
                ln0 ln0Var2 = ln0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_normal, org.telegram.messenger.hd.M0(2131745268, null), false, null);
        c12.d(-328966, -328966);
        final int i11 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ln0 ln0Var2 = ln0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_fast, org.telegram.messenger.hd.M0(2131745271, null), false, null);
        c13.d(-328966, -328966);
        final int i12 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ln0 ln0Var2 = ln0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_superfast, org.telegram.messenger.hd.M0(2131745265, null), false, null);
        c14.d(-328966, -328966);
        final int i13 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                ln0 ln0Var2 = ln0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        View rq0Var = new rq0(contextThemeWrapper, 6);
        rq0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        rq0Var.setBackgroundColor(-15198184);
        addView(rq0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rq0Var.getLayoutParams();
        if (org.telegram.messenger.hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        rq0Var.setLayoutParams(layoutParams);
    }
}
