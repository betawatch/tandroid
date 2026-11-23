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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p8 extends cu0 {
    public final e2.r0 g0;
    public final /* synthetic */ x8 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final /* synthetic */ x8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(x8 x8Var, Context context) {
        super(context, null);
        this.m0 = x8Var;
        this.h0 = x8Var;
        this.g0 = new e2.r0();
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        x8 x8Var = this.m0;
        if (!x8Var.V) {
            if (!x8Var.h) {
                canvas.save();
                float x10 = x8Var.a.getX() + x8Var.r.getX();
                float y10 = x8Var.a.getY() + x8Var.r.getY();
                int i7 = x8Var.d - x8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - x8Var.c) >> 1), x8Var.O);
                canvas.translate(x10, T1);
                x8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i7 / 2.0f;
                rectF.set(x10, T1 - (x8Var.F * f10), x8Var.a.getMeasuredWidth() + x10, (f10 * x8Var.F) + x8Var.a.getMeasuredHeight() + T1);
                q8 q8Var = x8Var.a;
                float f11 = x10 + q8Var.E;
                float f12 = T1 + q8Var.F;
                tc tcVar = x8Var.L;
                float f13 = q8Var.y;
                tcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                tcVar.i = false;
                tcVar.c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (x8Var.e.getVisibility() == 0 ? x8Var.e.getAlpha() : 0.0f)) * x8Var.a.s.c;
            if (alpha != 0.0f) {
                x8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(x8Var.I.getX(), x8Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, x8Var.I.getMeasuredWidth(), x8Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                x8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                x8Var.I.setVisibility(8);
            }
        }
        if (x8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        x8 x8Var = this.m0;
        Paint paint = x8Var.P;
        if (view == x8Var.I) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
        if (view != kVar || x8Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
            paint.setAlpha((int) (x8Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) x8Var.getParentLayout()).p(canvas2, (int) (x8Var.O * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j3);
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        Q();
        boolean z10 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f;
        x8 x8Var = this.m0;
        float f10 = 0.0f;
        if (z10 != x8Var.V) {
            x8Var.V = z10;
            org.telegram.messenger.g0.E2(x8Var.a);
            org.telegram.messenger.g0.Y2(x8Var.getParentActivity(), x8Var.getClassGuid());
            if (x8Var.V) {
                x8Var.n0(false, 0.0f);
                x8Var.a.setExpanded(false);
                addView(x8Var.a, 0, c8.na.c(-1.0f, -1));
            } else {
                x8Var.r.addView(x8Var.a, 0, c8.na.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.Z2(x8Var.getParentActivity(), x8Var.getClassGuid());
        }
        if (x8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) x8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) x8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) x8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = x8Var.M;
        boolean z12 = this.f >= org.telegram.messenger.g0.L(20.0f);
        x8Var.M = z12;
        if (z11 != z12) {
            super.onMeasure(i7, i10);
            if (x8Var.M) {
                int i12 = -x8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.b61 b61Var = x8Var.r;
            b61Var.setTranslationY((b61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) x8Var.r.getLayoutParams()).topMargin = i11;
            boolean z13 = x8Var.M;
            if (!x8Var.V) {
                x8Var.N = ValueAnimator.ofFloat(x8Var.O, z13 ? 1.0f : 0.0f);
                float f11 = ((x8Var.d - x8Var.c) - org.telegram.messenger.g0.m) * x8Var.F;
                if (z13) {
                    x8Var.a.setExpanded(false);
                    f11 = x8Var.r.getTranslationY();
                } else {
                    f10 = x8Var.r.getTranslationY();
                }
                if (!x8Var.G || z13) {
                    x8Var.G = false;
                } else {
                    x8Var.a.setExpanded(true);
                }
                x8Var.N.addUpdateListener(new s8(x8Var, f11, f10, z13));
                x8Var.N.addListener(new m8(x8Var, 1));
                x8Var.N.setDuration(250L);
                x8Var.N.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                x8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        x8Var.c = x8Var.a.getMeasuredHeight();
        x8Var.d = x8Var.a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        x8 x8Var = this.h0;
        if (x8Var.O > 0.0f || x8Var.V || i10 <= 0 || x8Var.F <= 0.0f) {
            return;
        }
        x8Var.i0();
        x8Var.n0(true, Utilities.i(x8Var.F - (i10 / x8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        x8 x8Var = this.h0;
        if (x8Var.O > 0.0f || x8Var.V || i12 == 0) {
            return;
        }
        x8Var.i0();
        x8Var.n0(true, Utilities.i(x8Var.F - (i12 / x8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.g0.a = i7;
        this.h0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        x8 x8Var = this.h0;
        return x8Var.O <= 0.0f && !x8Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g0.a = 0;
        x8 x8Var = this.h0;
        x8Var.l0(x8Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        x8 x8Var = this.m0;
        if (!x8Var.L.b(motionEvent)) {
            if (!x8Var.V) {
                if (motionEvent.getAction() == 0) {
                    r8 r8Var = x8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    r8Var.getHitRect(rect);
                    rect.offset(0, (int) x8Var.r.getY());
                    if (x8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.i0) || this.j0)) {
                    if (!z10) {
                        x8Var.n0(true, Utilities.i(((-(this.l0 - motionEvent.getY())) / x8Var.d) + this.k0, 1.0f, 0.0f));
                    } else if (Math.abs(this.l0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.i0 = false;
                        this.j0 = true;
                        this.k0 = x8Var.F;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        x8Var.l0(x8Var.F > 0.5f, false, false);
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
