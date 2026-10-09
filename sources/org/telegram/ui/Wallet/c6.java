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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c6 extends FrameLayout {
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
    public final y5 a0;
    public final int b;
    public float b0;
    public View c;
    public Runnable c0;
    public b6 d;
    public float d0;
    public a6 e;
    public double e0;
    public sg.g f;
    public long f0;
    public float g0;
    public fk0 h;
    public float h0;
    public float i0;
    public final y5 j0;
    public int k0;
    public final z5 l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.y5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.y5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c6(int i10, Context context, boolean z10) {
        super(context);
        sg.g gVar;
        this.y = -1;
        final int i11 = 0;
        this.a0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.y5
            public final /* synthetic */ c6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i11) {
                    case 0:
                        c6 c6Var = this.b;
                        if (c6Var.n) {
                            float min = c6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            c6Var.V = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = c6Var.T;
                            float f10 = c6Var.U;
                            c6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            c6Var.U = f10 * exp;
                            c6Var.k();
                            if (Math.abs(c6Var.U) <= 0.5f) {
                                c6Var.U = 0.0f;
                                c6Var.W = false;
                                c6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(c6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        c6 c6Var2 = this.b;
                        if (c6Var2.r && c6Var2.x && c6Var2.f != null) {
                            float min2 = c6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            c6Var2.f0 = j3;
                            if (c6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = c6Var2.G;
                                float f12 = c6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = c6Var2.d0;
                                c6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                c6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + c6Var2.e0) % 6.283185307179586d;
                                c6Var2.e0 = d;
                                c6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                c6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(c6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.i0 = 1.0f;
        final int i12 = 1;
        this.j0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.y5
            public final /* synthetic */ c6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i12) {
                    case 0:
                        c6 c6Var = this.b;
                        if (c6Var.n) {
                            float min = c6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            c6Var.V = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = c6Var.T;
                            float f10 = c6Var.U;
                            c6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            c6Var.U = f10 * exp;
                            c6Var.k();
                            if (Math.abs(c6Var.U) <= 0.5f) {
                                c6Var.U = 0.0f;
                                c6Var.W = false;
                                c6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(c6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        c6 c6Var2 = this.b;
                        if (c6Var2.r && c6Var2.x && c6Var2.f != null) {
                            float min2 = c6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            c6Var2.f0 = j3;
                            if (c6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = c6Var2.G;
                                float f12 = c6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = c6Var2.d0;
                                c6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                c6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + c6Var2.e0) % 6.283185307179586d;
                                c6Var2.e0 = d;
                                c6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                c6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(c6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.l0 = new z5(this, 0);
        int dp = AndroidUtilities.dp(i10);
        this.a = dp;
        this.b = i10;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && SharedConfig.getDevicePerformanceClass() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z10) {
                    a6 a6Var = new a6(this, context);
                    this.e = a6Var;
                    sg.g gVar2 = a6Var.b;
                    this.f = gVar2;
                    gVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    b6 b6Var = new b6(this, context);
                    this.d = b6Var;
                    this.f = b6Var.a;
                    this.c = b6Var;
                }
                gVar = this.f;
                if (gVar != null) {
                    gVar.z = org.telegram.ui.ActionBar.i6.fk;
                    gVar.A = org.telegram.ui.ActionBar.i6.gk;
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

    public static void a(c6 c6Var) {
        if (c6Var.f == null || !c6Var.r || c6Var.x) {
            return;
        }
        c6Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(c6 c6Var, boolean z10, float f7) {
        if (z10 || f7 > 1.001f || c6Var.f == null) {
            return;
        }
        c6Var.setRenderScale(1.0f);
    }

    public static void c(c6 c6Var) {
        if (c6Var.f == null) {
            return;
        }
        c6Var.h(false);
        c6Var.k0++;
        c6Var.removeCallbacks(c6Var.l0);
        Choreographer.getInstance().removeFrameCallback(c6Var.j0);
        c6Var.f0 = 0L;
        c6Var.d0 = 0.0f;
        c6Var.m(null);
        c6Var.setIdleAnimationEnabled(false);
        c6Var.setRendererPaused(true);
        b6 b6Var = c6Var.d;
        if (b6Var != null) {
            b6Var.setPaused(true);
            b6Var.onPause();
        }
        a6 a6Var = c6Var.e;
        if (a6Var != null) {
            a6Var.o();
        }
        c6Var.removeView(c6Var.c);
        c6Var.d = null;
        c6Var.e = null;
        c6Var.f = null;
        c6Var.g();
        View view = c6Var.c;
        int i10 = c6Var.a;
        c6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
        c6Var.r = false;
        if (c6Var.b0 != 0.0f) {
            c6Var.h.getAnimatedDrawable().K(1);
        }
        c6Var.j();
        Runnable runnable = c6Var.c0;
        c6Var.c0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setIdleAnimationEnabled(z10);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setPaused(z10);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setPaused(z10);
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
            this.J.b(new w5(this, 0));
            this.J.a(new x5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        sg.g gVar = this.f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.g0;
        float f11 = this.i0;
        gVar.d = com.google.android.gms.internal.vision.e2.y(1.0f, f11, f10, f7);
        gVar.i = com.google.android.gms.internal.vision.e2.y(1.0f, f11, this.h0, this.H);
    }

    public final void f(c6 c6Var) {
        sg.g gVar;
        if (c6Var == null || (gVar = c6Var.f) == null || this.f == null) {
            return;
        }
        this.G = gVar.d;
        this.H = gVar.i;
        e();
    }

    public final void g() {
        fk0 fk0Var = new fk0(getContext());
        this.h = fk0Var;
        fk0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fk0 fk0Var2 = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.b;
        fk0Var2.f(i10, i11, i11, null);
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
                    this.I.setInterpolator(hs.h);
                    this.I.addUpdateListener(new s2(this, 5));
                    this.I.addListener(new x4(this, 3));
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
            b6 b6Var = this.d;
            if (b6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                b6Var.J = max;
                b6Var.a.h = b6Var.I / max;
                b6Var.f();
            }
            setIdleAnimationEnabled(false);
            sg.g gVar = this.f;
            this.G = gVar.d;
            this.H = gVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                y5 y5Var = this.j0;
                choreographer.removeFrameCallback(y5Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(y5Var);
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
            fk0 fk0Var = this.h;
            if (fk0Var != null) {
                if (!z10) {
                    this.w = fk0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.v || this.w) {
                        fk0Var.d();
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
            y5 y5Var = this.j0;
            if (z10) {
                Choreographer.getInstance().removeFrameCallback(y5Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(y5Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(y5Var);
                this.f0 = 0L;
                this.d0 = 0.0f;
            }
        } else if (z10) {
            sg.g gVar = this.f;
            gVar.d = 0.0f;
            gVar.i = 0.0f;
            m(new r(this, i10, 1));
        }
        setRendererPaused(!z10);
    }

    public final void k() {
        sg.g gVar = this.f;
        if (gVar != null) {
            gVar.f = this.T + this.L;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.c0 = runnable;
        if (this.f != null) {
            m(new z5(this, 1));
        } else if (runnable != null) {
            post(new z5(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.v = runnable;
            if (b6Var.s && runnable != null) {
                b6Var.v = null;
                runnable.run();
            }
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.U = runnable;
            if (!a6Var.T || runnable == null) {
                return;
            }
            a6Var.U = null;
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
                sg.g gVar = this.f;
                gVar.d = com.google.android.gms.internal.vision.e2.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                sg.g gVar2 = this.f;
                gVar2.i = com.google.android.gms.internal.vision.e2.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.i);
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
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        sg.g gVar = this.f;
        if (gVar != null) {
            gVar.g = f7 + this.M;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotation(f7 + this.M);
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
        sg.g gVar = this.f;
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
        sg.g gVar = this.f;
        if (gVar != null) {
            gVar.g = this.K + this.M;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.s = z10;
        j();
    }

    public void setStarParticlesView(rg.w1 w1Var) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setStarParticlesView(w1Var);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setStarParticlesView(w1Var);
        }
    }
}
