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
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o8 extends qv0 {
    public final c5.e t0;
    public final /* synthetic */ w8 u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public final /* synthetic */ w8 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(w8 w8Var, Context context) {
        super(context, null);
        this.z0 = w8Var;
        this.u0 = w8Var;
        this.t0 = new c5.e();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        w8 w8Var = this.z0;
        if (!w8Var.R) {
            if (!w8Var.h) {
                canvas.save();
                float x10 = w8Var.a.getX() + w8Var.r.getX();
                float y10 = w8Var.a.getY() + w8Var.r.getY();
                int i10 = w8Var.d - w8Var.c;
                float lerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w8Var.c) >> 1), w8Var.K);
                canvas.translate(x10, lerp);
                w8Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (w8Var.B * f10), w8Var.a.getMeasuredWidth() + x10, (f10 * w8Var.B) + w8Var.a.getMeasuredHeight() + lerp);
                p8 p8Var = w8Var.a;
                float f11 = x10 + p8Var.y;
                float f12 = lerp + p8Var.B;
                xc xcVar = w8Var.H;
                float f13 = p8Var.x;
                xcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                xcVar.i = false;
                xcVar.c = 0;
                xcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (w8Var.e.getVisibility() == 0 ? w8Var.e.getAlpha() : 0.0f)) * w8Var.a.s.c;
            if (alpha != 0.0f) {
                w8Var.E.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(w8Var.E.getX(), w8Var.E.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, w8Var.E.getMeasuredWidth(), w8Var.E.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                w8Var.E.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                w8Var.E.setVisibility(8);
            }
        }
        if (w8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        w8 w8Var = this.z0;
        Paint paint = w8Var.L;
        if (view == w8Var.E) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        if (view != kVar || w8Var.K <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            paint.setAlpha((int) (w8Var.K * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) w8Var.getParentLayout()).p(canvas2, (int) (w8Var.K * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        c5.e eVar = this.t0;
        return eVar.b | eVar.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.z0.K == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        R();
        boolean z4 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f;
        w8 w8Var = this.z0;
        float f10 = 0.0f;
        if (z4 != w8Var.R) {
            w8Var.R = z4;
            AndroidUtilities.removeFromParent(w8Var.a);
            AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
            if (w8Var.R) {
                w8Var.i0(0.0f, false);
                w8Var.a.setExpanded(false);
                addView(w8Var.a, 0, k7.c6.c(-1.0f, -1));
            } else {
                w8Var.r.addView(w8Var.a, 0, k7.c6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        }
        if (w8Var.R) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) w8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) w8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) w8Var.T.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.T.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z10 = w8Var.I;
        boolean z11 = this.f >= AndroidUtilities.dp(20.0f);
        w8Var.I = z11;
        if (z10 != z11) {
            super.onMeasure(i10, i11);
            if (w8Var.I) {
                int i13 = -w8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            ib1 ib1Var = w8Var.r;
            ib1Var.setTranslationY((ib1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).topMargin = i12;
            boolean z12 = w8Var.I;
            if (!w8Var.R) {
                w8Var.J = ValueAnimator.ofFloat(w8Var.K, z12 ? 1.0f : 0.0f);
                float f11 = ((w8Var.d - w8Var.c) - AndroidUtilities.statusBarHeight) * w8Var.B;
                if (z12) {
                    w8Var.a.setExpanded(false);
                    f11 = w8Var.r.getTranslationY();
                } else {
                    f10 = w8Var.r.getTranslationY();
                }
                if (!w8Var.C || z12) {
                    w8Var.C = false;
                } else {
                    w8Var.a.setExpanded(true);
                }
                w8Var.J.addUpdateListener(new r8(w8Var, f11, f10, z12));
                w8Var.J.addListener(new l8(w8Var, 1));
                w8Var.J.setDuration(250L);
                w8Var.J.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                w8Var.J.start();
            }
        }
        super.onMeasure(i10, i11);
        w8Var.c = w8Var.a.getMeasuredHeight();
        w8Var.d = w8Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        w8 w8Var = this.u0;
        if (w8Var.K > 0.0f || w8Var.R || i11 <= 0 || w8Var.B <= 0.0f) {
            return;
        }
        w8Var.d0();
        w8Var.i0(Utilities.clamp(w8Var.B - (i11 / w8Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        w8 w8Var = this.u0;
        if (w8Var.K > 0.0f || w8Var.R || i13 == 0) {
            return;
        }
        w8Var.d0();
        w8Var.i0(Utilities.clamp(w8Var.B - (i13 / w8Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.t0.a = i10;
        this.u0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        w8 w8Var = this.u0;
        return w8Var.K <= 0.0f && !w8Var.R;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.t0.a = 0;
        w8 w8Var = this.u0;
        w8Var.g0(w8Var.B > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        w8 w8Var = this.z0;
        if (!w8Var.H.b(motionEvent)) {
            if (!w8Var.R) {
                if (motionEvent.getAction() == 0) {
                    q8 q8Var = w8Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    q8Var.getHitRect(rect);
                    rect.offset(0, (int) w8Var.r.getY());
                    if (w8Var.K == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.v0 = true;
                        motionEvent.getX();
                        this.y0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z4 = this.v0) || this.w0)) {
                    if (!z4) {
                        w8Var.i0(Utilities.clamp(((-(this.y0 - motionEvent.getY())) / w8Var.d) + this.x0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.y0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.v0 = false;
                        this.w0 = true;
                        this.x0 = w8Var.B;
                        motionEvent.getX();
                        this.y0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.w0) {
                        w8Var.g0(w8Var.B > 0.5f, false, false);
                    }
                    this.v0 = false;
                    this.w0 = false;
                }
            }
            if (!this.w0 && !super.onTouchEvent(motionEvent) && !this.v0) {
                return false;
            }
        }
        return true;
    }
}
