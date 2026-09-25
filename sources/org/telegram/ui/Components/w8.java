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
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class w8 extends aw0 {
    public float A0;
    public float B0;
    public final /* synthetic */ e9 C0;
    public final b2.q0 w0;
    public final /* synthetic */ e9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(e9 e9Var, Context context) {
        super(context, null);
        this.C0 = e9Var;
        this.x0 = e9Var;
        this.w0 = new b2.q0();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        e9 e9Var = this.C0;
        if (!e9Var.U) {
            if (!e9Var.h) {
                canvas.save();
                float x10 = e9Var.a.getX() + e9Var.r.getX();
                float y3 = e9Var.a.getY() + e9Var.r.getY();
                int i10 = e9Var.d - e9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - e9Var.c) >> 1), e9Var.N);
                canvas.translate(x10, lerp);
                e9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (e9Var.E * f7), e9Var.a.getMeasuredWidth() + x10, (f7 * e9Var.E) + e9Var.a.getMeasuredHeight() + lerp);
                x8 x8Var = e9Var.a;
                float f10 = x10 + x8Var.y;
                float f11 = lerp + x8Var.E;
                fd fdVar = e9Var.K;
                float f12 = x8Var.x;
                fdVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                fdVar.i = false;
                fdVar.c = 0;
                fdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (e9Var.e.getVisibility() == 0 ? e9Var.e.getAlpha() : 0.0f)) * e9Var.a.s.c;
            if (alpha != 0.0f) {
                e9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(e9Var.H.getX(), e9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, e9Var.H.getMeasuredWidth(), e9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                e9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                e9Var.H.setVisibility(8);
            }
        }
        if (e9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        e9 e9Var = this.C0;
        Paint paint = e9Var.O;
        if (view == e9Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) e9Var).actionBar;
        if (view != kVar || e9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            paint.setAlpha((int) (e9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) e9Var.getParentLayout()).p(canvas2, (int) (e9Var.N * 255.0f), view.getMeasuredHeight());
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
        e9 e9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != e9Var.U) {
            e9Var.U = z10;
            AndroidUtilities.removeFromParent(e9Var.a);
            AndroidUtilities.requestAdjustNothing(e9Var.getParentActivity(), e9Var.getClassGuid());
            if (e9Var.U) {
                e9Var.i0(0.0f, false);
                e9Var.a.setExpanded(false);
                addView(e9Var.a, 0, w7.y5.c(-1.0f, -1));
            } else {
                e9Var.r.addView(e9Var.a, 0, w7.y5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(e9Var.getParentActivity(), e9Var.getClassGuid());
        }
        if (e9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) e9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) e9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) e9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = e9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        e9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (e9Var.L) {
                int i13 = -e9Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.m2) e9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            ub1 ub1Var = e9Var.r;
            ub1Var.setTranslationY((ub1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) e9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = e9Var.L;
            if (!e9Var.U) {
                e9Var.M = ValueAnimator.ofFloat(e9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((e9Var.d - e9Var.c) - AndroidUtilities.statusBarHeight) * e9Var.E;
                if (z13) {
                    e9Var.a.setExpanded(false);
                    f10 = e9Var.r.getTranslationY();
                } else {
                    f7 = e9Var.r.getTranslationY();
                }
                if (!e9Var.F || z13) {
                    e9Var.F = false;
                } else {
                    e9Var.a.setExpanded(true);
                }
                e9Var.M.addUpdateListener(new z8(e9Var, f10, f7, z13));
                e9Var.M.addListener(new t8(e9Var, 1));
                e9Var.M.setDuration(250L);
                e9Var.M.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                e9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        e9Var.c = e9Var.a.getMeasuredHeight();
        e9Var.d = e9Var.a.getMeasuredWidth();
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
        e9 e9Var = this.x0;
        if (e9Var.N > 0.0f || e9Var.U || i11 <= 0 || e9Var.E <= 0.0f) {
            return;
        }
        e9Var.d0();
        e9Var.i0(Utilities.clamp(e9Var.E - (i11 / e9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e9 e9Var = this.x0;
        if (e9Var.N > 0.0f || e9Var.U || i13 == 0) {
            return;
        }
        e9Var.d0();
        e9Var.i0(Utilities.clamp(e9Var.E - (i13 / e9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        e9 e9Var = this.x0;
        return e9Var.N <= 0.0f && !e9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        e9 e9Var = this.x0;
        e9Var.g0(e9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        e9 e9Var = this.C0;
        if (!e9Var.K.b(motionEvent)) {
            if (!e9Var.U) {
                if (motionEvent.getAction() == 0) {
                    y8 y8Var = e9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    y8Var.getHitRect(rect);
                    rect.offset(0, (int) e9Var.r.getY());
                    if (e9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        e9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / e9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = e9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        e9Var.g0(e9Var.E > 0.5f, false, false);
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
