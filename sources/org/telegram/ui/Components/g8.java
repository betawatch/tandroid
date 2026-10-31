package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g8 extends uu0 {
    public final ac.g f0;
    public final /* synthetic */ o8 g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public float k0;
    public final /* synthetic */ o8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(o8 o8Var, Context context) {
        super(context, null);
        this.l0 = o8Var;
        this.g0 = o8Var;
        this.f0 = new ac.g();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        o8 o8Var = this.l0;
        if (!o8Var.U) {
            if (!o8Var.h) {
                canvas.save();
                float x10 = o8Var.a.getX() + o8Var.r.getX();
                float y3 = o8Var.a.getY() + o8Var.r.getY();
                int i10 = o8Var.d - o8Var.c;
                float T1 = org.telegram.messenger.i0.T1(y3, org.telegram.messenger.i0.m + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - o8Var.c) >> 1), o8Var.N);
                canvas.translate(x10, T1);
                o8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = i10 / 2.0f;
                rectF.set(x10, T1 - (o8Var.E * f7), o8Var.a.getMeasuredWidth() + x10, (f7 * o8Var.E) + o8Var.a.getMeasuredHeight() + T1);
                h8 h8Var = o8Var.a;
                float f10 = x10 + h8Var.D;
                float f11 = T1 + h8Var.E;
                jc jcVar = o8Var.K;
                float f12 = h8Var.y;
                jcVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                jcVar.i = false;
                jcVar.c = 0;
                jcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (o8Var.e.getVisibility() == 0 ? o8Var.e.getAlpha() : 0.0f)) * o8Var.a.s.c;
            if (alpha != 0.0f) {
                o8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(o8Var.H.getX(), o8Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, o8Var.H.getMeasuredWidth(), o8Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                o8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                o8Var.H.setVisibility(8);
            }
        }
        if (o8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        o8 o8Var = this.l0;
        Paint paint = o8Var.O;
        if (view == o8Var.H) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
        if (view != lVar || o8Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            paint.setAlpha((int) (o8Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) o8Var.getParentLayout()).p(canvas2, (int) (o8Var.N * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f0.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.l0.N == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        Q();
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f;
        o8 o8Var = this.l0;
        float f7 = 0.0f;
        if (z10 != o8Var.U) {
            o8Var.U = z10;
            org.telegram.messenger.i0.E2(o8Var.a);
            org.telegram.messenger.i0.Y2(o8Var.getParentActivity(), o8Var.getClassGuid());
            if (o8Var.U) {
                o8Var.m0(false, 0.0f);
                o8Var.a.setExpanded(false);
                addView(o8Var.a, 0, w7.b6.c(-1.0f, -1));
            } else {
                o8Var.r.addView(o8Var.a, 0, w7.b6.c(-2.0f, -1));
            }
            org.telegram.messenger.i0.Z2(o8Var.getParentActivity(), o8Var.getClassGuid());
        }
        if (o8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) o8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) o8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) o8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(18.0f);
        }
        boolean z11 = o8Var.L;
        boolean z12 = this.f >= org.telegram.messenger.i0.L(20.0f);
        o8Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (o8Var.L) {
                int i13 = -o8Var.b.getTop();
                lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
                i12 = org.telegram.messenger.i0.L(8.0f) + lVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            org.telegram.ui.u71 u71Var = o8Var.r;
            u71Var.setTranslationY((u71Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) o8Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = o8Var.L;
            if (!o8Var.U) {
                o8Var.M = ValueAnimator.ofFloat(o8Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((o8Var.d - o8Var.c) - org.telegram.messenger.i0.m) * o8Var.E;
                if (z13) {
                    o8Var.a.setExpanded(false);
                    f10 = o8Var.r.getTranslationY();
                } else {
                    f7 = o8Var.r.getTranslationY();
                }
                if (!o8Var.F || z13) {
                    o8Var.F = false;
                } else {
                    o8Var.a.setExpanded(true);
                }
                o8Var.M.addUpdateListener(new j8(o8Var, f10, f7, z13));
                o8Var.M.addListener(new d8(o8Var, 1));
                o8Var.M.setDuration(250L);
                o8Var.M.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                o8Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        o8Var.c = o8Var.a.getMeasuredHeight();
        o8Var.d = o8Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o8 o8Var = this.g0;
        if (o8Var.N > 0.0f || o8Var.U || i11 <= 0 || o8Var.E <= 0.0f) {
            return;
        }
        o8Var.h0();
        o8Var.m0(true, Utilities.i(o8Var.E - (i11 / o8Var.d), 1.0f, 0.0f));
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o8 o8Var = this.g0;
        if (o8Var.N > 0.0f || o8Var.U || i13 == 0) {
            return;
        }
        o8Var.h0();
        o8Var.m0(true, Utilities.i(o8Var.E - (i13 / o8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f0.a = i10;
        this.g0.h0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        o8 o8Var = this.g0;
        return o8Var.N <= 0.0f && !o8Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f0.a = 0;
        o8 o8Var = this.g0;
        o8Var.k0(o8Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        o8 o8Var = this.l0;
        if (!o8Var.K.b(motionEvent)) {
            if (!o8Var.U) {
                if (motionEvent.getAction() == 0) {
                    i8 i8Var = o8Var.b;
                    Rect rect = org.telegram.messenger.i0.Q;
                    i8Var.getHitRect(rect);
                    rect.offset(0, (int) o8Var.r.getY());
                    if (o8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.h0 = true;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.h0) || this.i0)) {
                    if (!z10) {
                        o8Var.m0(true, Utilities.i(((-(this.k0 - motionEvent.getY())) / o8Var.d) + this.j0, 1.0f, 0.0f));
                    } else if (Math.abs(this.k0 - motionEvent.getY()) > org.telegram.messenger.i0.e) {
                        this.h0 = false;
                        this.i0 = true;
                        this.j0 = o8Var.E;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.i0) {
                        o8Var.k0(o8Var.E > 0.5f, false, false);
                    }
                    this.h0 = false;
                    this.i0 = false;
                }
            }
            if (!this.i0 && !super.onTouchEvent(motionEvent) && !this.h0) {
                return false;
            }
        }
        return true;
    }
}
