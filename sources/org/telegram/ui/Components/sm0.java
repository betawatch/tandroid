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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class sm0 extends HorizontalScrollView {
    public static final /* synthetic */ int t0 = 0;
    public final d6 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.f6 O;
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
    public rm0 b;
    public boolean b0;
    public final LinearLayout.LayoutParams c;
    public float c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final gc1 e;
    public final nm0 e0;
    public qm0 f;
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
    public final d6 p0;
    public boolean q0;
    public final SparseArray r;
    public long r0;
    public View s;
    public final nm0 s0;
    public float v;
    public boolean w;
    public int x;
    public int y;

    public sm0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = rm0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        wr wrVar = wr.h;
        this.E = new d6(this, 350L, wrVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = AndroidUtilities.dp(33.0f);
        this.M = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.e0 = new nm0(this, 0);
        this.f0 = false;
        this.j0 = AndroidUtilities.dp(64.0f);
        this.k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.n0 = new Paint();
        this.o0 = true;
        this.p0 = new d6(this, 350L, wrVar);
        this.s0 = new nm0(this, 1);
        this.O = f6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        gc1 gc1Var = new gc1(this, context, 8);
        this.e = gc1Var;
        gc1Var.setOrientation(0);
        gc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(gc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return AndroidUtilities.dp(this.g0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String j3 = hc.b.j(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(j3);
        if (frameLayout != null) {
            g(j3, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.a6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new lm0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.y);
        this.h.put(j3, frameLayout);
        return frameLayout;
    }

    public final ox0 c(int i10, Drawable drawable) {
        String j3 = hc.b.j(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        ox0 ox0Var = (ox0) this.n.get(j3);
        if (ox0Var != null) {
            g(j3, ox0Var, i11);
        } else {
            ox0Var = new ox0(getContext(), 1);
            ox0Var.f.setImageDrawable(drawable);
            ox0Var.setFocusable(true);
            ox0Var.setOnClickListener(new lm0(this, 4));
            ox0Var.setExpanded(this.f0);
            ox0Var.a(this.i0);
            this.e.addView(ox0Var, i11);
        }
        ox0Var.d = false;
        ox0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        ox0Var.setSelected(i11 == this.y);
        this.h.put(j3, ox0Var);
        return ox0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.e0);
    }

    public final void d(boolean z10) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new om0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gc1 gc1Var;
        Canvas canvas2;
        float f7;
        float f10;
        float textWidth;
        float f11 = this.k0 - this.j0;
        float f12 = (1.0f - this.i0) * this.l0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            gc1Var = this.e;
            if (i11 >= gc1Var.getChildCount()) {
                break;
            }
            if (gc1Var.getChildAt(i11) instanceof ox0) {
                ox0 ox0Var = (ox0) gc1Var.getChildAt(i11);
                float left = ox0Var.getLeft();
                float f13 = ox0Var.y;
                if (left != f13 && ox0Var.E) {
                    ox0Var.b = f13 - ox0Var.getLeft();
                    ValueAnimator valueAnimator = ox0Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ox0Var.x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ox0Var.b, 0.0f);
                    ox0Var.x = ofFloat;
                    ofFloat.addUpdateListener(new nx0(ox0Var, this, i10));
                    ox0Var.x.addListener(new vv0(1, (Object) ox0Var, (Object) this));
                    ox0Var.x.start();
                }
                ox0Var.E = false;
                if (this.g0) {
                    ox0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.i0, i11 * f11, f12) + ox0Var.b);
                } else {
                    ox0Var.setTranslationX(ox0Var.b);
                }
            }
            i11++;
        }
        float height = getHeight();
        if (this.g0) {
            height = com.google.android.gms.internal.vision.e2.a(1.0f, this.i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f14 = height;
        float d = this.p0.d(this.o0 ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.x == 0 || this.J < 0) {
            canvas2 = canvas;
        } else {
            float f15 = this.y;
            d6 d6Var = this.E;
            float d10 = d6Var.d(f15, false);
            TimeInterpolator timeInterpolator = d6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view = null;
            View childAt = (floor < 0 || floor >= gc1Var.getChildCount()) ? null : gc1Var.getChildAt(floor);
            if (ceil >= 0 && ceil < gc1Var.getChildCount()) {
                view = gc1Var.getChildAt(ceil);
            }
            float f16 = f14 / 2.0f;
            if (childAt == null || view == null) {
                f7 = 2.0f;
                if (childAt != null) {
                    f10 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.i0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof ox0) {
                        textWidth = ((ox0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f10 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof ox0) {
                            textWidth = ((ox0) view).getTextWidth();
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f7 = 2.0f;
                float f17 = d10 - floor;
                f10 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.i0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.i0) / 2.0f) + view.getTranslationX() + view.getLeft(), f17);
                textWidth = AndroidUtilities.lerp(childAt instanceof ox0 ? ((ox0) childAt).getTextWidth() : 0.0f, view instanceof ox0 ? ((ox0) view).getTextWidth() : 0.0f, f17);
            }
            float dp = AndroidUtilities.dp(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(d6Var.b()) : d6Var.b())) * 0.25f) * f7)) * dp;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(d6Var.b()) : d6Var.b())) * 0.1f * f7) + 0.9f) * dp;
            float interpolation = wr.i.getInterpolation(this.i0);
            float lerp = f16 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f7;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f7;
            float f18 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f10 - lerp2, lerp - lerp3, f10 + lerp2, f18);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.f6 f6Var = this.O;
            Paint paint = this.n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f7, rectF.height() / f7, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.x == 0 || this.M <= 0) {
            return;
        }
        int i12 = this.I;
        Paint paint2 = this.H;
        paint2.setColor(i12);
        canvas2.drawRect(0.0f, f14 - this.M, gc1Var.getWidth(), f14, paint2);
    }

    public final boolean e(int i10) {
        if (!this.S || i10 < 0) {
            return false;
        }
        gc1 gc1Var = this.e;
        if (i10 >= gc1Var.getChildCount()) {
            return false;
        }
        View childAt = gc1Var.getChildAt(i10);
        if (!(childAt instanceof ox0)) {
            return false;
        }
        ox0 ox0Var = (ox0) childAt;
        return ox0Var.a == 0 && !ox0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        nm0 nm0Var = this.e0;
        if (action == 0 && this.s == null) {
            this.b0 = true;
            AndroidUtilities.runOnUIThread(nm0Var, 500L);
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
        }
        if (this.b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.a0) > f7) {
                this.b0 = false;
                AndroidUtilities.cancelRunOnUIThread(nm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        nm0 nm0Var2 = this.s0;
        gc1 gc1Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(nm0Var2);
            AndroidUtilities.cancelRunOnUIThread(nm0Var);
            if (this.s != null) {
                int i10 = this.T;
                int i11 = this.U;
                if (i10 != i11) {
                    o(i10, i11);
                    for (int i12 = 0; i12 < gc1Var.getChildCount(); i12++) {
                        gc1Var.getChildAt(i12).setTag(R.id.index_tag, Integer.valueOf(i12));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q70(this, 12));
                ofFloat.addListener(new rm(this, 28));
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
            for (int i14 = 0; i14 < gc1Var.getChildCount(); i14++) {
                if (i14 != this.U) {
                    ox0 ox0Var = (ox0) gc1Var.getChildAt(i14);
                    ox0Var.y = ox0Var.getLeft();
                    ox0Var.E = true;
                    ox0Var.invalidate();
                }
            }
            this.V += (ceil - this.U) * getTabSize();
            this.U = ceil;
            gc1Var.removeView(this.s);
            gc1Var.addView(this.s, this.U);
            invalidate();
        }
        this.d0 = this.W - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.q0 = false;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(nm0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.q0 = true;
            if (this.r0 <= 0) {
                this.r0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(nm0Var2, 16L);
        } else {
            this.r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(nm0Var2);
        }
        gc1Var.invalidate();
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
        if (this.g0) {
            return AndroidUtilities.dp(50.0f) * this.i0;
        }
        return 0.0f;
    }

    public rm0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        gc1 gc1Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                gc1Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (gc1Var.indexOfChild(view) != keyAt) {
                gc1Var.removeView(view);
                gc1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        if (this.f0 != z10) {
            this.f0 = z10;
            int i10 = 0;
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.mm0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    sm0 sm0Var = sm0.this;
                    gc1 gc1Var = sm0Var.e;
                    if (!z10) {
                        float childCount = sm0Var.k0 * gc1Var.getChildCount();
                        float scrollX = sm0Var.getScrollX();
                        float f10 = f7;
                        float childCount2 = (scrollX + f10) / (sm0Var.j0 * gc1Var.getChildCount());
                        float measuredWidth = (childCount - sm0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f10 = 0.0f;
                        }
                        float f11 = childCount * childCount2;
                        if (f11 - f10 < 0.0f) {
                            f11 = f10;
                        }
                        sm0Var.l0 = (sm0Var.getScrollX() + f10) - f11;
                    }
                    sm0Var.i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i11 = 0; i11 < gc1Var.getChildCount(); i11++) {
                        gc1Var.getChildAt(i11).invalidate();
                    }
                    gc1Var.invalidate();
                    sm0Var.p();
                }
            });
            this.h0.addListener(new pm0(this, z10, f7, i10));
            this.h0.start();
            gc1 gc1Var = this.e;
            if (z10) {
                this.g0 = true;
                while (i10 < gc1Var.getChildCount()) {
                    View childAt = gc1Var.getChildAt(i10);
                    if (childAt instanceof ox0) {
                        ((ox0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                    i10++;
                }
                gc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.j0 * gc1Var.getChildCount() * ((getScrollX() + f7) / (this.k0 * gc1Var.getChildCount()));
                this.l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.y;
        if (i12 == i10) {
            return;
        }
        gc1 gc1Var = this.e;
        View childAt = gc1Var.getChildAt(i12);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.y = i10;
        if (i10 >= gc1Var.getChildCount()) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i13 >= gc1Var.getChildCount()) {
                break;
            }
            View childAt2 = gc1Var.getChildAt(i13);
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
        if (this.x != 0) {
            gc1 gc1Var = this.e;
            if (gc1Var.getChildAt(i10) == null) {
                return;
            }
            int left = gc1Var.getChildAt(i10).getLeft();
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
        gc1 gc1Var;
        int i12;
        String str;
        ImageLocation forSticker;
        Object obj;
        Object obj2;
        Object obj3;
        float dp = AndroidUtilities.dp(33.0f);
        float dp2 = AndroidUtilities.dp(31.0f);
        float f7 = this.i0;
        float f10 = (dp2 * f7) + dp;
        float scrollX = getScrollX() - (this.g0 ? (1.0f - f7) * this.l0 : 0.0f);
        gc1 gc1Var2 = this.e;
        int paddingLeft = (int) ((scrollX - gc1Var2.getPaddingLeft()) / f10);
        int i13 = 1;
        int min = Math.min(gc1Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f10)) + paddingLeft + 1);
        if (this.g0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > gc1Var2.getChildCount()) {
                min = gc1Var2.getChildCount();
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
            sparseArray2.put(((ox0) sparseArray.valueAt(i14)).s, (ox0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = gc1Var2.getChildAt(paddingLeft);
            if (childAt instanceof ox0) {
                ox0 ox0Var = (ox0) childAt;
                int i15 = ox0Var.s;
                w9 w9Var = ox0Var.e;
                if (ox0Var.a == 2) {
                    Object tag = ox0Var.getTag(R.id.parent_tag);
                    Object tag2 = ox0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        w9Var.h(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        w9Var.setImageDrawable(drawable);
                    }
                    i10 = paddingLeft;
                    i11 = min;
                    gc1Var = gc1Var2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!ox0Var.c) {
                            ox0Var.v = DocumentObject.getSvgThumb((TLRPC.Document) tag3, org.telegram.ui.ActionBar.j6.c7, 0.2f);
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
                            if (ox0Var.c) {
                                i10 = paddingLeft;
                                i11 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                i10 = paddingLeft;
                                i11 = min;
                                ox0Var.v = DocumentObject.getSvgThumb(arrayList, org.telegram.ui.ActionBar.j6.c7, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                            }
                        } else {
                            i10 = paddingLeft;
                            i11 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i12);
                    }
                    if (!ox0Var.c && ox0Var.v == null && document != null) {
                        ox0Var.v = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.c7, 0.2f);
                    }
                    if (forSticker != null) {
                        ox0Var.c = true;
                        SvgHelper.SvgDrawable svgDrawable = ox0Var.v;
                        boolean isEnabled = LiteMode.isEnabled(1);
                        String str2 = !isEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            gc1Var = gc1Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            gc1Var = gc1Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            String str3 = str2;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    obj = tag4;
                                    w9Var.i(forSticker, str3, "tgs", svgDrawable, obj);
                                } else {
                                    obj = tag4;
                                    w9Var.i(forSticker, str3, "webp", svgDrawable, obj);
                                }
                                obj2 = obj;
                                ox0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (svgDrawable != null) {
                                w9Var.n(forSticker, str3, svgDrawable, tag4);
                                obj2 = tag4;
                                ox0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                w9Var.j(forSticker, str3, forSticker, null, 0, obj3);
                                obj2 = obj3;
                                ox0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!isEnabled) {
                                w9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                            } else if (svgDrawable != null) {
                                w9Var.n(ImageLocation.getForDocument(document), str2, svgDrawable, tag4);
                            } else {
                                obj3 = tag4;
                                w9Var.j(ImageLocation.getForDocument(document), str2, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            String str4 = str2;
                            if (svgDrawable != null) {
                                w9Var.n(forSticker, str4, svgDrawable, obj2);
                            } else {
                                w9Var.j(forSticker, str4, null, null, 0, obj2);
                            }
                        }
                        ox0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    gc1Var = gc1Var2;
                    paddingLeft = i10 + 1;
                    min = i11;
                    gc1Var2 = gc1Var;
                    i13 = 1;
                }
                sparseArray.put(i15, ox0Var);
                sparseArray2.remove(i15);
                paddingLeft = i10 + 1;
                min = i11;
                gc1Var2 = gc1Var;
                i13 = 1;
            }
            i10 = paddingLeft;
            i11 = min;
            gc1Var = gc1Var2;
            paddingLeft = i10 + 1;
            min = i11;
            gc1Var2 = gc1Var;
            i13 = 1;
        }
        for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
            if (((ox0) sparseArray2.valueAt(i16)) != this.s) {
                ((ox0) sparseArray2.valueAt(i16)).e.setImageDrawable(null);
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

    public void setDelegate(qm0 qm0Var) {
        this.f = qm0Var;
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
        this.w = z10;
        requestLayout();
    }

    public void setType(rm0 rm0Var) {
        if (rm0Var == null || this.b == rm0Var) {
            return;
        }
        this.b = rm0Var;
        int ordinal = rm0Var.ordinal();
        GradientDrawable gradientDrawable = this.K;
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
