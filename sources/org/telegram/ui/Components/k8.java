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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k8 extends st0 {
    public final e2.r0 f0;
    public final /* synthetic */ s8 g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public float k0;
    public final /* synthetic */ s8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(s8 s8Var, Context context) {
        super(context, null);
        this.l0 = s8Var;
        this.g0 = s8Var;
        this.f0 = new e2.r0();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        s8 s8Var = this.l0;
        if (!s8Var.U) {
            if (!s8Var.h) {
                canvas.save();
                float x10 = s8Var.a.getX() + s8Var.r.getX();
                float y10 = s8Var.a.getY() + s8Var.r.getY();
                int i7 = s8Var.d - s8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - s8Var.c) >> 1), s8Var.N);
                canvas.translate(x10, T1);
                s8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i7 / 2.0f;
                rectF.set(x10, T1 - (s8Var.E * f10), s8Var.a.getMeasuredWidth() + x10, (f10 * s8Var.E) + s8Var.a.getMeasuredHeight() + T1);
                l8 l8Var = s8Var.a;
                float f11 = x10 + l8Var.D;
                float f12 = T1 + l8Var.E;
                oc ocVar = s8Var.K;
                float f13 = l8Var.y;
                ocVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                ocVar.i = false;
                ocVar.c = 0;
                ocVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (s8Var.e.getVisibility() == 0 ? s8Var.e.getAlpha() : 0.0f)) * s8Var.a.s.c;
            if (alpha != 0.0f) {
                s8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(s8Var.H.getX(), s8Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, s8Var.H.getMeasuredWidth(), s8Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                s8Var.H.setVisibility(8);
            }
        }
        if (s8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        s8 s8Var = this.l0;
        Paint paint = s8Var.O;
        if (view == s8Var.H) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
        if (view != lVar || s8Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            paint.setAlpha((int) (s8Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) s8Var.getParentLayout()).p(canvas2, (int) (s8Var.N * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j3);
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.l lVar;
        Q();
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f;
        s8 s8Var = this.l0;
        float f10 = 0.0f;
        if (z9 != s8Var.U) {
            s8Var.U = z9;
            org.telegram.messenger.g0.E2(s8Var.a);
            org.telegram.messenger.g0.Z2(s8Var.getParentActivity(), s8Var.getClassGuid());
            if (s8Var.U) {
                s8Var.n0(false, 0.0f);
                s8Var.a.setExpanded(false);
                addView(s8Var.a, 0, c8.ha.c(-1.0f, -1));
            } else {
                s8Var.r.addView(s8Var.a, 0, c8.ha.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(s8Var.getParentActivity(), s8Var.getClassGuid());
        }
        if (s8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) s8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) s8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) s8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z10 = s8Var.L;
        boolean z11 = this.f >= org.telegram.messenger.g0.L(20.0f);
        s8Var.L = z11;
        if (z10 != z11) {
            super.onMeasure(i7, i10);
            if (s8Var.L) {
                int i12 = -s8Var.b.getTop();
                lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + lVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.e61 e61Var = s8Var.r;
            e61Var.setTranslationY((e61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) s8Var.r.getLayoutParams()).topMargin = i11;
            boolean z12 = s8Var.L;
            if (!s8Var.U) {
                s8Var.M = ValueAnimator.ofFloat(s8Var.N, z12 ? 1.0f : 0.0f);
                float f11 = ((s8Var.d - s8Var.c) - org.telegram.messenger.g0.m) * s8Var.E;
                if (z12) {
                    s8Var.a.setExpanded(false);
                    f11 = s8Var.r.getTranslationY();
                } else {
                    f10 = s8Var.r.getTranslationY();
                }
                if (!s8Var.F || z12) {
                    s8Var.F = false;
                } else {
                    s8Var.a.setExpanded(true);
                }
                s8Var.M.addUpdateListener(new n8(s8Var, f11, f10, z12));
                s8Var.M.addListener(new h8(s8Var, 1));
                s8Var.M.setDuration(250L);
                s8Var.M.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                s8Var.M.start();
            }
        }
        super.onMeasure(i7, i10);
        s8Var.c = s8Var.a.getMeasuredHeight();
        s8Var.d = s8Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        s8 s8Var = this.g0;
        if (s8Var.N > 0.0f || s8Var.U || i10 <= 0 || s8Var.E <= 0.0f) {
            return;
        }
        s8Var.i0();
        s8Var.n0(true, Utilities.i(s8Var.E - (i10 / s8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        s8 s8Var = this.g0;
        if (s8Var.N > 0.0f || s8Var.U || i12 == 0) {
            return;
        }
        s8Var.i0();
        s8Var.n0(true, Utilities.i(s8Var.E - (i12 / s8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f0.a = i7;
        this.g0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        s8 s8Var = this.g0;
        return s8Var.N <= 0.0f && !s8Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f0.a = 0;
        s8 s8Var = this.g0;
        s8Var.l0(s8Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        s8 s8Var = this.l0;
        if (!s8Var.K.b(motionEvent)) {
            if (!s8Var.U) {
                if (motionEvent.getAction() == 0) {
                    m8 m8Var = s8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    m8Var.getHitRect(rect);
                    rect.offset(0, (int) s8Var.r.getY());
                    if (s8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.h0 = true;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z9 = this.h0) || this.i0)) {
                    if (!z9) {
                        s8Var.n0(true, Utilities.i(((-(this.k0 - motionEvent.getY())) / s8Var.d) + this.j0, 1.0f, 0.0f));
                    } else if (Math.abs(this.k0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.h0 = false;
                        this.i0 = true;
                        this.j0 = s8Var.E;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.i0) {
                        s8Var.l0(s8Var.E > 0.5f, false, false);
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
