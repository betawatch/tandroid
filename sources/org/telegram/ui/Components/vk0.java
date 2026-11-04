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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class vk0 extends HorizontalScrollView {
    public static final /* synthetic */ int u0 = 0;
    public int E;
    public final u5 F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final org.telegram.ui.ActionBar.e6 P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int a;
    public float a0;
    public uk0 b;
    public float b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final org.telegram.ui.s51 e;
    public float e0;
    public tk0 f;
    public final qk0 f0;
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
    public final u5 q0;
    public final SparseArray r;
    public boolean r0;
    public View s;
    public long s0;
    public final qk0 t0;
    public float w;
    public boolean x;
    public int y;

    public vk0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = uk0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        xq xqVar = xq.h;
        this.F = new u5(this, 350L, xqVar);
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
        this.f0 = new qk0(this, 0);
        this.g0 = false;
        this.k0 = org.telegram.messenger.g0.L(64.0f);
        this.l0 = org.telegram.messenger.g0.L(33.0f);
        this.n0 = -1;
        this.o0 = new Paint();
        this.p0 = true;
        this.q0 = new u5(this, 350L, xqVar);
        this.t0 = new qk0(this, 1);
        this.P = e6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(14, context, this);
        this.e = s51Var;
        s51Var.setOrientation(0);
        s51Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(s51Var, new FrameLayout.LayoutParams(-1, -1, 16));
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

    public final FrameLayout b(int i3, Drawable drawable) {
        String i10 = k2.p1.i(i3, "tab");
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
            frameLayout.addView(imageView, b8.mf.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ok0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.E);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final ev0 c(int i3, Drawable drawable) {
        String i10 = k2.p1.i(i3, "tab");
        int i11 = this.y;
        this.y = i11 + 1;
        ev0 ev0Var = (ev0) this.n.get(i10);
        if (ev0Var != null) {
            g(i10, ev0Var, i11);
        } else {
            ev0Var = new ev0(getContext(), 1);
            ev0Var.f.setImageDrawable(drawable);
            ev0Var.setFocusable(true);
            ev0Var.setOnClickListener(new ok0(this, 4));
            ev0Var.setExpanded(this.g0);
            ev0Var.a(this.j0);
            this.e.addView(ev0Var, i11);
        }
        ev0Var.d = false;
        ev0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        ev0Var.setSelected(i11 == this.E);
        this.h.put(i10, ev0Var);
        return ev0Var;
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
            autoTransition.addTransition(new rk0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.s51 s51Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.l0 - this.k0;
        float f13 = (1.0f - this.j0) * this.m0;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            s51Var = this.e;
            if (i10 >= s51Var.getChildCount()) {
                break;
            }
            if (s51Var.getChildAt(i10) instanceof ev0) {
                ev0 ev0Var = (ev0) s51Var.getChildAt(i10);
                float left = ev0Var.getLeft();
                float f14 = ev0Var.E;
                if (left != f14 && ev0Var.F) {
                    ev0Var.b = f14 - ev0Var.getLeft();
                    ValueAnimator valueAnimator = ev0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ev0Var.y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ev0Var.b, 0.0f);
                    ev0Var.y = ofFloat;
                    ofFloat.addUpdateListener(new dv0(ev0Var, this, i3));
                    ev0Var.y.addListener(new ri0(4, ev0Var, this));
                    ev0Var.y.start();
                }
                ev0Var.F = false;
                if (this.h0) {
                    ev0Var.setTranslationX(com.google.android.recaptcha.internal.a.y(1.0f, this.j0, i10 * f12, f13) + ev0Var.b);
                } else {
                    ev0Var.setTranslationX(ev0Var.b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.h0) {
            height = a1.g.D(1.0f, this.j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f15 = height;
        float e10 = this.q0.e(false, this.p0 ? 1.0f : 0.0f);
        if (isInEditMode() || this.y == 0 || this.K < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.E;
            u5 u5Var = this.F;
            float e11 = u5Var.e(false, f16);
            TimeInterpolator timeInterpolator = u5Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= s51Var.getChildCount()) ? null : s51Var.getChildAt(floor);
            if (ceil >= 0 && ceil < s51Var.getChildCount()) {
                view = s51Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof ev0) {
                        textWidth = ((ev0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (org.telegram.messenger.g0.W1(this.j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof ev0) {
                            textWidth = ((ev0) view).getTextWidth();
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
                textWidth = org.telegram.messenger.g0.T1(childAt instanceof ev0 ? ((ev0) childAt).getTextWidth() : 0.0f, view instanceof ev0 ? ((ev0) view).getTextWidth() : 0.0f, f18);
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(u5Var.b()) : u5Var.b())) * 0.25f) * f10)) * L;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(u5Var.b()) : u5Var.b())) * 0.1f * f10) + 0.9f) * L;
            float interpolation = xq.i.getInterpolation(this.j0);
            float W1 = f17 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f10;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f11 - T1, W1 - T12, f11 + T1, f19);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.e6 e6Var = this.P;
            Paint paint = this.o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), 46));
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
        canvas2.drawRect(0.0f, f15 - this.N, s51Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i3) {
        if (!this.T || i3 < 0) {
            return false;
        }
        org.telegram.ui.s51 s51Var = this.e;
        if (i3 >= s51Var.getChildCount()) {
            return false;
        }
        View childAt = s51Var.getChildAt(i3);
        if (!(childAt instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) childAt;
        return ev0Var.a == 0 && !ev0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qk0 qk0Var = this.f0;
        if (action == 0 && this.s == null) {
            this.c0 = true;
            org.telegram.messenger.g0.i3(qk0Var, 500L);
            this.a0 = motionEvent.getX();
            this.b0 = motionEvent.getY();
        }
        if (this.c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.b0) > f10) {
                this.c0 = false;
                org.telegram.messenger.g0.r(qk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        qk0 qk0Var2 = this.t0;
        org.telegram.ui.s51 s51Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.s0 = -1L;
            org.telegram.messenger.g0.r(qk0Var2);
            org.telegram.messenger.g0.r(qk0Var);
            if (this.s != null) {
                int i3 = this.U;
                int i10 = this.V;
                if (i3 != i10) {
                    o(i3, i10);
                    for (int i11 = 0; i11 < s51Var.getChildCount(); i11++) {
                        s51Var.getChildAt(i11).setTag(R.id.index_tag, Integer.valueOf(i11));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y50(this, 12));
                ofFloat.addListener(new a60(this, 15));
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
            for (int i13 = 0; i13 < s51Var.getChildCount(); i13++) {
                if (i13 != this.V) {
                    ev0 ev0Var = (ev0) s51Var.getChildAt(i13);
                    ev0Var.E = ev0Var.getLeft();
                    ev0Var.F = true;
                    ev0Var.invalidate();
                }
            }
            this.W += (ceil - this.V) * getTabSize();
            this.V = ceil;
            s51Var.removeView(this.s);
            s51Var.addView(this.s, this.V);
            invalidate();
        }
        this.e0 = this.a0 - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.r0 = false;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.i3(qk0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.r0 = true;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            org.telegram.messenger.g0.i3(qk0Var2, 16L);
        } else {
            this.s0 = -1L;
            org.telegram.messenger.g0.r(qk0Var2);
        }
        s51Var.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i3) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i3, frameLayout);
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

    public uk0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        org.telegram.ui.s51 s51Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                s51Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            View view = (View) sparseArray.valueAt(i3);
            if (s51Var.indexOfChild(view) != keyAt) {
                s51Var.removeView(view);
                s51Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f10) {
        if (this.g0 != z10) {
            this.g0 = z10;
            int i3 = 0;
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.pk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vk0 vk0Var = vk0.this;
                    org.telegram.ui.s51 s51Var = vk0Var.e;
                    if (!z10) {
                        float childCount = vk0Var.l0 * s51Var.getChildCount();
                        float scrollX = vk0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (vk0Var.k0 * s51Var.getChildCount());
                        float measuredWidth = (childCount - vk0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        vk0Var.m0 = (vk0Var.getScrollX() + f11) - f12;
                    }
                    vk0Var.j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < s51Var.getChildCount(); i10++) {
                        s51Var.getChildAt(i10).invalidate();
                    }
                    s51Var.invalidate();
                    vk0Var.p();
                }
            });
            this.i0.addListener(new sk0(this, z10, f10, i3));
            this.i0.start();
            org.telegram.ui.s51 s51Var = this.e;
            if (z10) {
                this.h0 = true;
                while (i3 < s51Var.getChildCount()) {
                    View childAt = s51Var.getChildAt(i3);
                    if (childAt instanceof ev0) {
                        ((ev0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                    i3++;
                }
                s51Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.k0 * s51Var.getChildCount() * ((getScrollX() + f10) / (this.l0 * s51Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i3, int i10) {
        int i11 = this.E;
        if (i11 == i3) {
            return;
        }
        org.telegram.ui.s51 s51Var = this.e;
        View childAt = s51Var.getChildAt(i11);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.E = i3;
        if (i3 >= s51Var.getChildCount()) {
            return;
        }
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= s51Var.getChildCount()) {
                break;
            }
            View childAt2 = s51Var.getChildAt(i12);
            if (i12 != i3) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i12++;
        }
        if (this.i0 == null) {
            if (i10 != i3 || i3 <= 1) {
                l(i3);
            } else {
                l(i3 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i3) {
        if (this.y != 0) {
            org.telegram.ui.s51 s51Var = this.e;
            if (s51Var.getChildAt(i3) == null) {
                return;
            }
            int left = s51Var.getChildAt(i3).getLeft();
            int i10 = this.M;
            if (i3 > 0) {
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

    public final void m(int i3) {
        if (i3 < 0 || i3 >= this.y) {
            return;
        }
        this.e.getChildAt(i3).performClick();
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
        int i3;
        int i10;
        org.telegram.ui.s51 s51Var;
        int i11;
        int i12;
        String str;
        org.telegram.messenger.ac k10;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        float L = org.telegram.messenger.g0.L(33.0f);
        float L2 = org.telegram.messenger.g0.L(31.0f);
        float f10 = this.j0;
        float f11 = (L2 * f10) + L;
        float scrollX = getScrollX() - (this.h0 ? (1.0f - f10) * this.m0 : 0.0f);
        org.telegram.ui.s51 s51Var2 = this.e;
        int paddingLeft = (int) ((scrollX - s51Var2.getPaddingLeft()) / f11);
        int i13 = 1;
        int min = Math.min(s51Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.h0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > s51Var2.getChildCount()) {
                min = s51Var2.getChildCount();
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
            sparseArray2.put(((ev0) sparseArray.valueAt(i14)).s, (ev0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = s51Var2.getChildAt(paddingLeft);
            if (childAt instanceof ev0) {
                ev0 ev0Var = (ev0) childAt;
                int i15 = ev0Var.s;
                k9 k9Var = ev0Var.e;
                if (ev0Var.a == 2) {
                    Object tag = ev0Var.getTag(R.id.parent_tag);
                    Object tag2 = ev0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        k9Var.j(org.telegram.messenger.ac.b((TLRPC.Document) tag2), !org.telegram.messenger.lc.e(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        k9Var.setImageDrawable(drawable);
                    }
                    i3 = paddingLeft;
                    i10 = min;
                    s51Var = s51Var2;
                    i11 = i13;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!ev0Var.c) {
                            ev0Var.w = org.telegram.messenger.t5.f((TLRPC.Document) tag3, org.telegram.ui.ActionBar.k6.c7, 0.2f, null);
                        }
                        k10 = org.telegram.messenger.ac.b(document);
                        i3 = paddingLeft;
                        i10 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i12 = stickerSet.thumb_version;
                            if (ev0Var.c) {
                                i3 = paddingLeft;
                                i10 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                int i16 = org.telegram.ui.ActionBar.k6.c7;
                                i3 = paddingLeft;
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
                                ev0Var.w = org.telegram.messenger.t5.d(arrayList, i16, 0.2f, z10);
                            }
                        } else {
                            i3 = paddingLeft;
                            i10 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        k10 = org.telegram.messenger.ac.k(photoSize, document, i12);
                    } else {
                        i3 = paddingLeft;
                        i10 = min;
                        s51Var = s51Var2;
                        i11 = 1;
                    }
                    if (!ev0Var.c && ev0Var.w == null && document != null) {
                        ev0Var.w = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.c7, 0.2f, null);
                    }
                    if (k10 != null) {
                        ev0Var.c = true;
                        org.telegram.messenger.jz jzVar = ev0Var.w;
                        boolean e10 = org.telegram.messenger.lc.e(1);
                        String str2 = !e10 ? "40_40_firstframe" : "40_40";
                        if (str == null && org.telegram.messenger.zi.O4(document)) {
                            s51Var = s51Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            s51Var = s51Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            org.telegram.messenger.ac acVar = k10;
                            if (!(str == null && org.telegram.messenger.zi.L2(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                i11 = 1;
                                if (acVar.p == 1) {
                                    obj = tag4;
                                    k9Var.k(acVar, str2, "tgs", jzVar, obj);
                                } else {
                                    obj = tag4;
                                    k9Var.k(acVar, str2, "webp", jzVar, obj);
                                }
                                obj2 = obj;
                                ev0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (jzVar != null) {
                                k9Var.p(acVar, str2, jzVar, tag4);
                                obj2 = tag4;
                                i11 = 1;
                                ev0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                k9Var.l(acVar, str2, acVar, null, 0, obj3);
                                obj2 = obj3;
                                i11 = 1;
                                ev0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!e10) {
                                k9Var.p(org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "40_40", jzVar, tag4);
                            } else if (jzVar != null) {
                                k9Var.p(org.telegram.messenger.ac.b(document), str2, jzVar, tag4);
                            } else {
                                obj3 = tag4;
                                k9Var.l(org.telegram.messenger.ac.b(document), str2, k10, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            org.telegram.messenger.ac acVar2 = k10;
                            if (jzVar != null) {
                                k9Var.p(acVar2, str2, jzVar, obj2);
                            } else {
                                k9Var.l(acVar2, str2, null, null, 0, obj2);
                            }
                        }
                        i11 = 1;
                        ev0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    s51Var = s51Var2;
                    i11 = 1;
                }
                sparseArray.put(i15, ev0Var);
                sparseArray2.remove(i15);
                paddingLeft = i3 + 1;
                i13 = i11;
                min = i10;
                s51Var2 = s51Var;
            } else {
                i3 = paddingLeft;
                i10 = min;
                s51Var = s51Var2;
                i11 = i13;
            }
            paddingLeft = i3 + 1;
            i13 = i11;
            min = i10;
            s51Var2 = s51Var;
        }
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            if (((ev0) sparseArray2.valueAt(i19)) != this.s) {
                ((ev0) sparseArray2.valueAt(i19)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        n();
        int i13 = this.n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.n0 = -1;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        n();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i3 = 0; i3 < this.y; i3++) {
            View childAt = this.e.getChildAt(i3);
            if (this.x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i3) {
        this.E = i3;
    }

    public void setDelegate(tk0 tk0Var) {
        this.f = tk0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i3) {
        this.a = i3;
    }

    public void setIndicatorColor(int i3) {
        invalidate();
    }

    public void setIndicatorHeight(int i3) {
        this.K = i3;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        requestLayout();
    }

    public void setType(uk0 uk0Var) {
        if (uk0Var == null || this.b == uk0Var) {
            return;
        }
        this.b = uk0Var;
        int ordinal = uk0Var.ordinal();
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

    public void setUnderlineColor(int i3) {
        this.J = i3;
        invalidate();
    }

    public void setUnderlineColorResource(int i3) {
        this.J = getResources().getColor(i3);
        invalidate();
    }

    public void setUnderlineHeight(int i3) {
        if (this.N != i3) {
            this.N = i3;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i3, int i10) {
    }
}
