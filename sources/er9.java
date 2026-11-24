// default package

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
import android.view.animation.Interpolator;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class er9 extends HorizontalScrollView {
    public static final /* synthetic */ int u0 = 0;
    public int E;
    public final lm F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final wjb P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int a;
    public float a0;
    public dr9 b;
    public float b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final pkb e;
    public float e0;
    public cr9 f;
    public final br9 f0;
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
    public final lm q0;
    public final SparseArray r;
    public boolean r0;
    public View s;
    public long s0;
    public final br9 t0;
    public float w;
    public boolean x;
    public int y;

    public er9(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.a = 1;
        this.b = dr9.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        s33 s33Var = s33.h;
        this.F = new lm(350L, this, s33Var);
        this.G = new RectF();
        this.J = 436207616;
        this.L = new GradientDrawable();
        this.M = gl.L(33.0f);
        this.N = gl.L(2.0f);
        this.O = 0;
        this.R = new SparseArray();
        this.S = new SparseArray();
        this.f0 = new br9(this, (byte) 0);
        this.g0 = false;
        this.k0 = gl.L(64.0f);
        this.l0 = gl.L(33.0f);
        this.n0 = -1;
        this.o0 = new Paint();
        this.p0 = true;
        this.q0 = new lm(350L, this, s33Var);
        this.t0 = new br9(this, (byte) 1);
        this.P = wjbVar;
        this.Q = z;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        pkb pkbVar = new pkb((byte) 15, context, this);
        this.e = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setPadding(gl.L(9.5f), 0, gl.L(9.5f), 0);
        addView(pkbVar, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(gl.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSize() {
        return gl.L(this.h0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i, Drawable drawable) {
        String k = de9.k(i, "tab");
        int i2 = this.y;
        this.y = i2 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(k);
        if (frameLayout != null) {
            g(k, frameLayout, i2);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, nme.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new zq9(this, (byte) 0));
            this.e.addView(frameLayout, i2);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i2));
        frameLayout.setSelected(i2 == this.E);
        this.h.put(k, frameLayout);
        return frameLayout;
    }

    public final xza c(int i, Drawable drawable) {
        String k = de9.k(i, "tab");
        int i2 = this.y;
        this.y = i2 + 1;
        xza xzaVar = (xza) this.n.get(k);
        if (xzaVar != null) {
            g(k, xzaVar, i2);
        } else {
            xzaVar = new xza(getContext(), 1);
            xzaVar.f.setImageDrawable(drawable);
            xzaVar.setFocusable(true);
            xzaVar.setOnClickListener(new zq9(this, (byte) 1));
            xzaVar.setExpanded(this.g0);
            xzaVar.a(this.j0);
            this.e.addView(xzaVar, i2);
        }
        xzaVar.d = false;
        xzaVar.setTag(R.id.index_tag, Integer.valueOf(i2));
        xzaVar.setSelected(i2 == this.E);
        this.h.put(k, xzaVar);
        return xzaVar;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.c0 = false;
        gl.r(this.f0);
    }

    public final void d(boolean z) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.y = 0;
        if (z) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new u88(this, (byte) 1));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        pkb pkbVar;
        Canvas canvas2;
        float f;
        float f2;
        float textWidth;
        boolean z;
        float f3 = this.l0 - this.k0;
        float f4 = (1.0f - this.j0) * this.m0;
        byte b = 0;
        int i = 0;
        while (true) {
            pkbVar = this.e;
            if (i >= pkbVar.getChildCount()) {
                break;
            }
            if (pkbVar.getChildAt(i) instanceof xza) {
                xza xzaVar = (xza) pkbVar.getChildAt(i);
                float left = xzaVar.getLeft();
                float f5 = xzaVar.E;
                if (left != f5 && xzaVar.F) {
                    xzaVar.b = f5 - xzaVar.getLeft();
                    ValueAnimator valueAnimator = xzaVar.y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xzaVar.y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(xzaVar.b, 0.0f);
                    xzaVar.y = ofFloat;
                    ofFloat.addUpdateListener(new wza(xzaVar, this, b));
                    xzaVar.y.addListener(new eh8((Object) xzaVar, (Object) this, (byte) 16));
                    xzaVar.y.start();
                }
                xzaVar.F = false;
                if (this.h0) {
                    xzaVar.setTranslationX(tb4.A(1.0f, this.j0, i * f3, f4) + xzaVar.b);
                } else {
                    xzaVar.setTranslationX(xzaVar.b);
                }
            }
            i++;
        }
        float height = getHeight();
        if (this.h0) {
            height = ls6.B(1.0f, this.j0, gl.L(50.0f), getHeight());
        }
        float f6 = height;
        float e = this.q0.e(false, this.p0 ? 1.0f : 0.0f);
        if (isInEditMode() || this.y == 0 || this.K < 0) {
            canvas2 = canvas;
        } else {
            float f7 = this.E;
            lm lmVar = this.F;
            float e2 = lmVar.e(false, f7);
            Interpolator interpolator = lmVar.h;
            double d = e2;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= pkbVar.getChildCount()) ? null : pkbVar.getChildAt(floor);
            if (ceil >= 0 && ceil < pkbVar.getChildCount()) {
                view = pkbVar.getChildAt(ceil);
            }
            float f8 = f6 / 2.0f;
            if (childAt != null) {
                if (view != null) {
                    f = 2.0f;
                    float f9 = e2 - floor;
                    f2 = gl.R1((gl.U1(this.j0, gl.L(33.0f), gl.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), (gl.U1(this.j0, gl.L(33.0f), gl.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), f9);
                    textWidth = gl.R1(childAt instanceof xza ? ((xza) childAt).getTextWidth() : 0.0f, view instanceof xza ? ((xza) view).getTextWidth() : 0.0f, f9);
                } else {
                    f = 2.0f;
                    f2 = (gl.U1(this.j0, gl.L(33.0f), gl.L(64.0f)) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                    if (childAt instanceof xza) {
                        textWidth = ((xza) childAt).getTextWidth();
                    }
                    textWidth = 0.0f;
                }
                float L = gl.L(30.0f);
                float abs = (1.25f - ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.25f) * f)) * L;
                float abs2 = ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.1f * f) + 0.9f) * L;
                float interpolation = s33.i.getInterpolation(this.j0);
                float U1 = f8 + gl.U1(interpolation, 0, gl.L(26.0f));
                float R1 = gl.R1(abs, textWidth + gl.L(10.0f), interpolation) / f;
                float R12 = (gl.R1(1.0f, 0.55f, interpolation) * abs2) / f;
                float f10 = U1 + R12;
                RectF rectF = this.G;
                rectF.set(f2 - R1, U1 - R12, f2 + R1, f10);
                z = this.Q;
                wjb wjbVar = this.P;
                Paint paint = this.o0;
                if (z) {
                    paint.setColor(bm2.o(bkb.v0(bkb.Ml, wjbVar), 12));
                } else {
                    paint.setColor(bm2.o(bkb.v0(bkb.Df, wjbVar), 46));
                    paint.setAlpha((int) (paint.getAlpha() * e));
                }
                canvas2 = canvas;
                canvas2.drawRoundRect(rectF, rectF.height() / f, rectF.height() / f, paint);
            } else {
                f = 2.0f;
                if (view != null) {
                    f2 = (gl.U1(this.j0, gl.L(33.0f), gl.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof xza) {
                        textWidth = ((xza) view).getTextWidth();
                        float L2 = gl.L(30.0f);
                        float abs3 = (1.25f - ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.25f) * f)) * L2;
                        float abs22 = ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.1f * f) + 0.9f) * L2;
                        float interpolation2 = s33.i.getInterpolation(this.j0);
                        float U12 = f8 + gl.U1(interpolation2, 0, gl.L(26.0f));
                        float R13 = gl.R1(abs3, textWidth + gl.L(10.0f), interpolation2) / f;
                        float R122 = (gl.R1(1.0f, 0.55f, interpolation2) * abs22) / f;
                        float f102 = U12 + R122;
                        RectF rectF2 = this.G;
                        rectF2.set(f2 - R13, U12 - R122, f2 + R13, f102);
                        z = this.Q;
                        wjb wjbVar2 = this.P;
                        Paint paint2 = this.o0;
                        if (z) {
                        }
                        canvas2 = canvas;
                        canvas2.drawRoundRect(rectF2, rectF2.height() / f, rectF2.height() / f, paint2);
                    }
                } else {
                    f2 = 0.0f;
                }
                textWidth = 0.0f;
                float L22 = gl.L(30.0f);
                float abs32 = (1.25f - ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.25f) * f)) * L22;
                float abs222 = ((Math.abs(0.5f - (interpolator != null ? interpolator.getInterpolation(lmVar.b()) : lmVar.b())) * 0.1f * f) + 0.9f) * L22;
                float interpolation22 = s33.i.getInterpolation(this.j0);
                float U122 = f8 + gl.U1(interpolation22, 0, gl.L(26.0f));
                float R132 = gl.R1(abs32, textWidth + gl.L(10.0f), interpolation22) / f;
                float R1222 = (gl.R1(1.0f, 0.55f, interpolation22) * abs222) / f;
                float f1022 = U122 + R1222;
                RectF rectF22 = this.G;
                rectF22.set(f2 - R132, U122 - R1222, f2 + R132, f1022);
                z = this.Q;
                wjb wjbVar22 = this.P;
                Paint paint22 = this.o0;
                if (z) {
                }
                canvas2 = canvas;
                canvas2.drawRoundRect(rectF22, rectF22.height() / f, rectF22.height() / f, paint22);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.y == 0 || this.N <= 0) {
            return;
        }
        int i2 = this.J;
        Paint paint3 = this.I;
        paint3.setColor(i2);
        canvas2.drawRect(0.0f, f6 - this.N, pkbVar.getWidth(), f6, paint3);
    }

    public final boolean e(int i) {
        if (!this.T || i < 0) {
            return false;
        }
        pkb pkbVar = this.e;
        if (i >= pkbVar.getChildCount()) {
            return false;
        }
        View childAt = pkbVar.getChildAt(i);
        if (!(childAt instanceof xza)) {
            return false;
        }
        xza xzaVar = (xza) childAt;
        return xzaVar.a == 0 && !xzaVar.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        br9 br9Var = this.f0;
        if (action == 0 && this.s == null) {
            this.c0 = true;
            gl.e3(br9Var, 500L);
            this.a0 = motionEvent.getX();
            this.b0 = motionEvent.getY();
        }
        byte b = 2;
        if (this.c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.a0);
            float f = this.H;
            if (abs > f || Math.abs(motionEvent.getY() - this.b0) > f) {
                this.c0 = false;
                gl.r(br9Var);
            }
        }
        int action2 = motionEvent.getAction();
        br9 br9Var2 = this.t0;
        pkb pkbVar = this.e;
        if (action2 != 2 || this.s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.s0 = -1L;
            gl.r(br9Var2);
            gl.r(br9Var);
            if (this.s != null) {
                int i = this.U;
                int i2 = this.V;
                if (i != i2) {
                    o(i, i2);
                    for (int i3 = 0; i3 < pkbVar.getChildCount(); i3++) {
                        pkbVar.getChildAt(i3).setTag(R.id.index_tag, Integer.valueOf(i3));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x89(this, (byte) 8));
                ofFloat.addListener(new ng9(this, b));
                ofFloat.start();
            }
            this.c0 = false;
            j();
            return false;
        }
        int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i4 = this.V;
        if (ceil != i4) {
            if (ceil < i4) {
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
            for (int i5 = 0; i5 < pkbVar.getChildCount(); i5++) {
                if (i5 != this.V) {
                    xza xzaVar = (xza) pkbVar.getChildAt(i5);
                    xzaVar.E = xzaVar.getLeft();
                    xzaVar.F = true;
                    xzaVar.invalidate();
                }
            }
            this.W += (ceil - this.V) * getTabSize();
            this.V = ceil;
            pkbVar.removeView(this.s);
            pkbVar.addView(this.s, this.V);
            invalidate();
        }
        this.e0 = this.a0 - motionEvent.getX();
        float x = motionEvent.getX();
        if (x < this.s.getMeasuredWidth() / 2.0f) {
            this.r0 = false;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            gl.e3(br9Var2, 16L);
        } else if (x > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
            this.r0 = true;
            if (this.s0 <= 0) {
                this.s0 = System.currentTimeMillis();
            }
            gl.e3(br9Var2, 16L);
        } else {
            this.s0 = -1L;
            gl.r(br9Var2);
        }
        pkbVar.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.h0) {
            return gl.L(50.0f) * this.j0;
        }
        return 0.0f;
    }

    public dr9 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        pkb pkbVar = this.e;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                pkbVar.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            View view = (View) sparseArray.valueAt(i);
            if (pkbVar.indexOfChild(view) != keyAt) {
                pkbVar.removeView(view);
                pkbVar.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z, final float f) {
        if (this.g0 != z) {
            this.g0 = z;
            if (!z) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.i0.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z ? 1.0f : 0.0f);
            this.i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ar9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    er9 er9Var = er9.this;
                    pkb pkbVar = er9Var.e;
                    if (!z) {
                        float childCount = er9Var.l0 * pkbVar.getChildCount();
                        float scrollX = er9Var.getScrollX();
                        float f2 = f;
                        float childCount2 = (scrollX + f2) / (er9Var.k0 * pkbVar.getChildCount());
                        float measuredWidth = (childCount - er9Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f2 = 0.0f;
                        }
                        float f3 = childCount * childCount2;
                        if (f3 - f2 < 0.0f) {
                            f3 = f2;
                        }
                        er9Var.m0 = (er9Var.getScrollX() + f2) - f3;
                    }
                    er9Var.j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i = 0; i < pkbVar.getChildCount(); i++) {
                        pkbVar.getChildAt(i).invalidate();
                    }
                    pkbVar.invalidate();
                    er9Var.p();
                }
            });
            this.i0.addListener(new uy6(this, z, f, (byte) 1));
            this.i0.start();
            pkb pkbVar = this.e;
            if (z) {
                this.h0 = true;
                for (int i = 0; i < pkbVar.getChildCount(); i++) {
                    View childAt = pkbVar.getChildAt(i);
                    if (childAt instanceof xza) {
                        ((xza) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = gl.L(64.0f);
                }
                pkbVar.requestLayout();
                getLayoutParams().height = gl.L(86.0f);
            }
            if (z) {
                float childCount = this.k0 * pkbVar.getChildCount() * ((getScrollX() + f) / (this.l0 * pkbVar.getChildCount()));
                this.m0 = childCount - (getScrollX() + f);
                this.n0 = (int) (childCount - f);
            }
        }
    }

    public final void k(int i, int i2) {
        int i3 = this.E;
        if (i3 != i) {
            pkb pkbVar = this.e;
            View childAt = pkbVar.getChildAt(i3);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.E = i;
            if (i >= pkbVar.getChildCount()) {
                return;
            }
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 >= pkbVar.getChildCount()) {
                    break;
                }
                View childAt2 = pkbVar.getChildAt(i4);
                if (i4 != i) {
                    z = false;
                }
                childAt2.setSelected(z);
                i4++;
            }
            if (this.i0 == null) {
                if (i2 != i || i <= 1) {
                    l(i);
                } else {
                    l(i - 1);
                }
            }
            invalidate();
        }
    }

    public final void l(int i) {
        if (this.y != 0) {
            pkb pkbVar = this.e;
            if (pkbVar.getChildAt(i) != null) {
                int left = pkbVar.getChildAt(i).getLeft();
                int i2 = this.M;
                if (i > 0) {
                    left -= i2;
                }
                int scrollX = getScrollX();
                if (left != this.O) {
                    if (left < scrollX) {
                        this.O = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i2 > (getWidth() + scrollX) - (i2 << 1)) {
                        int width = (i2 * 3) + (left - getWidth());
                        this.O = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i) {
        if (i < 0 || i >= this.y) {
            return;
        }
        this.e.getChildAt(i).performClick();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f8, code lost:
    
        if (r1.equalsIgnoreCase("a") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fa, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0221, code lost:
    
        if (r5 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0223, code lost:
    
        r12.p(r13, r14, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0227, code lost:
    
        r12.h(r13, r14, r13, null, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0209, code lost:
    
        if (r13.p != r2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020b, code lost:
    
        r17 = r18;
        r12.n(r13, r14, "tgs", r5, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0217, code lost:
    
        r17 = r18;
        r12.n(r13, r14, "webp", r5, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0205, code lost:
    
        if (k27.K2(r9, true) == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        SparseArray sparseArray;
        int i;
        int i2;
        pkb pkbVar;
        byte b;
        int i3;
        String str;
        gl5 k;
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        float L = gl.L(33.0f);
        float L2 = gl.L(31.0f);
        float f = this.j0;
        float f2 = (L2 * f) + L;
        float scrollX = getScrollX() - (this.h0 ? (1.0f - f) * this.m0 : 0.0f);
        pkb pkbVar2 = this.e;
        int paddingLeft = (int) ((scrollX - pkbVar2.getPaddingLeft()) / f2);
        byte b2 = 1;
        int min = Math.min(pkbVar2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f2)) + paddingLeft + 1);
        if (this.h0) {
            paddingLeft -= 2;
            min += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (min > pkbVar2.getChildCount()) {
                min = pkbVar2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.S;
        sparseArray2.clear();
        int i4 = 0;
        while (true) {
            sparseArray = this.R;
            if (i4 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((xza) sparseArray.valueAt(i4)).s, (xza) sparseArray.valueAt(i4));
            i4++;
        }
        sparseArray.clear();
        while (paddingLeft < min) {
            View childAt = pkbVar2.getChildAt(paddingLeft);
            if (childAt instanceof xza) {
                xza xzaVar = (xza) childAt;
                int i5 = xzaVar.s;
                be0 be0Var = xzaVar.e;
                if (xzaVar.a == 2) {
                    Object tag = xzaVar.getTag(R.id.parent_tag);
                    Object tag2 = xzaVar.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        be0Var.m(gl5.b((TLRPC.Document) tag2), !e66.e(b2) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        be0Var.setImageDrawable(drawable);
                    }
                    i = paddingLeft;
                    i2 = min;
                    pkbVar = pkbVar2;
                    b = b2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!xzaVar.c) {
                            xzaVar.w = uo3.f((TLRPC.Document) tag3, bkb.b7, 0.2f, null);
                        }
                        k = gl5.b(document);
                        i = paddingLeft;
                        i2 = min;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i3 = stickerSet.thumb_version;
                            if (xzaVar.c) {
                                i = paddingLeft;
                                i2 = min;
                            } else {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                int i6 = bkb.b7;
                                i = paddingLeft;
                                int size = arrayList.size();
                                i2 = min;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size) {
                                        z = false;
                                        break;
                                    }
                                    int i8 = size;
                                    if ("v".equalsIgnoreCase(arrayList.get(i7).type)) {
                                        z = true;
                                        break;
                                    } else {
                                        i7++;
                                        size = i8;
                                    }
                                }
                                xzaVar.w = uo3.d(arrayList, i6, 0.2f, z);
                            }
                        } else {
                            i = paddingLeft;
                            i2 = min;
                            i3 = 0;
                        }
                        str = photoSize.type;
                        k = gl5.k(photoSize, document, i3);
                    } else {
                        i = paddingLeft;
                        i2 = min;
                        pkbVar = pkbVar2;
                        b = 1;
                    }
                    if (!xzaVar.c && xzaVar.w == null && document != null) {
                        xzaVar.w = uo3.f(document, bkb.b7, 0.2f, null);
                    }
                    if (k != null) {
                        xzaVar.c = true;
                        kcb kcbVar = xzaVar.w;
                        boolean e = e66.e(1);
                        String str2 = !e ? "40_40_firstframe" : "40_40";
                        if (str == null && k27.M4(document)) {
                            pkbVar = pkbVar2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                if (!e) {
                                    be0Var.p(gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), "40_40", kcbVar, tag4);
                                } else if (kcbVar != null) {
                                    be0Var.p(gl5.b(document), str2, kcbVar, tag4);
                                } else {
                                    obj3 = tag4;
                                    be0Var.h(gl5.b(document), str2, k, null, 0, obj3);
                                    obj2 = obj3;
                                    b = 1;
                                    xzaVar.h.setText(obj2 instanceof TLRPC.TL_messages_stickerSet ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                                }
                                obj2 = tag4;
                                b = 1;
                                xzaVar.h.setText(obj2 instanceof TLRPC.TL_messages_stickerSet ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                            }
                        } else {
                            pkbVar = pkbVar2;
                        }
                        gl5 gl5Var = k;
                        if (str == null) {
                            obj = tag4;
                            b = 1;
                        } else if (!str.equalsIgnoreCase("v")) {
                            obj = tag4;
                            b = 1;
                        } else if (kcbVar != null) {
                            be0Var.p(gl5Var, str2, kcbVar, tag4);
                            obj2 = tag4;
                            b = 1;
                        } else {
                            obj3 = tag4;
                            be0Var.h(gl5Var, str2, null, null, 0, obj3);
                            obj2 = obj3;
                            b = 1;
                        }
                        xzaVar.h.setText(obj2 instanceof TLRPC.TL_messages_stickerSet ? ((TLRPC.TL_messages_stickerSet) obj2).set.title : null);
                    }
                    pkbVar = pkbVar2;
                    b = 1;
                }
                sparseArray.put(i5, xzaVar);
                sparseArray2.remove(i5);
            } else {
                i = paddingLeft;
                i2 = min;
                pkbVar = pkbVar2;
                b = b2;
            }
            paddingLeft = i + 1;
            b2 = b;
            min = i2;
            pkbVar2 = pkbVar;
        }
        for (int i9 = 0; i9 < sparseArray2.size(); i9++) {
            if (((xza) sparseArray2.valueAt(i9)) != this.s) {
                ((xza) sparseArray2.valueAt(i9)).e.setImageDrawable(null);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
        int i5 = this.n0;
        if (i5 >= 0) {
            scrollTo(i5, 0);
            this.n0 = -1;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        n();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i = 0; i < this.y; i++) {
            View childAt = this.e.getChildAt(i);
            if (this.x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i) {
        this.E = i;
    }

    public void setDelegate(cr9 cr9Var) {
        this.f = cr9Var;
    }

    public void setDragEnabled(boolean z) {
        this.T = z;
    }

    public void setImageReceiversLayerNum(int i) {
        this.a = i;
    }

    public void setIndicatorColor(int i) {
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.K = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.x = z;
        requestLayout();
    }

    public void setType(dr9 dr9Var) {
        if (dr9Var == null || this.b == dr9Var) {
            return;
        }
        this.b = dr9Var;
        int ordinal = dr9Var.ordinal();
        GradientDrawable gradientDrawable = this.L;
        if (ordinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else if (ordinal == 1) {
            float N = gl.N(3.0f);
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i) {
        this.J = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.J = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        if (this.N != i) {
            this.N = i;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i, int i2) {
    }
}
