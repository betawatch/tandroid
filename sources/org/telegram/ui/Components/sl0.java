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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class sl0 extends HorizontalScrollView {
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
    public final org.telegram.ui.ActionBar.b6 K;
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
    public final ol0 a0;
    public rl0 b;
    public boolean b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public ValueAnimator d0;
    public final ta1 e;
    public float e0;
    public ql0 f;
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
    public final ol0 o0;
    public final SparseArray r;
    public View s;
    public float v;
    public boolean w;
    public int x;
    public int y;

    public sl0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.a = 1;
        this.b = rl0.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        gr grVar = gr.h;
        this.A = new y5(this, 350L, grVar);
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
        this.a0 = new ol0(this, 0);
        this.b0 = false;
        this.f0 = AndroidUtilities.dp(64.0f);
        this.g0 = AndroidUtilities.dp(33.0f);
        this.i0 = -1;
        this.j0 = new Paint();
        this.k0 = true;
        this.l0 = new y5(this, 350L, grVar);
        this.o0 = new ol0(this, 1);
        this.K = b6Var;
        this.L = z10;
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ta1 ta1Var = new ta1(this, context, 9);
        this.e = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ta1Var, new FrameLayout.LayoutParams(-1, -1, 16));
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

    public final FrameLayout b(int i9, Drawable drawable) {
        String l10 = j3.r0.l(i9, "tab");
        int i10 = this.x;
        this.x = i10 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(l10);
        if (frameLayout != null) {
            g(l10, frameLayout, i10);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, g7.e6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ml0(this, 3));
            this.e.addView(frameLayout, i10);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i10));
        frameLayout.setSelected(i10 == this.y);
        this.h.put(l10, frameLayout);
        return frameLayout;
    }

    public final lw0 c(int i9, Drawable drawable) {
        String l10 = j3.r0.l(i9, "tab");
        int i10 = this.x;
        this.x = i10 + 1;
        lw0 lw0Var = (lw0) this.n.get(l10);
        if (lw0Var != null) {
            g(l10, lw0Var, i10);
        } else {
            lw0Var = new lw0(getContext(), 1);
            lw0Var.f.setImageDrawable(drawable);
            lw0Var.setFocusable(true);
            lw0Var.setOnClickListener(new ml0(this, 4));
            lw0Var.setExpanded(this.b0);
            lw0Var.a(this.e0);
            this.e.addView(lw0Var, i10);
        }
        lw0Var.d = false;
        lw0Var.setTag(R.id.index_tag, Integer.valueOf(i10));
        lw0Var.setSelected(i10 == this.y);
        this.h.put(l10, lw0Var);
        return lw0Var;
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
            autoTransition.addTransition(new pl0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ta1 ta1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float textWidth;
        float f12 = this.g0 - this.f0;
        float f13 = (1.0f - this.e0) * this.h0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ta1Var = this.e;
            if (i10 >= ta1Var.getChildCount()) {
                break;
            }
            if (ta1Var.getChildAt(i10) instanceof lw0) {
                lw0 lw0Var = (lw0) ta1Var.getChildAt(i10);
                float left = lw0Var.getLeft();
                float f14 = lw0Var.y;
                if (left != f14 && lw0Var.A) {
                    lw0Var.b = f14 - lw0Var.getLeft();
                    ValueAnimator valueAnimator = lw0Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        lw0Var.x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(lw0Var.b, 0.0f);
                    lw0Var.x = ofFloat;
                    ofFloat.addUpdateListener(new kw0(lw0Var, this, i9));
                    lw0Var.x.addListener(new su0(1, lw0Var, this));
                    lw0Var.x.start();
                }
                lw0Var.A = false;
                if (this.c0) {
                    lw0Var.setTranslationX(e2.c.z(1.0f, this.e0, i10 * f12, f13) + lw0Var.b);
                } else {
                    lw0Var.setTranslationX(lw0Var.b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.c0) {
            height = j3.r0.C(1.0f, this.e0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f15 = height;
        float d = this.l0.d(this.k0 ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.x == 0 || this.F < 0) {
            canvas2 = canvas;
        } else {
            float f16 = this.y;
            y5 y5Var = this.A;
            float d9 = y5Var.d(f16, false);
            TimeInterpolator timeInterpolator = y5Var.h;
            double d10 = d9;
            int floor = (int) Math.floor(d10);
            int ceil = (int) Math.ceil(d10);
            View view = null;
            View childAt = (floor < 0 || floor >= ta1Var.getChildCount()) ? null : ta1Var.getChildAt(floor);
            if (ceil >= 0 && ceil < ta1Var.getChildCount()) {
                view = ta1Var.getChildAt(ceil);
            }
            float f17 = f15 / 2.0f;
            if (childAt == null || view == null) {
                f10 = 2.0f;
                if (childAt != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof lw0) {
                        textWidth = ((lw0) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + view.getTranslationX() + view.getLeft();
                        if (view instanceof lw0) {
                            textWidth = ((lw0) view).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            } else {
                f10 = 2.0f;
                float f18 = d9 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.e0) / 2.0f) + view.getTranslationX() + view.getLeft(), f18);
                textWidth = AndroidUtilities.lerp(childAt instanceof lw0 ? ((lw0) childAt).getTextWidth() : 0.0f, view instanceof lw0 ? ((lw0) view).getTextWidth() : 0.0f, f18);
            }
            float dp = AndroidUtilities.dp(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.25f) * f10)) * dp;
            float abs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = gr.i.getInterpolation(this.e0);
            float lerp = f17 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f19 = lerp + lerp3;
            RectF rectF = this.B;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f19);
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.b6 b6Var = this.K;
            Paint paint = this.j0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.x == 0 || this.I <= 0) {
            return;
        }
        int i11 = this.E;
        Paint paint2 = this.D;
        paint2.setColor(i11);
        canvas2.drawRect(0.0f, f15 - this.I, ta1Var.getWidth(), f15, paint2);
    }

    public final boolean e(int i9) {
        if (!this.O || i9 < 0) {
            return false;
        }
        ta1 ta1Var = this.e;
        if (i9 >= ta1Var.getChildCount()) {
            return false;
        }
        View childAt = ta1Var.getChildAt(i9);
        if (!(childAt instanceof lw0)) {
            return false;
        }
        lw0 lw0Var = (lw0) childAt;
        return lw0Var.a == 0 && !lw0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ol0 ol0Var = this.a0;
        if (action == 0 && this.s == null) {
            this.U = true;
            AndroidUtilities.runOnUIThread(ol0Var, 500L);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
        }
        if (this.U && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.S);
            float f10 = this.C;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.T) > f10) {
                this.U = false;
                AndroidUtilities.cancelRunOnUIThread(ol0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ol0 ol0Var2 = this.o0;
        ta1 ta1Var = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(ol0Var2);
            AndroidUtilities.cancelRunOnUIThread(ol0Var);
            if (this.s != null) {
                int i9 = this.P;
                int i10 = this.Q;
                if (i9 != i10) {
                    o(i9, i10);
                    for (int i11 = 0; i11 < ta1Var.getChildCount(); i11++) {
                        ta1Var.getChildAt(i11).setTag(R.id.index_tag, Integer.valueOf(i11));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q60(this, 12));
                ofFloat.addListener(new r60(this, 14));
                ofFloat.start();
            }
            this.U = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i12 = this.Q;
        if (ceil != i12) {
            if (ceil < i12) {
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
            for (int i13 = 0; i13 < ta1Var.getChildCount(); i13++) {
                if (i13 != this.Q) {
                    lw0 lw0Var = (lw0) ta1Var.getChildAt(i13);
                    lw0Var.y = lw0Var.getLeft();
                    lw0Var.A = true;
                    lw0Var.invalidate();
                }
            }
            this.R += (ceil - this.Q) * getTabSize();
            this.Q = ceil;
            ta1Var.removeView(this.s);
            ta1Var.addView(this.s, this.Q);
            invalidate();
        }
        this.W = this.S - motionEvent.getX();
        float x10 = motionEvent.getX();
        if (x10 < this.s.getMeasuredWidth() / 2.0f) {
            this.m0 = false;
            if (this.n0 <= 0) {
                this.n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(ol0Var2, 16L);
        } else if (x10 > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.m0 = true;
            if (this.n0 <= 0) {
                this.n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(ol0Var2, 16L);
        } else {
            this.n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(ol0Var2);
        }
        ta1Var.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i9) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i9, frameLayout);
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

    public rl0 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        ta1 ta1Var = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ta1Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            int keyAt = sparseArray.keyAt(i9);
            View view = (View) sparseArray.valueAt(i9);
            if (ta1Var.indexOfChild(view) != keyAt) {
                ta1Var.removeView(view);
                ta1Var.addView(view, keyAt);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.nl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    sl0 sl0Var = sl0.this;
                    ta1 ta1Var = sl0Var.e;
                    if (!z10) {
                        float childCount = sl0Var.g0 * ta1Var.getChildCount();
                        float scrollX = sl0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (sl0Var.f0 * ta1Var.getChildCount());
                        float measuredWidth = (childCount - sl0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        sl0Var.h0 = (sl0Var.getScrollX() + f11) - f12;
                    }
                    sl0Var.e0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                        ta1Var.getChildAt(i9).invalidate();
                    }
                    ta1Var.invalidate();
                    sl0Var.p();
                }
            });
            this.d0.addListener(new eh.t(this, z10, f10, 1));
            this.d0.start();
            ta1 ta1Var = this.e;
            if (z10) {
                this.c0 = true;
                for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                    View childAt = ta1Var.getChildAt(i9);
                    if (childAt instanceof lw0) {
                        ((lw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ta1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f0 * ta1Var.getChildCount() * ((getScrollX() + f10) / (this.g0 * ta1Var.getChildCount()));
                this.h0 = childCount - (getScrollX() + f10);
                this.i0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i9, int i10) {
        int i11 = this.y;
        if (i11 == i9) {
            return;
        }
        ta1 ta1Var = this.e;
        View childAt = ta1Var.getChildAt(i11);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.y = i9;
        if (i9 >= ta1Var.getChildCount()) {
            return;
        }
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= ta1Var.getChildCount()) {
                break;
            }
            View childAt2 = ta1Var.getChildAt(i12);
            if (i12 != i9) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i12++;
        }
        if (this.d0 == null) {
            if (i10 != i9 || i9 <= 1) {
                l(i9);
            } else {
                l(i9 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i9) {
        if (this.x != 0) {
            ta1 ta1Var = this.e;
            if (ta1Var.getChildAt(i9) == null) {
                return;
            }
            int left = ta1Var.getChildAt(i9).getLeft();
            int i10 = this.H;
            if (i9 > 0) {
                left -= i10;
            }
            int scrollX = getScrollX();
            if (left != this.J) {
                if (left < scrollX) {
                    this.J = left;
                    smoothScrollTo(left, 0);
                } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                    int width = (i10 * 3) + (left - getWidth());
                    this.J = width;
                    smoothScrollTo(width, 0);
                }
            }
        }
    }

    public final void m(int i9) {
        if (i9 < 0 || i9 >= this.x) {
            return;
        }
        this.e.getChildAt(i9).performClick();
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
        int i9;
        int i10;
        ta1 ta1Var;
        int i11;
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
        ta1 ta1Var2 = this.e;
        int paddingLeft = (int) ((scrollX - ta1Var2.getPaddingLeft()) / f11);
        int i12 = 1;
        int min = Math.min(ta1Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.c0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > ta1Var2.getChildCount()) {
                min = ta1Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.N;
        sparseArray2.clear();
        int i13 = 0;
        while (true) {
            sparseArray = this.M;
            if (i13 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((lw0) sparseArray.valueAt(i13)).s, (lw0) sparseArray.valueAt(i13));
            i13++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = ta1Var2.getChildAt(paddingLeft);
            if (childAt instanceof lw0) {
                lw0 lw0Var = (lw0) childAt;
                int i14 = lw0Var.s;
                o9 o9Var = lw0Var.e;
                if (lw0Var.a == 2) {
                    Object tag = lw0Var.getTag(R.id.parent_tag);
                    Object tag2 = lw0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        o9Var.h(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i12) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        o9Var.setImageDrawable(drawable);
                    }
                    i9 = paddingLeft;
                    i10 = min;
                    ta1Var = ta1Var2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!lw0Var.c) {
                            lw0Var.v = DocumentObject.getSvgThumb((TLRPC.Document) tag3, org.telegram.ui.ActionBar.f6.c7, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(document);
                        i9 = paddingLeft;
                        i10 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i11 = stickerSet.thumb_version;
                            if (lw0Var.c) {
                                i9 = paddingLeft;
                                i10 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                i9 = paddingLeft;
                                i10 = min;
                                lw0Var.v = DocumentObject.getSvgThumb(arrayList, org.telegram.ui.ActionBar.f6.c7, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                            }
                        } else {
                            i9 = paddingLeft;
                            i10 = min;
                            i11 = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i11);
                    }
                    if (!lw0Var.c && lw0Var.v == null && document != null) {
                        lw0Var.v = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.c7, 0.2f);
                    }
                    if (forSticker != null) {
                        lw0Var.c = true;
                        SvgHelper.SvgDrawable svgDrawable = lw0Var.v;
                        boolean isEnabled = LiteMode.isEnabled(1);
                        String str2 = !isEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            ta1Var = ta1Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null) {
                            }
                        } else {
                            ta1Var = ta1Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            String str3 = str2;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    obj = tag4;
                                    o9Var.i(forSticker, str3, "tgs", svgDrawable, obj);
                                } else {
                                    obj = tag4;
                                    o9Var.i(forSticker, str3, "webp", svgDrawable, obj);
                                }
                                obj2 = obj;
                                lw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else if (svgDrawable != null) {
                                o9Var.n(forSticker, str3, svgDrawable, tag4);
                                obj2 = tag4;
                                lw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            } else {
                                obj3 = tag4;
                                o9Var.j(forSticker, str3, forSticker, null, 0, obj3);
                                obj2 = obj3;
                                lw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        }
                        if (str == null) {
                            if (!isEnabled) {
                                o9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                            } else if (svgDrawable != null) {
                                o9Var.n(ImageLocation.getForDocument(document), str2, svgDrawable, tag4);
                            } else {
                                obj3 = tag4;
                                o9Var.j(ImageLocation.getForDocument(document), str2, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            String str4 = str2;
                            if (svgDrawable != null) {
                                o9Var.n(forSticker, str4, svgDrawable, obj2);
                            } else {
                                o9Var.j(forSticker, str4, null, null, 0, obj2);
                            }
                        }
                        lw0Var.h.setText(!(obj2 instanceof TLRPC.TL_messages_stickerSet) ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    ta1Var = ta1Var2;
                    paddingLeft = i9 + 1;
                    min = i10;
                    ta1Var2 = ta1Var;
                    i12 = 1;
                }
                sparseArray.put(i14, lw0Var);
                sparseArray2.remove(i14);
                paddingLeft = i9 + 1;
                min = i10;
                ta1Var2 = ta1Var;
                i12 = 1;
            }
            i9 = paddingLeft;
            i10 = min;
            ta1Var = ta1Var2;
            paddingLeft = i9 + 1;
            min = i10;
            ta1Var2 = ta1Var;
            i12 = 1;
        }
        for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
            if (((lw0) sparseArray2.valueAt(i15)) != this.s) {
                ((lw0) sparseArray2.valueAt(i15)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        n();
        int i13 = this.i0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.i0 = -1;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        n();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i9 = 0; i9 < this.x; i9++) {
            View childAt = this.e.getChildAt(i9);
            if (this.w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i9) {
        this.y = i9;
    }

    public void setDelegate(ql0 ql0Var) {
        this.f = ql0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.O = z10;
    }

    public void setImageReceiversLayerNum(int i9) {
        this.a = i9;
    }

    public void setIndicatorColor(int i9) {
        invalidate();
    }

    public void setIndicatorHeight(int i9) {
        this.F = i9;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.w = z10;
        requestLayout();
    }

    public void setType(rl0 rl0Var) {
        if (rl0Var == null || this.b == rl0Var) {
            return;
        }
        this.b = rl0Var;
        int ordinal = rl0Var.ordinal();
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

    public void setUnderlineColor(int i9) {
        this.E = i9;
        invalidate();
    }

    public void setUnderlineColorResource(int i9) {
        this.E = getResources().getColor(i9);
        invalidate();
    }

    public void setUnderlineHeight(int i9) {
        if (this.I != i9) {
            this.I = i9;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i9, int i10) {
    }
}
