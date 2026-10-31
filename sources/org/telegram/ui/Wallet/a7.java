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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ns0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a7 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.j J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.j O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int a;
    public final w6 a0;
    public final int b;
    public float b0;
    public View c;
    public Runnable c0;
    public z6 d;
    public float d0;
    public y6 e;
    public double e0;
    public lg.h f;
    public long f0;
    public float g0;
    public ei0 h;
    public float h0;
    public float i0;
    public final w6 j0;
    public int k0;
    public final x6 l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.w6] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.w6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a7(int i10, Context context, boolean z10) {
        super(context);
        lg.h hVar;
        this.D = -1;
        final int i11 = 0;
        this.a0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.w6
            public final /* synthetic */ a7 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i11) {
                    case 0:
                        a7 a7Var = this.b;
                        if (a7Var.n) {
                            float min = a7Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            a7Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = a7Var.T;
                            float f10 = a7Var.U;
                            a7Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            a7Var.U = f10 * exp;
                            a7Var.k();
                            if (Math.abs(a7Var.U) <= 0.5f) {
                                a7Var.U = 0.0f;
                                a7Var.W = false;
                                a7Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(a7Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        a7 a7Var2 = this.b;
                        if (a7Var2.r && a7Var2.y && a7Var2.f != null) {
                            float min2 = a7Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            a7Var2.f0 = j10;
                            if (a7Var2.D == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = a7Var2.G;
                                float f12 = a7Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = a7Var2.d0;
                                a7Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                a7Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + a7Var2.e0) % 6.283185307179586d;
                                a7Var2.e0 = d;
                                a7Var2.H = ((float) Math.sin(d)) * 9.0f;
                                a7Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(a7Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.i0 = 1.0f;
        final int i12 = 1;
        this.j0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.w6
            public final /* synthetic */ a7 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i12) {
                    case 0:
                        a7 a7Var = this.b;
                        if (a7Var.n) {
                            float min = a7Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            a7Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = a7Var.T;
                            float f10 = a7Var.U;
                            a7Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            a7Var.U = f10 * exp;
                            a7Var.k();
                            if (Math.abs(a7Var.U) <= 0.5f) {
                                a7Var.U = 0.0f;
                                a7Var.W = false;
                                a7Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(a7Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        a7 a7Var2 = this.b;
                        if (a7Var2.r && a7Var2.y && a7Var2.f != null) {
                            float min2 = a7Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            a7Var2.f0 = j10;
                            if (a7Var2.D == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = a7Var2.G;
                                float f12 = a7Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = a7Var2.d0;
                                a7Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                a7Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + a7Var2.e0) % 6.283185307179586d;
                                a7Var2.e0 = d;
                                a7Var2.H = ((float) Math.sin(d)) * 9.0f;
                                a7Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(a7Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.l0 = new x6(this, 0);
        int L = org.telegram.messenger.i0.L(i10);
        this.a = L;
        this.b = i10;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && tz.o() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z10) {
                    y6 y6Var = new y6(this, context);
                    this.e = y6Var;
                    lg.h hVar2 = y6Var.b;
                    this.f = hVar2;
                    hVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    z6 z6Var = new z6(this, context);
                    this.d = z6Var;
                    this.f = z6Var.a;
                    this.c = z6Var;
                }
                hVar = this.f;
                if (hVar != null) {
                    hVar.z = org.telegram.ui.ActionBar.t6.Tk;
                    hVar.A = org.telegram.ui.ActionBar.t6.Uk;
                    hVar.b();
                    setIdleAnimationEnabled(false);
                }
                addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
            }
        }
        g();
        hVar = this.f;
        if (hVar != null) {
        }
        addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
    }

    public static void a(a7 a7Var) {
        if (a7Var.f == null || !a7Var.r || a7Var.y) {
            return;
        }
        a7Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(a7 a7Var, boolean z10, float f7) {
        if (z10 || f7 > 1.001f || a7Var.f == null) {
            return;
        }
        a7Var.setRenderScale(1.0f);
    }

    public static void c(a7 a7Var) {
        if (a7Var.f == null) {
            return;
        }
        a7Var.h(false);
        a7Var.k0++;
        a7Var.removeCallbacks(a7Var.l0);
        Choreographer.getInstance().removeFrameCallback(a7Var.j0);
        a7Var.f0 = 0L;
        a7Var.d0 = 0.0f;
        a7Var.m(null);
        a7Var.setIdleAnimationEnabled(false);
        a7Var.setRendererPaused(true);
        z6 z6Var = a7Var.d;
        if (z6Var != null) {
            z6Var.setPaused(true);
            z6Var.onPause();
        }
        y6 y6Var = a7Var.e;
        if (y6Var != null) {
            y6Var.o();
        }
        a7Var.removeView(a7Var.c);
        a7Var.d = null;
        a7Var.e = null;
        a7Var.f = null;
        a7Var.g();
        View view = a7Var.c;
        int i10 = a7Var.a;
        a7Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
        a7Var.r = false;
        if (a7Var.b0 != 0.0f) {
            a7Var.h.getAnimatedDrawable().K(1);
        }
        a7Var.j();
        Runnable runnable = a7Var.c0;
        a7Var.c0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setIdleAnimationEnabled(z10);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setPaused(z10);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.j jVar = new o1.j(new o1.i(this.c.getScaleX()));
            this.J = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.m = kVar;
            this.J.f(0.001f);
            this.J.b(new u6(this, 0));
            this.J.a(new v6(this, 0));
        }
        this.J.c(f7);
    }

    public final void e() {
        lg.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.g0;
        float f11 = this.i0;
        hVar.d = c3.i0.z(1.0f, f11, f10, f7);
        hVar.i = c3.i0.z(1.0f, f11, this.h0, this.H);
    }

    public final void f(a7 a7Var) {
        lg.h hVar;
        if (a7Var == null || (hVar = a7Var.f) == null || this.f == null) {
            return;
        }
        this.G = hVar.d;
        this.H = hVar.i;
        e();
    }

    public final void g() {
        ei0 ei0Var = new ei0(getContext());
        this.h = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ei0 ei0Var2 = this.h;
        int i10 = this.b;
        ei0Var2.f(R.raw.wallet_diamond_blue, i10, i10, null);
        this.h.getAnimatedDrawable().K(0);
        this.c = this.h;
        setOnClickListener(new i3(this, 4));
        setClickable(!this.y);
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
        if (this.D != -1) {
            this.D = -1;
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
                    this.I.setInterpolator(gr.h);
                    this.I.addUpdateListener(new r3(this, 4));
                    this.I.addListener(new ns0(this, 20));
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
        o1.j jVar = this.J;
        if (jVar != null) {
            jVar.d();
            this.J = null;
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        if (this.f != null) {
            setRenderScale(1.0f);
        }
    }

    public final void i() {
        this.y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.l0);
        setClickable(false);
        if (this.f != null) {
            z6 z6Var = this.d;
            if (z6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                z6Var.J = max;
                z6Var.a.h = z6Var.I / max;
                z6Var.f();
            }
            setIdleAnimationEnabled(false);
            lg.h hVar = this.f;
            this.G = hVar.d;
            this.H = hVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                w6 w6Var = this.j0;
                choreographer.removeFrameCallback(w6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(w6Var);
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
            ei0 ei0Var = this.h;
            if (ei0Var != null) {
                if (!z10) {
                    this.x = ei0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.w || this.x) {
                        ei0Var.d();
                    }
                    this.w = true;
                    return;
                }
            }
            return;
        }
        removeCallbacks(this.l0);
        setIdleAnimationEnabled(false);
        if (this.y) {
            w6 w6Var = this.j0;
            if (z10) {
                Choreographer.getInstance().removeFrameCallback(w6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(w6Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(w6Var);
                this.f0 = 0L;
                this.d0 = 0.0f;
            }
        } else if (z10) {
            lg.h hVar = this.f;
            hVar.d = 0.0f;
            hVar.i = 0.0f;
            m(new qq(this, i10, 27));
        }
        setRendererPaused(!z10);
    }

    public final void k() {
        lg.h hVar = this.f;
        if (hVar != null) {
            hVar.f = this.T + this.L;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.c0 = runnable;
        if (this.f != null) {
            m(new x6(this, 1));
        } else if (runnable != null) {
            post(new x6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.w = runnable;
            if (z6Var.s && runnable != null) {
                z6Var.w = null;
                runnable.run();
            }
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.a0 = runnable;
            if (!y6Var.W || runnable == null) {
                return;
            }
            y6Var.a0 = null;
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
        o1.j jVar = this.O;
        if (jVar != null) {
            jVar.d();
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
        return (isEnabled() && this.y && this.f != null && this.r) || super.onInterceptTouchEvent(motionEvent);
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
        if (!isEnabled() || !this.y || this.f == null || !this.r) {
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
            this.D = motionEvent.getPointerId(0);
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
                int findPointerIndex = motionEvent.findPointerIndex(this.D);
                if (findPointerIndex < 0) {
                    h(true);
                    return true;
                }
                float f7 = 0.8f / org.telegram.messenger.i0.p;
                lg.h hVar = this.f;
                hVar.d = c3.i0.z(motionEvent.getX(findPointerIndex), this.E, f7, hVar.d);
                lg.h hVar2 = this.f;
                hVar2.i = c3.i0.z(motionEvent.getY(findPointerIndex), this.F, f7, hVar2.i);
                this.E = motionEvent.getX(findPointerIndex);
                this.F = motionEvent.getY(findPointerIndex);
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    if (this.D == -1) {
                        return false;
                    }
                } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.D) {
                    int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.D = motionEvent.getPointerId(i10);
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
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        lg.h hVar = this.f;
        if (hVar != null) {
            hVar.g = f7 + this.M;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotation(f7 + this.M);
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
        lg.h hVar = this.f;
        if (hVar != null) {
            hVar.j = f7;
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
        lg.h hVar = this.f;
        if (hVar != null) {
            hVar.g = this.K + this.M;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.s = z10;
        j();
    }

    public void setStarParticlesView(kg.g2 g2Var) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setStarParticlesView(g2Var);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setStarParticlesView(g2Var);
        }
    }
}
