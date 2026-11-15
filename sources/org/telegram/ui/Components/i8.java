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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i8 extends st0 {
    public final e2.r0 g0;
    public final /* synthetic */ q8 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final /* synthetic */ q8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(q8 q8Var, Context context) {
        super(context, null);
        this.m0 = q8Var;
        this.h0 = q8Var;
        this.g0 = new e2.r0();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        q8 q8Var = this.m0;
        if (!q8Var.V) {
            if (!q8Var.h) {
                canvas.save();
                float x10 = q8Var.a.getX() + q8Var.r.getX();
                float y10 = q8Var.a.getY() + q8Var.r.getY();
                int i7 = q8Var.d - q8Var.c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - q8Var.c) >> 1), q8Var.O);
                canvas.translate(x10, T1);
                q8Var.a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = i7 / 2.0f;
                rectF.set(x10, T1 - (q8Var.F * f10), q8Var.a.getMeasuredWidth() + x10, (f10 * q8Var.F) + q8Var.a.getMeasuredHeight() + T1);
                j8 j8Var = q8Var.a;
                float f11 = x10 + j8Var.E;
                float f12 = T1 + j8Var.F;
                kc kcVar = q8Var.L;
                float f13 = j8Var.y;
                kcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                kcVar.i = false;
                kcVar.c = 0;
                kcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (q8Var.e.getVisibility() == 0 ? q8Var.e.getAlpha() : 0.0f)) * q8Var.a.s.c;
            if (alpha != 0.0f) {
                q8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(q8Var.I.getX(), q8Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q8Var.I.getMeasuredWidth(), q8Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                q8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                q8Var.I.setVisibility(8);
            }
        }
        if (q8Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        q8 q8Var = this.m0;
        Paint paint = q8Var.P;
        if (view == q8Var.I) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
        if (view != kVar || q8Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
            paint.setAlpha((int) (q8Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) q8Var.getParentLayout()).p(canvas2, (int) (q8Var.O * 255.0f), view.getMeasuredHeight());
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
        q8 q8Var = this.m0;
        float f10 = 0.0f;
        if (z10 != q8Var.V) {
            q8Var.V = z10;
            org.telegram.messenger.g0.E2(q8Var.a);
            org.telegram.messenger.g0.Z2(q8Var.getParentActivity(), q8Var.getClassGuid());
            if (q8Var.V) {
                q8Var.n0(false, 0.0f);
                q8Var.a.setExpanded(false);
                addView(q8Var.a, 0, c8.ja.c(-1.0f, -1));
            } else {
                q8Var.r.addView(q8Var.a, 0, c8.ja.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(q8Var.getParentActivity(), q8Var.getClassGuid());
        }
        if (q8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) q8Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) q8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) q8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = q8Var.M;
        boolean z12 = this.f >= org.telegram.messenger.g0.L(20.0f);
        q8Var.M = z12;
        if (z11 != z12) {
            super.onMeasure(i7, i10);
            if (q8Var.M) {
                int i12 = -q8Var.b.getTop();
                kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + i12;
            } else {
                i11 = 0;
            }
            org.telegram.ui.z51 z51Var = q8Var.r;
            z51Var.setTranslationY((z51Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) q8Var.r.getLayoutParams()).topMargin = i11;
            boolean z13 = q8Var.M;
            if (!q8Var.V) {
                q8Var.N = ValueAnimator.ofFloat(q8Var.O, z13 ? 1.0f : 0.0f);
                float f11 = ((q8Var.d - q8Var.c) - org.telegram.messenger.g0.m) * q8Var.F;
                if (z13) {
                    q8Var.a.setExpanded(false);
                    f11 = q8Var.r.getTranslationY();
                } else {
                    f10 = q8Var.r.getTranslationY();
                }
                if (!q8Var.G || z13) {
                    q8Var.G = false;
                } else {
                    q8Var.a.setExpanded(true);
                }
                q8Var.N.addUpdateListener(new l8(q8Var, f11, f10, z13));
                q8Var.N.addListener(new f8(q8Var, 1));
                q8Var.N.setDuration(250L);
                q8Var.N.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                q8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        q8Var.c = q8Var.a.getMeasuredHeight();
        q8Var.d = q8Var.a.getMeasuredWidth();
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
        q8 q8Var = this.h0;
        if (q8Var.O > 0.0f || q8Var.V || i10 <= 0 || q8Var.F <= 0.0f) {
            return;
        }
        q8Var.i0();
        q8Var.n0(true, Utilities.i(q8Var.F - (i10 / q8Var.d), 1.0f, 0.0f));
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        q8 q8Var = this.h0;
        if (q8Var.O > 0.0f || q8Var.V || i12 == 0) {
            return;
        }
        q8Var.i0();
        q8Var.n0(true, Utilities.i(q8Var.F - (i12 / q8Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.g0.a = i7;
        this.h0.i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        q8 q8Var = this.h0;
        return q8Var.O <= 0.0f && !q8Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g0.a = 0;
        q8 q8Var = this.h0;
        q8Var.l0(q8Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        q8 q8Var = this.m0;
        if (!q8Var.L.b(motionEvent)) {
            if (!q8Var.V) {
                if (motionEvent.getAction() == 0) {
                    k8 k8Var = q8Var.b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    k8Var.getHitRect(rect);
                    rect.offset(0, (int) q8Var.r.getY());
                    if (q8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.i0) || this.j0)) {
                    if (!z10) {
                        q8Var.n0(true, Utilities.i(((-(this.l0 - motionEvent.getY())) / q8Var.d) + this.k0, 1.0f, 0.0f));
                    } else if (Math.abs(this.l0 - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.i0 = false;
                        this.j0 = true;
                        this.k0 = q8Var.F;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        q8Var.l0(q8Var.F > 0.5f, false, false);
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
