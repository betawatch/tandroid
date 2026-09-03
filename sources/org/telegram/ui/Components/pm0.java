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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class pm0 extends HorizontalScrollView {
    public static final /* synthetic */ int q0 = 0;
    public final z5 B;
    public final RectF C;
    public final float D;
    public final Paint E;
    public int F;
    public int G;
    public final GradientDrawable H;
    public final int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.g6 L;
    public final boolean M;
    public final SparseArray N;
    public final SparseArray O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public float W;
    public int a;
    public float a0;
    public om0 b;
    public final lm0 b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public boolean d0;
    public final ob1 e;
    public ValueAnimator e0;
    public nm0 f;
    public float f0;
    public final float g0;
    public HashMap h;
    public final float h0;
    public float i0;
    public int j0;
    public final Paint k0;
    public boolean l0;
    public final z5 m0;
    public HashMap n;
    public boolean n0;
    public long o0;
    public final lm0 p0;
    public final SparseArray r;
    public View s;
    public float v;
    public boolean w;
    public int x;
    public int y;

    public pm0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.a = 1;
        this.b = om0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        pr prVar = pr.h;
        this.B = new z5(this, 350L, prVar);
        new RectF();
        new RectF();
        this.C = new RectF();
        this.F = 436207616;
        this.H = new GradientDrawable();
        this.I = AndroidUtilities.dp(33.0f);
        this.J = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.K = 0;
        this.N = new SparseArray();
        this.O = new SparseArray();
        this.b0 = new lm0(this, 0);
        this.c0 = false;
        this.g0 = AndroidUtilities.dp(64.0f);
        this.h0 = AndroidUtilities.dp(33.0f);
        this.j0 = -1;
        this.k0 = new Paint();
        this.l0 = true;
        this.m0 = new z5(this, 350L, prVar);
        this.p0 = new lm0(this, 1);
        this.L = g6Var;
        this.M = z4;
        this.D = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ob1 ob1Var = new ob1(this, context, 9);
        this.e = ob1Var;
        ob1Var.setOrientation(0);
        ob1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ob1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return AndroidUtilities.dp(this.d0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(j10);
        if (frameLayout != null) {
            g(j10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, k7.c6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new jm0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.y);
        this.h.put(j10, frameLayout);
        return frameLayout;
    }

    public final fx0 c(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        fx0 fx0Var = (fx0) this.n.get(j10);
        if (fx0Var != null) {
            g(j10, fx0Var, i11);
        } else {
            fx0Var = new fx0(getContext(), 1);
            fx0Var.f.setImageDrawable(drawable);
            fx0Var.setFocusable(true);
            fx0Var.setOnClickListener(new jm0(this, 4));
            fx0Var.setExpanded(this.c0);
            fx0Var.a(this.f0);
            this.e.addView(fx0Var, i11);
        }
        fx0Var.d = false;
        fx0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        fx0Var.setSelected(i11 == this.y);
        this.h.put(j10, fx0Var);
        return fx0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.V = false;
        AndroidUtilities.cancelRunOnUIThread(this.b0);
    }

    public final void d(boolean z4) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.x = 0;
        if (z4) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new mm0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ob1 ob1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.h0 - this.g0;
        float f13 = (1.0f - this.f0) * this.i0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ob1Var = this.e;
            if (i11 >= ob1Var.getChildCount()) {
                break;
            }
            if (ob1Var.getChildAt(i11) instanceof fx0) {
                fx0 fx0Var = (fx0) ob1Var.getChildAt(i11);
                float left = fx0Var.getLeft();
                float f14 = fx0Var.y;
                if (left != f14 && fx0Var.B) {
                    fx0Var.b = f14 - fx0Var.getLeft();
                    ValueAnimator valueAnimator = fx0Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fx0Var.x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fx0Var.b, 0.0f);
                    fx0Var.x = ofFloat;
                    ofFloat.addUpdateListener(new dx0(fx0Var, this, i10));
                    fx0Var.x.addListener(new ex0(i10, fx0Var, this));
                    fx0Var.x.start();
                }
                fx0Var.B = false;
                if (this.d0) {
                    fx0Var.setTranslationX(e2.c.w(1.0f, this.f0, i11 * f12, f13) + fx0Var.b);
                } else {
                    fx0Var.setTranslationX(fx0Var.b);
                }
            }
            i11++;
        }
        float height = getHeight();
        if (this.d0) {
            height = org.telegram.ui.yh.c(1.0f, this.f0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f15 = height;
        float d = this.m0.d(this.l0 ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.x == 0 || this.G < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.y;
            z5 z5Var = this.B;
            float d10 = z5Var.d(f16, false);
            TimeInterpolator timeInterpolator = z5Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view = null;
            View childAt = (floor < 0 || floor >= ob1Var.getChildCount()) ? null : ob1Var.getChildAt(floor);
            if (ceil >= 0 && ceil < ob1Var.getChildCount()) {
                view = ob1Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof fx0) {
                        textWidth = ((fx0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f0) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof fx0) {
                            textWidth = ((fx0) view).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f10 = 2.0f;
                float f18 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f0) / 2.0f) + view.getTranslationX() + view.getLeft(), f18);
                textWidth = AndroidUtilities.lerp(childAt instanceof fx0 ? ((fx0) childAt).getTextWidth() : 0.0f, view instanceof fx0 ? ((fx0) view).getTextWidth() : 0.0f, f18);
            }
            float dp = AndroidUtilities.dp(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(z5Var.b()) : z5Var.b())) * 0.25f) * f10)) * dp;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(z5Var.b()) : z5Var.b())) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = pr.i.getInterpolation(this.f0);
            float lerp = f17 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = lerp + lerp3;
            RectF rectF = this.C;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f19);
            boolean z4 = this.M;
            org.telegram.ui.ActionBar.g6 g6Var = this.L;
            Paint paint = this.k0;
            if (z4) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.x == 0 || this.J <= 0) {
            return;
        }
        int i12 = this.F;
        Paint paint2 = this.E;
        paint2.setColor(i12);
        canvas2.drawRect(0.0f, f15 - this.J, ob1Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i10) {
        if (!this.P || i10 < 0) {
            return false;
        }
        ob1 ob1Var = this.e;
        if (i10 >= ob1Var.getChildCount()) {
            return false;
        }
        View childAt = ob1Var.getChildAt(i10);
        if (!(childAt instanceof fx0)) {
            return false;
        }
        fx0 fx0Var = (fx0) childAt;
        return fx0Var.a == 0 && !fx0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        lm0 lm0Var = this.b0;
        if (action == 0 && this.s == null) {
            this.V = true;
            AndroidUtilities.runOnUIThread(lm0Var, 500L);
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
        }
        if (this.V && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.T);
            float f10 = this.D;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.U) > f10) {
                this.V = false;
                AndroidUtilities.cancelRunOnUIThread(lm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        lm0 lm0Var2 = this.p0;
        ob1 ob1Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.o0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(lm0Var2);
            AndroidUtilities.cancelRunOnUIThread(lm0Var);
            if (this.s != null) {
                int i10 = this.Q;
                int i11 = this.R;
                if (i10 != i11) {
                    o(i10, i11);
                    for (int i12 = 0; i12 < ob1Var.getChildCount(); i12++) {
                        ob1Var.getChildAt(i12).setTag(R.id.index_tag, Integer.valueOf(i12));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k70(this, 12));
                ofFloat.addListener(new pd0(this, 7));
                ofFloat.start();
            }
            this.V = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i13 = this.R;
        if (ceil != i13) {
            if (ceil < i13) {
                while (!e(ceil) && ceil != this.R) {
                    ceil++;
                }
            } else {
                while (!e(ceil) && ceil != this.R) {
                    ceil--;
                }
            }
        }
        if (this.R != ceil && e(ceil)) {
            for (int i14 = 0; i14 < ob1Var.getChildCount(); i14++) {
                if (i14 != this.R) {
                    fx0 fx0Var = (fx0) ob1Var.getChildAt(i14);
                    fx0Var.y = fx0Var.getLeft();
                    fx0Var.B = true;
                    fx0Var.invalidate();
                }
            }
            this.S += (ceil - this.R) * getTabSize();
            this.R = ceil;
            ob1Var.removeView(this.s);
            ob1Var.addView(this.s, this.R);
            invalidate();
        }
        this.a0 = this.T - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.n0 = false;
            if (this.o0 <= 0) {
                this.o0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(lm0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.n0 = true;
            if (this.o0 <= 0) {
                this.o0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(lm0Var2, 16L);
        } else {
            this.o0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(lm0Var2);
        }
        ob1Var.invalidate();
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
        return this.y;
    }

    public float getExpandedOffset() {
        if (this.d0) {
            return AndroidUtilities.dp(50.0f) * this.f0;
        }
        return 0.0f;
    }

    public om0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        ob1 ob1Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ob1Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ob1Var.indexOfChild(view) != keyAt) {
                ob1Var.removeView(view);
                ob1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z4) {
        if (this.c0 != z4) {
            this.c0 = z4;
            if (!z4) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.e0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, z4 ? 1.0f : 0.0f);
            this.e0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.km0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pm0 pm0Var = pm0.this;
                    ob1 ob1Var = pm0Var.e;
                    if (!z4) {
                        float childCount = pm0Var.h0 * ob1Var.getChildCount();
                        float scrollX = pm0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (pm0Var.g0 * ob1Var.getChildCount());
                        float measuredWidth = (childCount - pm0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        pm0Var.i0 = (pm0Var.getScrollX() + f11) - f12;
                    }
                    pm0Var.f0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                        ob1Var.getChildAt(i10).invalidate();
                    }
                    ob1Var.invalidate();
                    pm0Var.p();
                }
            });
            this.e0.addListener(new kh.r(this, z4, f10, 1));
            this.e0.start();
            ob1 ob1Var = this.e;
            if (z4) {
                this.d0 = true;
                for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                    View childAt = ob1Var.getChildAt(i10);
                    if (childAt instanceof fx0) {
                        ((fx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ob1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z4) {
                float childCount = this.g0 * ob1Var.getChildCount() * ((getScrollX() + f10) / (this.h0 * ob1Var.getChildCount()));
                this.i0 = childCount - (getScrollX() + f10);
                this.j0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.y;
        if (i12 == i10) {
            return;
        }
        ob1 ob1Var = this.e;
        View childAt = ob1Var.getChildAt(i12);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.y = i10;
        if (i10 >= ob1Var.getChildCount()) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z4 = true;
            if (i13 >= ob1Var.getChildCount()) {
                break;
            }
            View childAt2 = ob1Var.getChildAt(i13);
            if (i13 != i10) {
                z4 = false;
            }
            childAt2.setSelected(z4);
            i13++;
        }
        if (this.e0 == null) {
            if (i11 != i10 || i10 <= 1) {
                l(i10);
            } else {
                l(i10 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i10) {
        if (this.x != 0) {
            ob1 ob1Var = this.e;
            if (ob1Var.getChildAt(i10) == null) {
                return;
            }
            int left = ob1Var.getChildAt(i10).getLeft();
            int i11 = this.I;
            if (i10 > 0) {
                left -= i11;
            }
            int scrollX = getScrollX();
            if (left != this.K) {
                if (left < scrollX) {
                    this.K = left;
                    smoothScrollTo(left, 0);
                } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                    int width = (i11 * 3) + (left - getWidth());
                    this.K = width;
                    smoothScrollTo(width, 0);
                }
            }
        }
    }

    public final void m(int i10) {
        if (i10 < 0 || i10 >= this.x) {
            return;
        }
        this.e.getChildAt(i10).performClick();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        if (r3.size() > 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        SparseArray sparseArray;
        int i10;
        int i11;
        ob1 ob1Var;
        int i12;
        String str;
        ImageLocation forSticker;
        Object obj;
        Object obj2;
        Object obj3;
        float dp = AndroidUtilities.dp(33.0f);
        float dp2 = AndroidUtilities.dp(31.0f);
        float f10 = this.f0;
        float f11 = (dp2 * f10) + dp;
        float scrollX = getScrollX() - (this.d0 ? (1.0f - f10) * this.i0 : 0.0f);
        ob1 ob1Var2 = this.e;
        int paddingLeft = (int) ((scrollX - ob1Var2.getPaddingLeft()) / f11);
        int i13 = 1;
        int min = Math.min(ob1Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.d0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > ob1Var2.getChildCount()) {
                min = ob1Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.O;
        sparseArray2.clear();
        int i14 = 0;
        while (true) {
            sparseArray = this.N;
            if (i14 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((fx0) sparseArray.valueAt(i14)).s, (fx0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = ob1Var2.getChildAt(paddingLeft);
            if (childAt instanceof fx0) {
                fx0 fx0Var = (fx0) childAt;
                int i15 = fx0Var.s;
                p9 p9Var = fx0Var.e;
                if (fx0Var.a == 2) {
                    Object tag = fx0Var.getTag(R.id.parent_tag);
                    Object tag2 = fx0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        p9Var.h(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        p9Var.setImageDrawable(drawable);
                    }
                    i10 = paddingLeft;
                    i11 = min;
                    ob1Var = ob1Var2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!fx0Var.c) {
                            fx0Var.v = DocumentObject.getSvgThumb((TLRPC.Document) tag3, org.telegram.ui.ActionBar.k6.c7, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(document);
                        i10 = paddingLeft;
                        i11 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i12 = stickerSet.thumb_version;
                            if (fx0Var.c) {
                                i10 = paddingLeft;
                                i11 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                i10 = paddingLeft;
                                i11 = min;
                                fx0Var.v = DocumentObject.getSvgThumb(arrayList, org.telegram.ui.ActionBar.k6.c7, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                            }
                        } else {
                            i10 = paddingLeft;
                            i11 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i12);
                    }
                    if (!fx0Var.c && fx0Var.v == null && document != null) {
                        fx0Var.v = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.c7, 0.2f);
                    }
                    if (forSticker != null) {
                        fx0Var.c = true;
                        SvgHelper.SvgDrawable svgDrawable = fx0Var.v;
                        boolean isEnabled = LiteMode.isEnabled(1);
                        String str2 = !isEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            ob1Var = ob1Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            ob1Var = ob1Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            String str3 = str2;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    obj = tag4;
                                    p9Var.i(forSticker, str3, "tgs", svgDrawable, obj);
                                } else {
                                    obj = tag4;
                                    p9Var.i(forSticker, str3, "webp", svgDrawable, obj);
                                }
                                obj2 = obj;
                                fx0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (svgDrawable != null) {
                                p9Var.n(forSticker, str3, svgDrawable, tag4);
                                obj2 = tag4;
                                fx0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                p9Var.j(forSticker, str3, forSticker, null, 0, obj3);
                                obj2 = obj3;
                                fx0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!isEnabled) {
                                p9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                            } else if (svgDrawable != null) {
                                p9Var.n(ImageLocation.getForDocument(document), str2, svgDrawable, tag4);
                            } else {
                                obj3 = tag4;
                                p9Var.j(ImageLocation.getForDocument(document), str2, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            String str4 = str2;
                            if (svgDrawable != null) {
                                p9Var.n(forSticker, str4, svgDrawable, obj2);
                            } else {
                                p9Var.j(forSticker, str4, null, null, 0, obj2);
                            }
                        }
                        fx0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    ob1Var = ob1Var2;
                    paddingLeft = i10 + 1;
                    min = i11;
                    ob1Var2 = ob1Var;
                    i13 = 1;
                }
                sparseArray.put(i15, fx0Var);
                sparseArray2.remove(i15);
                paddingLeft = i10 + 1;
                min = i11;
                ob1Var2 = ob1Var;
                i13 = 1;
            }
            i10 = paddingLeft;
            i11 = min;
            ob1Var = ob1Var2;
            paddingLeft = i10 + 1;
            min = i11;
            ob1Var2 = ob1Var;
            i13 = 1;
        }
        for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
            if (((fx0) sparseArray2.valueAt(i16)) != this.s) {
                ((fx0) sparseArray2.valueAt(i16)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        n();
        int i14 = this.j0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.j0 = -1;
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
        for (int i10 = 0; i10 < this.x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.y = i10;
    }

    public void setDelegate(nm0 nm0Var) {
        this.f = nm0Var;
    }

    public void setDragEnabled(boolean z4) {
        this.P = z4;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.G = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.w = z4;
        requestLayout();
    }

    public void setType(om0 om0Var) {
        if (om0Var == null || this.b == om0Var) {
            return;
        }
        this.b = om0Var;
        int ordinal = om0Var.ordinal();
        GradientDrawable gradientDrawable = this.H;
        if (ordinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (ordinal != 1) {
                return;
            }
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.F = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.J != i10) {
            this.J = i10;
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
