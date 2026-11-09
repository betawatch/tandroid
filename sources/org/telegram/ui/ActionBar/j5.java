package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.we0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j5 extends FrameLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public Runnable H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final h2.f O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final float[] U;
    public final Path V;
    public final ArrayList W;
    public float a;
    public float a0;
    public we0 b;
    public float b0;
    public final g6.d0 c;
    public float c0;
    public s4 d;
    public final float[] d0;
    public r0 e;
    public final RectF e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public fh.g h;
    public s4 n;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    public j5(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new g6.d0(this, 28);
        this.r = new WeakHashMap();
        this.x = new Paint(1);
        Paint paint = new Paint();
        this.y = paint;
        this.O = new h2.f((int[]) null);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new float[8];
        this.V = new Path();
        this.W = new ArrayList();
        this.d0 = new float[2];
        this.e0 = new RectF();
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
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
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

    private int getContentTop() {
        int i7 = (int) this.P.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z9) {
        if (this.N == z9) {
            return;
        }
        this.N = z9;
        h2.f fVar = this.O;
        if (z9) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z9) {
        boolean z10 = this.D;
        if (z10 || this.N) {
            if (z10) {
                this.D = false;
                if (z9 && isAttachedToWindow() && isLaidOut()) {
                    h();
                    return;
                }
            }
            c();
        }
    }

    public final void b() {
        s4 s4Var = this.d;
        if (s4Var == null) {
            return;
        }
        r0 r0Var = this.e;
        RectF rectF = this.P;
        this.E = s4Var.b(r0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.e0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.d0;
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
        this.D = false;
        this.M = 0.0f;
        this.L = 0.0f;
        this.K = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.W;
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
        r0 r0Var = this.e;
        s4 s4Var = this.d;
        this.e = null;
        this.d = null;
        if (s4Var != null) {
            s4Var.f(null, null);
        }
        if (r0Var != null) {
            r0Var.getIconView().setAlpha(1.0f);
            o0 o0Var = r0Var.Q;
            if (o0Var != null) {
                o0Var.i();
            }
        }
        Runnable runnable = this.H;
        if (runnable != null) {
            this.H = null;
            runnable.run();
        }
    }

    public final void d(s4 s4Var, r0 r0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (this.D && this.d == s4Var && this.e == r0Var) {
            return;
        }
        s4 s4Var2 = this.d;
        if (s4Var2 != null && (s4Var2 != s4Var || this.e != r0Var)) {
            c();
        }
        this.d = s4Var;
        this.e = r0Var;
        s4Var.getClass();
        this.s = false;
        this.w = s4Var.a();
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
        s6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        l60.U(actionBarPopupWindow$ActionBarPopupWindowLayout, l6.r1(0.06f, l6.w0(l6.E8, this.d.getMenuResourcesProvider())));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f();
        we0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        if (swipeBack != null) {
            swipeBack.b(false);
            swipeBack.setForegroundOnGlass(true);
            if (this.b != swipeBack) {
                this.b = swipeBack;
                swipeBack.y.add(new ve0() { // from class: org.telegram.ui.ActionBar.h5
                    @Override // org.telegram.ui.Components.ve0
                    public final void a(float f10, float f11) {
                        j5.this.invalidate();
                    }
                });
            }
            for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                    j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                    s6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                    l60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, l6.r1(0.06f, l6.w0(l6.E8, this.d.getMenuResourcesProvider())));
                }
            }
        }
        ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.K;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout);
            addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
        }
        fh.g gVar = this.h;
        if (gVar == null || this.n != s4Var) {
            if (gVar != null) {
                gVar.a.setEmpty();
                this.h.setBounds(0, 0, 0, 0);
            }
            WeakHashMap weakHashMap = this.r;
            fh.g gVar2 = (fh.g) weakHashMap.get(s4Var);
            this.h = gVar2;
            if (gVar2 == null) {
                fh.g e10 = s4Var.e(this);
                this.h = e10;
                if (e10 != null) {
                    e10.p(this.c);
                    weakHashMap.put(s4Var, this.h);
                }
            }
            this.n = s4Var;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).bringChildToFront(this);
        }
        setVisibility(0);
        this.D = true;
        this.G = SystemClock.uptimeMillis();
        h();
        s4Var.f(this, r0Var);
        b();
        if (!this.E && r0Var != null) {
            r0Var.getIconView().setAlpha(0.0f);
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
        float f12;
        char c11;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.N) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.I == 0) {
                this.I = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f13 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.I) / 1000.0f) / animatorDurationScale;
            float f14 = this.J;
            if (this.D) {
                this.M = 0.0f;
                this.K = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) g(f13, 0.78d, 0.3d))) + f14;
                this.L = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) g(f13 - 0.02d, 0.8d, 0.34d))) + f14;
                if (f13 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l10 = Utilities.l(f13 / 0.2f);
                float l11 = Utilities.l(f13 / 0.17f);
                this.K = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f14;
                this.L = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f14;
                float f15 = f13 - 0.2f;
                this.M = (f15 <= 0.0f || !this.E) ? 0.0f : f14 * 0.07f * ((float) Math.exp((-f15) / 0.11f)) * ((float) Math.sin((f15 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.E ? f15 >= 0.0f : f15 > 0.45f) {
                    this.M = 0.0f;
                    post(new g5(this, 0));
                }
            }
            float f16 = this.c0;
            float f17 = f16 == 0.0f ? 0.0f : f13 - f16;
            if (f17 > 0.001f) {
                this.b0 = (this.L - this.a0) / f17;
            } else if (f16 == 0.0f) {
                this.b0 = 0.0f;
            }
            this.a0 = this.L;
            this.c0 = Math.max(f13, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        we0 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.Q;
        if (swipeBack == null || !(swipeBack.Q || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f18 = this.K;
        float f19 = this.L;
        float l12 = Utilities.l(Math.max(f18, f19));
        RectF rectF3 = this.P;
        float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f18);
        float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f19);
        float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f18);
        float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f19);
        RectF rectF4 = this.R;
        rectF4.set(T1, T12, T13, T14);
        if (this.M != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            float B = com.google.android.recaptcha.internal.a.B(this.M, 0.5f, 1.0f, rectF4.width() / 2.0f);
            f10 = 2.0f;
            float height = (1.0f - this.M) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
        } else {
            f10 = 2.0f;
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f19)));
        float l13 = this.s ? Utilities.l(this.b0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f : 0.0f;
        float f20 = min + l13;
        float[] fArr = this.U;
        fArr[3] = f20;
        fArr[2] = f20;
        fArr[1] = f20;
        fArr[0] = f20;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f21 = rectF4.left;
        float f22 = rectF4.top - l13;
        float f23 = rectF4.right;
        float f24 = rectF4.bottom;
        RectF rectF5 = this.T;
        rectF5.set(f21, f22, f23, f24);
        Paint paint = this.y;
        paint.setAlpha((int) (26.0f * l12));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = org.telegram.messenger.g0.L(6.0f);
        float l14 = this.E ? 1.0f : Utilities.l(l12 / 0.25f);
        fh.g gVar = this.h;
        Path path = this.V;
        RectF rectF6 = this.S;
        if (gVar != null) {
            float l15 = this.E ? Utilities.l(l12) : 1.0f;
            this.a = l15;
            this.d.setMenuGlassFrostedProgress(l15);
            this.h.updateColors();
            fh.g gVar2 = this.h;
            float i7 = i(this.d.getButtonsGlassColorProvider(), true);
            g6.d0 d0Var = this.c;
            c10 = 1;
            float T15 = org.telegram.messenger.g0.T1(i7, i(d0Var, true), this.a);
            float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(d0Var, false), this.a);
            fh.f fVar = gVar2.Q;
            fVar.i = T15;
            fVar.j = T16;
            gVar2.O = null;
            if (l13 > 0.0f) {
                this.h.t(f20, f20, min, min, false);
            } else {
                this.h.r(min);
            }
            this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
            rectF6.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF6.union(rectF3);
            float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
            rectF = rectF2;
            this.h.a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
            this.h.setAlpha((int) (255.0f * l14));
            this.h.draw(canvas);
        } else {
            float f25 = l14;
            c10 = 1;
            rectF = rectF2;
            int w02 = l6.w0(l6.G8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.x;
            paint2.setColor(w02);
            paint2.setAlpha((int) (paint2.getAlpha() * f25));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF5, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        float l16 = 1.0f - Utilities.l(l12 / (this.D ? 0.3f : 0.7f));
        View menuView = this.E ? this.d.getMenuView() : this.e.getIconView();
        if (l16 <= 0.004f || menuView == null) {
            f11 = 0.004f;
            f12 = 0.25f;
        } else {
            RectF rectF7 = this.e0;
            boolean c12 = jh.k.c(menuView, this, rectF7);
            float[] fArr2 = this.d0;
            if (c12) {
                c11 = 0;
                fArr2[0] = rectF7.left;
                fArr2[c10] = rectF7.top;
            } else {
                c11 = 0;
                fArr2[c10] = 0.0f;
                fArr2[0] = 0.0f;
            }
            float f26 = fArr2[c11];
            rectF6.set(f26, fArr2[c10], menuView.getWidth() + f26, fArr2[c10] + menuView.getHeight());
            float l17 = 1.0f - (Utilities.l(l12 / 0.3f) * 0.15f);
            f11 = 0.004f;
            f12 = 0.25f;
            e(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l16);
            float f27 = this.M;
            canvas.scale(com.google.android.recaptcha.internal.a.B(f27, 0.5f, 1.0f, l17), (1.0f - f27) * l17, rectF6.centerX(), rectF6.centerY());
            canvas.translate(rectF6.left, rectF6.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        float f28 = this.s ? this.D ? f(0.15f, 0.6f, l12) : f(0.6f, 1.0f, l12) : this.D ? f(f12, 0.75f, l12) : f(0.5f, 0.95f, l12);
        if (f28 <= f11 || !this.s) {
            RectF rectF8 = rectF;
            if (f28 > f11) {
                float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                e(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, f28);
                if (this.w) {
                    canvas.translate(rectF4.centerX() - rectF8.centerX(), rectF4.top - rectF8.top);
                    canvas.scale(max2, max2, rectF8.centerX(), rectF8.top);
                } else {
                    canvas.translate(rectF4.right - rectF8.right, rectF4.top - rectF8.top);
                    canvas.scale(max2, max2, rectF8.right, rectF8.top);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        } else {
            float centerX2 = rectF4.centerX() - rectF.centerX();
            float f29 = rectF4.top - rectF.top;
            if (Math.abs(this.b0) < 0.6f) {
                centerX2 = Math.round(centerX2);
                f29 = Math.round(f29);
            }
            e(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f28);
            canvas.translate(centerX2, f29);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.N) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.D || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.P.contains(r8.getX(), r8.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7.F = r1;
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
    
        if (r7.Q.contains(r8.getX(), r8.getY()) == false) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9 = false;
        if (!this.D) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.G < 300) {
            }
        }
        if (this.F) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public r0 getItem() {
        return this.e;
    }

    public final void h() {
        this.J = Math.max(this.K, this.L);
        this.a0 = this.L;
        this.c0 = 0.0f;
        this.I = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z9) {
        if (aVar == this.c) {
            s4 s4Var = this.d;
            aVar = s4Var != null ? s4Var.getMenuGlassColorProvider() : null;
        }
        if (!(aVar instanceof gh.e)) {
            return org.telegram.messenger.g0.N(z9 ? 1.0f : 0.6666667f);
        }
        gh.e eVar = (gh.e) aVar;
        return z9 ? eVar.f : eVar.h;
    }

    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W;
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
        if (this.D || this.N) {
            c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        boolean z10 = this.s;
        RectF rectF = this.P;
        if (z10) {
            int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int i13 = (int) rectF.bottom;
            this.f.layout(max, i13 - measuredHeight, measuredWidth + max, i13);
        } else if (this.w) {
            int contentTop = getContentTop();
            int max2 = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            this.f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        } else {
            int i14 = (int) rectF.right;
            int contentTop2 = getContentTop();
            int max3 = Math.max(org.telegram.messenger.g0.L(8.0f), i14 - measuredWidth);
            this.f.layout(max3, contentTop2, measuredWidth + max3, measuredHeight + contentTop2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        this.f.measure(org.telegram.messenger.camera.q.c(16.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), this.s ? (int) ((this.P.bottom - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f)) : ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.n), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.H = runnable;
    }
}
