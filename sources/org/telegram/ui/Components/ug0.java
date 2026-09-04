package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ug0 extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public int G;
    public AnimationNotificationsLocker H;
    public org.telegram.ui.ActionBar.f6 I;
    public int J;
    public sg0 K;
    public Rect L;
    public float M;
    public float N;
    public Runnable O;
    public boolean P;
    public SparseIntArray a;
    public float b;
    public float c;
    public l.d d;
    public boolean e;
    public boolean f;
    public boolean h;
    public Paint n;
    public Paint r;
    public int s;
    public Path v;
    public RectF w;
    public ArrayList x;
    public boolean y;

    public final void a(float f7, float f10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.b, f7).setDuration((long) (Math.max(0.5f, Math.abs(this.b - f7) - Math.min(0.2f, f10)) * 300.0f));
        duration.setInterpolator(pr.f);
        this.H.lock();
        duration.addUpdateListener(new rg0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 5));
        duration.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        c(true);
    }

    public final void b(boolean z10) {
        if (this.f) {
            return;
        }
        if (z10) {
            a(0.0f, 0.0f);
            return;
        }
        this.G = -1;
        this.b = 0.0f;
        c(true);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        ArrayList arrayList = this.x;
        if (this.M != this.c || this.N != this.b) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((tg0) arrayList.get(i10)).a(this.c, this.b);
                }
            }
            this.M = this.c;
            this.N = this.b;
        }
        View childAt = getChildAt(0);
        int i11 = this.G;
        View childAt2 = (i11 < 0 || i11 >= getChildCount()) ? null : getChildAt(this.G);
        childAt.setTranslationX((-this.b) * getWidth() * 0.5f);
        float f11 = ((1.0f - this.b) * 0.05f) + 0.95f;
        childAt.setScaleX(f11);
        childAt.setScaleY(f11);
        if (childAt2 != null) {
            childAt2.setTranslationX((1.0f - this.b) * getWidth());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt3 = getChildAt(i12);
            if (i12 == 0) {
                if (this.b == 1.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.b != 1.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else if (i12 == this.G) {
                if (this.b == 0.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.b != 0.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else {
                childAt3.setVisibility(4);
            }
        }
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (childAt2 != null) {
            f7 = childAt2.getMeasuredWidth();
            f10 = this.E;
            if (f10 == 0.0f) {
                f10 = childAt2.getMeasuredHeight();
            }
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
        float f12 = this.b;
        float f13 = ((f7 - measuredWidth) * f12) + measuredWidth;
        float z11 = com.google.android.gms.internal.vision.e2.z(f10, measuredHeight, f12, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f13 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, z11 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = true;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt4 = getChildAt(i13);
            childAt4.setPivotX(0.0f);
            childAt4.setPivotY(0.0f);
        }
        invalidate();
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Rect rect = this.L;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof org.telegram.ui.ActionBar.c1))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (d(motionEvent, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.v;
        RectF rectF = this.w;
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        float top = childAt.getTop();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        int i10 = this.G;
        if (i10 != -1 && i10 < getChildCount()) {
            View childAt2 = getChildAt(this.G);
            float top2 = childAt2.getTop();
            float measuredWidth2 = childAt2.getMeasuredWidth();
            float f7 = this.E;
            if (f7 == 0.0f) {
                f7 = childAt2.getMeasuredHeight();
            }
            if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                top = AndroidUtilities.lerp(top, top2, this.b);
                measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.b);
                measuredHeight = AndroidUtilities.lerp(measuredHeight, f7, this.b);
            }
        }
        int save = canvas.save();
        path.rewind();
        int dp = AndroidUtilities.dp(12.0f);
        if (this.P) {
            rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
        } else {
            rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
        }
        float f10 = dp;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        if (this.K == null || this.J == rectF.height()) {
            return;
        }
        sg0 sg0Var = this.K;
        int height = (int) rectF.height();
        this.J = height;
        org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) ((org.telegram.ui.iu) sg0Var).b;
        org.telegram.ui.ActionBar.n2 n2Var = n2VarArr[0];
        if (n2Var == null || n2Var.getFragmentView() == null || !n2VarArr[0].isInPreviewMode()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = n2VarArr[0].getFragmentView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + height;
            n2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RectF rectF = this.w;
        int action = motionEvent.getAction() & 255;
        if (this.f) {
            z10 = true;
        } else if (((GestureDetector) this.d.b).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            z10 = this.e;
        } else {
            if (this.e) {
                this.e = false;
                this.h = false;
                a(this.b >= 0.5f ? 1.0f : 0.0f, 0.0f);
            } else if (this.h) {
                this.e = false;
                this.h = false;
            }
            z10 = false;
        }
        if (!z10) {
            int actionMasked = motionEvent.getActionMasked();
            if (rectF != null) {
                rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
            if (actionMasked == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                callOnClick();
                return true;
            }
            int i10 = this.G;
            if (i10 < 0 || i10 >= getChildCount()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(this.G);
            if (this.b > 0.5f) {
                childAt = childAt2;
            }
            boolean dispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
            if ((dispatchTouchEvent || actionMasked != 0) && !dispatchTouchEvent && !onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Paint paint = this.n;
        Paint paint2 = this.r;
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i10 = this.s;
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.I));
            } else {
                paint2.setColor(i10);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(int i10) {
        if (this.f) {
            return;
        }
        this.G = i10;
        this.E = this.a.get(i10);
        a(1.0f, 0.0f);
    }

    public final void f(int i10, int i11, boolean z10) {
        this.a.put(i10, i11);
        int i12 = this.G;
        if (i10 == i12 && i12 >= 0 && i12 < getChildCount()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            if (!z10) {
                this.E = i11;
                c(true);
                return;
            }
            View childAt = getChildAt(this.G);
            float f7 = this.E;
            if (f7 == 0.0f) {
                f7 = childAt.getMeasuredHeight();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f7, i11).setDuration(240L);
            duration.setInterpolator(jt.e);
            duration.addUpdateListener(new rg0(this, 1));
            this.f = true;
            duration.addListener(new r80(this, 7));
            duration.start();
            this.F = duration;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.P) {
                    int i15 = i12 - i10;
                    int i16 = i13 - i11;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), i16 - childAt.getMeasuredHeight(), i15, i16);
                } else {
                    int i17 = i13 - i11;
                    childAt.layout(0, i17 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i17);
                }
            } else if (this.P) {
                int i18 = i12 - i10;
                childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        c(true);
    }

    public void setForegroundColor(int i10) {
        this.s = i10;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.O = runnable;
    }

    public void setOnHeightUpdateListener(sg0 sg0Var) {
        this.K = sg0Var;
    }

    public void setStickToRight(boolean z10) {
        this.P = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.y = z10;
    }
}
