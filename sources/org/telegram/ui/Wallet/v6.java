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
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s81;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class v6 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public r1.g J;
    public float K;
    public float L;
    public float M;
    public float N;
    public r1.g O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int a;
    public final r6 a0;
    public final int b;
    public float b0;
    public View c;
    public Runnable c0;
    public u6 d;
    public float d0;
    public t6 e;
    public double e0;
    public vg.f f;
    public long f0;
    public float g0;
    public ch0 h;
    public float h0;
    public float i0;
    public final r6 j0;
    public int k0;
    public final s6 l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.r6] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.r6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v6(int i7, Context context, boolean z9) {
        super(context);
        vg.f fVar;
        this.D = -1;
        final int i10 = 0;
        this.a0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.r6
            public final /* synthetic */ v6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i10) {
                    case 0:
                        v6 v6Var = this.b;
                        if (v6Var.n) {
                            float min = v6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            v6Var.V = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f10 = v6Var.T;
                            float f11 = v6Var.U;
                            v6Var.T = (((1.0f - exp) * (0.55f * f11)) + f10) % 360.0f;
                            v6Var.U = f11 * exp;
                            v6Var.k();
                            if (Math.abs(v6Var.U) <= 0.5f) {
                                v6Var.U = 0.0f;
                                v6Var.W = false;
                                v6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(v6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        v6 v6Var2 = this.b;
                        if (v6Var2.r && v6Var2.y && v6Var2.f != null) {
                            float min2 = v6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            v6Var2.f0 = j3;
                            if (v6Var2.D == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f12 = v6Var2.G;
                                float f13 = v6Var2.b0;
                                if (f13 == 0.0f) {
                                    f13 = -18.0f;
                                }
                                float f14 = (f13 * min2) + f12;
                                float f15 = v6Var2.d0;
                                v6Var2.G = (((1.0f - exp2) * (0.75f * f15)) + f14) % 360.0f;
                                v6Var2.d0 = f15 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + v6Var2.e0) % 6.283185307179586d;
                                v6Var2.e0 = d;
                                v6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                v6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(v6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.i0 = 1.0f;
        final int i11 = 1;
        this.j0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.r6
            public final /* synthetic */ v6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i11) {
                    case 0:
                        v6 v6Var = this.b;
                        if (v6Var.n) {
                            float min = v6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            v6Var.V = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f10 = v6Var.T;
                            float f11 = v6Var.U;
                            v6Var.T = (((1.0f - exp) * (0.55f * f11)) + f10) % 360.0f;
                            v6Var.U = f11 * exp;
                            v6Var.k();
                            if (Math.abs(v6Var.U) <= 0.5f) {
                                v6Var.U = 0.0f;
                                v6Var.W = false;
                                v6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(v6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        v6 v6Var2 = this.b;
                        if (v6Var2.r && v6Var2.y && v6Var2.f != null) {
                            float min2 = v6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            v6Var2.f0 = j3;
                            if (v6Var2.D == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f12 = v6Var2.G;
                                float f13 = v6Var2.b0;
                                if (f13 == 0.0f) {
                                    f13 = -18.0f;
                                }
                                float f14 = (f13 * min2) + f12;
                                float f15 = v6Var2.d0;
                                v6Var2.G = (((1.0f - exp2) * (0.75f * f15)) + f14) % 360.0f;
                                v6Var2.d0 = f15 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + v6Var2.e0) % 6.283185307179586d;
                                v6Var2.e0 = d;
                                v6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                v6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(v6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.l0 = new s6(this, 0);
        int L = org.telegram.messenger.g0.L(i7);
        this.a = L;
        this.b = i7;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && iz.o() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z9) {
                    t6 t6Var = new t6(this, context);
                    this.e = t6Var;
                    vg.f fVar2 = t6Var.b;
                    this.f = fVar2;
                    fVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    u6 u6Var = new u6(this, context);
                    this.d = u6Var;
                    this.f = u6Var.a;
                    this.c = u6Var;
                }
                fVar = this.f;
                if (fVar != null) {
                    fVar.z = org.telegram.ui.ActionBar.k6.Tk;
                    fVar.A = org.telegram.ui.ActionBar.k6.Uk;
                    fVar.b();
                    setIdleAnimationEnabled(false);
                }
                addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
            }
        }
        g();
        fVar = this.f;
        if (fVar != null) {
        }
        addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
    }

    public static void a(v6 v6Var) {
        if (v6Var.f == null || !v6Var.r || v6Var.y) {
            return;
        }
        v6Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(v6 v6Var, boolean z9, float f10) {
        if (z9 || f10 > 1.001f || v6Var.f == null) {
            return;
        }
        v6Var.setRenderScale(1.0f);
    }

    public static void c(v6 v6Var) {
        if (v6Var.f == null) {
            return;
        }
        v6Var.h(false);
        v6Var.k0++;
        v6Var.removeCallbacks(v6Var.l0);
        Choreographer.getInstance().removeFrameCallback(v6Var.j0);
        v6Var.f0 = 0L;
        v6Var.d0 = 0.0f;
        v6Var.m(null);
        v6Var.setIdleAnimationEnabled(false);
        v6Var.setRendererPaused(true);
        u6 u6Var = v6Var.d;
        if (u6Var != null) {
            u6Var.setPaused(true);
            u6Var.onPause();
        }
        t6 t6Var = v6Var.e;
        if (t6Var != null) {
            t6Var.o();
        }
        v6Var.removeView(v6Var.c);
        v6Var.d = null;
        v6Var.e = null;
        v6Var.f = null;
        v6Var.g();
        View view = v6Var.c;
        int i7 = v6Var.a;
        v6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
        v6Var.r = false;
        if (v6Var.b0 != 0.0f) {
            v6Var.h.getAnimatedDrawable().K(1);
        }
        v6Var.j();
        Runnable runnable = v6Var.c0;
        v6Var.c0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z9) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setIdleAnimationEnabled(z9);
        }
        t6 t6Var = this.e;
        if (t6Var != null) {
            t6Var.setIdleAnimationEnabled(z9);
        }
    }

    private void setRenderScale(float f10) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setRenderScale(f10);
        }
        if (this.e != null) {
            this.f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z9) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setPaused(z9);
        }
        t6 t6Var = this.e;
        if (t6Var != null) {
            t6Var.setPaused(z9);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            r1.g gVar = new r1.g(new r1.f(this.c.getScaleX()));
            this.J = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.m = hVar;
            this.J.f(0.001f);
            this.J.b(new p6(this, 0));
            this.J.a(new q6(this, 0));
        }
        this.J.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f;
        if (fVar == null) {
            return;
        }
        float f10 = this.G;
        float f11 = this.g0;
        float f12 = this.i0;
        fVar.d = com.google.android.recaptcha.internal.a.z(1.0f, f12, f11, f10);
        fVar.i = com.google.android.recaptcha.internal.a.z(1.0f, f12, this.h0, this.H);
    }

    public final void f(v6 v6Var) {
        vg.f fVar;
        if (v6Var == null || (fVar = v6Var.f) == null || this.f == null) {
            return;
        }
        this.G = fVar.d;
        this.H = fVar.i;
        e();
    }

    public final void g() {
        ch0 ch0Var = new ch0(getContext());
        this.h = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ch0 ch0Var2 = this.h;
        int i7 = this.b;
        ch0Var2.f(R.raw.wallet_diamond_blue, i7, i7, null);
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

    public final void h(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.f != null) {
                if (z9) {
                    this.g0 = (float) Math.IEEEremainder(r0.d - this.G, 360.0d);
                    this.h0 = (float) Math.IEEEremainder(this.f.i - this.H, 360.0d);
                    this.i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(xq.h);
                    this.I.addUpdateListener(new q3(this, 4));
                    this.I.addListener(new s81(this, 9));
                    this.I.start();
                } else {
                    this.i0 = 1.0f;
                    this.h0 = 0.0f;
                    this.g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z9 && (valueAnimator = this.I) != null) {
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
        if (z9) {
            d(1.0f);
            return;
        }
        r1.g gVar = this.J;
        if (gVar != null) {
            gVar.d();
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
            u6 u6Var = this.d;
            if (u6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                u6Var.J = max;
                u6Var.a.h = u6Var.I / max;
                u6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f;
            this.G = fVar.d;
            this.H = fVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                r6 r6Var = this.j0;
                choreographer.removeFrameCallback(r6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(r6Var);
            }
        }
    }

    public final void j() {
        boolean z9 = !this.s && this.n && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.r == z9) {
            return;
        }
        this.r = z9;
        if (!z9) {
            h(false);
        }
        int i7 = this.k0 + 1;
        this.k0 = i7;
        if (this.f == null) {
            ch0 ch0Var = this.h;
            if (ch0Var != null) {
                if (!z9) {
                    this.x = ch0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.w || this.x) {
                        ch0Var.d();
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
            r6 r6Var = this.j0;
            if (z9) {
                Choreographer.getInstance().removeFrameCallback(r6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(r6Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(r6Var);
                this.f0 = 0L;
                this.d0 = 0.0f;
            }
        } else if (z9) {
            vg.f fVar = this.f;
            fVar.d = 0.0f;
            fVar.i = 0.0f;
            m(new g2(this, i7, 2));
        }
        setRendererPaused(!z9);
    }

    public final void k() {
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.f = this.T + this.L;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.c0 = runnable;
        if (this.f != null) {
            m(new s6(this, 1));
        } else if (runnable != null) {
            post(new s6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.w = runnable;
            if (u6Var.s && runnable != null) {
                u6Var.w = null;
                runnable.run();
            }
        }
        t6 t6Var = this.e;
        if (t6Var != null) {
            t6Var.a0 = runnable;
            if (!t6Var.W || runnable == null) {
                return;
            }
            t6Var.a0 = null;
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
        r1.g gVar = this.O;
        if (gVar != null) {
            gVar.d();
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
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
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
                float f10 = 0.8f / org.telegram.messenger.g0.p;
                vg.f fVar = this.f;
                fVar.d = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.E, f10, fVar.d);
                vg.f fVar2 = this.f;
                fVar2.i = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.F, f10, fVar2.i);
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
                    int i7 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.D = motionEvent.getPointerId(i7);
                    this.E = motionEvent.getX(i7);
                    this.F = motionEvent.getY(i7);
                }
                return true;
            }
        }
        h(true);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        j();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.b0 = f10;
        i();
        setEnabled(false);
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.K = f10;
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.g = f10 + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(f10 + this.M);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (z9) {
            return;
        }
        h(false);
    }

    public void setHeaderTilt(float f10) {
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f - f10;
        float f12 = (2.0f * f11) + 1.0f;
        this.c.setScaleX(f12);
        this.c.setScaleY(f12);
        if (this.f != null) {
            setRenderScale(f12 > 1.0f ? 3.5f : 1.0f);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.g = this.K + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z9) {
        this.s = z9;
        j();
    }

    public void setStarParticlesView(ug.q1 q1Var) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setStarParticlesView(q1Var);
        }
        t6 t6Var = this.e;
        if (t6Var != null) {
            t6Var.setStarParticlesView(q1Var);
        }
    }
}
