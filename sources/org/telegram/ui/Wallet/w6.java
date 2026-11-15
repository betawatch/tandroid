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
import org.telegram.messenger.gz;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.g71;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class w6 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public r1.g K;
    public float L;
    public float M;
    public float N;
    public float O;
    public r1.g P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int a;
    public boolean a0;
    public final int b;
    public final s6 b0;
    public View c;
    public float c0;
    public v6 d;
    public Runnable d0;
    public u6 e;
    public float e0;
    public vg.f f;
    public double f0;
    public long g0;
    public fh0 h;
    public float h0;
    public float i0;
    public float j0;
    public final s6 k0;
    public int l0;
    public final t6 m0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.s6] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.s6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w6(int i7, Context context, boolean z10) {
        super(context);
        vg.f fVar;
        this.E = -1;
        final int i10 = 0;
        this.b0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.s6
            public final /* synthetic */ w6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i10) {
                    case 0:
                        w6 w6Var = this.b;
                        if (w6Var.n) {
                            float min = w6Var.W == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            w6Var.W = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f10 = w6Var.U;
                            float f11 = w6Var.V;
                            w6Var.U = (((1.0f - exp) * (0.55f * f11)) + f10) % 360.0f;
                            w6Var.V = f11 * exp;
                            w6Var.k();
                            if (Math.abs(w6Var.V) <= 0.5f) {
                                w6Var.V = 0.0f;
                                w6Var.a0 = false;
                                w6Var.W = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(w6Var.b0);
                                break;
                            }
                        }
                        break;
                    default:
                        w6 w6Var2 = this.b;
                        if (w6Var2.r && w6Var2.y && w6Var2.f != null) {
                            float min2 = w6Var2.g0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            w6Var2.g0 = j3;
                            if (w6Var2.E == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f12 = w6Var2.H;
                                float f13 = w6Var2.c0;
                                if (f13 == 0.0f) {
                                    f13 = -18.0f;
                                }
                                float f14 = (f13 * min2) + f12;
                                float f15 = w6Var2.e0;
                                w6Var2.H = (((1.0f - exp2) * (0.75f * f15)) + f14) % 360.0f;
                                w6Var2.e0 = f15 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + w6Var2.f0) % 6.283185307179586d;
                                w6Var2.f0 = d;
                                w6Var2.I = ((float) Math.sin(d)) * 9.0f;
                                w6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(w6Var2.k0);
                            break;
                        }
                        break;
                }
            }
        };
        this.j0 = 1.0f;
        final int i11 = 1;
        this.k0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.s6
            public final /* synthetic */ w6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                switch (i11) {
                    case 0:
                        w6 w6Var = this.b;
                        if (w6Var.n) {
                            float min = w6Var.W == 0 ? 0.016666668f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            w6Var.W = j3;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f10 = w6Var.U;
                            float f11 = w6Var.V;
                            w6Var.U = (((1.0f - exp) * (0.55f * f11)) + f10) % 360.0f;
                            w6Var.V = f11 * exp;
                            w6Var.k();
                            if (Math.abs(w6Var.V) <= 0.5f) {
                                w6Var.V = 0.0f;
                                w6Var.a0 = false;
                                w6Var.W = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(w6Var.b0);
                                break;
                            }
                        }
                        break;
                    default:
                        w6 w6Var2 = this.b;
                        if (w6Var2.r && w6Var2.y && w6Var2.f != null) {
                            float min2 = w6Var2.g0 == 0 ? 0.0f : Math.min(0.05f, (j3 - r1) / 1.0E9f);
                            w6Var2.g0 = j3;
                            if (w6Var2.E == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f12 = w6Var2.H;
                                float f13 = w6Var2.c0;
                                if (f13 == 0.0f) {
                                    f13 = -18.0f;
                                }
                                float f14 = (f13 * min2) + f12;
                                float f15 = w6Var2.e0;
                                w6Var2.H = (((1.0f - exp2) * (0.75f * f15)) + f14) % 360.0f;
                                w6Var2.e0 = f15 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + w6Var2.f0) % 6.283185307179586d;
                                w6Var2.f0 = d;
                                w6Var2.I = ((float) Math.sin(d)) * 9.0f;
                                w6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(w6Var2.k0);
                            break;
                        }
                        break;
                }
            }
        };
        this.m0 = new t6(this, 0);
        int L = org.telegram.messenger.g0.L(i7);
        this.a = L;
        this.b = i7;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && gz.o() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z10) {
                    u6 u6Var = new u6(this, context);
                    this.e = u6Var;
                    vg.f fVar2 = u6Var.b;
                    this.f = fVar2;
                    fVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    v6 v6Var = new v6(this, context);
                    this.d = v6Var;
                    this.f = v6Var.a;
                    this.c = v6Var;
                }
                fVar = this.f;
                if (fVar != null) {
                    fVar.z = org.telegram.ui.ActionBar.j6.Wk;
                    fVar.A = org.telegram.ui.ActionBar.j6.Xk;
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

    public static void a(w6 w6Var) {
        if (w6Var.f == null || !w6Var.r || w6Var.y) {
            return;
        }
        w6Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(w6 w6Var, boolean z10, float f10) {
        if (z10 || f10 > 1.001f || w6Var.f == null) {
            return;
        }
        w6Var.setRenderScale(1.0f);
    }

    public static void c(w6 w6Var) {
        if (w6Var.f == null) {
            return;
        }
        w6Var.h(false);
        w6Var.l0++;
        w6Var.removeCallbacks(w6Var.m0);
        Choreographer.getInstance().removeFrameCallback(w6Var.k0);
        w6Var.g0 = 0L;
        w6Var.e0 = 0.0f;
        w6Var.m(null);
        w6Var.setIdleAnimationEnabled(false);
        w6Var.setRendererPaused(true);
        v6 v6Var = w6Var.d;
        if (v6Var != null) {
            v6Var.setPaused(true);
            v6Var.onPause();
        }
        u6 u6Var = w6Var.e;
        if (u6Var != null) {
            u6Var.o();
        }
        w6Var.removeView(w6Var.c);
        w6Var.d = null;
        w6Var.e = null;
        w6Var.f = null;
        w6Var.g();
        View view = w6Var.c;
        int i7 = w6Var.a;
        w6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
        w6Var.r = false;
        if (w6Var.c0 != 0.0f) {
            w6Var.h.getAnimatedDrawable().K(1);
        }
        w6Var.j();
        Runnable runnable = w6Var.d0;
        w6Var.d0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setIdleAnimationEnabled(z10);
        }
        u6 u6Var = this.e;
        if (u6Var != null) {
            u6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setRenderScale(f10);
        }
        if (this.e != null) {
            this.f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setPaused(z10);
        }
        u6 u6Var = this.e;
        if (u6Var != null) {
            u6Var.setPaused(z10);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            r1.g gVar = new r1.g(new r1.f(this.c.getScaleX()));
            this.K = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.m = hVar;
            this.K.f(0.001f);
            this.K.b(new q6(this, 0));
            this.K.a(new r6(this, 0));
        }
        this.K.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f;
        if (fVar == null) {
            return;
        }
        float f10 = this.H;
        float f11 = this.h0;
        float f12 = this.j0;
        fVar.d = com.google.android.gms.internal.vision.e2.z(1.0f, f12, f11, f10);
        fVar.i = com.google.android.gms.internal.vision.e2.z(1.0f, f12, this.i0, this.I);
    }

    public final void f(w6 w6Var) {
        vg.f fVar;
        if (w6Var == null || (fVar = w6Var.f) == null || this.f == null) {
            return;
        }
        this.H = fVar.d;
        this.I = fVar.i;
        e();
    }

    public final void g() {
        fh0 fh0Var = new fh0(getContext());
        this.h = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fh0 fh0Var2 = this.h;
        int i7 = this.b;
        fh0Var2.f(R.raw.wallet_diamond_blue, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.c = this.h;
        setOnClickListener(new g3(this, 4));
        setClickable(!this.y);
    }

    public float getConversionWobble() {
        return this.L;
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
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.f != null) {
                if (z10) {
                    this.h0 = (float) Math.IEEEremainder(r0.d - this.H, 360.0d);
                    this.i0 = (float) Math.IEEEremainder(this.f.i - this.I, 360.0d);
                    this.j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(er.h);
                    this.J.addUpdateListener(new q3(this, 4));
                    this.J.addListener(new g71(this, 10));
                    this.J.start();
                } else {
                    this.j0 = 1.0f;
                    this.i0 = 0.0f;
                    this.h0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.j0 = 1.0f;
            this.i0 = 0.0f;
            this.h0 = 0.0f;
            e();
        }
        if (this.c == null) {
            return;
        }
        if (z10) {
            d(1.0f);
            return;
        }
        r1.g gVar = this.K;
        if (gVar != null) {
            gVar.d();
            this.K = null;
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
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f != null) {
            v6 v6Var = this.d;
            if (v6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                v6Var.K = max;
                v6Var.a.h = v6Var.J / max;
                v6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f;
            this.H = fVar.d;
            this.I = fVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                s6 s6Var = this.k0;
                choreographer.removeFrameCallback(s6Var);
                this.g0 = 0L;
                Choreographer.getInstance().postFrameCallback(s6Var);
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
        int i7 = this.l0 + 1;
        this.l0 = i7;
        if (this.f == null) {
            fh0 fh0Var = this.h;
            if (fh0Var != null) {
                if (!z10) {
                    this.x = fh0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.w || this.x) {
                        fh0Var.d();
                    }
                    this.w = true;
                    return;
                }
            }
            return;
        }
        removeCallbacks(this.m0);
        setIdleAnimationEnabled(false);
        if (this.y) {
            s6 s6Var = this.k0;
            if (z10) {
                Choreographer.getInstance().removeFrameCallback(s6Var);
                this.g0 = 0L;
                Choreographer.getInstance().postFrameCallback(s6Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(s6Var);
                this.g0 = 0L;
                this.e0 = 0.0f;
            }
        } else if (z10) {
            vg.f fVar = this.f;
            fVar.d = 0.0f;
            fVar.i = 0.0f;
            m(new nb1(this, i7, 5));
        }
        setRendererPaused(!z10);
    }

    public final void k() {
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.f = this.U + this.M;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.d0 = runnable;
        if (this.f != null) {
            m(new t6(this, 1));
        } else if (runnable != null) {
            post(new t6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.w = runnable;
            if (v6Var.s && runnable != null) {
                v6Var.w = null;
                runnable.run();
            }
        }
        u6 u6Var = this.e;
        if (u6Var != null) {
            u6Var.b0 = runnable;
            if (!u6Var.a0 || runnable == null) {
                return;
            }
            u6Var.b0 = null;
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
        Choreographer.getInstance().removeFrameCallback(this.b0);
        r1.g gVar = this.P;
        if (gVar != null) {
            gVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.a0 = false;
        this.T = false;
        this.W = 0L;
        this.V = 0.0f;
        this.U = 0.0f;
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
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            this.e0 = 0.0f;
            this.E = motionEvent.getPointerId(0);
            this.F = motionEvent.getX();
            this.G = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            d(3.0f);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex < 0) {
                    h(true);
                    return true;
                }
                float f10 = 0.8f / org.telegram.messenger.g0.p;
                vg.f fVar = this.f;
                fVar.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.F, f10, fVar.d);
                vg.f fVar2 = this.f;
                fVar2.i = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.G, f10, fVar2.i);
                this.F = motionEvent.getX(findPointerIndex);
                this.G = motionEvent.getY(findPointerIndex);
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    if (this.E == -1) {
                        return false;
                    }
                } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                    int i7 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.E = motionEvent.getPointerId(i7);
                    this.F = motionEvent.getX(i7);
                    this.G = motionEvent.getY(i7);
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
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.c0 = f10;
        i();
        setEnabled(false);
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.L = f10;
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.g = f10 + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(f10 + this.N);
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
        this.M = f11 * (-720.0f);
        this.N = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.g = this.L + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z10) {
        this.s = z10;
        j();
    }

    public void setStarParticlesView(ug.s1 s1Var) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setStarParticlesView(s1Var);
        }
        u6 u6Var = this.e;
        if (u6Var != null) {
            u6Var.setStarParticlesView(s1Var);
        }
    }
}
