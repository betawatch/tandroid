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
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.ye0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public Runnable I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final h2.f P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final RectF U;
    public final float[] V;
    public final Path W;
    public float a;
    public final ArrayList a0;
    public ye0 b;
    public float b0;
    public final ia.d c;
    public float c0;
    public q4 d;
    public float d0;
    public q0 e;
    public final float[] e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final RectF f0;
    public fh.g h;
    public q4 n;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    public g5(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new ia.d(this, 26);
        this.r = new WeakHashMap();
        this.x = new Paint(1);
        Paint paint = new Paint();
        this.y = paint;
        this.P = new h2.f((int[]) null);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new RectF();
        this.V = new float[8];
        this.W = new Path();
        this.a0 = new ArrayList();
        this.e0 = new float[2];
        this.f0 = new RectF();
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

    private int getContentTop() {
        int i7 = (int) this.Q.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        h2.f fVar = this.P;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.E;
        if (z11 || this.O) {
            if (z11) {
                this.E = false;
                if (z10 && isAttachedToWindow() && isLaidOut()) {
                    h();
                    return;
                }
            }
            c();
        }
    }

    public final void b() {
        q4 q4Var = this.d;
        if (q4Var == null) {
            return;
        }
        q0 q0Var = this.e;
        RectF rectF = this.Q;
        this.F = q4Var.b(q0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.e0;
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
        this.E = false;
        this.N = 0.0f;
        this.M = 0.0f;
        this.L = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.a0;
            if (i7 >= arrayList.size()) {
                break;
            }
            f5 f5Var = (f5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(f5Var.b);
            Drawable drawable = f5Var.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(f5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(f5Var.e, f5Var.f, f5Var.g, f5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        q0 q0Var = this.e;
        q4 q4Var = this.d;
        this.e = null;
        this.d = null;
        if (q4Var != null) {
            q4Var.h(null, null);
        }
        if (q0Var != null) {
            q0Var.getIconView().setAlpha(1.0f);
            n0 n0Var = q0Var.R;
            if (n0Var != null) {
                n0Var.i();
            }
        }
        Runnable runnable = this.I;
        if (runnable != null) {
            this.I = null;
            runnable.run();
        }
    }

    public final void d(q4 q4Var, q0 q0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (this.E && this.d == q4Var && this.e == q0Var) {
            return;
        }
        q4 q4Var2 = this.d;
        if (q4Var2 != null && (q4Var2 != q4Var || this.e != q0Var)) {
            c();
        }
        this.d = q4Var;
        this.e = q0Var;
        this.s = q4Var.f();
        this.w = q4Var.a();
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
        q6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        m60.U(actionBarPopupWindow$ActionBarPopupWindowLayout, j6.r1(0.06f, j6.w0(j6.E8, this.d.getMenuResourcesProvider())));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f();
        ye0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        if (swipeBack != null) {
            swipeBack.b(false);
            swipeBack.setForegroundOnGlass(true);
            if (this.b != swipeBack) {
                this.b = swipeBack;
                swipeBack.y.add(new xe0() { // from class: org.telegram.ui.ActionBar.e5
                    @Override // org.telegram.ui.Components.xe0
                    public final void a(float f10, float f11) {
                        g5.this.invalidate();
                    }
                });
            }
            for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                    j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                    q6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                    m60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, j6.r1(0.06f, j6.w0(j6.E8, this.d.getMenuResourcesProvider())));
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
        if (gVar == null || this.n != q4Var) {
            if (gVar != null) {
                gVar.a.setEmpty();
                this.h.setBounds(0, 0, 0, 0);
            }
            WeakHashMap weakHashMap = this.r;
            fh.g gVar2 = (fh.g) weakHashMap.get(q4Var);
            this.h = gVar2;
            if (gVar2 == null) {
                fh.g g10 = q4Var.g(this);
                this.h = g10;
                if (g10 != null) {
                    g10.p(this.c);
                    weakHashMap.put(q4Var, this.h);
                }
            }
            this.n = q4Var;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).bringChildToFront(this);
        }
        setVisibility(0);
        this.E = true;
        this.H = SystemClock.uptimeMillis();
        h();
        q4Var.h(this, q0Var);
        b();
        if (!this.F && q0Var != null) {
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
        float f12;
        char c11;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.O) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.J == 0) {
                this.J = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f13 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.J) / 1000.0f) / animatorDurationScale;
            float f14 = this.K;
            if (this.E) {
                this.N = 0.0f;
                this.L = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) g(f13, 0.78d, 0.3d))) + f14;
                this.M = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) g(f13 - 0.02d, 0.8d, 0.34d))) + f14;
                if (f13 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l10 = Utilities.l(f13 / 0.2f);
                float l11 = Utilities.l(f13 / 0.17f);
                this.L = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f14;
                this.M = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f14;
                float f15 = f13 - 0.2f;
                this.N = (f15 <= 0.0f || !this.F) ? 0.0f : f14 * 0.07f * ((float) Math.exp((-f15) / 0.11f)) * ((float) Math.sin((f15 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.F ? f15 >= 0.0f : f15 > 0.45f) {
                    this.N = 0.0f;
                    post(new bi.t4(this, 2));
                }
            }
            float f16 = this.d0;
            float f17 = f16 == 0.0f ? 0.0f : f13 - f16;
            if (f17 > 0.001f) {
                this.c0 = (this.M - this.b0) / f17;
            } else if (f16 == 0.0f) {
                this.c0 = 0.0f;
            }
            this.b0 = this.M;
            this.d0 = Math.max(f13, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        ye0 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.R;
        if (swipeBack == null || !(swipeBack.R || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f18 = this.L;
        float f19 = this.M;
        float l12 = Utilities.l(Math.max(f18, f19));
        RectF rectF3 = this.Q;
        float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f18);
        float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f19);
        float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f18);
        float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f19);
        RectF rectF4 = this.S;
        rectF4.set(T1, T12, T13, T14);
        if (this.N != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            float B = com.google.android.gms.internal.vision.e2.B(this.N, 0.5f, 1.0f, rectF4.width() / 2.0f);
            f10 = 2.0f;
            float height = (1.0f - this.N) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
        } else {
            f10 = 2.0f;
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f19)));
        float l13 = this.s ? Utilities.l(this.c0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f : 0.0f;
        float f20 = min + l13;
        float[] fArr = this.V;
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
        RectF rectF5 = this.U;
        rectF5.set(f21, f22, f23, f24);
        q4 q4Var = this.d;
        int menuDimAlpha = (q4Var == null || q4Var.getMenuDimAlpha() < 0) ? 26 : this.d.getMenuDimAlpha();
        Paint paint = this.y;
        paint.setAlpha((int) (menuDimAlpha * l12));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = org.telegram.messenger.g0.L(6.0f);
        float l14 = (this.F && this.d.d()) ? 1.0f : Utilities.l(l12 / 0.25f);
        fh.g gVar = this.h;
        Path path = this.W;
        RectF rectF6 = this.T;
        if (gVar != null) {
            float l15 = this.F ? Utilities.l(l12) : 1.0f;
            this.a = l15;
            this.d.setMenuGlassFrostedProgress(l15);
            this.h.updateColors();
            fh.g gVar2 = this.h;
            float i7 = i(this.d.getButtonsGlassColorProvider(), true);
            ia.d dVar = this.c;
            c10 = 1;
            float T15 = org.telegram.messenger.g0.T1(i7, i(dVar, true), this.a);
            float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(dVar, false), this.a);
            fh.f fVar = gVar2.R;
            fVar.i = T15;
            fVar.j = T16;
            gVar2.P = null;
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
            int w02 = j6.w0(j6.G8, this.d.getMenuResourcesProvider());
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
        float l16 = 1.0f - Utilities.l(l12 / (this.E ? 0.3f : 0.7f));
        View menuView = this.F ? this.d.getMenuView() : this.e.getIconView();
        if (l16 <= 0.004f || menuView == null) {
            f11 = 0.004f;
            f12 = 0.25f;
        } else {
            RectF rectF7 = this.f0;
            boolean c12 = jh.k.c(menuView, this, rectF7);
            float[] fArr2 = this.e0;
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
            float f27 = this.N;
            canvas.scale(com.google.android.gms.internal.vision.e2.B(f27, 0.5f, 1.0f, l17), (1.0f - f27) * l17, rectF6.centerX(), rectF6.centerY());
            canvas.translate(rectF6.left, rectF6.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        float f28 = this.s ? this.E ? f(0.15f, 0.6f, l12) : f(0.6f, 1.0f, l12) : this.E ? f(f12, 0.75f, l12) : f(0.5f, 0.95f, l12);
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
            if (Math.abs(this.c0) < 0.6f) {
                centerX2 = Math.round(centerX2);
                f29 = Math.round(f29);
            }
            e(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f28);
            canvas.translate(centerX2, f29);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.O) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.E || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.Q.contains(r8.getX(), r8.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7.G = r1;
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
    
        if (r7.R.contains(r8.getX(), r8.getY()) == false) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.E) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.H < 300) {
            }
        }
        if (this.G) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public q0 getItem() {
        return this.e;
    }

    public final void h() {
        this.K = Math.max(this.L, this.M);
        this.b0 = this.M;
        this.d0 = 0.0f;
        this.J = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z10) {
        if (aVar == this.c) {
            q4 q4Var = this.d;
            aVar = q4Var != null ? q4Var.getMenuGlassColorProvider() : null;
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
            ArrayList arrayList = this.a0;
            if (i10 >= arrayList.size()) {
                arrayList.add(new f5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((f5) arrayList.get(i10)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
        if (this.E || this.O) {
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
        RectF rectF = this.Q;
        if (z11) {
            int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int menuExtraBelow = this.d.getMenuExtraBelow() + ((int) rectF.bottom);
            this.f.layout(max, menuExtraBelow - measuredHeight, measuredWidth + max, menuExtraBelow);
        } else if (this.w) {
            int contentTop = getContentTop();
            int max2 = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            this.f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        } else {
            int i13 = (int) rectF.right;
            int contentTop2 = getContentTop();
            int max3 = Math.max(org.telegram.messenger.g0.L(8.0f), i13 - measuredWidth);
            this.f.layout(max3, contentTop2, measuredWidth + max3, measuredHeight + contentTop2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        if (this.d == null || (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int menuExtraBelow = this.s ? (int) (((this.Q.bottom + this.d.getMenuExtraBelow()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f)) : ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.n;
        int menuMaxHeight = this.d.getMenuMaxHeight();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        int c10 = i20.c(16.0f, size, TLObject.FLAG_31);
        int L = org.telegram.messenger.g0.L(48.0f);
        if (menuMaxHeight > 0) {
            menuExtraBelow = Math.min(menuMaxHeight, menuExtraBelow);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(Math.max(L, menuExtraBelow), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.I = runnable;
    }
}
