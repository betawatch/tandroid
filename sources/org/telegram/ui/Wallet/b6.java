package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.fi1;
import org.telegram.ui.li1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.k J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.k O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int a;
    public final x5 a0;
    public final int b;
    public float b0;
    public View c;
    public Runnable c0;
    public a6 d;
    public float d0;
    public z5 e;
    public double e0;
    public tg.g f;
    public long f0;
    public float g0;
    public bk0 h;
    public float h0;
    public float i0;
    public final x5 j0;
    public int k0;
    public final y5 l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.x5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.x5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b6(int i10, Context context, boolean z10) {
        super(context);
        tg.g gVar;
        this.y = -1;
        final int i11 = 0;
        this.a0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.x5
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i11) {
                    case 0:
                        b6 b6Var = this.b;
                        if (b6Var.n) {
                            float min = b6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            b6Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = b6Var.T;
                            float f10 = b6Var.U;
                            b6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            b6Var.U = f10 * exp;
                            b6Var.k();
                            if (Math.abs(b6Var.U) <= 0.5f) {
                                b6Var.U = 0.0f;
                                b6Var.W = false;
                                b6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(b6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        b6 b6Var2 = this.b;
                        if (b6Var2.r && b6Var2.x && b6Var2.f != null) {
                            float min2 = b6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            b6Var2.f0 = j10;
                            if (b6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = b6Var2.G;
                                float f12 = b6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = b6Var2.d0;
                                b6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                b6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + b6Var2.e0) % 6.283185307179586d;
                                b6Var2.e0 = d;
                                b6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                b6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(b6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.i0 = 1.0f;
        final int i12 = 1;
        this.j0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.x5
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i12) {
                    case 0:
                        b6 b6Var = this.b;
                        if (b6Var.n) {
                            float min = b6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            b6Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = b6Var.T;
                            float f10 = b6Var.U;
                            b6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            b6Var.U = f10 * exp;
                            b6Var.k();
                            if (Math.abs(b6Var.U) <= 0.5f) {
                                b6Var.U = 0.0f;
                                b6Var.W = false;
                                b6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(b6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        b6 b6Var2 = this.b;
                        if (b6Var2.r && b6Var2.x && b6Var2.f != null) {
                            float min2 = b6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            b6Var2.f0 = j10;
                            if (b6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = b6Var2.G;
                                float f12 = b6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = b6Var2.d0;
                                b6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                b6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + b6Var2.e0) % 6.283185307179586d;
                                b6Var2.e0 = d;
                                b6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                b6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(b6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.l0 = new y5(this, 0);
        int dp = AndroidUtilities.dp(i10);
        this.a = dp;
        this.b = i10;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && SharedConfig.getDevicePerformanceClass() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z10) {
                    z5 z5Var = new z5(this, context);
                    this.e = z5Var;
                    tg.g gVar2 = z5Var.b;
                    this.f = gVar2;
                    gVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    a6 a6Var = new a6(this, context);
                    this.d = a6Var;
                    this.f = a6Var.a;
                    this.c = a6Var;
                }
                gVar = this.f;
                if (gVar != null) {
                    gVar.z = org.telegram.ui.ActionBar.g6.fk;
                    gVar.A = org.telegram.ui.ActionBar.g6.gk;
                    gVar.b();
                    setIdleAnimationEnabled(false);
                }
                addView(this.c, new FrameLayout.LayoutParams(dp, dp, 17));
            }
        }
        g();
        gVar = this.f;
        if (gVar != null) {
        }
        addView(this.c, new FrameLayout.LayoutParams(dp, dp, 17));
    }

    public static void a(b6 b6Var) {
        if (b6Var.f == null || !b6Var.r || b6Var.x) {
            return;
        }
        b6Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(b6 b6Var, boolean z10, float f7) {
        if (z10 || f7 > 1.001f || b6Var.f == null) {
            return;
        }
        b6Var.setRenderScale(1.0f);
    }

    public static void c(b6 b6Var) {
        if (b6Var.f == null) {
            return;
        }
        b6Var.h(false);
        b6Var.k0++;
        b6Var.removeCallbacks(b6Var.l0);
        Choreographer.getInstance().removeFrameCallback(b6Var.j0);
        b6Var.f0 = 0L;
        b6Var.d0 = 0.0f;
        b6Var.m(null);
        b6Var.setIdleAnimationEnabled(false);
        b6Var.setRendererPaused(true);
        a6 a6Var = b6Var.d;
        if (a6Var != null) {
            a6Var.setPaused(true);
            a6Var.onPause();
        }
        z5 z5Var = b6Var.e;
        if (z5Var != null) {
            z5Var.o();
        }
        b6Var.removeView(b6Var.c);
        b6Var.d = null;
        b6Var.e = null;
        b6Var.f = null;
        b6Var.g();
        View view = b6Var.c;
        int i10 = b6Var.a;
        b6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
        b6Var.r = false;
        if (b6Var.b0 != 0.0f) {
            b6Var.h.getAnimatedDrawable().K(1);
        }
        b6Var.j();
        Runnable runnable = b6Var.c0;
        b6Var.c0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setIdleAnimationEnabled(z10);
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setPaused(z10);
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.u = lVar;
            this.J.e(0.001f);
            this.J.b(new v5(this, 0));
            this.J.a(new w5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.g0;
        float f11 = this.i0;
        gVar.d = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, f10, f7);
        gVar.i = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, this.h0, this.H);
    }

    public final void f(b6 b6Var) {
        tg.g gVar;
        if (b6Var == null || (gVar = b6Var.f) == null || this.f == null) {
            return;
        }
        this.G = gVar.d;
        this.H = gVar.i;
        e();
    }

    public final void g() {
        bk0 bk0Var = new bk0(getContext());
        this.h = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        bk0 bk0Var2 = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.b;
        bk0Var2.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.c = this.h;
        setOnClickListener(new j3(this, 3));
        setClickable(!this.x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        if (this.f == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(r0.i + r0.j);
    }

    public float getFlightYaw() {
        if (this.f == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(r0.d + r0.f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.y != -1) {
            this.y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.f != null) {
                if (z10) {
                    this.g0 = (float) Math.IEEEremainder(r0.d - this.G, 360.0d);
                    this.h0 = (float) Math.IEEEremainder(this.f.i - this.H, 360.0d);
                    this.i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(es.h);
                    this.I.addUpdateListener(new s2(this, 5));
                    this.I.addListener(new fi1(this, 6));
                    this.I.start();
                } else {
                    this.i0 = 1.0f;
                    this.h0 = 0.0f;
                    this.g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.i0 = 1.0f;
            this.h0 = 0.0f;
            this.g0 = 0.0f;
            e();
        }
        if (this.c == null) {
            return;
        }
        if (z10) {
            d(1.0f);
            return;
        }
        o1.k kVar = this.J;
        if (kVar != null) {
            kVar.c();
            this.J = null;
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        if (this.f != null) {
            setRenderScale(1.0f);
        }
    }

    public final void i() {
        this.x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.l0);
        setClickable(false);
        if (this.f != null) {
            a6 a6Var = this.d;
            if (a6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                a6Var.J = max;
                a6Var.a.h = a6Var.I / max;
                a6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f;
            this.G = gVar.d;
            this.H = gVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                x5 x5Var = this.j0;
                choreographer.removeFrameCallback(x5Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(x5Var);
            }
        }
    }

    public final void j() {
        boolean z10 = !this.s && this.n && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        if (!z10) {
            h(false);
        }
        int i10 = this.k0 + 1;
        this.k0 = i10;
        if (this.f == null) {
            bk0 bk0Var = this.h;
            if (bk0Var != null) {
                if (!z10) {
                    this.w = bk0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.v || this.w) {
                        bk0Var.d();
                    }
                    this.v = true;
                    return;
                }
            }
            return;
        }
        removeCallbacks(this.l0);
        setIdleAnimationEnabled(false);
        if (this.x) {
            x5 x5Var = this.j0;
            if (z10) {
                Choreographer.getInstance().removeFrameCallback(x5Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(x5Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(x5Var);
                this.f0 = 0L;
                this.d0 = 0.0f;
            }
        } else if (z10) {
            tg.g gVar = this.f;
            gVar.d = 0.0f;
            gVar.i = 0.0f;
            m(new li1(this, i10, 3));
        }
        setRendererPaused(!z10);
    }

    public final void k() {
        tg.g gVar = this.f;
        if (gVar != null) {
            gVar.f = this.T + this.L;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.c0 = runnable;
        if (this.f != null) {
            m(new y5(this, 1));
        } else if (runnable != null) {
            post(new y5(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.v = runnable;
            if (a6Var.s && runnable != null) {
                a6Var.v = null;
                runnable.run();
            }
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.U = runnable;
            if (!z5Var.T || runnable == null) {
                return;
            }
            z5Var.U = null;
            runnable.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.n = false;
        Choreographer.getInstance().removeFrameCallback(this.a0);
        o1.k kVar = this.O;
        if (kVar != null) {
            kVar.c();
            this.O = null;
            setTranslationX(0.0f);
        }
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0L;
        this.W = false;
        this.S = false;
        this.V = 0L;
        this.U = 0.0f;
        this.T = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (isEnabled() && this.x && this.f != null && this.r) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), TLObject.FLAG_30);
        this.c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.x || this.f == null || !this.r) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
            }
            this.d0 = 0.0f;
            this.y = motionEvent.getPointerId(0);
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            d(3.0f);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.y);
                if (findPointerIndex < 0) {
                    h(true);
                    return true;
                }
                float f7 = 0.8f / AndroidUtilities.density;
                tg.g gVar = this.f;
                gVar.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                tg.g gVar2 = this.f;
                gVar2.i = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.i);
                this.E = motionEvent.getX(findPointerIndex);
                this.F = motionEvent.getY(findPointerIndex);
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    if (this.y == -1) {
                        return false;
                    }
                } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.y) {
                    int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.y = motionEvent.getPointerId(i10);
                    this.E = motionEvent.getX(i10);
                    this.F = motionEvent.getY(i10);
                }
                return true;
            }
        }
        h(true);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        j();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        j();
    }

    public void setContinuousRotation(float f7) {
        this.b0 = f7;
        i();
        setEnabled(false);
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f;
        if (gVar != null) {
            gVar.g = f7 + this.M;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotation(f7 + this.M);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        h(false);
    }

    public void setHeaderTilt(float f7) {
        tg.g gVar = this.f;
        if (gVar != null) {
            gVar.j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f - f7;
        float f11 = (2.0f * f10) + 1.0f;
        this.c.setScaleX(f11);
        this.c.setScaleY(f11);
        if (this.f != null) {
            setRenderScale(f11 > 1.0f ? 3.5f : 1.0f);
        }
        this.L = f10 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f;
        if (gVar != null) {
            gVar.g = this.K + this.M;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.s = z10;
        j();
    }

    public void setStarParticlesView(sg.x1 x1Var) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setStarParticlesView(x1Var);
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setStarParticlesView(x1Var);
        }
    }
}
