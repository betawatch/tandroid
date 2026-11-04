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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xe0 extends FrameLayout {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public int H;
    public g2.g I;
    public org.telegram.ui.ActionBar.e6 J;
    public int K;
    public ve0 L;
    public Rect M;
    public boolean N;
    public float O;
    public float P;
    public Runnable Q;
    public boolean R;
    public SparseIntArray a;
    public float b;
    public float c;
    public y00 d;
    public boolean e;
    public boolean f;
    public boolean h;
    public Paint n;
    public Paint r;
    public int s;
    public Path w;
    public RectF x;
    public ArrayList y;

    public final void a(float f10, float f11) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.b, f10).setDuration((long) (Math.max(0.5f, Math.abs(this.b - f10) - Math.min(0.2f, f11)) * 300.0f));
        duration.setInterpolator(xq.f);
        this.I.d();
        duration.addUpdateListener(new ue0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 5));
        duration.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
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
        this.H = -1;
        this.b = 0.0f;
        c(true);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        ArrayList arrayList = this.y;
        if (this.O != this.c || this.P != this.b) {
            if (!arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((we0) arrayList.get(i3)).a(this.c, this.b);
                }
            }
            this.O = this.c;
            this.P = this.b;
        }
        View childAt = getChildAt(0);
        int i10 = this.H;
        View childAt2 = (i10 < 0 || i10 >= getChildCount()) ? null : getChildAt(this.H);
        childAt.setTranslationX((-this.b) * getWidth() * 0.5f);
        float f12 = ((1.0f - this.b) * 0.05f) + 0.95f;
        childAt.setScaleX(f12);
        childAt.setScaleY(f12);
        if (childAt2 != null) {
            childAt2.setTranslationX((1.0f - this.b) * getWidth());
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt3 = getChildAt(i11);
            if (i11 == 0) {
                if (this.b == 1.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.b != 1.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else if (i11 == this.H) {
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
            f10 = childAt2.getMeasuredWidth();
            f11 = this.F;
            if (f11 == 0.0f) {
                f11 = childAt2.getMeasuredHeight();
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
        float f13 = this.b;
        float f14 = ((f10 - measuredWidth) * f13) + measuredWidth;
        float y9 = com.google.android.recaptcha.internal.a.y(f11, measuredHeight, f13, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f14 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, y9 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = true;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt4 = getChildAt(i12);
            childAt4.setPivotX(0.0f);
            childAt4.setPivotY(0.0f);
        }
        invalidate();
    }

    public final boolean d(View view, MotionEvent motionEvent) {
        Rect rect = this.M;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof org.telegram.ui.ActionBar.v0))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                if (d(viewGroup.getChildAt(i3), motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.w;
        RectF rectF = this.x;
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        float top = childAt.getTop();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        int i3 = this.H;
        if (i3 != -1 && i3 < getChildCount()) {
            View childAt2 = getChildAt(this.H);
            float top2 = childAt2.getTop();
            float measuredWidth2 = childAt2.getMeasuredWidth();
            float f10 = this.F;
            if (f10 == 0.0f) {
                f10 = childAt2.getMeasuredHeight();
            }
            if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                top = org.telegram.messenger.g0.T1(top, top2, this.b);
                measuredWidth = org.telegram.messenger.g0.T1(measuredWidth, measuredWidth2, this.b);
                measuredHeight = org.telegram.messenger.g0.T1(measuredHeight, f10, this.b);
            }
        }
        int save = canvas.save();
        path.rewind();
        int L = org.telegram.messenger.g0.L(12.0f);
        if (this.R) {
            rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
        } else {
            rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
        }
        float f11 = L;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        if (this.L == null || this.K == rectF.height()) {
            return;
        }
        ve0 ve0Var = this.L;
        int height = (int) rectF.height();
        this.K = height;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) ((org.telegram.ui.ur) ve0Var).b;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var == null || d2Var.getFragmentView() == null || !d2VarArr[0].isInPreviewMode()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = d2VarArr[0].getFragmentView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = org.telegram.messenger.g0.L(48.0f) + height;
            d2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RectF rectF = this.x;
        int action = motionEvent.getAction() & org.telegram.messenger.hs.e4;
        if (this.f) {
            z10 = true;
        } else if (((GestureDetector) this.d.a).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
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
            int i3 = this.H;
            if (i3 < 0 || i3 >= getChildCount()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(this.H);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint = this.n;
        Paint paint2 = this.r;
        int indexOfChild = indexOfChild(view);
        if (this.N) {
            float f10 = this.b * 2.0f;
            float min = indexOfChild == 0 ? 1.0f - Math.min(1.0f, f10) : Math.max(0.0f, f10 - 1.0f);
            if (min <= 0.0f) {
                return false;
            }
            if (min >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            int saveLayerAlpha = canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), (int) (min * 255.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restoreToCount(saveLayerAlpha);
            return drawChild;
        }
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i3 = this.s;
            if (i3 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.J));
            } else {
                paint2.setColor(i3);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getMeasuredWidth() + view.getX(), getMeasuredHeight(), paint2);
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild2;
    }

    public final void e(int i3) {
        if (this.f) {
            return;
        }
        this.H = i3;
        this.F = this.a.get(i3);
        a(1.0f, 0.0f);
    }

    public final void f(int i3, int i10, boolean z10) {
        this.a.put(i3, i10);
        int i11 = this.H;
        if (i3 == i11 && i11 >= 0 && i11 < getChildCount()) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            if (!z10) {
                this.F = i10;
                c(true);
                return;
            }
            View childAt = getChildAt(this.H);
            float f10 = this.F;
            if (f10 == 0.0f) {
                f10 = childAt.getMeasuredHeight();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f10, i10).setDuration(240L);
            duration.setInterpolator(ks.e);
            duration.addUpdateListener(new ue0(this, 1));
            this.f = true;
            duration.addListener(new a60(this, 10));
            duration.start();
            this.G = duration;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.R) {
                    int i14 = i11 - i3;
                    int i15 = i12 - i10;
                    childAt.layout(i14 - childAt.getMeasuredWidth(), i15 - childAt.getMeasuredHeight(), i14, i15);
                } else {
                    int i16 = i12 - i10;
                    childAt.layout(0, i16 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i16);
                }
            } else if (this.R) {
                int i17 = i11 - i3;
                childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        c(true);
    }

    public void setForegroundColor(int i3) {
        this.s = i3;
    }

    public void setForegroundOnGlass(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            invalidate();
        }
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.Q = runnable;
    }

    public void setOnHeightUpdateListener(ve0 ve0Var) {
        this.L = ve0Var;
    }

    public void setStickToRight(boolean z10) {
        this.R = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.E = z10;
    }
}
