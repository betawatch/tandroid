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
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class vl0 extends HorizontalScrollView {
    public static final /* synthetic */ int p0 = 0;
    public final y5 A;
    public final RectF B;
    public final float C;
    public final Paint D;
    public int E;
    public int F;
    public final GradientDrawable G;
    public final int H;
    public int I;
    public int J;
    public final org.telegram.ui.ActionBar.c6 K;
    public final boolean L;
    public final SparseArray M;
    public final SparseArray N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int a;
    public final rl0 a0;
    public ul0 b;
    public boolean b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public ValueAnimator d0;
    public final ra1 e;
    public float e0;
    public tl0 f;
    public final float f0;
    public final float g0;
    public HashMap h;
    public float h0;
    public int i0;
    public final Paint j0;
    public boolean k0;
    public final y5 l0;
    public boolean m0;
    public HashMap n;
    public long n0;
    public final rl0 o0;
    public final SparseArray r;
    public View s;
    public float v;
    public boolean w;
    public int x;
    public int y;

    public vl0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = ul0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        er erVar = er.h;
        this.A = new y5(this, 350L, erVar);
        new RectF();
        new RectF();
        this.B = new RectF();
        this.E = 436207616;
        this.G = new GradientDrawable();
        this.H = AndroidUtilities.dp(33.0f);
        this.I = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.J = 0;
        this.M = new SparseArray();
        this.N = new SparseArray();
        this.a0 = new rl0(this, 0);
        this.b0 = false;
        this.f0 = AndroidUtilities.dp(64.0f);
        this.g0 = AndroidUtilities.dp(33.0f);
        this.i0 = -1;
        this.j0 = new Paint();
        this.k0 = true;
        this.l0 = new y5(this, 350L, erVar);
        this.o0 = new rl0(this, 1);
        this.K = c6Var;
        this.L = z10;
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ra1 ra1Var = new ra1(this, context, 10);
        this.e = ra1Var;
        ra1Var.setOrientation(0);
        ra1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ra1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.D = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return AndroidUtilities.dp(this.c0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String k10 = i0.a.k(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(k10);
        if (frameLayout != null) {
            g(k10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, h7.z5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new pl0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.y);
        this.h.put(k10, frameLayout);
        return frameLayout;
    }

    public final nw0 c(int i10, Drawable drawable) {
        String k10 = i0.a.k(i10, "tab");
        int i11 = this.x;
        this.x = i11 + 1;
        nw0 nw0Var = (nw0) this.n.get(k10);
        if (nw0Var != null) {
            g(k10, nw0Var, i11);
        } else {
            nw0Var = new nw0(getContext(), 1);
            nw0Var.f.setImageDrawable(drawable);
            nw0Var.setFocusable(true);
            nw0Var.setOnClickListener(new pl0(this, 4));
            nw0Var.setExpanded(this.b0);
            nw0Var.a(this.e0);
            this.e.addView(nw0Var, i11);
        }
        nw0Var.d = false;
        nw0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        nw0Var.setSelected(i11 == this.y);
        this.h.put(k10, nw0Var);
        return nw0Var;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.U = false;
        AndroidUtilities.cancelRunOnUIThread(this.a0);
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
            autoTransition.addTransition(new sl0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ra1 ra1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.g0 - this.f0;
        float f13 = (1.0f - this.e0) * this.h0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ra1Var = this.e;
            if (i11 >= ra1Var.getChildCount()) {
                break;
            }
            if (ra1Var.getChildAt(i11) instanceof nw0) {
                nw0 nw0Var = (nw0) ra1Var.getChildAt(i11);
                float left = nw0Var.getLeft();
                float f14 = nw0Var.y;
                if (left != f14 && nw0Var.A) {
                    nw0Var.b = f14 - nw0Var.getLeft();
                    ValueAnimator valueAnimator = nw0Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        nw0Var.x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(nw0Var.b, 0.0f);
                    nw0Var.x = ofFloat;
                    ofFloat.addUpdateListener(new mw0(nw0Var, this, i10));
                    nw0Var.x.addListener(new fk0(3, nw0Var, this));
                    nw0Var.x.start();
                }
                nw0Var.A = false;
                if (this.c0) {
                    nw0Var.setTranslationX(com.google.android.recaptcha.internal.a.z(1.0f, this.e0, i11 * f12, f13) + nw0Var.b);
                } else {
                    nw0Var.setTranslationX(nw0Var.b);
                }
            }
            i11++;
        }
        float height = getHeight();
        if (this.c0) {
            height = org.telegram.ui.Cells.pa.b(1.0f, this.e0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f15 = height;
        float d = this.l0.d(this.k0 ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.x == 0 || this.F < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.y;
            y5 y5Var = this.A;
            float d10 = y5Var.d(f16, false);
            TimeInterpolator timeInterpolator = y5Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view = null;
            View childAt = (floor < 0 || floor >= ra1Var.getChildCount()) ? null : ra1Var.getChildAt(floor);
            if (ceil >= 0 && ceil < ra1Var.getChildCount()) {
                view = ra1Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof nw0) {
                        textWidth = ((nw0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof nw0) {
                            textWidth = ((nw0) view).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f10 = 2.0f;
                float f18 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + view.getTranslationX() + view.getLeft(), f18);
                textWidth = AndroidUtilities.lerp(childAt instanceof nw0 ? ((nw0) childAt).getTextWidth() : 0.0f, view instanceof nw0 ? ((nw0) view).getTextWidth() : 0.0f, f18);
            }
            float dp = AndroidUtilities.dp(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.25f) * f10)) * dp;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = er.i.getInterpolation(this.e0);
            float lerp = f17 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = lerp + lerp3;
            RectF rectF = this.B;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f19);
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.c6 c6Var = this.K;
            Paint paint = this.j0;
            if (z10) {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.x == 0 || this.I <= 0) {
            return;
        }
        int i12 = this.E;
        Paint paint2 = this.D;
        paint2.setColor(i12);
        canvas2.drawRect(0.0f, f15 - this.I, ra1Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i10) {
        if (!this.O || i10 < 0) {
            return false;
        }
        ra1 ra1Var = this.e;
        if (i10 >= ra1Var.getChildCount()) {
            return false;
        }
        View childAt = ra1Var.getChildAt(i10);
        if (!(childAt instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) childAt;
        return nw0Var.a == 0 && !nw0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rl0 rl0Var = this.a0;
        if (action == 0 && this.s == null) {
            this.U = true;
            AndroidUtilities.runOnUIThread(rl0Var, 500L);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
        }
        if (this.U && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.S);
            float f10 = this.C;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.T) > f10) {
                this.U = false;
                AndroidUtilities.cancelRunOnUIThread(rl0Var);
            }
        }
        int action2 = motionEvent.getAction();
        rl0 rl0Var2 = this.o0;
        ra1 ra1Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(rl0Var2);
            AndroidUtilities.cancelRunOnUIThread(rl0Var);
            if (this.s != null) {
                int i10 = this.P;
                int i11 = this.Q;
                if (i10 != i11) {
                    o(i10, i11);
                    for (int i12 = 0; i12 < ra1Var.getChildCount(); i12++) {
                        ra1Var.getChildAt(i12).setTag(R.id.index_tag, Integer.valueOf(i12));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v60(this, 12));
                ofFloat.addListener(new sz(this, 16));
                ofFloat.start();
            }
            this.U = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i13 = this.Q;
        if (ceil != i13) {
            if (ceil < i13) {
                while (!e(ceil) && ceil != this.Q) {
                    ceil++;
                }
            } else {
                while (!e(ceil) && ceil != this.Q) {
                    ceil--;
                }
            }
        }
        if (this.Q != ceil && e(ceil)) {
            for (int i14 = 0; i14 < ra1Var.getChildCount(); i14++) {
                if (i14 != this.Q) {
                    nw0 nw0Var = (nw0) ra1Var.getChildAt(i14);
                    nw0Var.y = nw0Var.getLeft();
                    nw0Var.A = true;
                    nw0Var.invalidate();
                }
            }
            this.R += (ceil - this.Q) * getTabSize();
            this.Q = ceil;
            ra1Var.removeView(this.s);
            ra1Var.addView(this.s, this.Q);
            invalidate();
        }
        this.W = this.S - motionEvent.getX();
        float x8 = motionEvent.getX();
        if (x8 < this.s.getMeasuredWidth() / 2.0f) {
            this.m0 = false;
            if (this.n0 <= 0) {
                this.n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(rl0Var2, 16L);
        } else if (x8 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.m0 = true;
            if (this.n0 <= 0) {
                this.n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(rl0Var2, 16L);
        } else {
            this.n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(rl0Var2);
        }
        ra1Var.invalidate();
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
        if (this.c0) {
            return AndroidUtilities.dp(50.0f) * this.e0;
        }
        return 0.0f;
    }

    public ul0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        ra1 ra1Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ra1Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ra1Var.indexOfChild(view) != keyAt) {
                ra1Var.removeView(view);
                ra1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z10) {
        if (this.b0 != z10) {
            this.b0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? 1.0f : 0.0f);
            this.d0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ql0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vl0 vl0Var = vl0.this;
                    ra1 ra1Var = vl0Var.e;
                    if (!z10) {
                        float childCount = vl0Var.g0 * ra1Var.getChildCount();
                        float scrollX = vl0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (vl0Var.f0 * ra1Var.getChildCount());
                        float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        vl0Var.h0 = (vl0Var.getScrollX() + f11) - f12;
                    }
                    vl0Var.e0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                        ra1Var.getChildAt(i10).invalidate();
                    }
                    ra1Var.invalidate();
                    vl0Var.p();
                }
            });
            this.d0.addListener(new fh.r(this, z10, f10, 1));
            this.d0.start();
            ra1 ra1Var = this.e;
            if (z10) {
                this.c0 = true;
                for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                    View childAt = ra1Var.getChildAt(i10);
                    if (childAt instanceof nw0) {
                        ((nw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ra1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f0 * ra1Var.getChildCount() * ((getScrollX() + f10) / (this.g0 * ra1Var.getChildCount()));
                this.h0 = childCount - (getScrollX() + f10);
                this.i0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.y;
        if (i12 == i10) {
            return;
        }
        ra1 ra1Var = this.e;
        View childAt = ra1Var.getChildAt(i12);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.y = i10;
        if (i10 >= ra1Var.getChildCount()) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i13 >= ra1Var.getChildCount()) {
                break;
            }
            View childAt2 = ra1Var.getChildAt(i13);
            if (i13 != i10) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i13++;
        }
        if (this.d0 == null) {
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
            ra1 ra1Var = this.e;
            if (ra1Var.getChildAt(i10) == null) {
                return;
            }
            int left = ra1Var.getChildAt(i10).getLeft();
            int i11 = this.H;
            if (i10 > 0) {
                left -= i11;
            }
            int scrollX = getScrollX();
            if (left != this.J) {
                if (left < scrollX) {
                    this.J = left;
                    smoothScrollTo(left, 0);
                } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                    int width = (i11 * 3) + (left - getWidth());
                    this.J = width;
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
        ra1 ra1Var;
        int i12;
        String str;
        ImageLocation forSticker;
        Object obj;
        Object obj2;
        Object obj3;
        float dp = AndroidUtilities.dp(33.0f);
        float dp2 = AndroidUtilities.dp(31.0f);
        float f10 = this.e0;
        float f11 = (dp2 * f10) + dp;
        float scrollX = getScrollX() - (this.c0 ? (1.0f - f10) * this.h0 : 0.0f);
        ra1 ra1Var2 = this.e;
        int paddingLeft = (int) ((scrollX - ra1Var2.getPaddingLeft()) / f11);
        int i13 = 1;
        int min = Math.min(ra1Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.c0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > ra1Var2.getChildCount()) {
                min = ra1Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.N;
        sparseArray2.clear();
        int i14 = 0;
        while (true) {
            sparseArray = this.M;
            if (i14 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((nw0) sparseArray.valueAt(i14)).s, (nw0) sparseArray.valueAt(i14));
            i14++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = ra1Var2.getChildAt(paddingLeft);
            if (childAt instanceof nw0) {
                nw0 nw0Var = (nw0) childAt;
                int i15 = nw0Var.s;
                n9 n9Var = nw0Var.e;
                if (nw0Var.a == 2) {
                    Object tag = nw0Var.getTag(R.id.parent_tag);
                    Object tag2 = nw0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        n9Var.h(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i13) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        n9Var.setImageDrawable(drawable);
                    }
                    i10 = paddingLeft;
                    i11 = min;
                    ra1Var = ra1Var2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!nw0Var.c) {
                            nw0Var.v = DocumentObject.getSvgThumb((TLRPC.Document) tag3, org.telegram.ui.ActionBar.g6.c7, 0.2f);
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
                            if (nw0Var.c) {
                                i10 = paddingLeft;
                                i11 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                i10 = paddingLeft;
                                i11 = min;
                                nw0Var.v = DocumentObject.getSvgThumb(arrayList, org.telegram.ui.ActionBar.g6.c7, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                            }
                        } else {
                            i10 = paddingLeft;
                            i11 = min;
                            i12 = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i12);
                    }
                    if (!nw0Var.c && nw0Var.v == null && document != null) {
                        nw0Var.v = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.c7, 0.2f);
                    }
                    if (forSticker != null) {
                        nw0Var.c = true;
                        SvgHelper.SvgDrawable svgDrawable = nw0Var.v;
                        boolean isEnabled = LiteMode.isEnabled(1);
                        String str2 = !isEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            ra1Var = ra1Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            ra1Var = ra1Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            String str3 = str2;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    obj = tag4;
                                    n9Var.i(forSticker, str3, "tgs", svgDrawable, obj);
                                } else {
                                    obj = tag4;
                                    n9Var.i(forSticker, str3, "webp", svgDrawable, obj);
                                }
                                obj2 = obj;
                                nw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (svgDrawable != null) {
                                n9Var.n(forSticker, str3, svgDrawable, tag4);
                                obj2 = tag4;
                                nw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                n9Var.j(forSticker, str3, forSticker, null, 0, obj3);
                                obj2 = obj3;
                                nw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!isEnabled) {
                                n9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                            } else if (svgDrawable != null) {
                                n9Var.n(ImageLocation.getForDocument(document), str2, svgDrawable, tag4);
                            } else {
                                obj3 = tag4;
                                n9Var.j(ImageLocation.getForDocument(document), str2, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            String str4 = str2;
                            if (svgDrawable != null) {
                                n9Var.n(forSticker, str4, svgDrawable, obj2);
                            } else {
                                n9Var.j(forSticker, str4, null, null, 0, obj2);
                            }
                        }
                        nw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    ra1Var = ra1Var2;
                    paddingLeft = i10 + 1;
                    min = i11;
                    ra1Var2 = ra1Var;
                    i13 = 1;
                }
                sparseArray.put(i15, nw0Var);
                sparseArray2.remove(i15);
                paddingLeft = i10 + 1;
                min = i11;
                ra1Var2 = ra1Var;
                i13 = 1;
            }
            i10 = paddingLeft;
            i11 = min;
            ra1Var = ra1Var2;
            paddingLeft = i10 + 1;
            min = i11;
            ra1Var2 = ra1Var;
            i13 = 1;
        }
        for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
            if (((nw0) sparseArray2.valueAt(i16)) != this.s) {
                ((nw0) sparseArray2.valueAt(i16)).e.setImageDrawable(null);
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
        int i14 = this.i0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.i0 = -1;
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

    public void setDelegate(tl0 tl0Var) {
        this.f = tl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.O = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.w = z10;
        requestLayout();
    }

    public void setType(ul0 ul0Var) {
        if (ul0Var == null || this.b == ul0Var) {
            return;
        }
        this.b = ul0Var;
        int ordinal = ul0Var.ordinal();
        GradientDrawable gradientDrawable = this.G;
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
        this.E = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.E = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
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
