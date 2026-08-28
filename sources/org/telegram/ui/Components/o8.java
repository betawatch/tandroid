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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o8 extends xu0 {
    public final d5.p s0;
    public final /* synthetic */ w8 t0;
    public boolean u0;
    public boolean v0;
    public float w0;
    public float x0;
    public final /* synthetic */ w8 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(w8 w8Var, Context context) {
        super(context, null);
        this.y0 = w8Var;
        this.t0 = w8Var;
        this.s0 = new d5.p();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        w8 w8Var = this.y0;
        if (!w8Var.Q) {
            if (!w8Var.h) {
                canvas.save();
                float x10 = w8Var.a.getX() + w8Var.r.getX();
                float y10 = w8Var.a.getY() + w8Var.r.getY();
                int i9 = w8Var.d - w8Var.c;
                float lerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w8Var.c) >> 1), w8Var.J);
                canvas.translate(x10, lerp);
                w8Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i9 / 2.0f;
                rectF.set(x10, lerp - (w8Var.A * f10), w8Var.a.getMeasuredWidth() + x10, (f10 * w8Var.A) + w8Var.a.getMeasuredHeight() + lerp);
                p8 p8Var = w8Var.a;
                float f11 = x10 + p8Var.y;
                float f12 = lerp + p8Var.A;
                wc wcVar = w8Var.G;
                float f13 = p8Var.x;
                wcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                wcVar.i = false;
                wcVar.c = 0;
                wcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (w8Var.e.getVisibility() == 0 ? w8Var.e.getAlpha() : 0.0f)) * w8Var.a.s.c;
            if (alpha != 0.0f) {
                w8Var.D.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(w8Var.D.getX(), w8Var.D.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, w8Var.D.getMeasuredWidth(), w8Var.D.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                w8Var.D.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                w8Var.D.setVisibility(8);
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
        w8 w8Var = this.y0;
        Paint paint = w8Var.K;
        if (view == w8Var.D) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
        if (view != kVar || w8Var.J <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            paint.setAlpha((int) (w8Var.J * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) w8Var.getParentLayout()).p(canvas2, (int) (w8Var.J * 255.0f), view.getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        R();
        boolean z10 = View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10) + this.f;
        w8 w8Var = this.y0;
        float f10 = 0.0f;
        if (z10 != w8Var.Q) {
            w8Var.Q = z10;
            AndroidUtilities.removeFromParent(w8Var.a);
            AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
            if (w8Var.Q) {
                w8Var.h0(0.0f, false);
                w8Var.a.setExpanded(false);
                addView(w8Var.a, 0, g7.e6.c(-1.0f, -1));
            } else {
                w8Var.r.addView(w8Var.a, 0, g7.e6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        }
        if (w8Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i9) * 0.55f);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i9) * 0.45f);
            ((ViewGroup.MarginLayoutParams) w8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) w8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = w8Var.H;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        w8Var.H = z12;
        if (z11 != z12) {
            super.onMeasure(i9, i10);
            if (w8Var.H) {
                int i12 = -w8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
                i11 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            ta1 ta1Var = w8Var.r;
            ta1Var.setTranslationY((ta1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) w8Var.r.getLayoutParams()).topMargin = i11;
            boolean z13 = w8Var.H;
            if (!w8Var.Q) {
                w8Var.I = ValueAnimator.ofFloat(w8Var.J, z13 ? 1.0f : 0.0f);
                float f11 = ((w8Var.d - w8Var.c) - AndroidUtilities.statusBarHeight) * w8Var.A;
                if (z13) {
                    w8Var.a.setExpanded(false);
                    f11 = w8Var.r.getTranslationY();
                } else {
                    f10 = w8Var.r.getTranslationY();
                }
                if (!w8Var.B || z13) {
                    w8Var.B = false;
                } else {
                    w8Var.a.setExpanded(true);
                }
                w8Var.I.addUpdateListener(new r8(w8Var, f11, f10, z13));
                w8Var.I.addListener(new l8(w8Var, 1));
                w8Var.I.setDuration(250L);
                w8Var.I.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                w8Var.I.start();
            }
        }
        super.onMeasure(i9, i10);
        w8Var.c = w8Var.a.getMeasuredHeight();
        w8Var.d = w8Var.a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        w8 w8Var = this.t0;
        if (w8Var.J > 0.0f || w8Var.Q || i10 <= 0 || w8Var.A <= 0.0f) {
            return;
        }
        w8Var.c0();
        w8Var.h0(Utilities.clamp(w8Var.A - (i10 / w8Var.d), 1.0f, 0.0f), true);
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        w8 w8Var = this.t0;
        if (w8Var.J > 0.0f || w8Var.Q || i12 == 0) {
            return;
        }
        w8Var.c0();
        w8Var.h0(Utilities.clamp(w8Var.A - (i12 / w8Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        this.s0.a = i9;
        this.t0.c0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        w8 w8Var = this.t0;
        return w8Var.J <= 0.0f && !w8Var.Q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.s0.a = 0;
        w8 w8Var = this.t0;
        w8Var.f0(w8Var.A > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        w8 w8Var = this.y0;
        if (!w8Var.G.b(motionEvent)) {
            if (!w8Var.Q) {
                if (motionEvent.getAction() == 0) {
                    q8 q8Var = w8Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    q8Var.getHitRect(rect);
                    rect.offset(0, (int) w8Var.r.getY());
                    if (w8Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.u0 = true;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.u0) || this.v0)) {
                    if (!z10) {
                        w8Var.h0(Utilities.clamp(((-(this.x0 - motionEvent.getY())) / w8Var.d) + this.w0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.u0 = false;
                        this.v0 = true;
                        this.w0 = w8Var.A;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.v0) {
                        w8Var.f0(w8Var.A > 0.5f, false, false);
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
