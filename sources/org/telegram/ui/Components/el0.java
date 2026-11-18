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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class el0 extends HorizontalScrollView {
    public static final /* synthetic */ int u0 = 0;
    public int E;
    public final c6 F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final org.telegram.ui.ActionBar.i6 P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int a;
    public float a0;
    public dl0 b;
    public float b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final org.telegram.ui.d61 e;
    public float e0;
    public cl0 f;
    public final zk0 f0;
    public boolean g0;
    public HashMap h;
    public boolean h0;
    public ValueAnimator i0;
    public float j0;
    public final float k0;
    public final float l0;
    public float m0;
    public HashMap n;
    public int n0;
    public final Paint o0;
    public boolean p0;
    public final c6 q0;
    public final SparseArray r;
    public boolean r0;
    public View s;
    public long s0;
    public final zk0 t0;
    public float w;
    public boolean x;
    public int y;

    public el0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = dl0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        lr lrVar = lr.h;
        this.F = new c6(this, 350L, lrVar);
        new RectF();
        new RectF();
        this.G = new RectF();
        this.J = 436207616;
        this.L = new GradientDrawable();
        this.M = org.telegram.messenger.g0.L(33.0f);
        this.N = org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.L(12.0f);
        org.telegram.messenger.g0.L(24.0f);
        this.O = 0;
        this.R = new SparseArray();
        this.S = new SparseArray();
        this.f0 = new zk0(this, 0);
        this.g0 = false;
        this.k0 = org.telegram.messenger.g0.L(64.0f);
        this.l0 = org.telegram.messenger.g0.L(33.0f);
        this.n0 = -1;
        this.o0 = new Paint();
        this.p0 = true;
        this.q0 = new c6(this, 350L, lrVar);
        this.t0 = new zk0(this, 1);
        this.P = i6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(14, context, this);
        this.e = d61Var;
        d61Var.setOrientation(0);
        d61Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(d61Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return org.telegram.messenger.g0.L(this.h0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.y;
        this.y = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(i10);
        if (frameLayout != null) {
            g(i10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new xk0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.E);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final pv0 c(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.y;
        this.y = i11 + 1;
        pv0 pv0Var = (pv0) this.n.get(i10);
        if (pv0Var != null) {
            g(i10, pv0Var, i11);
        } else {
            pv0Var = new pv0(getContext(), 1);
            pv0Var.f.setImageDrawable(drawable);
            pv0Var.setFocusable(true);
            pv0Var.setOnClickListener(new xk0(this, 4));
            pv0Var.setExpanded(this.g0);
            pv0Var.a(this.j0);
            this.e.addView(pv0Var, i11);
        }
        pv0Var.d = false;
        pv0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        pv0Var.setSelected(i11 == this.E);
        this.h.put(i10, pv0Var);
        return pv0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.c0 = false;
        org.telegram.messenger.g0.r(this.f0);
    }

    public final void d(boolean z10) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new al0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.d61 d61Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.l0 - this.k0;
        float f13 = (1.0f - this.j0) * this.m0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            d61Var = this.e;
            if (i10 >= d61Var.getChildCount()) {
                break;
            }
            if (d61Var.getChildAt(i10) instanceof pv0) {
                pv0 pv0Var = (pv0) d61Var.getChildAt(i10);
                float left = pv0Var.getLeft();
                float f14 = pv0Var.E;
                if (left != f14 && pv0Var.F) {
                    pv0Var.b = f14 - pv0Var.getLeft();
                    ValueAnimator valueAnimator = pv0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pv0Var.y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(pv0Var.b, 0.0f);
                    pv0Var.y = ofFloat;
                    ofFloat.addUpdateListener(new ov0(pv0Var, this, i7));
                    pv0Var.y.addListener(new h60(5, pv0Var, this));
                    pv0Var.y.start();
                }
                pv0Var.F = false;
                if (this.h0) {
                    pv0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.j0, i10 * f12, f13) + pv0Var.b);
                } else {
                    pv0Var.setTranslationX(pv0Var.b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.h0) {
            height = com.google.android.gms.internal.vision.e2.t(1.0f, this.j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f15 = height;
        float e10 = this.q0.e(false, this.p0 ? 1.0f : 0.0f);
        if (isInEditMode() || this.y == 0 || this.K < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.E;
            c6 c6Var = this.F;
            float e11 = c6Var.e(false, f16);
            TimeInterpolator timeInterpolator = c6Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= d61Var.getChildCount()) ? null : d61Var.getChildAt(floor);
            if (ceil >= 0 && ceil < d61Var.getChildCount()) {
                view = d61Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof pv0) {
                        textWidth = ((pv0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof pv0) {
                            textWidth = ((pv0) view).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f10 = 2.0f;
                float f18 = e11 - floor;
                f11 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), f18);
                textWidth = org.telegram.messenger.g0.T1(childAt instanceof pv0 ? ((pv0) childAt).getTextWidth() : 0.0f, view instanceof pv0 ? ((pv0) view).getTextWidth() : 0.0f, f18);
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(c6Var.b()) : c6Var.b())) * 0.25f) * f10)) * L;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(c6Var.b()) : c6Var.b())) * 0.1f * f10) + 0.9f) * L;
            float interpolation = lr.i.getInterpolation(this.j0);
            float W1 = f17 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f10;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f11 - T1, W1 - T12, f11 + T1, f19);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.i6 i6Var = this.P;
            Paint paint = this.o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.y == 0 || this.N <= 0) {
            return;
        }
        int i11 = this.J;
        Paint paint2 = this.I;
        paint2.setColor(i11);
        canvas2.drawRect(0.0f, f15 - this.N, d61Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i7) {
        if (!this.T || i7 < 0) {
            return false;
        }
        org.telegram.ui.d61 d61Var = this.e;
        if (i7 >= d61Var.getChildCount()) {
            return false;
        }
        View childAt = d61Var.getChildAt(i7);
        if (!(childAt instanceof pv0)) {
            return false;
        }
        pv0 pv0Var = (pv0) childAt;
        return pv0Var.a == 0 && !pv0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        zk0 zk0Var = this.f0;
        if (action == 0 && this.s == null) {
            this.c0 = true;
            org.telegram.messenger.g0.h3(zk0Var, 500L);
            this.a0 = motionEvent.getX();
            this.b0 = motionEvent.getY();
        }
        if (this.c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.b0) > f10) {
                this.c0 = false;
                org.telegram.messenger.g0.r(zk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        zk0 zk0Var2 = this.t0;
        org.telegram.ui.d61 d61Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.s0 = -1L;
            org.telegram.messenger.g0.r(zk0Var2);
            org.telegram.messenger.g0.r(zk0Var);
            if (this.s != null) {
                int i7 = this.U;
                int i10 = this.V;
                if (i7 != i10) {
                    o(i7, i10);
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        d61Var.getChildAt(i11).setTag(R.id.index_tag, Integer.valueOf(i11));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e60(this, 13));
                ofFloat.addListener(new q60(this, 15));
                ofFloat.start();
            }
            this.c0 = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i12 = this.V;
        if (ceil != i12) {
            if (ceil < i12) {
                while (!e(ceil) && ceil != this.V) {
                    ceil++;
                }
            } else {
                while (!e(ceil) && ceil != this.V) {
                    ceil--;
                }
            }
        }
        if (this.V != ceil && e(ceil)) {
            for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
                if (i13 != this.V) {
                    pv0 pv0Var = (pv0) d61Var.getChildAt(i13);
                    pv0Var.E = pv0Var.getLeft();
                    pv0Var.F = true;
                    pv0Var.invalidate();
                }
            }
            this.W += (ceil - this.V) * getTabSize();
            this.V = ceil;
            d61Var.removeView(this.s);
            d61Var.addView(this.s, this.V);
            invalidate();
        }
        this.e0 = this.a0 - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.r0 = false;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.h3(zk0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.r0 = true;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.h3(zk0Var2, 16L);
        } else {
            this.s0 = -1L;
            org.telegram.messenger.g0.r(zk0Var2);
        }
        d61Var.invalidate();
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
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.h0) {
            return org.telegram.messenger.g0.L(50.0f) * this.j0;
        }
        return 0.0f;
    }

    public dl0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        org.telegram.ui.d61 d61Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                d61Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            View view = (View) sparseArray.valueAt(i7);
            if (d61Var.indexOfChild(view) != keyAt) {
                d61Var.removeView(view);
                d61Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f10) {
        if (this.g0 != z10) {
            this.g0 = z10;
            int i7 = 0;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.i0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z10 ? 1.0f : 0.0f);
            this.i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    el0 el0Var = el0.this;
                    org.telegram.ui.d61 d61Var = el0Var.e;
                    if (!z10) {
                        float childCount = el0Var.l0 * d61Var.getChildCount();
                        float scrollX = el0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (el0Var.k0 * d61Var.getChildCount());
                        float measuredWidth = (childCount - el0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        el0Var.m0 = (el0Var.getScrollX() + f11) - f12;
                    }
                    el0Var.j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < d61Var.getChildCount(); i10++) {
                        d61Var.getChildAt(i10).invalidate();
                    }
                    d61Var.invalidate();
                    el0Var.p();
                }
            });
            this.i0.addListener(new bl0(this, z10, f10, i7));
            this.i0.start();
            org.telegram.ui.d61 d61Var = this.e;
            if (z10) {
                this.h0 = true;
                while (i7 < d61Var.getChildCount()) {
                    View childAt = d61Var.getChildAt(i7);
                    if (childAt instanceof pv0) {
                        ((pv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                    i7++;
                }
                d61Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.k0 * d61Var.getChildCount() * ((getScrollX() + f10) / (this.l0 * d61Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.E;
        if (i11 == i7) {
            return;
        }
        org.telegram.ui.d61 d61Var = this.e;
        View childAt = d61Var.getChildAt(i11);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.E = i7;
        if (i7 >= d61Var.getChildCount()) {
            return;
        }
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= d61Var.getChildCount()) {
                break;
            }
            View childAt2 = d61Var.getChildAt(i12);
            if (i12 != i7) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i12++;
        }
        if (this.i0 == null) {
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
            org.telegram.ui.d61 d61Var = this.e;
            if (d61Var.getChildAt(i7) == null) {
                return;
            }
            int left = d61Var.getChildAt(i7).getLeft();
            int i10 = this.M;
            if (i7 > 0) {
                left -= i10;
            }
            int scrollX = getScrollX();
            if (left != this.O) {
                if (left < scrollX) {
                    this.O = left;
                    smoothScrollTo(left, 0);
                } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                    int width = (i10 * 3) + (left - getWidth());
                    this.O = width;
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
        org.telegram.ui.d61 d61Var;
        int i11;
        int i12;
        String str;
        org.telegram.messenger.fc k10;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        float L = org.telegram.messenger.g0.L(33.0f);
        float L2 = org.telegram.messenger.g0.L(31.0f);
        float f10 = this.j0;
        float f11 = (L2 * f10) + L;
        float scrollX = getScrollX() - (this.h0 ? (1.0f - f10) * this.m0 : 0.0f);
        org.telegram.ui.d61 d61Var2 = this.e;
        int paddingLeft = (int) ((scrollX - d61Var2.getPaddingLeft()) / f11);
        int i13 = 1;
        int min = Math.min(d61Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.h0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > d61Var2.getChildCount()) {
                min = d61Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.S;
        sparseArray2.clear();
        int i14 = 0;
        while (true) {
            sparseArray = this.R;
            if (i14 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((pv0) sparseArray.valueAt(i14)).s, (pv0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = d61Var2.getChildAt(paddingLeft);
            if (childAt instanceof pv0) {
                pv0 pv0Var = (pv0) childAt;
                int i15 = pv0Var.s;
                q9 q9Var = pv0Var.e;
                if (pv0Var.a == 2) {
                    Object tag = pv0Var.getTag(R.id.parent_tag);
                    Object tag2 = pv0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        q9Var.j(org.telegram.messenger.fc.b((TLRPC.Document) tag2), !org.telegram.messenger.pc.e(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        q9Var.setImageDrawable(drawable);
                    }
                    i7 = paddingLeft;
                    i10 = min;
                    d61Var = d61Var2;
                    i11 = i13;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!pv0Var.c) {
                            pv0Var.w = org.telegram.messenger.u5.f((TLRPC.Document) tag3, org.telegram.ui.ActionBar.n6.c7, 0.2f, null);
                        }
                        k10 = org.telegram.messenger.fc.b(document);
                        i7 = paddingLeft;
                        i10 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i12 = stickerSet.thumb_version;
                            if (pv0Var.c) {
                                i7 = paddingLeft;
                                i10 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                int i16 = org.telegram.ui.ActionBar.n6.c7;
                                i7 = paddingLeft;
                                int size = arrayList.size();
                                i10 = min;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size) {
                                        z10 = false;
                                        break;
                                    }
                                    int i18 = size;
                                    if ("v".equalsIgnoreCase(arrayList.get(i17).type)) {
                                        z10 = true;
                                        break;
                                    } else {
                                        i17++;
                                        size = i18;
                                    }
                                }
                                pv0Var.w = org.telegram.messenger.u5.d(arrayList, i16, 0.2f, z10);
                            }
                        } else {
                            i7 = paddingLeft;
                            i10 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        k10 = org.telegram.messenger.fc.k(photoSize, document, i12);
                    } else {
                        i7 = paddingLeft;
                        i10 = min;
                        d61Var = d61Var2;
                        i11 = 1;
                    }
                    if (!pv0Var.c && pv0Var.w == null && document != null) {
                        pv0Var.w = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.c7, 0.2f, null);
                    }
                    if (k10 != null) {
                        pv0Var.c = true;
                        org.telegram.messenger.lz lzVar = pv0Var.w;
                        boolean e10 = org.telegram.messenger.pc.e(1);
                        String str2 = !e10 ? "40_40_firstframe" : "40_40";
                        if (str == null && org.telegram.messenger.fj.N4(document)) {
                            d61Var = d61Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            d61Var = d61Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            org.telegram.messenger.fc fcVar = k10;
                            if (!(str == null && org.telegram.messenger.fj.K2(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                i11 = 1;
                                if (fcVar.p == 1) {
                                    obj = tag4;
                                    q9Var.k(fcVar, str2, "tgs", lzVar, obj);
                                } else {
                                    obj = tag4;
                                    q9Var.k(fcVar, str2, "webp", lzVar, obj);
                                }
                                obj2 = obj;
                                pv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (lzVar != null) {
                                q9Var.p(fcVar, str2, lzVar, tag4);
                                obj2 = tag4;
                                i11 = 1;
                                pv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                q9Var.l(fcVar, str2, fcVar, null, 0, obj3);
                                obj2 = obj3;
                                i11 = 1;
                                pv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!e10) {
                                q9Var.p(org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "40_40", lzVar, tag4);
                            } else if (lzVar != null) {
                                q9Var.p(org.telegram.messenger.fc.b(document), str2, lzVar, tag4);
                            } else {
                                obj3 = tag4;
                                q9Var.l(org.telegram.messenger.fc.b(document), str2, k10, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            org.telegram.messenger.fc fcVar2 = k10;
                            if (lzVar != null) {
                                q9Var.p(fcVar2, str2, lzVar, obj2);
                            } else {
                                q9Var.l(fcVar2, str2, null, null, 0, obj2);
                            }
                        }
                        i11 = 1;
                        pv0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    d61Var = d61Var2;
                    i11 = 1;
                }
                sparseArray.put(i15, pv0Var);
                sparseArray2.remove(i15);
                paddingLeft = i7 + 1;
                i13 = i11;
                min = i10;
                d61Var2 = d61Var;
            } else {
                i7 = paddingLeft;
                i10 = min;
                d61Var = d61Var2;
                i11 = i13;
            }
            paddingLeft = i7 + 1;
            i13 = i11;
            min = i10;
            d61Var2 = d61Var;
        }
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            if (((pv0) sparseArray2.valueAt(i19)) != this.s) {
                ((pv0) sparseArray2.valueAt(i19)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        n();
        int i13 = this.n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.n0 = -1;
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
        this.E = i7;
    }

    public void setDelegate(cl0 cl0Var) {
        this.f = cl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.K = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        requestLayout();
    }

    public void setType(dl0 dl0Var) {
        if (dl0Var == null || this.b == dl0Var) {
            return;
        }
        this.b = dl0Var;
        int ordinal = dl0Var.ordinal();
        GradientDrawable gradientDrawable = this.L;
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
        this.J = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.J = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        if (this.N != i7) {
            this.N = i7;
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
