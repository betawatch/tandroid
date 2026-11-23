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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q8 extends du0 {
    public final e2.r0 g0;
    public final /* synthetic */ y8 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final /* synthetic */ y8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(y8 y8Var, Context context) {
        super(context, null);
        this.m0 = y8Var;
        this.h0 = y8Var;
        this.g0 = new e2.r0();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        y8 y8Var = this.m0;
        if (!y8Var.V) {
            if (!y8Var.h) {
                canvas.save();
                float x10 = y8Var.a.getX() + y8Var.r.getX();
                float y10 = y8Var.a.getY() + y8Var.r.getY();
                int i7 = y8Var.d - y8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - y8Var.c) >> 1), y8Var.O);
                canvas.translate(x10, T1);
                y8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i7 / 2.0f;
                rectF.set(x10, T1 - (y8Var.F * f10), y8Var.a.getMeasuredWidth() + x10, (f10 * y8Var.F) + y8Var.a.getMeasuredHeight() + T1);
                r8 r8Var = y8Var.a;
                float f11 = x10 + r8Var.E;
                float f12 = T1 + r8Var.F;
                tc tcVar = y8Var.L;
                float f13 = r8Var.y;
                tcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                tcVar.i = false;
                tcVar.c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (y8Var.e.getVisibility() == 0 ? y8Var.e.getAlpha() : 0.0f)) * y8Var.a.s.c;
            if (alpha != 0.0f) {
                y8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(y8Var.I.getX(), y8Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, y8Var.I.getMeasuredWidth(), y8Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                y8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                y8Var.I.setVisibility(8);
            }
        }
        if (y8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        y8 y8Var = this.m0;
        Paint paint = y8Var.P;
        if (view == y8Var.I) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.g2) y8Var).actionBar;
        if (view != kVar || y8Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            paint.setAlpha((int) (y8Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) y8Var.getParentLayout()).p(canvas2, (int) (y8Var.O * 255.0f), view.getMeasuredHeight());
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
        y8 y8Var = this.m0;
        float f10 = 0.0f;
        if (z10 != y8Var.V) {
            y8Var.V = z10;
            org.telegram.messenger.g0.E2(y8Var.a);
            org.telegram.messenger.g0.Y2(y8Var.getParentActivity(), y8Var.getClassGuid());
            if (y8Var.V) {
                y8Var.n0(false, 0.0f);
                y8Var.a.setExpanded(false);
                addView(y8Var.a, 0, c8.ma.c(-1.0f, -1));
            } else {
                y8Var.r.addView(y8Var.a, 0, c8.ma.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.Z2(y8Var.getParentActivity(), y8Var.getClassGuid());
        }
        if (y8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) y8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) y8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) y8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = y8Var.M;
        boolean z12 = this.f >= org.telegram.messenger.g0.L(20.0f);
        y8Var.M = z12;
        if (z11 != z12) {
            super.onMeasure(i7, i10);
            if (y8Var.M) {
                int i12 = -y8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.g2) y8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.d61 d61Var = y8Var.r;
            d61Var.setTranslationY((d61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) y8Var.r.getLayoutParams()).topMargin = i11;
            boolean z13 = y8Var.M;
            if (!y8Var.V) {
                y8Var.N = ValueAnimator.ofFloat(y8Var.O, z13 ? 1.0f : 0.0f);
                float f11 = ((y8Var.d - y8Var.c) - org.telegram.messenger.g0.m) * y8Var.F;
                if (z13) {
                    y8Var.a.setExpanded(false);
                    f11 = y8Var.r.getTranslationY();
                } else {
                    f10 = y8Var.r.getTranslationY();
                }
                if (!y8Var.G || z13) {
                    y8Var.G = false;
                } else {
                    y8Var.a.setExpanded(true);
                }
                y8Var.N.addUpdateListener(new t8(y8Var, f11, f10, z13));
                y8Var.N.addListener(new n8(y8Var, 1));
                y8Var.N.setDuration(250L);
                y8Var.N.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                y8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        y8Var.c = y8Var.a.getMeasuredHeight();
        y8Var.d = y8Var.a.getMeasuredWidth();
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
        y8 y8Var = this.h0;
        if (y8Var.O > 0.0f || y8Var.V || i10 <= 0 || y8Var.F <= 0.0f) {
            return;
        }
        y8Var.i0();
        y8Var.n0(true, Utilities.i(y8Var.F - (i10 / y8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        y8 y8Var = this.h0;
        if (y8Var.O > 0.0f || y8Var.V || i12 == 0) {
            return;
        }
        y8Var.i0();
        y8Var.n0(true, Utilities.i(y8Var.F - (i12 / y8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.g0.a = i7;
        this.h0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        y8 y8Var = this.h0;
        return y8Var.O <= 0.0f && !y8Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g0.a = 0;
        y8 y8Var = this.h0;
        y8Var.l0(y8Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y8 y8Var = this.m0;
        if (!y8Var.L.b(motionEvent)) {
            if (!y8Var.V) {
                if (motionEvent.getAction() == 0) {
                    s8 s8Var = y8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    s8Var.getHitRect(rect);
                    rect.offset(0, (int) y8Var.r.getY());
                    if (y8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.i0) || this.j0)) {
                    if (!z10) {
                        y8Var.n0(true, Utilities.i(((-(this.l0 - motionEvent.getY())) / y8Var.d) + this.k0, 1.0f, 0.0f));
                    } else if (Math.abs(this.l0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.i0 = false;
                        this.j0 = true;
                        this.k0 = y8Var.F;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        y8Var.l0(y8Var.F > 0.5f, false, false);
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
