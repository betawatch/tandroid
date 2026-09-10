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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v8 extends aw0 {
    public float A0;
    public float B0;
    public final /* synthetic */ d9 C0;
    public final b2.q0 w0;
    public final /* synthetic */ d9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(d9 d9Var, Context context) {
        super(context, null);
        this.C0 = d9Var;
        this.x0 = d9Var;
        this.w0 = new b2.q0();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        d9 d9Var = this.C0;
        if (!d9Var.U) {
            if (!d9Var.h) {
                canvas.save();
                float x10 = d9Var.a.getX() + d9Var.r.getX();
                float y3 = d9Var.a.getY() + d9Var.r.getY();
                int i10 = d9Var.d - d9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - d9Var.c) >> 1), d9Var.N);
                canvas.translate(x10, lerp);
                d9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (d9Var.E * f7), d9Var.a.getMeasuredWidth() + x10, (f7 * d9Var.E) + d9Var.a.getMeasuredHeight() + lerp);
                w8 w8Var = d9Var.a;
                float f10 = x10 + w8Var.y;
                float f11 = lerp + w8Var.E;
                ed edVar = d9Var.K;
                float f12 = w8Var.x;
                edVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                edVar.i = false;
                edVar.c = 0;
                edVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (d9Var.e.getVisibility() == 0 ? d9Var.e.getAlpha() : 0.0f)) * d9Var.a.s.c;
            if (alpha != 0.0f) {
                d9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(d9Var.H.getX(), d9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, d9Var.H.getMeasuredWidth(), d9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                d9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                d9Var.H.setVisibility(8);
            }
        }
        if (d9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        d9 d9Var = this.C0;
        Paint paint = d9Var.O;
        if (view == d9Var.H) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
        if (view != lVar || d9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            paint.setAlpha((int) (d9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) d9Var.getParentLayout()).p(canvas2, (int) (d9Var.N * 255.0f), view.getMeasuredHeight());
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
        org.telegram.ui.ActionBar.l lVar;
        R();
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f;
        d9 d9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != d9Var.U) {
            d9Var.U = z10;
            AndroidUtilities.removeFromParent(d9Var.a);
            AndroidUtilities.requestAdjustNothing(d9Var.getParentActivity(), d9Var.getClassGuid());
            if (d9Var.U) {
                d9Var.i0(0.0f, false);
                d9Var.a.setExpanded(false);
                addView(d9Var.a, 0, w7.a6.c(-1.0f, -1));
            } else {
                d9Var.r.addView(d9Var.a, 0, w7.a6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        }
        if (d9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) d9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) d9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = d9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        d9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (d9Var.L) {
                int i13 = -d9Var.b.getTop();
                lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + lVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            gc1 gc1Var = d9Var.r;
            gc1Var.setTranslationY((gc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) d9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = d9Var.L;
            if (!d9Var.U) {
                d9Var.M = ValueAnimator.ofFloat(d9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((d9Var.d - d9Var.c) - AndroidUtilities.statusBarHeight) * d9Var.E;
                if (z13) {
                    d9Var.a.setExpanded(false);
                    f10 = d9Var.r.getTranslationY();
                } else {
                    f7 = d9Var.r.getTranslationY();
                }
                if (!d9Var.F || z13) {
                    d9Var.F = false;
                } else {
                    d9Var.a.setExpanded(true);
                }
                d9Var.M.addUpdateListener(new y8(d9Var, f10, f7, z13));
                d9Var.M.addListener(new s8(d9Var, 1));
                d9Var.M.setDuration(250L);
                d9Var.M.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                d9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        d9Var.c = d9Var.a.getMeasuredHeight();
        d9Var.d = d9Var.a.getMeasuredWidth();
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
        d9 d9Var = this.x0;
        if (d9Var.N > 0.0f || d9Var.U || i11 <= 0 || d9Var.E <= 0.0f) {
            return;
        }
        d9Var.d0();
        d9Var.i0(Utilities.clamp(d9Var.E - (i11 / d9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d9 d9Var = this.x0;
        if (d9Var.N > 0.0f || d9Var.U || i13 == 0) {
            return;
        }
        d9Var.d0();
        d9Var.i0(Utilities.clamp(d9Var.E - (i13 / d9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        d9 d9Var = this.x0;
        return d9Var.N <= 0.0f && !d9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        d9 d9Var = this.x0;
        d9Var.g0(d9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        d9 d9Var = this.C0;
        if (!d9Var.K.b(motionEvent)) {
            if (!d9Var.U) {
                if (motionEvent.getAction() == 0) {
                    x8 x8Var = d9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    x8Var.getHitRect(rect);
                    rect.offset(0, (int) d9Var.r.getY());
                    if (d9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        d9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / d9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = d9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        d9Var.g0(d9Var.E > 0.5f, false, false);
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
