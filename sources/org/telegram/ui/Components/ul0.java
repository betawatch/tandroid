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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ul0 extends HorizontalScrollView {
    public static final /* synthetic */ int t0 = 0;
    public int D;
    public final t5 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.p6 O;
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
    public tl0 b;
    public boolean b0;
    public final LinearLayout.LayoutParams c;
    public float c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final org.telegram.ui.u71 e;
    public final ql0 e0;
    public sl0 f;
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
    public final t5 p0;
    public boolean q0;
    public final SparseArray r;
    public long r0;
    public View s;
    public final ql0 s0;
    public float w;
    public boolean x;
    public int y;

    public ul0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = tl0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        gr grVar = gr.h;
        this.E = new t5(this, 350L, grVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = org.telegram.messenger.i0.L(33.0f);
        this.M = org.telegram.messenger.i0.L(2.0f);
        org.telegram.messenger.i0.L(12.0f);
        org.telegram.messenger.i0.L(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.e0 = new ql0(this, 0);
        this.f0 = false;
        this.j0 = org.telegram.messenger.i0.L(64.0f);
        this.k0 = org.telegram.messenger.i0.L(33.0f);
        this.m0 = -1;
        this.n0 = new Paint();
        this.o0 = true;
        this.p0 = new t5(this, 350L, grVar);
        this.s0 = new ql0(this, 1);
        this.O = p6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 9);
        this.e = u71Var;
        u71Var.setOrientation(0);
        u71Var.setPadding(org.telegram.messenger.i0.L(9.5f), 0, org.telegram.messenger.i0.L(9.5f), 0);
        addView(u71Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return org.telegram.messenger.i0.L(this.g0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.y;
        this.y = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(i11);
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.b6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ol0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        frameLayout.setSelected(i12 == this.D);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final jw0 c(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.y;
        this.y = i12 + 1;
        jw0 jw0Var = (jw0) this.n.get(i11);
        if (jw0Var != null) {
            g(i11, jw0Var, i12);
        } else {
            jw0Var = new jw0(getContext(), 1);
            jw0Var.f.setImageDrawable(drawable);
            jw0Var.setFocusable(true);
            jw0Var.setOnClickListener(new ol0(this, 4));
            jw0Var.setExpanded(this.f0);
            jw0Var.a(this.i0);
            this.e.addView(jw0Var, i12);
        }
        jw0Var.d = false;
        jw0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        jw0Var.setSelected(i12 == this.D);
        this.h.put(i11, jw0Var);
        return jw0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.b0 = false;
        org.telegram.messenger.i0.r(this.e0);
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
            autoTransition.addTransition(new rl0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.u71 u71Var;
        Canvas canvas2;
        float f7;
        float f10;
        float textWidth;
        float f11 = this.k0 - this.j0;
        float f12 = (1.0f - this.i0) * this.l0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            u71Var = this.e;
            if (i11 >= u71Var.getChildCount()) {
                break;
            }
            if (u71Var.getChildAt(i11) instanceof jw0) {
                jw0 jw0Var = (jw0) u71Var.getChildAt(i11);
                float left = jw0Var.getLeft();
                float f13 = jw0Var.D;
                if (left != f13 && jw0Var.E) {
                    jw0Var.b = f13 - jw0Var.getLeft();
                    ValueAnimator valueAnimator = jw0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jw0Var.y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(jw0Var.b, 0.0f);
                    jw0Var.y = ofFloat;
                    ofFloat.addUpdateListener(new hw0(jw0Var, this, i10));
                    jw0Var.y.addListener(new iw0(i10, (Object) jw0Var, (Object) this));
                    jw0Var.y.start();
                }
                jw0Var.E = false;
                if (this.g0) {
                    jw0Var.setTranslationX(c3.i0.z(1.0f, this.i0, i11 * f11, f12) + jw0Var.b);
                } else {
                    jw0Var.setTranslationX(jw0Var.b);
                }
            }
            i11++;
        }
        float height = getHeight();
        if (this.g0) {
            height = sc.e.z(1.0f, this.i0, org.telegram.messenger.i0.L(50.0f), getHeight());
        }
        float f14 = height;
        float e = this.p0.e(false, this.o0 ? 1.0f : 0.0f);
        if (isInEditMode() || this.y == 0 || this.J < 0) {
            canvas2 = canvas;
        } else {
            float f15 = this.D;
            t5 t5Var = this.E;
            float e7 = t5Var.e(false, f15);
            TimeInterpolator timeInterpolator = t5Var.h;
            double d = e7;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= u71Var.getChildCount()) ? null : u71Var.getChildAt(floor);
            if (ceil >= 0 && ceil < u71Var.getChildCount()) {
                view = u71Var.getChildAt(ceil);
            }
            float f16 = f14 / 2.0f;
            if (childAt == null || view == null) {
                f7 = 2.0f;
                if (childAt != null) {
                    f10 = (org.telegram.messenger.i0.W1(this.i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof jw0) {
                        textWidth = ((jw0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f10 = (org.telegram.messenger.i0.W1(this.i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof jw0) {
                            textWidth = ((jw0) view).getTextWidth();
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f7 = 2.0f;
                float f17 = e7 - floor;
                f10 = org.telegram.messenger.i0.T1((org.telegram.messenger.i0.W1(this.i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (org.telegram.messenger.i0.W1(this.i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), f17);
                textWidth = org.telegram.messenger.i0.T1(childAt instanceof jw0 ? ((jw0) childAt).getTextWidth() : 0.0f, view instanceof jw0 ? ((jw0) view).getTextWidth() : 0.0f, f17);
            }
            float L = org.telegram.messenger.i0.L(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(t5Var.b()) : t5Var.b())) * 0.25f) * f7)) * L;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(t5Var.b()) : t5Var.b())) * 0.1f * f7) + 0.9f) * L;
            float interpolation = gr.i.getInterpolation(this.i0);
            float W1 = f16 + org.telegram.messenger.i0.W1(interpolation, 0, org.telegram.messenger.i0.L(26.0f));
            float T1 = org.telegram.messenger.i0.T1(abs, textWidth + org.telegram.messenger.i0.L(10.0f), interpolation) / f7;
            float T12 = (org.telegram.messenger.i0.T1(1.0f, 0.55f, interpolation) * abs2) / f7;
            float f18 = W1 + T12;
            RectF rectF = this.F;
            rectF.set(f10 - T1, W1 - T12, f10 + T1, f18);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.p6 p6Var = this.O;
            Paint paint = this.n0;
            if (z10) {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f7, rectF.height() / f7, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.y == 0 || this.M <= 0) {
            return;
        }
        int i12 = this.I;
        Paint paint2 = this.H;
        paint2.setColor(i12);
        canvas2.drawRect(0.0f, f14 - this.M, u71Var.getWidth(), f14, paint2);
    }

    public final boolean e(int i10) {
        if (!this.S || i10 < 0) {
            return false;
        }
        org.telegram.ui.u71 u71Var = this.e;
        if (i10 >= u71Var.getChildCount()) {
            return false;
        }
        View childAt = u71Var.getChildAt(i10);
        if (!(childAt instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) childAt;
        return jw0Var.a == 0 && !jw0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ql0 ql0Var = this.e0;
        if (action == 0 && this.s == null) {
            this.b0 = true;
            org.telegram.messenger.i0.h3(ql0Var, 500L);
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
        }
        if (this.b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.a0) > f7) {
                this.b0 = false;
                org.telegram.messenger.i0.r(ql0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ql0 ql0Var2 = this.s0;
        org.telegram.ui.u71 u71Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.r0 = -1L;
            org.telegram.messenger.i0.r(ql0Var2);
            org.telegram.messenger.i0.r(ql0Var);
            if (this.s != null) {
                int i10 = this.T;
                int i11 = this.U;
                if (i10 != i11) {
                    o(i10, i11);
                    for (int i12 = 0; i12 < u71Var.getChildCount(); i12++) {
                        u71Var.getChildAt(i12).setTag(R.id.index_tag, Integer.valueOf(i12));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 12));
                ofFloat.addListener(new t60(this, 15));
                ofFloat.start();
            }
            this.b0 = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i13 = this.U;
        if (ceil != i13) {
            if (ceil < i13) {
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
            for (int i14 = 0; i14 < u71Var.getChildCount(); i14++) {
                if (i14 != this.U) {
                    jw0 jw0Var = (jw0) u71Var.getChildAt(i14);
                    jw0Var.D = jw0Var.getLeft();
                    jw0Var.E = true;
                    jw0Var.invalidate();
                }
            }
            this.V += (ceil - this.U) * getTabSize();
            this.U = ceil;
            u71Var.removeView(this.s);
            u71Var.addView(this.s, this.U);
            invalidate();
        }
        this.d0 = this.W - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.q0 = false;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            org.telegram.messenger.i0.h3(ql0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.q0 = true;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            org.telegram.messenger.i0.h3(ql0Var2, 16L);
        } else {
            this.r0 = -1L;
            org.telegram.messenger.i0.r(ql0Var2);
        }
        u71Var.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.D;
    }

    public float getExpandedOffset() {
        if (this.g0) {
            return org.telegram.messenger.i0.L(50.0f) * this.i0;
        }
        return 0.0f;
    }

    public tl0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        org.telegram.ui.u71 u71Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                u71Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (u71Var.indexOfChild(view) != keyAt) {
                u71Var.removeView(view);
                u71Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f7) {
        if (this.f0 != z10) {
            this.f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.h0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i0, z10 ? 1.0f : 0.0f);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.pl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ul0 ul0Var = ul0.this;
                    org.telegram.ui.u71 u71Var = ul0Var.e;
                    if (!z10) {
                        float childCount = ul0Var.k0 * u71Var.getChildCount();
                        float scrollX = ul0Var.getScrollX();
                        float f10 = f7;
                        float childCount2 = (scrollX + f10) / (ul0Var.j0 * u71Var.getChildCount());
                        float measuredWidth = (childCount - ul0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f10 = 0.0f;
                        }
                        float f11 = childCount * childCount2;
                        if (f11 - f10 < 0.0f) {
                            f11 = f10;
                        }
                        ul0Var.l0 = (ul0Var.getScrollX() + f10) - f11;
                    }
                    ul0Var.i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                        u71Var.getChildAt(i10).invalidate();
                    }
                    u71Var.invalidate();
                    ul0Var.p();
                }
            });
            this.h0.addListener(new oh.n(this, z10, f7, 1));
            this.h0.start();
            org.telegram.ui.u71 u71Var = this.e;
            if (z10) {
                this.g0 = true;
                for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                    View childAt = u71Var.getChildAt(i10);
                    if (childAt instanceof jw0) {
                        ((jw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.i0.L(64.0f);
                }
                u71Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.i0.L(86.0f);
            }
            if (z10) {
                float childCount = this.j0 * u71Var.getChildCount() * ((getScrollX() + f7) / (this.k0 * u71Var.getChildCount()));
                this.l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.D;
        if (i12 == i10) {
            return;
        }
        org.telegram.ui.u71 u71Var = this.e;
        View childAt = u71Var.getChildAt(i12);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.D = i10;
        if (i10 >= u71Var.getChildCount()) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i13 >= u71Var.getChildCount()) {
                break;
            }
            View childAt2 = u71Var.getChildAt(i13);
            if (i13 != i10) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i13++;
        }
        if (this.h0 == null) {
            if (i11 != i10 || i10 <= 1) {
                l(i10);
            } else {
                l(i10 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i10) {
        if (this.y != 0) {
            org.telegram.ui.u71 u71Var = this.e;
            if (u71Var.getChildAt(i10) == null) {
                return;
            }
            int left = u71Var.getChildAt(i10).getLeft();
            int i11 = this.L;
            if (i10 > 0) {
                left -= i11;
            }
            int scrollX = getScrollX();
            if (left != this.N) {
                if (left < scrollX) {
                    this.N = left;
                    smoothScrollTo(left, 0);
                } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                    int width = (i11 * 3) + (left - getWidth());
                    this.N = width;
                    smoothScrollTo(width, 0);
                }
            }
        }
    }

    public final void m(int i10) {
        if (i10 < 0 || i10 >= this.y) {
            return;
        }
        this.e.getChildAt(i10).performClick();
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
        int i10;
        int i11;
        org.telegram.ui.u71 u71Var;
        int i12;
        int i13;
        String str;
        org.telegram.messenger.ic k10;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        float L = org.telegram.messenger.i0.L(33.0f);
        float L2 = org.telegram.messenger.i0.L(31.0f);
        float f7 = this.i0;
        float f10 = (L2 * f7) + L;
        float scrollX = getScrollX() - (this.g0 ? (1.0f - f7) * this.l0 : 0.0f);
        org.telegram.ui.u71 u71Var2 = this.e;
        int paddingLeft = (int) ((scrollX - u71Var2.getPaddingLeft()) / f10);
        int i14 = 1;
        int min = Math.min(u71Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f10)) + paddingLeft + 1);
        if (this.g0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > u71Var2.getChildCount()) {
                min = u71Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.R;
        sparseArray2.clear();
        int i15 = 0;
        while (true) {
            sparseArray = this.Q;
            if (i15 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((jw0) sparseArray.valueAt(i15)).s, (jw0) sparseArray.valueAt(i15));
            i15++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = u71Var2.getChildAt(paddingLeft);
            if (childAt instanceof jw0) {
                jw0 jw0Var = (jw0) childAt;
                int i16 = jw0Var.s;
                g9 g9Var = jw0Var.e;
                if (jw0Var.a == 2) {
                    Object tag = jw0Var.getTag(R.id.parent_tag);
                    Object tag2 = jw0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        g9Var.j(org.telegram.messenger.ic.b((TLRPC.Document) tag2), !org.telegram.messenger.sc.e(i14) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        g9Var.setImageDrawable(drawable);
                    }
                    i10 = paddingLeft;
                    i11 = min;
                    u71Var = u71Var2;
                    i12 = i14;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!jw0Var.c) {
                            jw0Var.w = org.telegram.messenger.v5.f((TLRPC.Document) tag3, org.telegram.ui.ActionBar.t6.c7, 0.2f, null);
                        }
                        k10 = org.telegram.messenger.ic.b(document);
                        i10 = paddingLeft;
                        i11 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i13 = stickerSet.thumb_version;
                            if (jw0Var.c) {
                                i10 = paddingLeft;
                                i11 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                int i17 = org.telegram.ui.ActionBar.t6.c7;
                                i10 = paddingLeft;
                                int size = arrayList.size();
                                i11 = min;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size) {
                                        z10 = false;
                                        break;
                                    }
                                    int i19 = size;
                                    if ("v".equalsIgnoreCase(arrayList.get(i18).type)) {
                                        z10 = true;
                                        break;
                                    } else {
                                        i18++;
                                        size = i19;
                                    }
                                }
                                jw0Var.w = org.telegram.messenger.v5.d(arrayList, i17, 0.2f, z10);
                            }
                        } else {
                            i10 = paddingLeft;
                            i11 = min;
                            i13 = 0;
                        }
                        str = photoSize.type;
                        k10 = org.telegram.messenger.ic.k(photoSize, document, i13);
                    } else {
                        i10 = paddingLeft;
                        i11 = min;
                        u71Var = u71Var2;
                        i12 = 1;
                    }
                    if (!jw0Var.c && jw0Var.w == null && document != null) {
                        jw0Var.w = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.c7, 0.2f, null);
                    }
                    if (k10 != null) {
                        jw0Var.c = true;
                        org.telegram.messenger.c00 c00Var = jw0Var.w;
                        boolean e = org.telegram.messenger.sc.e(1);
                        String str2 = !e ? "40_40_firstframe" : "40_40";
                        if (str == null && org.telegram.messenger.jj.N4(document)) {
                            u71Var = u71Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            u71Var = u71Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            org.telegram.messenger.ic icVar = k10;
                            if (!(str == null && org.telegram.messenger.jj.K2(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                i12 = 1;
                                if (icVar.p == 1) {
                                    obj = tag4;
                                    g9Var.k(icVar, str2, "tgs", c00Var, obj);
                                } else {
                                    obj = tag4;
                                    g9Var.k(icVar, str2, "webp", c00Var, obj);
                                }
                                obj2 = obj;
                                jw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (c00Var != null) {
                                g9Var.p(icVar, str2, c00Var, tag4);
                                obj2 = tag4;
                                i12 = 1;
                                jw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                g9Var.l(icVar, str2, icVar, null, 0, obj3);
                                obj2 = obj3;
                                i12 = 1;
                                jw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!e) {
                                g9Var.p(org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document), "40_40", c00Var, tag4);
                            } else if (c00Var != null) {
                                g9Var.p(org.telegram.messenger.ic.b(document), str2, c00Var, tag4);
                            } else {
                                obj3 = tag4;
                                g9Var.l(org.telegram.messenger.ic.b(document), str2, k10, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            org.telegram.messenger.ic icVar2 = k10;
                            if (c00Var != null) {
                                g9Var.p(icVar2, str2, c00Var, obj2);
                            } else {
                                g9Var.l(icVar2, str2, null, null, 0, obj2);
                            }
                        }
                        i12 = 1;
                        jw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    u71Var = u71Var2;
                    i12 = 1;
                }
                sparseArray.put(i16, jw0Var);
                sparseArray2.remove(i16);
                paddingLeft = i10 + 1;
                i14 = i12;
                min = i11;
                u71Var2 = u71Var;
            } else {
                i10 = paddingLeft;
                i11 = min;
                u71Var = u71Var2;
                i12 = i14;
            }
            paddingLeft = i10 + 1;
            i14 = i12;
            min = i11;
            u71Var2 = u71Var;
        }
        for (int i20 = 0; i20 < sparseArray2.size(); i20++) {
            if (((jw0) sparseArray2.valueAt(i20)) != this.s) {
                ((jw0) sparseArray2.valueAt(i20)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
        int i14 = this.m0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.m0 = -1;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        n();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i10 = 0; i10 < this.y; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.D = i10;
    }

    public void setDelegate(sl0 sl0Var) {
        this.f = sl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        requestLayout();
    }

    public void setType(tl0 tl0Var) {
        if (tl0Var == null || this.b == tl0Var) {
            return;
        }
        this.b = tl0Var;
        int ordinal = tl0Var.ordinal();
        GradientDrawable gradientDrawable = this.K;
        if (ordinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (ordinal != 1) {
                return;
            }
            float N = org.telegram.messenger.i0.N(3.0f);
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i10) {
        this.I = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.I = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.M != i10) {
            this.M = i10;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i10, int i11) {
    }
}
