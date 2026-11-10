package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class rk0 extends HorizontalScrollView {
    public static final /* synthetic */ int t0 = 0;
    public int D;
    public final v5 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.h6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int a;
    public float a0;
    public qk0 b;
    public boolean b0;
    public final LinearLayout.LayoutParams c;
    public float c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final org.telegram.ui.e61 e;
    public final mk0 e0;
    public pk0 f;
    public boolean f0;
    public boolean g0;
    public HashMap h;
    public ValueAnimator h0;
    public float i0;
    public final float j0;
    public final float k0;
    public float l0;
    public int m0;
    public HashMap n;
    public final Paint n0;
    public boolean o0;
    public final v5 p0;
    public boolean q0;
    public final SparseArray r;
    public long r0;
    public View s;
    public final mk0 s0;
    public float w;
    public boolean x;
    public int y;

    public rk0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.a = 1;
        this.b = qk0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        wq wqVar = wq.h;
        this.E = new v5(this, 350L, wqVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = org.telegram.messenger.g0.L(33.0f);
        this.M = org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.L(12.0f);
        org.telegram.messenger.g0.L(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.e0 = new mk0(this, 0);
        this.f0 = false;
        this.j0 = org.telegram.messenger.g0.L(64.0f);
        this.k0 = org.telegram.messenger.g0.L(33.0f);
        this.m0 = -1;
        this.n0 = new Paint();
        this.o0 = true;
        this.p0 = new v5(this, 350L, wqVar);
        this.s0 = new mk0(this, 1);
        this.O = h6Var;
        this.P = z9;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(13, context, this);
        this.e = e61Var;
        e61Var.setOrientation(0);
        e61Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(e61Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return org.telegram.messenger.g0.L(this.g0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String j3 = jg.g.j(i7, "tab");
        int i10 = this.y;
        this.y = i10 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(j3);
        if (frameLayout != null) {
            g(j3, frameLayout, i10);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new kk0(this, 3));
            this.e.addView(frameLayout, i10);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i10));
        frameLayout.setSelected(i10 == this.D);
        this.h.put(j3, frameLayout);
        return frameLayout;
    }

    public final gv0 c(int i7, Drawable drawable) {
        String j3 = jg.g.j(i7, "tab");
        int i10 = this.y;
        this.y = i10 + 1;
        gv0 gv0Var = (gv0) this.n.get(j3);
        if (gv0Var != null) {
            g(j3, gv0Var, i10);
        } else {
            gv0Var = new gv0(getContext(), 1);
            gv0Var.f.setImageDrawable(drawable);
            gv0Var.setFocusable(true);
            gv0Var.setOnClickListener(new kk0(this, 4));
            gv0Var.setExpanded(this.f0);
            gv0Var.a(this.i0);
            this.e.addView(gv0Var, i10);
        }
        gv0Var.d = false;
        gv0Var.setTag(R.id.index_tag, Integer.valueOf(i10));
        gv0Var.setSelected(i10 == this.D);
        this.h.put(j3, gv0Var);
        return gv0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.b0 = false;
        org.telegram.messenger.g0.r(this.e0);
    }

    public final void d(boolean z9) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.y = 0;
        if (z9) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new nk0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.e61 e61Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.k0 - this.j0;
        float f13 = (1.0f - this.i0) * this.l0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            e61Var = this.e;
            if (i10 >= e61Var.getChildCount()) {
                break;
            }
            if (e61Var.getChildAt(i10) instanceof gv0) {
                gv0 gv0Var = (gv0) e61Var.getChildAt(i10);
                float left = gv0Var.getLeft();
                float f14 = gv0Var.D;
                if (left != f14 && gv0Var.E) {
                    gv0Var.b = f14 - gv0Var.getLeft();
                    ValueAnimator valueAnimator = gv0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gv0Var.y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(gv0Var.b, 0.0f);
                    gv0Var.y = ofFloat;
                    ofFloat.addUpdateListener(new fv0(gv0Var, this, i7));
                    gv0Var.y.addListener(new v50(5, gv0Var, this));
                    gv0Var.y.start();
                }
                gv0Var.E = false;
                if (this.g0) {
                    gv0Var.setTranslationX(com.google.android.recaptcha.internal.a.z(1.0f, this.i0, i10 * f12, f13) + gv0Var.b);
                } else {
                    gv0Var.setTranslationX(gv0Var.b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.g0) {
            height = com.google.android.recaptcha.internal.a.v(1.0f, this.i0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f15 = height;
        float e10 = this.p0.e(false, this.o0 ? 1.0f : 0.0f);
        if (isInEditMode() || this.y == 0 || this.J < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.D;
            v5 v5Var = this.E;
            float e11 = v5Var.e(false, f16);
            TimeInterpolator timeInterpolator = v5Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= e61Var.getChildCount()) ? null : e61Var.getChildAt(floor);
            if (ceil >= 0 && ceil < e61Var.getChildCount()) {
                view = e61Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (org.telegram.messenger.g0.W1(this.i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof gv0) {
                        textWidth = ((gv0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (org.telegram.messenger.g0.W1(this.i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof gv0) {
                            textWidth = ((gv0) view).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f10 = 2.0f;
                float f18 = e11 - floor;
                f11 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (org.telegram.messenger.g0.W1(this.i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), f18);
                textWidth = org.telegram.messenger.g0.T1(childAt instanceof gv0 ? ((gv0) childAt).getTextWidth() : 0.0f, view instanceof gv0 ? ((gv0) view).getTextWidth() : 0.0f, f18);
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(v5Var.b()) : v5Var.b())) * 0.25f) * f10)) * L;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(v5Var.b()) : v5Var.b())) * 0.1f * f10) + 0.9f) * L;
            float interpolation = wq.i.getInterpolation(this.i0);
            float W1 = f17 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f10;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = W1 + T12;
            RectF rectF = this.F;
            rectF.set(f11 - T1, W1 - T12, f11 + T1, f19);
            boolean z9 = this.P;
            org.telegram.ui.ActionBar.h6 h6Var = this.O;
            Paint paint = this.n0;
            if (z9) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.y == 0 || this.M <= 0) {
            return;
        }
        int i11 = this.I;
        Paint paint2 = this.H;
        paint2.setColor(i11);
        canvas2.drawRect(0.0f, f15 - this.M, e61Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i7) {
        if (!this.S || i7 < 0) {
            return false;
        }
        org.telegram.ui.e61 e61Var = this.e;
        if (i7 >= e61Var.getChildCount()) {
            return false;
        }
        View childAt = e61Var.getChildAt(i7);
        if (!(childAt instanceof gv0)) {
            return false;
        }
        gv0 gv0Var = (gv0) childAt;
        return gv0Var.a == 0 && !gv0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mk0 mk0Var = this.e0;
        if (action == 0 && this.s == null) {
            this.b0 = true;
            org.telegram.messenger.g0.i3(mk0Var, 500L);
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
        }
        if (this.b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f10 = this.G;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.a0) > f10) {
                this.b0 = false;
                org.telegram.messenger.g0.r(mk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        mk0 mk0Var2 = this.s0;
        org.telegram.ui.e61 e61Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.r0 = -1L;
            org.telegram.messenger.g0.r(mk0Var2);
            org.telegram.messenger.g0.r(mk0Var);
            if (this.s != null) {
                int i7 = this.T;
                int i10 = this.U;
                if (i7 != i10) {
                    o(i7, i10);
                    for (int i11 = 0; i11 < e61Var.getChildCount(); i11++) {
                        e61Var.getChildAt(i11).setTag(R.id.index_tag, Integer.valueOf(i11));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c60(this, 11));
                ofFloat.addListener(new e60(this, 15));
                ofFloat.start();
            }
            this.b0 = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i12 = this.U;
        if (ceil != i12) {
            if (ceil < i12) {
                while (!e(ceil) && ceil != this.U) {
                    ceil++;
                }
            } else {
                while (!e(ceil) && ceil != this.U) {
                    ceil--;
                }
            }
        }
        if (this.U != ceil && e(ceil)) {
            for (int i13 = 0; i13 < e61Var.getChildCount(); i13++) {
                if (i13 != this.U) {
                    gv0 gv0Var = (gv0) e61Var.getChildAt(i13);
                    gv0Var.D = gv0Var.getLeft();
                    gv0Var.E = true;
                    gv0Var.invalidate();
                }
            }
            this.V += (ceil - this.U) * getTabSize();
            this.U = ceil;
            e61Var.removeView(this.s);
            e61Var.addView(this.s, this.U);
            invalidate();
        }
        this.d0 = this.W - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.q0 = false;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.i3(mk0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.q0 = true;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.i3(mk0Var2, 16L);
        } else {
            this.r0 = -1L;
            org.telegram.messenger.g0.r(mk0Var2);
        }
        e61Var.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i7) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i7, frameLayout);
    }

    public int getCurrentPosition() {
        return this.D;
    }

    public float getExpandedOffset() {
        if (this.g0) {
            return org.telegram.messenger.g0.L(50.0f) * this.i0;
        }
        return 0.0f;
    }

    public qk0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        org.telegram.ui.e61 e61Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                e61Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            View view = (View) sparseArray.valueAt(i7);
            if (e61Var.indexOfChild(view) != keyAt) {
                e61Var.removeView(view);
                e61Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z9, final float f10) {
        if (this.f0 != z9) {
            this.f0 = z9;
            int i7 = 0;
            if (!z9) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.h0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i0, z9 ? 1.0f : 0.0f);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.lk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    rk0 rk0Var = rk0.this;
                    org.telegram.ui.e61 e61Var = rk0Var.e;
                    if (!z9) {
                        float childCount = rk0Var.k0 * e61Var.getChildCount();
                        float scrollX = rk0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (rk0Var.j0 * e61Var.getChildCount());
                        float measuredWidth = (childCount - rk0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        rk0Var.l0 = (rk0Var.getScrollX() + f11) - f12;
                    }
                    rk0Var.i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < e61Var.getChildCount(); i10++) {
                        e61Var.getChildAt(i10).invalidate();
                    }
                    e61Var.invalidate();
                    rk0Var.p();
                }
            });
            this.h0.addListener(new ok0(this, z9, f10, i7));
            this.h0.start();
            org.telegram.ui.e61 e61Var = this.e;
            if (z9) {
                this.g0 = true;
                while (i7 < e61Var.getChildCount()) {
                    View childAt = e61Var.getChildAt(i7);
                    if (childAt instanceof gv0) {
                        ((gv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                    i7++;
                }
                e61Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z9) {
                float childCount = this.j0 * e61Var.getChildCount() * ((getScrollX() + f10) / (this.k0 * e61Var.getChildCount()));
                this.l0 = childCount - (getScrollX() + f10);
                this.m0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.D;
        if (i11 == i7) {
            return;
        }
        org.telegram.ui.e61 e61Var = this.e;
        View childAt = e61Var.getChildAt(i11);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.D = i7;
        if (i7 >= e61Var.getChildCount()) {
            return;
        }
        int i12 = 0;
        while (true) {
            boolean z9 = true;
            if (i12 >= e61Var.getChildCount()) {
                break;
            }
            View childAt2 = e61Var.getChildAt(i12);
            if (i12 != i7) {
                z9 = false;
            }
            childAt2.setSelected(z9);
            i12++;
        }
        if (this.h0 == null) {
            if (i10 != i7 || i7 <= 1) {
                l(i7);
            } else {
                l(i7 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i7) {
        if (this.y != 0) {
            org.telegram.ui.e61 e61Var = this.e;
            if (e61Var.getChildAt(i7) == null) {
                return;
            }
            int left = e61Var.getChildAt(i7).getLeft();
            int i10 = this.L;
            if (i7 > 0) {
                left -= i10;
            }
            int scrollX = getScrollX();
            if (left != this.N) {
                if (left < scrollX) {
                    this.N = left;
                    smoothScrollTo(left, 0);
                } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                    int width = (i10 * 3) + (left - getWidth());
                    this.N = width;
                    smoothScrollTo(width, 0);
                }
            }
        }
    }

    public final void m(int i7) {
        if (i7 < 0 || i7 >= this.y) {
            return;
        }
        this.e.getChildAt(i7).performClick();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
    
        if (r3.size() > 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        SparseArray sparseArray;
        int i7;
        int i10;
        org.telegram.ui.e61 e61Var;
        int i11;
        int i12;
        String str;
        org.telegram.messenger.hc k10;
        boolean z9;
        Object obj;
        Object obj2;
        Object obj3;
        float L = org.telegram.messenger.g0.L(33.0f);
        float L2 = org.telegram.messenger.g0.L(31.0f);
        float f10 = this.i0;
        float f11 = (L2 * f10) + L;
        float scrollX = getScrollX() - (this.g0 ? (1.0f - f10) * this.l0 : 0.0f);
        org.telegram.ui.e61 e61Var2 = this.e;
        int paddingLeft = (int) ((scrollX - e61Var2.getPaddingLeft()) / f11);
        int i13 = 1;
        int min = Math.min(e61Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.g0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > e61Var2.getChildCount()) {
                min = e61Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.R;
        sparseArray2.clear();
        int i14 = 0;
        while (true) {
            sparseArray = this.Q;
            if (i14 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((gv0) sparseArray.valueAt(i14)).s, (gv0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = e61Var2.getChildAt(paddingLeft);
            if (childAt instanceof gv0) {
                gv0 gv0Var = (gv0) childAt;
                int i15 = gv0Var.s;
                k9 k9Var = gv0Var.e;
                if (gv0Var.a == 2) {
                    Object tag = gv0Var.getTag(R.id.parent_tag);
                    Object tag2 = gv0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        k9Var.j(org.telegram.messenger.hc.b((TLRPC.Document) tag2), !org.telegram.messenger.sc.e(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        k9Var.setImageDrawable(drawable);
                    }
                    i7 = paddingLeft;
                    i10 = min;
                    e61Var = e61Var2;
                    i11 = i13;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!gv0Var.c) {
                            gv0Var.w = org.telegram.messenger.t5.f((TLRPC.Document) tag3, org.telegram.ui.ActionBar.m6.c7, 0.2f, null);
                        }
                        k10 = org.telegram.messenger.hc.b(document);
                        i7 = paddingLeft;
                        i10 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i12 = stickerSet.thumb_version;
                            if (gv0Var.c) {
                                i7 = paddingLeft;
                                i10 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                int i16 = org.telegram.ui.ActionBar.m6.c7;
                                i7 = paddingLeft;
                                int size = arrayList.size();
                                i10 = min;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size) {
                                        z9 = false;
                                        break;
                                    }
                                    int i18 = size;
                                    if ("v".equalsIgnoreCase(arrayList.get(i17).type)) {
                                        z9 = true;
                                        break;
                                    } else {
                                        i17++;
                                        size = i18;
                                    }
                                }
                                gv0Var.w = org.telegram.messenger.t5.d(arrayList, i16, 0.2f, z9);
                            }
                        } else {
                            i7 = paddingLeft;
                            i10 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        k10 = org.telegram.messenger.hc.k(photoSize, document, i12);
                    } else {
                        i7 = paddingLeft;
                        i10 = min;
                        e61Var = e61Var2;
                        i11 = 1;
                    }
                    if (!gv0Var.c && gv0Var.w == null && document != null) {
                        gv0Var.w = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.c7, 0.2f, null);
                    }
                    if (k10 != null) {
                        gv0Var.c = true;
                        org.telegram.messenger.rz rzVar = gv0Var.w;
                        boolean e10 = org.telegram.messenger.sc.e(1);
                        String str2 = !e10 ? "40_40_firstframe" : "40_40";
                        if (str == null && org.telegram.messenger.ij.N4(document)) {
                            e61Var = e61Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            e61Var = e61Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            org.telegram.messenger.hc hcVar = k10;
                            if (!(str == null && org.telegram.messenger.ij.K2(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                i11 = 1;
                                if (hcVar.p == 1) {
                                    obj = tag4;
                                    k9Var.k(hcVar, str2, "tgs", rzVar, obj);
                                } else {
                                    obj = tag4;
                                    k9Var.k(hcVar, str2, "webp", rzVar, obj);
                                }
                                obj2 = obj;
                                gv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (rzVar != null) {
                                k9Var.p(hcVar, str2, rzVar, tag4);
                                obj2 = tag4;
                                i11 = 1;
                                gv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                k9Var.l(hcVar, str2, hcVar, null, 0, obj3);
                                obj2 = obj3;
                                i11 = 1;
                                gv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!e10) {
                                k9Var.p(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "40_40", rzVar, tag4);
                            } else if (rzVar != null) {
                                k9Var.p(org.telegram.messenger.hc.b(document), str2, rzVar, tag4);
                            } else {
                                obj3 = tag4;
                                k9Var.l(org.telegram.messenger.hc.b(document), str2, k10, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            org.telegram.messenger.hc hcVar2 = k10;
                            if (rzVar != null) {
                                k9Var.p(hcVar2, str2, rzVar, obj2);
                            } else {
                                k9Var.l(hcVar2, str2, null, null, 0, obj2);
                            }
                        }
                        i11 = 1;
                        gv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    e61Var = e61Var2;
                    i11 = 1;
                }
                sparseArray.put(i15, gv0Var);
                sparseArray2.remove(i15);
                paddingLeft = i7 + 1;
                i13 = i11;
                min = i10;
                e61Var2 = e61Var;
            } else {
                i7 = paddingLeft;
                i10 = min;
                e61Var = e61Var2;
                i11 = i13;
            }
            paddingLeft = i7 + 1;
            i13 = i11;
            min = i10;
            e61Var2 = e61Var;
        }
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            if (((gv0) sparseArray2.valueAt(i19)) != this.s) {
                ((gv0) sparseArray2.valueAt(i19)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        n();
        int i13 = this.m0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.m0 = -1;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        n();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i7 = 0; i7 < this.y; i7++) {
            View childAt = this.e.getChildAt(i7);
            if (this.x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i7) {
        this.D = i7;
    }

    public void setDelegate(pk0 pk0Var) {
        this.f = pk0Var;
    }

    public void setDragEnabled(boolean z9) {
        this.S = z9;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.J = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z9) {
        this.x = z9;
        requestLayout();
    }

    public void setType(qk0 qk0Var) {
        if (qk0Var == null || this.b == qk0Var) {
            return;
        }
        this.b = qk0Var;
        int ordinal = qk0Var.ordinal();
        GradientDrawable gradientDrawable = this.K;
        if (ordinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (ordinal != 1) {
                return;
            }
            float N = org.telegram.messenger.g0.N(3.0f);
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i7) {
        this.I = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.I = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        if (this.M != i7) {
            this.M = i7;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i7, int i10) {
    }
}
