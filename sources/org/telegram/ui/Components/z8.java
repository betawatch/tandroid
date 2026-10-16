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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z8 extends ow0 {
    public float A0;
    public float B0;
    public final /* synthetic */ h9 C0;
    public final b2.v0 w0;
    public final /* synthetic */ h9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(h9 h9Var, Context context) {
        super(context, null);
        this.C0 = h9Var;
        this.x0 = h9Var;
        this.w0 = new b2.v0();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        h9 h9Var = this.C0;
        if (!h9Var.U) {
            if (!h9Var.h) {
                canvas.save();
                float x10 = h9Var.a.getX() + h9Var.r.getX();
                float y3 = h9Var.a.getY() + h9Var.r.getY();
                int i10 = h9Var.d - h9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - h9Var.c) >> 1), h9Var.N);
                canvas.translate(x10, lerp);
                h9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (h9Var.E * f7), h9Var.a.getMeasuredWidth() + x10, (f7 * h9Var.E) + h9Var.a.getMeasuredHeight() + lerp);
                a9 a9Var = h9Var.a;
                float f10 = x10 + a9Var.y;
                float f11 = lerp + a9Var.E;
                hd hdVar = h9Var.K;
                float f12 = a9Var.x;
                hdVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                hdVar.i = false;
                hdVar.c = 0;
                hdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (h9Var.e.getVisibility() == 0 ? h9Var.e.getAlpha() : 0.0f)) * h9Var.a.s.c;
            if (alpha != 0.0f) {
                h9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(h9Var.H.getX(), h9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, h9Var.H.getMeasuredWidth(), h9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                h9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                h9Var.H.setVisibility(8);
            }
        }
        if (h9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        h9 h9Var = this.C0;
        Paint paint = h9Var.O;
        if (view == h9Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
        if (view != kVar || h9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            paint.setAlpha((int) (h9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) h9Var.getParentLayout()).p(canvas2, (int) (h9Var.N * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.w0.b();
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
        h9 h9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != h9Var.U) {
            h9Var.U = z10;
            AndroidUtilities.removeFromParent(h9Var.a);
            AndroidUtilities.requestAdjustNothing(h9Var.getParentActivity(), h9Var.getClassGuid());
            if (h9Var.U) {
                h9Var.i0(0.0f, false);
                h9Var.a.setExpanded(false);
                addView(h9Var.a, 0, w7.z5.d(-1.0f, -1));
            } else {
                h9Var.r.addView(h9Var.a, 0, w7.z5.d(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(h9Var.getParentActivity(), h9Var.getClassGuid());
        }
        if (h9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) h9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) h9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) h9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = h9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        h9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (h9Var.L) {
                int i13 = -h9Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            ic1 ic1Var = h9Var.r;
            ic1Var.setTranslationY((ic1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) h9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = h9Var.L;
            if (!h9Var.U) {
                h9Var.M = ValueAnimator.ofFloat(h9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((h9Var.d - h9Var.c) - AndroidUtilities.statusBarHeight) * h9Var.E;
                if (z13) {
                    h9Var.a.setExpanded(false);
                    f10 = h9Var.r.getTranslationY();
                } else {
                    f7 = h9Var.r.getTranslationY();
                }
                if (!h9Var.F || z13) {
                    h9Var.F = false;
                } else {
                    h9Var.a.setExpanded(true);
                }
                h9Var.M.addUpdateListener(new c9(h9Var, f10, f7, z13));
                h9Var.M.addListener(new w8(h9Var, 1));
                h9Var.M.setDuration(250L);
                h9Var.M.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                h9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        h9Var.c = h9Var.a.getMeasuredHeight();
        h9Var.d = h9Var.a.getMeasuredWidth();
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
        h9 h9Var = this.x0;
        if (h9Var.N > 0.0f || h9Var.U || i11 <= 0 || h9Var.E <= 0.0f) {
            return;
        }
        h9Var.d0();
        h9Var.i0(Utilities.clamp(h9Var.E - (i11 / h9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        h9 h9Var = this.x0;
        if (h9Var.N > 0.0f || h9Var.U || i13 == 0) {
            return;
        }
        h9Var.d0();
        h9Var.i0(Utilities.clamp(h9Var.E - (i13 / h9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        h9 h9Var = this.x0;
        return h9Var.N <= 0.0f && !h9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        h9 h9Var = this.x0;
        h9Var.g0(h9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h9 h9Var = this.C0;
        if (!h9Var.K.b(motionEvent)) {
            if (!h9Var.U) {
                if (motionEvent.getAction() == 0) {
                    b9 b9Var = h9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    b9Var.getHitRect(rect);
                    rect.offset(0, (int) h9Var.r.getY());
                    if (h9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        h9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / h9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = h9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        h9Var.g0(h9Var.E > 0.5f, false, false);
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
