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
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n8 extends zu0 {
    public final d5.p s0;
    public final /* synthetic */ v8 t0;
    public boolean u0;
    public boolean v0;
    public float w0;
    public float x0;
    public final /* synthetic */ v8 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(v8 v8Var, Context context) {
        super(context, null);
        this.y0 = v8Var;
        this.t0 = v8Var;
        this.s0 = new d5.p();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        v8 v8Var = this.y0;
        if (!v8Var.Q) {
            if (!v8Var.h) {
                canvas.save();
                float x8 = v8Var.a.getX() + v8Var.r.getX();
                float y10 = v8Var.a.getY() + v8Var.r.getY();
                int i10 = v8Var.d - v8Var.c;
                float lerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - v8Var.c) >> 1), v8Var.J);
                canvas.translate(x8, lerp);
                v8Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x8, lerp - (v8Var.A * f10), v8Var.a.getMeasuredWidth() + x8, (f10 * v8Var.A) + v8Var.a.getMeasuredHeight() + lerp);
                o8 o8Var = v8Var.a;
                float f11 = x8 + o8Var.y;
                float f12 = lerp + o8Var.A;
                tc tcVar = v8Var.G;
                float f13 = o8Var.x;
                tcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                tcVar.i = false;
                tcVar.c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (v8Var.e.getVisibility() == 0 ? v8Var.e.getAlpha() : 0.0f)) * v8Var.a.s.c;
            if (alpha != 0.0f) {
                v8Var.D.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(v8Var.D.getX(), v8Var.D.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, v8Var.D.getMeasuredWidth(), v8Var.D.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                v8Var.D.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                v8Var.D.setVisibility(8);
            }
        }
        if (v8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        v8 v8Var = this.y0;
        Paint paint = v8Var.K;
        if (view == v8Var.D) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) v8Var).actionBar;
        if (view != kVar || v8Var.J <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            paint.setAlpha((int) (v8Var.J * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) v8Var.getParentLayout()).p(canvas2, (int) (v8Var.J * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        d5.p pVar = this.s0;
        return pVar.b | pVar.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.y0.J == 0.0f) {
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
        v8 v8Var = this.y0;
        float f10 = 0.0f;
        if (z10 != v8Var.Q) {
            v8Var.Q = z10;
            AndroidUtilities.removeFromParent(v8Var.a);
            AndroidUtilities.requestAdjustNothing(v8Var.getParentActivity(), v8Var.getClassGuid());
            if (v8Var.Q) {
                v8Var.i0(0.0f, false);
                v8Var.a.setExpanded(false);
                addView(v8Var.a, 0, h7.z5.c(-1.0f, -1));
            } else {
                v8Var.r.addView(v8Var.a, 0, h7.z5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(v8Var.getParentActivity(), v8Var.getClassGuid());
        }
        if (v8Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) v8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) v8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) v8Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = v8Var.H;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        v8Var.H = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (v8Var.H) {
                int i13 = -v8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.n2) v8Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            ra1 ra1Var = v8Var.r;
            ra1Var.setTranslationY((ra1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) v8Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = v8Var.H;
            if (!v8Var.Q) {
                v8Var.I = ValueAnimator.ofFloat(v8Var.J, z13 ? 1.0f : 0.0f);
                float f11 = ((v8Var.d - v8Var.c) - AndroidUtilities.statusBarHeight) * v8Var.A;
                if (z13) {
                    v8Var.a.setExpanded(false);
                    f11 = v8Var.r.getTranslationY();
                } else {
                    f10 = v8Var.r.getTranslationY();
                }
                if (!v8Var.B || z13) {
                    v8Var.B = false;
                } else {
                    v8Var.a.setExpanded(true);
                }
                v8Var.I.addUpdateListener(new q8(v8Var, f11, f10, z13));
                v8Var.I.addListener(new k8(v8Var, 1));
                v8Var.I.setDuration(250L);
                v8Var.I.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                v8Var.I.start();
            }
        }
        super.onMeasure(i10, i11);
        v8Var.c = v8Var.a.getMeasuredHeight();
        v8Var.d = v8Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        v8 v8Var = this.t0;
        if (v8Var.J > 0.0f || v8Var.Q || i11 <= 0 || v8Var.A <= 0.0f) {
            return;
        }
        v8Var.d0();
        v8Var.i0(Utilities.clamp(v8Var.A - (i11 / v8Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        v8 v8Var = this.t0;
        if (v8Var.J > 0.0f || v8Var.Q || i13 == 0) {
            return;
        }
        v8Var.d0();
        v8Var.i0(Utilities.clamp(v8Var.A - (i13 / v8Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.s0.a = i10;
        this.t0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        v8 v8Var = this.t0;
        return v8Var.J <= 0.0f && !v8Var.Q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.s0.a = 0;
        v8 v8Var = this.t0;
        v8Var.g0(v8Var.A > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v8 v8Var = this.y0;
        if (!v8Var.G.b(motionEvent)) {
            if (!v8Var.Q) {
                if (motionEvent.getAction() == 0) {
                    p8 p8Var = v8Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    p8Var.getHitRect(rect);
                    rect.offset(0, (int) v8Var.r.getY());
                    if (v8Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.u0 = true;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.u0) || this.v0)) {
                    if (!z10) {
                        v8Var.i0(Utilities.clamp(((-(this.x0 - motionEvent.getY())) / v8Var.d) + this.w0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.u0 = false;
                        this.v0 = true;
                        this.w0 = v8Var.A;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.v0) {
                        v8Var.g0(v8Var.A > 0.5f, false, false);
                    }
                    this.u0 = false;
                    this.v0 = false;
                }
            }
            if (!this.v0 && !super.onTouchEvent(motionEvent) && !this.u0) {
                return false;
            }
        }
        return true;
    }
}
