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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l8 extends rt0 {
    public final e2.r0 f0;
    public final /* synthetic */ t8 g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public float k0;
    public final /* synthetic */ t8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(t8 t8Var, Context context) {
        super(context, null);
        this.l0 = t8Var;
        this.g0 = t8Var;
        this.f0 = new e2.r0();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        t8 t8Var = this.l0;
        if (!t8Var.U) {
            if (!t8Var.h) {
                canvas.save();
                float x10 = t8Var.a.getX() + t8Var.r.getX();
                float y10 = t8Var.a.getY() + t8Var.r.getY();
                int i7 = t8Var.d - t8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - t8Var.c) >> 1), t8Var.N);
                canvas.translate(x10, T1);
                t8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i7 / 2.0f;
                rectF.set(x10, T1 - (t8Var.E * f10), t8Var.a.getMeasuredWidth() + x10, (f10 * t8Var.E) + t8Var.a.getMeasuredHeight() + T1);
                m8 m8Var = t8Var.a;
                float f11 = x10 + m8Var.D;
                float f12 = T1 + m8Var.E;
                pc pcVar = t8Var.K;
                float f13 = m8Var.y;
                pcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                pcVar.i = false;
                pcVar.c = 0;
                pcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (t8Var.e.getVisibility() == 0 ? t8Var.e.getAlpha() : 0.0f)) * t8Var.a.s.c;
            if (alpha != 0.0f) {
                t8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(t8Var.H.getX(), t8Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, t8Var.H.getMeasuredWidth(), t8Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                t8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                t8Var.H.setVisibility(8);
            }
        }
        if (t8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        t8 t8Var = this.l0;
        Paint paint = t8Var.O;
        if (view == t8Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
        if (view != kVar || t8Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            paint.setAlpha((int) (t8Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) t8Var.getParentLayout()).p(canvas2, (int) (t8Var.N * 255.0f), view.getMeasuredHeight());
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
        org.telegram.ui.ActionBar.k kVar;
        Q();
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f;
        t8 t8Var = this.l0;
        float f10 = 0.0f;
        if (z9 != t8Var.U) {
            t8Var.U = z9;
            org.telegram.messenger.g0.E2(t8Var.a);
            org.telegram.messenger.g0.Z2(t8Var.getParentActivity(), t8Var.getClassGuid());
            if (t8Var.U) {
                t8Var.n0(false, 0.0f);
                t8Var.a.setExpanded(false);
                addView(t8Var.a, 0, c8.ha.c(-1.0f, -1));
            } else {
                t8Var.r.addView(t8Var.a, 0, c8.ha.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(t8Var.getParentActivity(), t8Var.getClassGuid());
        }
        if (t8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) t8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) t8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) t8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z10 = t8Var.L;
        boolean z11 = this.f >= org.telegram.messenger.g0.L(20.0f);
        t8Var.L = z11;
        if (z10 != z11) {
            super.onMeasure(i7, i10);
            if (t8Var.L) {
                int i12 = -t8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.c61 c61Var = t8Var.r;
            c61Var.setTranslationY((c61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) t8Var.r.getLayoutParams()).topMargin = i11;
            boolean z12 = t8Var.L;
            if (!t8Var.U) {
                t8Var.M = ValueAnimator.ofFloat(t8Var.N, z12 ? 1.0f : 0.0f);
                float f11 = ((t8Var.d - t8Var.c) - org.telegram.messenger.g0.m) * t8Var.E;
                if (z12) {
                    t8Var.a.setExpanded(false);
                    f11 = t8Var.r.getTranslationY();
                } else {
                    f10 = t8Var.r.getTranslationY();
                }
                if (!t8Var.F || z12) {
                    t8Var.F = false;
                } else {
                    t8Var.a.setExpanded(true);
                }
                t8Var.M.addUpdateListener(new o8(t8Var, f11, f10, z12));
                t8Var.M.addListener(new i8(t8Var, 1));
                t8Var.M.setDuration(250L);
                t8Var.M.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                t8Var.M.start();
            }
        }
        super.onMeasure(i7, i10);
        t8Var.c = t8Var.a.getMeasuredHeight();
        t8Var.d = t8Var.a.getMeasuredWidth();
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
        t8 t8Var = this.g0;
        if (t8Var.N > 0.0f || t8Var.U || i10 <= 0 || t8Var.E <= 0.0f) {
            return;
        }
        t8Var.i0();
        t8Var.n0(true, Utilities.i(t8Var.E - (i10 / t8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        t8 t8Var = this.g0;
        if (t8Var.N > 0.0f || t8Var.U || i12 == 0) {
            return;
        }
        t8Var.i0();
        t8Var.n0(true, Utilities.i(t8Var.E - (i12 / t8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f0.a = i7;
        this.g0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        t8 t8Var = this.g0;
        return t8Var.N <= 0.0f && !t8Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f0.a = 0;
        t8 t8Var = this.g0;
        t8Var.l0(t8Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        t8 t8Var = this.l0;
        if (!t8Var.K.b(motionEvent)) {
            if (!t8Var.U) {
                if (motionEvent.getAction() == 0) {
                    n8 n8Var = t8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    n8Var.getHitRect(rect);
                    rect.offset(0, (int) t8Var.r.getY());
                    if (t8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.h0 = true;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z9 = this.h0) || this.i0)) {
                    if (!z9) {
                        t8Var.n0(true, Utilities.i(((-(this.k0 - motionEvent.getY())) / t8Var.d) + this.j0, 1.0f, 0.0f));
                    } else if (Math.abs(this.k0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.h0 = false;
                        this.i0 = true;
                        this.j0 = t8Var.E;
                        motionEvent.getX();
                        this.k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.i0) {
                        t8Var.l0(t8Var.E > 0.5f, false, false);
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
