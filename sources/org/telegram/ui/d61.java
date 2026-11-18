package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d61 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d61(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                ci.r rVar = (ci.r) this.b;
                d61 d61Var = rVar.c;
                int i7 = rVar.e;
                if (i7 >= 0 && i7 < d61Var.getChildCount()) {
                    float width = (r1.getWidth() / 2.0f) + r1.getLeft();
                    if (d61Var.getChildAt(rVar.e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f)) {
                            rVar.f = width;
                        } else {
                            float f10 = rVar.f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f;
                                }
                                rVar.f = width;
                                d61Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f, d61Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                float f12 = chatActivityEnterView.w1;
                if (f12 < 1.0f) {
                    if (f12 <= 0.0f) {
                        super.dispatchDraw(canvas);
                        break;
                    } else {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.w1) * 255.0f));
                        super.dispatchDraw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        break;
                    }
                }
                break;
            case 18:
                int width2 = getWidth() / 2;
                int height = getHeight() / 2;
                bc1 bc1Var = (bc1) this.b;
                Camera camera = bc1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = bc1Var.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f13 = -width2;
                float f14 = -height;
                matrix.preTranslate(f13, f14);
                float f15 = width2;
                float f16 = height;
                matrix.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = bc1Var.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f13, f14);
                matrix2.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
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
                if (((di.z5) this.b).b0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 3:
                if (((di.pb) this.b).u0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 4:
                if (((ii.t) this.b).t0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.o0) {
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
                    scrollSlidingTextTabStrip.d0 = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.d0));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.d0 = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.d0;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.d0);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.d0.getX();
                        int width2 = scrollSlidingTextTabStrip.d0.getWidth();
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
                            org.telegram.ui.Components.hl0 hl0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i7);
                            hl0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.d0;
                    if (view3 != null) {
                        final int i11 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.fl0
                            public final /* synthetic */ org.telegram.ui.d61 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        org.telegram.ui.d61 d61Var = this.b;
                                        d61Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) d61Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.d61 d61Var2 = this.b;
                                        d61Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) d61Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.lr.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.d0;
                    if (view4 != null) {
                        final int i12 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.fl0
                            public final /* synthetic */ org.telegram.ui.d61 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.d61 d61Var = this.b;
                                        d61Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) d61Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.d61 d61Var2 = this.b;
                                        d61Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) d61Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.lr.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                }
                return scrollSlidingTextTabStrip.d0 != null || super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 20:
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
                if (!(view instanceof org.telegram.ui.ActionBar.e1) || ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).O == null) {
                    return super.drawChild(canvas, view, j3);
                }
                return false;
            case 10:
                if (view == ((org.telegram.ui.Components.y8) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 14:
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.b;
                if (view instanceof org.telegram.ui.Components.pv0) {
                    ((org.telegram.ui.Components.pv0) view).a(el0Var.j0);
                }
                if (view == el0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 19:
                boolean drawChild = super.drawChild(canvas, view, j3);
                f50 f50Var = (f50) this.b;
                if (view == f50Var.b && f50Var.y != null) {
                    int measuredHeight = f50Var.s.getMeasuredHeight();
                    f50Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), f50Var.y.getIntrinsicHeight() + measuredHeight);
                    f50Var.y.draw(canvas);
                }
                return drawChild;
            case 25:
                ug.i1 i1Var = (ug.i1) ((di.l4) this.b).d;
                if (view == i1Var.n2 && i1Var.D2) {
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
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.b;
                    if (i7 >= x0VarArr.length) {
                        break;
                    } else {
                        x0VarArr[i7].invalidate();
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
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((hc1) this.b).B0);
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
                return org.telegram.ui.ActionBar.k4.b((org.telegram.ui.ActionBar.k4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 11:
                super.onLayout(z10, i7, i10, i11, i12);
                setPivotX(getWidth());
                break;
            case 12:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.jv) this.b).s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.f3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 13:
                ((org.telegram.ui.Components.c10) this.b).c.a(getMeasuredWidth());
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 14:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 15:
                super.onLayout(z10, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.m0 = false;
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
                oi.z1 z1Var = (oi.z1) this.b;
                LinearLayout linearLayout = z1Var.n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z1Var.n0.getLayoutParams();
                    paddingRight += z1Var.n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = z1Var.o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z1Var.o0.getLayoutParams();
                    paddingRight += z1Var.o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = z1Var.p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z1Var.p0.getLayoutParams();
                    paddingRight += z1Var.p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                z1Var.l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                break;
            case 7:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                oi.x3 x3Var = (oi.x3) this.b;
                LinearLayout linearLayout4 = x3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x3Var.M.getLayoutParams();
                    paddingRight2 += x3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = x3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) x3Var.N.getLayoutParams();
                    paddingRight2 += x3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = x3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) x3Var.O.getLayoutParams();
                    paddingRight2 += x3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                x3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                break;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
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
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i14 = Math.max(i14, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i15 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.F;
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
                org.telegram.ui.ActionBar.k4 k4Var = (org.telegram.ui.ActionBar.k4) this.b;
                super.onMeasure((!org.telegram.ui.ActionBar.k4.b(k4Var) || (size = k4Var.J) == null) ? i7 : View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30), i11);
                break;
            case 12:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.jv) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i11);
                break;
            case 17:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.gd.a0) {
                    ((org.telegram.ui.Components.w21) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 20:
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
                    if (((PhotoViewer) this.b).k1.getVisibility() == 0) {
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(((PhotoViewer) this.b).Y7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).k1.setPadding(max, 0, max, 0);
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
            case 22:
                super.onMeasure(i7, i10);
                bb1 bb1Var = (bb1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) bb1Var.c.getLayoutParams();
                int L = org.telegram.messenger.g0.L(8.0f) + (bb1Var.a.getVisibility() == 8 ? org.telegram.messenger.g0.m : 0);
                if (bb1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x <= point.y) {
                        i12 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i12;
                break;
            case 24:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.n6) this.b).D0) * getMeasuredHeight()));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 15:
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
            case 16:
                org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) this.b;
                org.telegram.ui.Components.q9 q9Var = kv0Var.b;
                if (getVisibility() == 8 && i7 == 0) {
                    kv0Var.c();
                    if (org.telegram.messenger.pc.e(3)) {
                        q9Var.getImageReceiver().P0(false);
                    }
                } else if (i7 == 8) {
                    q9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d61(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(ContextThemeWrapper contextThemeWrapper, final qn0 qn0Var) {
        super(contextThemeWrapper);
        this.a = 21;
        this.b = new org.telegram.ui.ActionBar.z0[]{r0, r0, r0, r0, r0};
        final int i7 = 1;
        setOrientation(1);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_0_2, org.telegram.messenger.gd.M0(2131745028, null), false, null);
        c10.d(-328966, -328966);
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                qn0 qn0Var2 = qn0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_slow, org.telegram.messenger.gd.M0(2131745031, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i7;
                qn0 qn0Var2 = qn0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_normal, org.telegram.messenger.gd.M0(2131745032, null), false, null);
        c12.d(-328966, -328966);
        final int i11 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                qn0 qn0Var2 = qn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_fast, org.telegram.messenger.gd.M0(2131745035, null), false, null);
        c13.d(-328966, -328966);
        final int i12 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                qn0 qn0Var2 = qn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_speed_superfast, org.telegram.messenger.gd.M0(2131745029, null), false, null);
        c14.d(-328966, -328966);
        final int i13 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                qn0 qn0Var2 = qn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        View ih0Var = new ih0(contextThemeWrapper, 8);
        ih0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ih0Var.setBackgroundColor(-15198184);
        addView(ih0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ih0Var.getLayoutParams();
        if (org.telegram.messenger.gd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        ih0Var.setLayoutParams(layoutParams);
    }
}
