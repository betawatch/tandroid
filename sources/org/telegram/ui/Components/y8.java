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
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y8 extends sw0 {
    public float A0;
    public float B0;
    public final /* synthetic */ g9 C0;
    public final b2.q0 w0;
    public final /* synthetic */ g9 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(g9 g9Var, Context context) {
        super(context, null);
        this.C0 = g9Var;
        this.x0 = g9Var;
        this.w0 = new b2.q0();
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        g9 g9Var = this.C0;
        if (!g9Var.U) {
            if (!g9Var.h) {
                canvas.save();
                float x10 = g9Var.a.getX() + g9Var.r.getX();
                float y3 = g9Var.a.getY() + g9Var.r.getY();
                int i10 = g9Var.d - g9Var.c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - g9Var.c) >> 1), g9Var.N);
                canvas.translate(x10, lerp);
                g9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = i10 / 2.0f;
                rectF.set(x10, lerp - (g9Var.E * f7), g9Var.a.getMeasuredWidth() + x10, (f7 * g9Var.E) + g9Var.a.getMeasuredHeight() + lerp);
                z8 z8Var = g9Var.a;
                float f10 = x10 + z8Var.y;
                float f11 = lerp + z8Var.E;
                id idVar = g9Var.K;
                float f12 = z8Var.x;
                idVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                idVar.i = false;
                idVar.c = 0;
                idVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (g9Var.e.getVisibility() == 0 ? g9Var.e.getAlpha() : 0.0f)) * g9Var.a.s.c;
            if (alpha != 0.0f) {
                g9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(g9Var.H.getX(), g9Var.H.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, g9Var.H.getMeasuredWidth(), g9Var.H.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                g9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                g9Var.H.setVisibility(8);
            }
        }
        if (g9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        g9 g9Var = this.C0;
        Paint paint = g9Var.O;
        if (view == g9Var.H) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
        if (view != kVar || g9Var.N <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            paint.setAlpha((int) (g9Var.N * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) g9Var.getParentLayout()).p(canvas2, (int) (g9Var.N * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j3);
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
        g9 g9Var = this.C0;
        float f7 = 0.0f;
        if (z10 != g9Var.U) {
            g9Var.U = z10;
            AndroidUtilities.removeFromParent(g9Var.a);
            AndroidUtilities.requestAdjustNothing(g9Var.getParentActivity(), g9Var.getClassGuid());
            if (g9Var.U) {
                g9Var.i0(0.0f, false);
                g9Var.a.setExpanded(false);
                addView(g9Var.a, 0, w7.x5.d(-1.0f, -1));
            } else {
                g9Var.r.addView(g9Var.a, 0, w7.x5.d(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        }
        if (g9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) g9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) g9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = g9Var.L;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        g9Var.L = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (g9Var.L) {
                int i13 = -g9Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            dc1 dc1Var = g9Var.r;
            dc1Var.setTranslationY((dc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) g9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = g9Var.L;
            if (!g9Var.U) {
                g9Var.M = ValueAnimator.ofFloat(g9Var.N, z13 ? 1.0f : 0.0f);
                float f10 = ((g9Var.d - g9Var.c) - AndroidUtilities.statusBarHeight) * g9Var.E;
                if (z13) {
                    g9Var.a.setExpanded(false);
                    f10 = g9Var.r.getTranslationY();
                } else {
                    f7 = g9Var.r.getTranslationY();
                }
                if (!g9Var.F || z13) {
                    g9Var.F = false;
                } else {
                    g9Var.a.setExpanded(true);
                }
                g9Var.M.addUpdateListener(new b9(g9Var, f10, f7, z13));
                g9Var.M.addListener(new v8(g9Var, 1));
                g9Var.M.setDuration(250L);
                g9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                g9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        g9Var.c = g9Var.a.getMeasuredHeight();
        g9Var.d = g9Var.a.getMeasuredWidth();
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
        g9 g9Var = this.x0;
        if (g9Var.N > 0.0f || g9Var.U || i11 <= 0 || g9Var.E <= 0.0f) {
            return;
        }
        g9Var.d0();
        g9Var.i0(Utilities.clamp(g9Var.E - (i11 / g9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        g9 g9Var = this.x0;
        if (g9Var.N > 0.0f || g9Var.U || i13 == 0) {
            return;
        }
        g9Var.d0();
        g9Var.i0(Utilities.clamp(g9Var.E - (i13 / g9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.w0.a = i10;
        this.x0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        g9 g9Var = this.x0;
        return g9Var.N <= 0.0f && !g9Var.U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.w0.a = 0;
        g9 g9Var = this.x0;
        g9Var.g0(g9Var.E > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        g9 g9Var = this.C0;
        if (!g9Var.K.b(motionEvent)) {
            if (!g9Var.U) {
                if (motionEvent.getAction() == 0) {
                    a9 a9Var = g9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    a9Var.getHitRect(rect);
                    rect.offset(0, (int) g9Var.r.getY());
                    if (g9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.y0) || this.z0)) {
                    if (!z10) {
                        g9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / g9Var.d) + this.A0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.y0 = false;
                        this.z0 = true;
                        this.A0 = g9Var.E;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.z0) {
                        g9Var.g0(g9Var.E > 0.5f, false, false);
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
