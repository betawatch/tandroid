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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j8 extends qt0 {
    public final d2.t0 g0;
    public final /* synthetic */ r8 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final /* synthetic */ r8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(r8 r8Var, Context context) {
        super(context, null);
        this.m0 = r8Var;
        this.h0 = r8Var;
        this.g0 = new d2.t0();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        r8 r8Var = this.m0;
        if (!r8Var.V) {
            if (!r8Var.h) {
                canvas.save();
                float x10 = r8Var.a.getX() + r8Var.r.getX();
                float y9 = r8Var.a.getY() + r8Var.r.getY();
                int i3 = r8Var.d - r8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y9, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r8Var.c) >> 1), r8Var.O);
                canvas.translate(x10, T1);
                r8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i3 / 2.0f;
                rectF.set(x10, T1 - (r8Var.F * f10), r8Var.a.getMeasuredWidth() + x10, (f10 * r8Var.F) + r8Var.a.getMeasuredHeight() + T1);
                k8 k8Var = r8Var.a;
                float f11 = x10 + k8Var.E;
                float f12 = T1 + k8Var.F;
                nc ncVar = r8Var.L;
                float f13 = k8Var.y;
                ncVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                ncVar.i = false;
                ncVar.c = 0;
                ncVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (r8Var.e.getVisibility() == 0 ? r8Var.e.getAlpha() : 0.0f)) * r8Var.a.s.c;
            if (alpha != 0.0f) {
                r8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(r8Var.I.getX(), r8Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r8Var.I.getMeasuredWidth(), r8Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                r8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                r8Var.I.setVisibility(8);
            }
        }
        if (r8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        r8 r8Var = this.m0;
        Paint paint = r8Var.P;
        if (view == r8Var.I) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
        if (view != kVar || r8Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            paint.setAlpha((int) (r8Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) r8Var.getParentLayout()).p(canvas2, (int) (r8Var.O * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.g0.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m0.O == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        Q();
        boolean z10 = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10) + this.f;
        r8 r8Var = this.m0;
        float f10 = 0.0f;
        if (z10 != r8Var.V) {
            r8Var.V = z10;
            org.telegram.messenger.g0.E2(r8Var.a);
            org.telegram.messenger.g0.Z2(r8Var.getParentActivity(), r8Var.getClassGuid());
            if (r8Var.V) {
                r8Var.n0(false, 0.0f);
                r8Var.a.setExpanded(false);
                addView(r8Var.a, 0, b8.mf.c(-1.0f, -1));
            } else {
                r8Var.r.addView(r8Var.a, 0, b8.mf.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(r8Var.getParentActivity(), r8Var.getClassGuid());
        }
        if (r8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i3) * 0.55f);
            ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i3) * 0.45f);
            ((ViewGroup.MarginLayoutParams) r8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) r8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) r8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = r8Var.M;
        boolean z12 = this.f >= org.telegram.messenger.g0.L(20.0f);
        r8Var.M = z12;
        if (z11 != z12) {
            super.onMeasure(i3, i10);
            if (r8Var.M) {
                int i12 = -r8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.s51 s51Var = r8Var.r;
            s51Var.setTranslationY((s51Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) r8Var.r.getLayoutParams()).topMargin = i11;
            boolean z13 = r8Var.M;
            if (!r8Var.V) {
                r8Var.N = ValueAnimator.ofFloat(r8Var.O, z13 ? 1.0f : 0.0f);
                float f11 = ((r8Var.d - r8Var.c) - org.telegram.messenger.g0.m) * r8Var.F;
                if (z13) {
                    r8Var.a.setExpanded(false);
                    f11 = r8Var.r.getTranslationY();
                } else {
                    f10 = r8Var.r.getTranslationY();
                }
                if (!r8Var.G || z13) {
                    r8Var.G = false;
                } else {
                    r8Var.a.setExpanded(true);
                }
                r8Var.N.addUpdateListener(new m8(r8Var, f11, f10, z13));
                r8Var.N.addListener(new g8(r8Var, 1));
                r8Var.N.setDuration(250L);
                r8Var.N.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                r8Var.N.start();
            }
        }
        super.onMeasure(i3, i10);
        r8Var.c = r8Var.a.getMeasuredHeight();
        r8Var.d = r8Var.a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        r8 r8Var = this.h0;
        if (r8Var.O > 0.0f || r8Var.V || i10 <= 0 || r8Var.F <= 0.0f) {
            return;
        }
        r8Var.i0();
        r8Var.n0(true, Utilities.i(r8Var.F - (i10 / r8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        r8 r8Var = this.h0;
        if (r8Var.O > 0.0f || r8Var.V || i12 == 0) {
            return;
        }
        r8Var.i0();
        r8Var.n0(true, Utilities.i(r8Var.F - (i12 / r8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.g0.a = i3;
        this.h0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        r8 r8Var = this.h0;
        return r8Var.O <= 0.0f && !r8Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g0.a = 0;
        r8 r8Var = this.h0;
        r8Var.l0(r8Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        r8 r8Var = this.m0;
        if (!r8Var.L.b(motionEvent)) {
            if (!r8Var.V) {
                if (motionEvent.getAction() == 0) {
                    l8 l8Var = r8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    l8Var.getHitRect(rect);
                    rect.offset(0, (int) r8Var.r.getY());
                    if (r8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.i0) || this.j0)) {
                    if (!z10) {
                        r8Var.n0(true, Utilities.i(((-(this.l0 - motionEvent.getY())) / r8Var.d) + this.k0, 1.0f, 0.0f));
                    } else if (Math.abs(this.l0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.i0 = false;
                        this.j0 = true;
                        this.k0 = r8Var.F;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        r8Var.l0(r8Var.F > 0.5f, false, false);
                    }
                    this.i0 = false;
                    this.j0 = false;
                }
            }
            if (!this.j0 && !super.onTouchEvent(motionEvent) && !this.i0) {
                return false;
            }
        }
        return true;
    }
}
