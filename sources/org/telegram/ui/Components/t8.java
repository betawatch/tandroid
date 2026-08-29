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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t8 extends hv0 {
    public final a5.e s0;
    public final /* synthetic */ b9 t0;
    public boolean u0;
    public boolean v0;
    public float w0;
    public float x0;
    public final /* synthetic */ b9 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(b9 b9Var, Context context) {
        super(context, null);
        this.y0 = b9Var;
        this.t0 = b9Var;
        this.s0 = new a5.e();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        b9 b9Var = this.y0;
        if (!b9Var.Q) {
            if (!b9Var.h) {
                canvas.save();
                float x4 = b9Var.a.getX() + b9Var.r.getX();
                float y8 = b9Var.a.getY() + b9Var.r.getY();
                int i10 = b9Var.d - b9Var.c;
                float lerp = AndroidUtilities.lerp(y8, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - b9Var.c) >> 1), b9Var.J);
                canvas.translate(x4, lerp);
                b9Var.a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = i10 / 2.0f;
                rectF.set(x4, lerp - (b9Var.A * f9), b9Var.a.getMeasuredWidth() + x4, (f9 * b9Var.A) + b9Var.a.getMeasuredHeight() + lerp);
                u8 u8Var = b9Var.a;
                float f10 = x4 + u8Var.y;
                float f11 = lerp + u8Var.A;
                ad adVar = b9Var.G;
                float f12 = u8Var.x;
                adVar.getClass();
                rectF.set((int) (f10 - f12), (int) (f11 - f12), (int) (f10 + f12), (int) (f11 + f12));
                adVar.i = false;
                adVar.c = 0;
                adVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (b9Var.e.getVisibility() == 0 ? b9Var.e.getAlpha() : 0.0f)) * b9Var.a.s.c;
            if (alpha != 0.0f) {
                b9Var.D.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(b9Var.D.getX(), b9Var.D.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, b9Var.D.getMeasuredWidth(), b9Var.D.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                b9Var.D.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                b9Var.D.setVisibility(8);
            }
        }
        if (b9Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        b9 b9Var = this.y0;
        Paint paint = b9Var.K;
        if (view == b9Var.D) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
        if (view != lVar || b9Var.J <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            paint.setAlpha((int) (b9Var.J * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) b9Var.getParentLayout()).p(canvas2, (int) (b9Var.J * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        a5.e eVar = this.s0;
        return eVar.b | eVar.a;
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
        org.telegram.ui.ActionBar.l lVar;
        R();
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f;
        b9 b9Var = this.y0;
        float f9 = 0.0f;
        if (z10 != b9Var.Q) {
            b9Var.Q = z10;
            AndroidUtilities.removeFromParent(b9Var.a);
            AndroidUtilities.requestAdjustNothing(b9Var.getParentActivity(), b9Var.getClassGuid());
            if (b9Var.Q) {
                b9Var.i0(0.0f, false);
                b9Var.a.setExpanded(false);
                addView(b9Var.a, 0, i7.f6.c(-1.0f, -1));
            } else {
                b9Var.r.addView(b9Var.a, 0, i7.f6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(b9Var.getParentActivity(), b9Var.getClassGuid());
        }
        if (b9Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) b9Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) b9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) b9Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = b9Var.H;
        boolean z12 = this.f >= AndroidUtilities.dp(20.0f);
        b9Var.H = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            if (b9Var.H) {
                int i13 = -b9Var.b.getTop();
                lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + lVar.getMeasuredHeight() + i13;
            } else {
                i12 = 0;
            }
            ua1 ua1Var = b9Var.r;
            ua1Var.setTranslationY((ua1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) b9Var.r.getLayoutParams()).topMargin = i12;
            boolean z13 = b9Var.H;
            if (!b9Var.Q) {
                b9Var.I = ValueAnimator.ofFloat(b9Var.J, z13 ? 1.0f : 0.0f);
                float f10 = ((b9Var.d - b9Var.c) - AndroidUtilities.statusBarHeight) * b9Var.A;
                if (z13) {
                    b9Var.a.setExpanded(false);
                    f10 = b9Var.r.getTranslationY();
                } else {
                    f9 = b9Var.r.getTranslationY();
                }
                if (!b9Var.B || z13) {
                    b9Var.B = false;
                } else {
                    b9Var.a.setExpanded(true);
                }
                b9Var.I.addUpdateListener(new w8(b9Var, f10, f9, z13));
                b9Var.I.addListener(new q8(b9Var, 1));
                b9Var.I.setDuration(250L);
                b9Var.I.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                b9Var.I.start();
            }
        }
        super.onMeasure(i10, i11);
        b9Var.c = b9Var.a.getMeasuredHeight();
        b9Var.d = b9Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        b9 b9Var = this.t0;
        if (b9Var.J > 0.0f || b9Var.Q || i11 <= 0 || b9Var.A <= 0.0f) {
            return;
        }
        b9Var.d0();
        b9Var.i0(Utilities.clamp(b9Var.A - (i11 / b9Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        b9 b9Var = this.t0;
        if (b9Var.J > 0.0f || b9Var.Q || i13 == 0) {
            return;
        }
        b9Var.d0();
        b9Var.i0(Utilities.clamp(b9Var.A - (i13 / b9Var.d), 1.0f, 0.0f), true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.s0.a = i10;
        this.t0.d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        b9 b9Var = this.t0;
        return b9Var.J <= 0.0f && !b9Var.Q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.s0.a = 0;
        b9 b9Var = this.t0;
        b9Var.g0(b9Var.A > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        b9 b9Var = this.y0;
        if (!b9Var.G.b(motionEvent)) {
            if (!b9Var.Q) {
                if (motionEvent.getAction() == 0) {
                    v8 v8Var = b9Var.b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    v8Var.getHitRect(rect);
                    rect.offset(0, (int) b9Var.r.getY());
                    if (b9Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.u0 = true;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.u0) || this.v0)) {
                    if (!z10) {
                        b9Var.i0(Utilities.clamp(((-(this.x0 - motionEvent.getY())) / b9Var.d) + this.w0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.u0 = false;
                        this.v0 = true;
                        this.w0 = b9Var.A;
                        motionEvent.getX();
                        this.x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.v0) {
                        b9Var.g0(b9Var.A > 0.5f, false, false);
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
