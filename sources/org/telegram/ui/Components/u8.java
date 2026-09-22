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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u8 extends pv0 {
    public float A0;
    public float B0;
    public final /* synthetic */ c9 C0;
    public final b2.q0 w0;
    public final /* synthetic */ c9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(c9 c9Var, Context context) {
        super(context, null);
        this.C0 = c9Var;
        this.x0 = c9Var;
        this.w0 = new b2.q0();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        c9 c9Var = this.C0;
        if (!c9Var.U) {
            if (!c9Var.h) {
                canvas.save();
                float x10 = c9Var.a.getX() + c9Var.r.getX();
                float y3 = c9Var.a.getY() + c9Var.r.getY();
                int i10 = c9Var.d - c9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - c9Var.c) >> 1), c9Var.N);
                canvas.translate(x10, lerp);
                c9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (c9Var.E * f7), c9Var.a.getMeasuredWidth() + x10, (f7 * c9Var.E) + c9Var.a.getMeasuredHeight() + lerp);
                v8 v8Var = c9Var.a;
                float f10 = x10 + v8Var.y;
                float f11 = lerp + v8Var.E;
                dd ddVar = c9Var.K;
                float f12 = v8Var.x;
                ddVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                ddVar.i = false;
                ddVar.c = 0;
                ddVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (c9Var.e.getVisibility() == 0 ? c9Var.e.getAlpha() : 0.0f)) * c9Var.a.s.c;
            if (alpha != 0.0f) {
                c9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(c9Var.H.getX(), c9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, c9Var.H.getMeasuredWidth(), c9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                c9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                c9Var.H.setVisibility(8);
            }
        }
        if (c9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        c9 c9Var = this.C0;
        Paint paint = c9Var.O;
        if (view == c9Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
        if (view != kVar || c9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
            paint.setAlpha((int) (c9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) c9Var.getParentLayout()).p(canvas2, (int) (c9Var.N * 255.0f), view.getMeasuredHeight());
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
        c9 c9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != c9Var.U) {
            c9Var.U = z10;
            AndroidUtilities.removeFromParent(c9Var.a);
            AndroidUtilities.requestAdjustNothing(c9Var.getParentActivity(), c9Var.getClassGuid());
            if (c9Var.U) {
                c9Var.i0(0.0f, false);
                c9Var.a.setExpanded(false);
                addView(c9Var.a, 0, w7.x5.c(-1.0f, -1));
            } else {
                c9Var.r.addView(c9Var.a, 0, w7.x5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(c9Var.getParentActivity(), c9Var.getClassGuid());
        }
        if (c9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) c9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) c9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) c9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = c9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        c9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (c9Var.L) {
                int i13 = -c9Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            cc1 cc1Var = c9Var.r;
            cc1Var.setTranslationY((cc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) c9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = c9Var.L;
            if (!c9Var.U) {
                c9Var.M = ValueAnimator.ofFloat(c9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((c9Var.d - c9Var.c) - AndroidUtilities.statusBarHeight) * c9Var.E;
                if (z13) {
                    c9Var.a.setExpanded(false);
                    f10 = c9Var.r.getTranslationY();
                } else {
                    f7 = c9Var.r.getTranslationY();
                }
                if (!c9Var.F || z13) {
                    c9Var.F = false;
                } else {
                    c9Var.a.setExpanded(true);
                }
                c9Var.M.addUpdateListener(new x8(c9Var, f10, f7, z13));
                c9Var.M.addListener(new r8(c9Var, 1));
                c9Var.M.setDuration(250L);
                c9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                c9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        c9Var.c = c9Var.a.getMeasuredHeight();
        c9Var.d = c9Var.a.getMeasuredWidth();
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
        c9 c9Var = this.x0;
        if (c9Var.N > 0.0f || c9Var.U || i11 <= 0 || c9Var.E <= 0.0f) {
            return;
        }
        c9Var.d0();
        c9Var.i0(Utilities.clamp(c9Var.E - (i11 / c9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        c9 c9Var = this.x0;
        if (c9Var.N > 0.0f || c9Var.U || i13 == 0) {
            return;
        }
        c9Var.d0();
        c9Var.i0(Utilities.clamp(c9Var.E - (i13 / c9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        c9 c9Var = this.x0;
        return c9Var.N <= 0.0f && !c9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        c9 c9Var = this.x0;
        c9Var.g0(c9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        c9 c9Var = this.C0;
        if (!c9Var.K.b(motionEvent)) {
            if (!c9Var.U) {
                if (motionEvent.getAction() == 0) {
                    w8 w8Var = c9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    w8Var.getHitRect(rect);
                    rect.offset(0, (int) c9Var.r.getY());
                    if (c9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        c9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / c9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = c9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        c9Var.g0(c9Var.E > 0.5f, false, false);
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
