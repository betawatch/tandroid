package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import bi.f7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kf0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j5 extends FrameLayout {
    public int E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public Runnable M;
    public long N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public final h2.f T;
    public final RectF U;
    public final RectF V;
    public final RectF W;
    public float a;
    public final RectF a0;
    public kf0 b;
    public final RectF b0;
    public final hi.t5 c;
    public final float[] c0;
    public t4 d;
    public final Path d0;
    public q0 e;
    public final ArrayList e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public float f0;
    public float g0;
    public fh.g h;
    public float h0;
    public int i0;
    public int j0;
    public final int[] k0;
    public final float[] l0;
    public final RectF m0;
    public t4 n;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public j5(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new hi.t5(this, 29);
        this.r = new WeakHashMap();
        this.F = new Paint(1);
        this.G = new Paint(1);
        Paint paint = new Paint();
        this.H = paint;
        this.T = new h2.f((int[]) null);
        this.U = new RectF();
        this.V = new RectF();
        this.W = new RectF();
        this.a0 = new RectF();
        this.b0 = new RectF();
        this.c0 = new float[8];
        this.d0 = new Path();
        this.e0 = new ArrayList();
        this.k0 = new int[2];
        this.l0 = new float[2];
        this.m0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static void e(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f14 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
        }
    }

    public static float f(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static double g(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
    }

    private float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private int getRawContentBottom() {
        int i7 = (int) this.U.bottom;
        this.d.getClass();
        return this.d.getMenuExtraBelow() + i7;
    }

    private int getRawContentTop() {
        int i7 = (int) this.U.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        h2.f fVar = this.T;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.I;
        if (z11 || this.S) {
            if (z11) {
                this.I = false;
                if (z10 && isAttachedToWindow() && isLaidOut()) {
                    h();
                    return;
                }
            }
            c();
        }
    }

    public final void b() {
        t4 t4Var = this.d;
        if (t4Var == null) {
            return;
        }
        q0 q0Var = this.e;
        RectF rectF = this.U;
        this.J = t4Var.b(q0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.m0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.l0;
        if (c10) {
            fArr[0] = rectF2.left;
            fArr[1] = rectF2.top;
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void c() {
        ArrayList arrayList;
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.a.setEmpty();
        }
        setAnimating(false);
        this.I = false;
        this.x = false;
        this.R = 0.0f;
        this.Q = 0.0f;
        this.P = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.e0;
            if (i7 >= arrayList.size()) {
                break;
            }
            i5 i5Var = (i5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = i5Var.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(i5Var.b);
            Drawable drawable = i5Var.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(i5Var.e, i5Var.f, i5Var.g, i5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        q0 q0Var = this.e;
        t4 t4Var = this.d;
        this.e = null;
        this.d = null;
        if (t4Var != null) {
            t4Var.h(null, null);
        }
        if (q0Var != null) {
            q0Var.getIconView().setAlpha(1.0f);
            n0 n0Var = q0Var.R;
            if (n0Var != null) {
                n0Var.j();
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            this.M = null;
            runnable.run();
        }
    }

    public final void d(t4 t4Var, q0 q0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (this.I && this.d == t4Var && this.e == q0Var) {
            return;
        }
        t4 t4Var2 = this.d;
        if (t4Var2 != null && (t4Var2 != t4Var || this.e != q0Var)) {
            c();
        }
        this.d = t4Var;
        this.e = q0Var;
        this.s = t4Var.f();
        this.w = t4Var.a();
        this.x = false;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
            }
            this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        j(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.messenger.g0.L(5.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        t6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        a70.V(actionBarPopupWindow$ActionBarPopupWindowLayout, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f();
        kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        if (swipeBack != null) {
            swipeBack.b(false);
            swipeBack.setForegroundOnGlass(true);
            if (this.b != swipeBack) {
                this.b = swipeBack;
                swipeBack.y.add(new jf0() { // from class: org.telegram.ui.ActionBar.h5
                    @Override // org.telegram.ui.Components.jf0
                    public final void a(float f10, float f11) {
                        j5.this.invalidate();
                    }
                });
            }
            for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                    j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                    t6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                    a70.V(actionBarPopupWindow$ActionBarPopupWindowLayout3, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
                }
            }
        }
        ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout);
            addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
        }
        fh.g gVar = this.h;
        if (gVar == null || this.n != t4Var) {
            if (gVar != null) {
                gVar.a.setEmpty();
                this.h.setBounds(0, 0, 0, 0);
            }
            WeakHashMap weakHashMap = this.r;
            fh.g gVar2 = (fh.g) weakHashMap.get(t4Var);
            this.h = gVar2;
            if (gVar2 == null) {
                fh.g g10 = t4Var.g(this);
                this.h = g10;
                if (g10 != null) {
                    g10.p(this.c);
                    weakHashMap.put(t4Var, this.h);
                }
            }
            this.n = t4Var;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).bringChildToFront(this);
        }
        setVisibility(0);
        this.I = true;
        this.L = SystemClock.uptimeMillis();
        h();
        t4Var.h(this, q0Var);
        b();
        if (!this.J && q0Var != null) {
            q0Var.getIconView().setAlpha(0.0f);
        }
        View findFocus = getRootView() != null ? getRootView().findFocus() : null;
        if ((findFocus instanceof EditText) && findFocus.isShown()) {
            return;
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        RectF rectF;
        float f11;
        RectF rectF2;
        float f12;
        float f13;
        char c11;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.S) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.N == 0) {
                this.N = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f14 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.N) / 1000.0f) / animatorDurationScale;
            float f15 = this.O;
            if (this.I) {
                this.R = 0.0f;
                this.P = f14 > 0.7f ? 1.0f : ((1.0f - f15) * ((float) g(f14, 0.78d, 0.3d))) + f15;
                this.Q = f14 > 0.7f ? 1.0f : ((1.0f - f15) * ((float) g(f14 - 0.02d, 0.8d, 0.34d))) + f15;
                if (f14 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l10 = Utilities.l(f14 / 0.2f);
                float l11 = Utilities.l(f14 / 0.17f);
                this.P = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f15;
                this.Q = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f15;
                float f16 = f14 - 0.2f;
                this.R = (f16 <= 0.0f || !this.J) ? 0.0f : f15 * 0.07f * ((float) Math.exp((-f16) / 0.11f)) * ((float) Math.sin((f16 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.J ? f16 >= 0.0f : f16 > 0.45f) {
                    this.R = 0.0f;
                    post(new f7(this, 2));
                }
            }
            float f17 = this.h0;
            float f18 = f17 == 0.0f ? 0.0f : f14 - f17;
            if (f18 > 0.001f) {
                this.g0 = (this.Q - this.f0) / f18;
            } else if (f17 == 0.0f) {
                this.g0 = 0.0f;
            }
            this.f0 = this.Q;
            this.h0 = Math.max(f14, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        kf0 swipeBack = this.f.getSwipeBack();
        RectF rectF3 = this.V;
        if (swipeBack == null || !(swipeBack.R || this.f.c)) {
            rectF3.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF3.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f19 = this.P;
        float f20 = this.Q;
        float l12 = Utilities.l(Math.max(f19, f20));
        RectF rectF4 = this.U;
        float T1 = org.telegram.messenger.g0.T1(rectF4.left, rectF3.left, f19);
        float T12 = org.telegram.messenger.g0.T1(rectF4.top, rectF3.top, f20);
        float T13 = org.telegram.messenger.g0.T1(rectF4.right, rectF3.right, f19);
        float T14 = org.telegram.messenger.g0.T1(rectF4.bottom, rectF3.bottom, f20);
        RectF rectF5 = this.W;
        rectF5.set(T1, T12, T13, T14);
        if (this.R != 0.0f) {
            float centerX = rectF5.centerX();
            float centerY = rectF5.centerY();
            float B = com.google.android.gms.internal.vision.e2.B(this.R, 0.5f, 1.0f, rectF5.width() / 2.0f);
            f10 = 2.0f;
            float height = (1.0f - this.R) * (rectF5.height() / 2.0f);
            rectF5.set(centerX - B, centerY - height, centerX + B, centerY + height);
        } else {
            f10 = 2.0f;
        }
        float min = Math.min(Math.min(rectF5.height(), rectF5.width()) / f10, org.telegram.messenger.g0.T1(rectF4.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f20)));
        float l13 = this.s ? Utilities.l(this.g0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f : 0.0f;
        float f21 = min + l13;
        float[] fArr = this.c0;
        fArr[3] = f21;
        fArr[2] = f21;
        fArr[1] = f21;
        fArr[0] = f21;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f22 = rectF5.left;
        float f23 = rectF5.top - l13;
        float f24 = rectF5.right;
        float f25 = rectF5.bottom;
        RectF rectF6 = this.b0;
        rectF6.set(f22, f23, f24, f25);
        t4 t4Var = this.d;
        int menuDimAlpha = (t4Var == null || t4Var.getMenuDimAlpha() < 0) ? 26 : this.d.getMenuDimAlpha();
        Paint paint = this.H;
        paint.setAlpha((int) (menuDimAlpha * l12));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = org.telegram.messenger.g0.L(6.0f);
        float l14 = (this.J && this.d.d()) ? 1.0f : Utilities.l(l12 / 0.25f);
        fh.g gVar = this.h;
        RectF rectF7 = this.a0;
        Path path = this.d0;
        if (gVar != null) {
            float l15 = this.J ? Utilities.l(l12) : 1.0f;
            this.a = l15;
            this.d.setMenuGlassFrostedProgress(l15);
            this.h.updateColors();
            fh.g gVar2 = this.h;
            float i7 = i(this.d.getButtonsGlassColorProvider(), true);
            hi.t5 t5Var = this.c;
            c10 = 1;
            float T15 = org.telegram.messenger.g0.T1(i7, i(t5Var, true), this.a);
            float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(t5Var, false), this.a);
            fh.f fVar = gVar2.R;
            fVar.i = T15;
            fVar.j = T16;
            gVar2.P = null;
            if (l13 > 0.0f) {
                this.h.t(f21, f21, min, min, false);
            } else {
                this.h.r(min);
            }
            this.h.setBounds(Math.round(rectF6.left) - L, Math.round(rectF6.top) - L, Math.round(rectF6.right) + L, Math.round(rectF6.bottom) + L);
            rectF7.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF7.union(rectF4);
            float max = (Math.max(rectF7.width(), rectF7.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
            rectF2 = rectF5;
            rectF = rectF3;
            f11 = l12;
            this.h.a.set((int) Math.floor(rectF7.left - max), (int) Math.floor(rectF7.top - max), (int) Math.ceil(rectF7.right + max), (int) Math.ceil(rectF7.bottom + max));
            this.h.setAlpha((int) (l14 * 255.0f));
            this.h.draw(canvas);
        } else {
            c10 = 1;
            rectF = rectF3;
            f11 = l12;
            rectF2 = rectF5;
            int w02 = m6.w0(m6.G8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.F;
            paint2.setColor(w02);
            paint2.setAlpha((int) (paint2.getAlpha() * l14));
            path.rewind();
            path.addRoundRect(rectF6, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        int menuAnchorTint = this.J ? this.d.getMenuAnchorTint() : 0;
        if (menuAnchorTint != 0 && f11 < 1.0f) {
            Paint paint3 = this.G;
            paint3.setColor(menuAnchorTint);
            paint3.setAlpha((int) ((1.0f - f11) * Color.alpha(menuAnchorTint)));
            path.rewind();
            path.addRoundRect(rectF6, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint3);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF6, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        float l16 = 1.0f - Utilities.l(f11 / (this.I ? 0.3f : 0.7f));
        View menuView = this.J ? this.d.getMenuView() : this.e.getIconView();
        if (l16 <= 0.004f || menuView == null) {
            f12 = 0.25f;
        } else {
            RectF rectF8 = this.m0;
            boolean c12 = jh.k.c(menuView, this, rectF8);
            float[] fArr2 = this.l0;
            if (c12) {
                c11 = 0;
                fArr2[0] = rectF8.left;
                fArr2[c10] = rectF8.top;
            } else {
                c11 = 0;
                fArr2[c10] = 0.0f;
                fArr2[0] = 0.0f;
            }
            float f26 = fArr2[c11];
            rectF7.set(f26, fArr2[c10], menuView.getWidth() + f26, fArr2[c10] + menuView.getHeight());
            float l17 = 1.0f - (Utilities.l(f11 / 0.3f) * 0.15f);
            f12 = 0.25f;
            e(canvas, rectF7.left, rectF7.top, rectF7.right, rectF7.bottom, l16);
            float f27 = this.R;
            canvas.scale(com.google.android.gms.internal.vision.e2.B(f27, 0.5f, 1.0f, l17), (1.0f - f27) * l17, rectF7.centerX(), rectF7.centerY());
            canvas.translate(rectF7.left, rectF7.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        if (this.s) {
            f13 = this.I ? f(0.15f, 0.6f, f11) : f(0.6f, 1.0f, f11);
        } else {
            float f28 = f11;
            f13 = this.I ? f(f12, 0.75f, f28) : f(0.5f, 0.95f, f28);
        }
        float f29 = f13;
        if (f29 <= 0.004f || !this.s) {
            RectF rectF9 = rectF;
            if (f29 > 0.004f) {
                float max2 = Math.max(0.3f, rectF2.width() / Math.max(1.0f, rectF9.width()));
                e(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f29);
                if (this.w) {
                    canvas.translate(rectF2.centerX() - rectF9.centerX(), rectF2.top - rectF9.top);
                    canvas.scale(max2, max2, rectF9.centerX(), rectF9.top);
                } else {
                    canvas.translate(rectF2.right - rectF9.right, rectF2.top - rectF9.top);
                    canvas.scale(max2, max2, rectF9.right, rectF9.top);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        } else {
            float centerX2 = rectF2.centerX() - rectF.centerX();
            float f30 = rectF2.top - rectF.top;
            if (Math.abs(this.g0) < 0.6f) {
                centerX2 = Math.round(centerX2);
                f30 = Math.round(f30);
            }
            e(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, f29);
            canvas.translate(centerX2, f30);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.S) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.I || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.U.contains(r8.getX(), r8.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7.K = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7.V.contains(r8.getX(), r8.getY()) == false) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.I) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.L < 300) {
            }
        }
        if (this.K) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public q0 getItem() {
        return this.e;
    }

    public final void h() {
        this.O = Math.max(this.P, this.Q);
        this.f0 = this.Q;
        this.h0 = 0.0f;
        this.N = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z10) {
        if (aVar == this.c) {
            t4 t4Var = this.d;
            aVar = t4Var != null ? t4Var.getMenuGlassColorProvider() : null;
        }
        if (!(aVar instanceof gh.e)) {
            return org.telegram.messenger.g0.N(z10 ? 1.0f : 0.6666667f);
        }
        gh.e eVar = (gh.e) aVar;
        return z10 ? eVar.f : eVar.h;
    }

    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e0;
            if (i10 >= arrayList.size()) {
                arrayList.add(new i5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((i5) arrayList.get(i10)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                break;
            } else {
                i10++;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i7, 0, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I || this.S) {
            c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d == null || (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        boolean z11 = this.s;
        RectF rectF = this.U;
        if (z11) {
            this.d.getClass();
            int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.f3.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int rawContentBottom = getRawContentBottom();
            if (rawContentBottom - measuredHeight < this.i0) {
                rawContentBottom = Math.min(Math.max(rawContentBottom, this.j0), this.i0 + measuredHeight);
            }
            this.f.layout(max, rawContentBottom - measuredHeight, measuredWidth + max, rawContentBottom);
            return;
        }
        if (!this.w) {
            int i13 = (int) rectF.right;
            int rawContentTop = getRawContentTop();
            if (rawContentTop + measuredHeight > this.j0) {
                rawContentTop = Math.max(Math.min(rawContentTop, this.i0), this.j0 - measuredHeight);
            }
            int max2 = Math.max(org.telegram.messenger.g0.L(8.0f), i13 - measuredWidth);
            this.f.layout(max2, rawContentTop, measuredWidth + max2, measuredHeight + rawContentTop);
            return;
        }
        if (!this.x) {
            this.x = true;
            int rawContentTop2 = getRawContentTop();
            if (rawContentTop2 + measuredHeight > this.j0) {
                rawContentTop2 = Math.max(Math.min(rawContentTop2, this.i0), this.j0 - measuredHeight);
            }
            this.E = rawContentTop2;
            this.y = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.f3.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        int i14 = this.y;
        int i15 = this.E;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i11;
        int min;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        if (this.d == null || (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        View rootView = getRootView();
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(this);
        if (rootView == null || a10 == null) {
            this.i0 = org.telegram.messenger.g0.L(8.0f);
            this.j0 = (size2 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.n;
        } else {
            r0.i1 i1Var = a10.a;
            int[] iArr = this.k0;
            getLocationInWindow(iArr);
            int i12 = i1Var.f(1).b;
            int i13 = i1Var.f(10).d;
            this.i0 = org.telegram.messenger.g0.L(8.0f) + Math.max(0, i12 - iArr[1]);
            this.j0 = Math.min(size2, (rootView.getHeight() - i13) - iArr[1]) - org.telegram.messenger.g0.L(16.0f);
        }
        if (this.s) {
            i11 = Math.max(this.j0, getRawContentBottom());
            min = this.i0;
        } else {
            i11 = this.j0;
            min = Math.min(getRawContentTop(), this.i0);
        }
        int i14 = i11 - min;
        int menuMaxHeight = this.d.getMenuMaxHeight();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        int c10 = n10.c(16.0f, size, TLObject.FLAG_31);
        int L = org.telegram.messenger.g0.L(48.0f);
        if (menuMaxHeight > 0) {
            i14 = Math.min(menuMaxHeight, i14);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(Math.max(L, i14), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.M = runnable;
    }
}
