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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x8 extends ov0 {
    public float A0;
    public float B0;
    public final /* synthetic */ f9 C0;
    public final b2.q0 w0;
    public final /* synthetic */ f9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(f9 f9Var, Context context) {
        super(context, null);
        this.C0 = f9Var;
        this.x0 = f9Var;
        this.w0 = new b2.q0();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        f9 f9Var = this.C0;
        if (!f9Var.U) {
            if (!f9Var.h) {
                canvas.save();
                float x10 = f9Var.a.getX() + f9Var.r.getX();
                float y3 = f9Var.a.getY() + f9Var.r.getY();
                int i10 = f9Var.d - f9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f9Var.c) >> 1), f9Var.N);
                canvas.translate(x10, lerp);
                f9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (f9Var.E * f7), f9Var.a.getMeasuredWidth() + x10, (f7 * f9Var.E) + f9Var.a.getMeasuredHeight() + lerp);
                y8 y8Var = f9Var.a;
                float f10 = x10 + y8Var.y;
                float f11 = lerp + y8Var.E;
                gd gdVar = f9Var.K;
                float f12 = y8Var.x;
                gdVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                gdVar.i = false;
                gdVar.c = 0;
                gdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (f9Var.e.getVisibility() == 0 ? f9Var.e.getAlpha() : 0.0f)) * f9Var.a.s.c;
            if (alpha != 0.0f) {
                f9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(f9Var.H.getX(), f9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f9Var.H.getMeasuredWidth(), f9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                f9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                f9Var.H.setVisibility(8);
            }
        }
        if (f9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        f9 f9Var = this.C0;
        Paint paint = f9Var.O;
        if (view == f9Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        if (view != kVar || f9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            paint.setAlpha((int) (f9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) f9Var.getParentLayout()).p(canvas2, (int) (f9Var.N * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j3);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        b2.q0 q0Var = this.w0;
        return q0Var.b | q0Var.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.N == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        R();
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f;
        f9 f9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != f9Var.U) {
            f9Var.U = z10;
            AndroidUtilities.removeFromParent(f9Var.a);
            AndroidUtilities.requestAdjustNothing(f9Var.getParentActivity(), f9Var.getClassGuid());
            if (f9Var.U) {
                f9Var.i0(0.0f, false);
                f9Var.a.setExpanded(false);
                addView(f9Var.a, 0, w7.x5.c(-1.0f, -1));
            } else {
                f9Var.r.addView(f9Var.a, 0, w7.x5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(f9Var.getParentActivity(), f9Var.getClassGuid());
        }
        if (f9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) f9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) f9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) f9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = f9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        f9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (f9Var.L) {
                int i13 = -f9Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            cc1 cc1Var = f9Var.r;
            cc1Var.setTranslationY((cc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) f9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = f9Var.L;
            if (!f9Var.U) {
                f9Var.M = ValueAnimator.ofFloat(f9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((f9Var.d - f9Var.c) - AndroidUtilities.statusBarHeight) * f9Var.E;
                if (z13) {
                    f9Var.a.setExpanded(false);
                    f10 = f9Var.r.getTranslationY();
                } else {
                    f7 = f9Var.r.getTranslationY();
                }
                if (!f9Var.F || z13) {
                    f9Var.F = false;
                } else {
                    f9Var.a.setExpanded(true);
                }
                f9Var.M.addUpdateListener(new a9(f9Var, f10, f7, z13));
                f9Var.M.addListener(new u8(f9Var, 1));
                f9Var.M.setDuration(250L);
                f9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                f9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        f9Var.c = f9Var.a.getMeasuredHeight();
        f9Var.d = f9Var.a.getMeasuredWidth();
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
        f9 f9Var = this.x0;
        if (f9Var.N > 0.0f || f9Var.U || i11 <= 0 || f9Var.E <= 0.0f) {
            return;
        }
        f9Var.d0();
        f9Var.i0(Utilities.clamp(f9Var.E - (i11 / f9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        f9 f9Var = this.x0;
        if (f9Var.N > 0.0f || f9Var.U || i13 == 0) {
            return;
        }
        f9Var.d0();
        f9Var.i0(Utilities.clamp(f9Var.E - (i13 / f9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        f9 f9Var = this.x0;
        return f9Var.N <= 0.0f && !f9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        f9 f9Var = this.x0;
        f9Var.g0(f9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        f9 f9Var = this.C0;
        if (!f9Var.K.b(motionEvent)) {
            if (!f9Var.U) {
                if (motionEvent.getAction() == 0) {
                    z8 z8Var = f9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    z8Var.getHitRect(rect);
                    rect.offset(0, (int) f9Var.r.getY());
                    if (f9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        f9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / f9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = f9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        f9Var.g0(f9Var.E > 0.5f, false, false);
                    }
                    this.y0 = false;
                    this.z0 = false;
                }
            }
            if (!this.z0 && !super.onTouchEvent(motionEvent) && !this.y0) {
                return false;
            }
        }
        return true;
    }
}
