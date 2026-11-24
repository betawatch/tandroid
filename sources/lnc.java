// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lnc extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public yla K;
    public float L;
    public float M;
    public float N;
    public float O;
    public yla P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int a;
    public boolean a0;
    public final short b;
    public final hnc b0;
    public View c;
    public float c0;
    public knc d;
    public Runnable d0;
    public jnc e;
    public float e0;
    public uq4 f;
    public double f0;
    public long g0;
    public ry8 h;
    public float h0;
    public float i0;
    public float j0;
    public final hnc k0;
    public int l0;
    public final inc m0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
    /* JADX WARN: Type inference failed for: r0v1, types: [hnc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hnc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lnc(int i, Context context, boolean z) {
        super(context);
        uq4 uq4Var;
        this.E = -1;
        final byte b = 0;
        this.b0 = new Choreographer.FrameCallback(this) { // from class: hnc
            public final /* synthetic */ lnc b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                byte b2 = b;
                lnc lncVar = this.b;
                switch (b2) {
                    case 0:
                        if (lncVar.n) {
                            float min = lncVar.W == 0 ? 0.016666668f : Math.min(0.05f, (j - r8) / 1.0E9f);
                            lncVar.W = j;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f = lncVar.U;
                            float f2 = lncVar.V;
                            lncVar.U = (((1.0f - exp) * (0.55f * f2)) + f) % 360.0f;
                            lncVar.V = f2 * exp;
                            lncVar.k();
                            if (Math.abs(lncVar.V) <= 0.5f) {
                                lncVar.V = 0.0f;
                                lncVar.a0 = false;
                                lncVar.W = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(lncVar.b0);
                                break;
                            }
                        }
                        break;
                    default:
                        if (lncVar.r && lncVar.y && lncVar.f != null) {
                            float min2 = lncVar.g0 == 0 ? 0.0f : Math.min(0.05f, (j - r8) / 1.0E9f);
                            lncVar.g0 = j;
                            if (lncVar.E == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f3 = lncVar.H;
                                float f4 = lncVar.c0;
                                if (f4 == 0.0f) {
                                    f4 = -18.0f;
                                }
                                float f5 = (f4 * min2) + f3;
                                float f6 = lncVar.e0;
                                lncVar.H = (((1.0f - exp2) * (0.75f * f6)) + f5) % 360.0f;
                                lncVar.e0 = f6 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + lncVar.f0) % 6.283185307179586d;
                                lncVar.f0 = d;
                                lncVar.I = ((float) Math.sin(d)) * 9.0f;
                                lncVar.b();
                            }
                            Choreographer.getInstance().postFrameCallback(lncVar.k0);
                            break;
                        }
                        break;
                }
            }
        };
        this.j0 = 1.0f;
        final byte b2 = 1;
        this.k0 = new Choreographer.FrameCallback(this) { // from class: hnc
            public final /* synthetic */ lnc b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                byte b22 = b2;
                lnc lncVar = this.b;
                switch (b22) {
                    case 0:
                        if (lncVar.n) {
                            float min = lncVar.W == 0 ? 0.016666668f : Math.min(0.05f, (j - r8) / 1.0E9f);
                            lncVar.W = j;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f = lncVar.U;
                            float f2 = lncVar.V;
                            lncVar.U = (((1.0f - exp) * (0.55f * f2)) + f) % 360.0f;
                            lncVar.V = f2 * exp;
                            lncVar.k();
                            if (Math.abs(lncVar.V) <= 0.5f) {
                                lncVar.V = 0.0f;
                                lncVar.a0 = false;
                                lncVar.W = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(lncVar.b0);
                                break;
                            }
                        }
                        break;
                    default:
                        if (lncVar.r && lncVar.y && lncVar.f != null) {
                            float min2 = lncVar.g0 == 0 ? 0.0f : Math.min(0.05f, (j - r8) / 1.0E9f);
                            lncVar.g0 = j;
                            if (lncVar.E == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f3 = lncVar.H;
                                float f4 = lncVar.c0;
                                if (f4 == 0.0f) {
                                    f4 = -18.0f;
                                }
                                float f5 = (f4 * min2) + f3;
                                float f6 = lncVar.e0;
                                lncVar.H = (((1.0f - exp2) * (0.75f * f6)) + f5) % 360.0f;
                                lncVar.e0 = f6 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + lncVar.f0) % 6.283185307179586d;
                                lncVar.f0 = d;
                                lncVar.I = ((float) Math.sin(d)) * 9.0f;
                                lncVar.b();
                            }
                            Choreographer.getInstance().postFrameCallback(lncVar.k0);
                            break;
                        }
                        break;
                }
            }
        };
        this.m0 = new inc(this, (byte) 0);
        int L = gl.L(i);
        this.a = L;
        this.b = i;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && gba.o() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z) {
                    jnc jncVar = new jnc(this, context);
                    this.e = jncVar;
                    uq4 uq4Var2 = jncVar.b;
                    this.f = uq4Var2;
                    uq4Var2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    knc kncVar = new knc(this, context);
                    this.d = kncVar;
                    this.f = kncVar.a;
                    this.c = kncVar;
                }
                uq4Var = this.f;
                if (uq4Var != null) {
                    uq4Var.z = bkb.Vk;
                    uq4Var.A = bkb.Wk;
                    uq4Var.b();
                    setIdleAnimationEnabled(false);
                }
                addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
            }
        }
        d();
        uq4Var = this.f;
        if (uq4Var != null) {
        }
        addView(this.c, new FrameLayout.LayoutParams(L, L, 17));
    }

    private void setIdleAnimationEnabled(boolean z) {
        knc kncVar = this.d;
        if (kncVar != null) {
            kncVar.setIdleAnimationEnabled(z);
        }
        jnc jncVar = this.e;
        if (jncVar != null) {
            jncVar.setIdleAnimationEnabled(z);
        }
    }

    private void setRenderScale(float f) {
        knc kncVar = this.d;
        if (kncVar != null) {
            kncVar.setRenderScale(f);
        }
        if (this.e != null) {
            this.f.h = f / 3.5f;
        }
    }

    private void setRendererPaused(boolean z) {
        knc kncVar = this.d;
        if (kncVar != null) {
            kncVar.setPaused(z);
        }
        jnc jncVar = this.e;
        if (jncVar != null) {
            jncVar.setPaused(z);
        }
    }

    public final void a(float f) {
        if (f > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            yla ylaVar = new yla(new ti4(this.c.getScaleX()));
            this.K = ylaVar;
            zla zlaVar = new zla(f);
            zlaVar.a(0.55f);
            zlaVar.b(280.0f);
            ylaVar.m = zlaVar;
            this.K.f(0.001f);
            this.K.b(new gnc(this, (byte) 0));
            this.K.a(new zv0(this, (byte) 12));
        }
        this.K.c(f);
    }

    public final void b() {
        uq4 uq4Var = this.f;
        if (uq4Var == null) {
            return;
        }
        float f = this.H;
        float f2 = this.h0;
        float f3 = this.j0;
        uq4Var.d = tb4.A(1.0f, f3, f2, f);
        uq4Var.i = tb4.A(1.0f, f3, this.i0, this.I);
    }

    public final void c(lnc lncVar) {
        uq4 uq4Var;
        if (lncVar == null || (uq4Var = lncVar.f) == null || this.f == null) {
            return;
        }
        this.H = uq4Var.d;
        this.I = uq4Var.i;
        b();
    }

    public final void d() {
        ry8 ry8Var = new ry8(getContext());
        this.h = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ry8 ry8Var2 = this.h;
        short s = this.b;
        ry8Var2.f(R.raw.wallet_diamond_blue, s, s, null);
        this.h.getAnimatedDrawable().F(0);
        this.c = this.h;
        setOnClickListener(new bna(this, (byte) 27));
        setClickable(!this.y);
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.f != null) {
                if (z) {
                    this.h0 = (float) Math.IEEEremainder(r0.d - this.H, 360.0d);
                    this.i0 = (float) Math.IEEEremainder(this.f.i - this.I, 360.0d);
                    this.j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(s33.h);
                    this.J.addUpdateListener(new uwb(this, (byte) 12));
                    this.J.addListener(new iab(this, (byte) 29));
                    this.J.start();
                } else {
                    this.j0 = 1.0f;
                    this.i0 = 0.0f;
                    this.h0 = 0.0f;
                    b();
                }
            }
        }
        if (!z && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.j0 = 1.0f;
            this.i0 = 0.0f;
            this.h0 = 0.0f;
            b();
        }
        if (this.c != null) {
            if (z) {
                a(1.0f);
                return;
            }
            yla ylaVar = this.K;
            if (ylaVar != null) {
                ylaVar.d();
                this.K = null;
            }
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            if (this.f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final /* synthetic */ void f(boolean z, float f) {
        if (z || f > 1.001f || this.f == null) {
            return;
        }
        setRenderScale(1.0f);
    }

    public final void g() {
        this.y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f != null) {
            knc kncVar = this.d;
            if (kncVar != null) {
                kncVar.K = 3.5f;
                kncVar.a.h = kncVar.J / 3.5f;
                kncVar.f();
            }
            setIdleAnimationEnabled(false);
            uq4 uq4Var = this.f;
            this.H = uq4Var.d;
            this.I = uq4Var.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                hnc hncVar = this.k0;
                choreographer.removeFrameCallback(hncVar);
                this.g0 = 0L;
                Choreographer.getInstance().postFrameCallback(hncVar);
            }
        }
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        if (this.f == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(r2.i + r2.j);
    }

    public float getFlightYaw() {
        if (this.f == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(r2.d + r2.f);
    }

    public final void h() {
        if (this.f != null) {
            e(false);
            this.l0++;
            removeCallbacks(this.m0);
            Choreographer.getInstance().removeFrameCallback(this.k0);
            this.g0 = 0L;
            this.e0 = 0.0f;
            m(null);
            setIdleAnimationEnabled(false);
            setRendererPaused(true);
            knc kncVar = this.d;
            if (kncVar != null) {
                kncVar.setPaused(true);
                kncVar.onPause();
            }
            jnc jncVar = this.e;
            if (jncVar != null) {
                jncVar.o();
            }
            removeView(this.c);
            this.d = null;
            this.e = null;
            this.f = null;
            d();
            View view = this.c;
            int i = this.a;
            addView(view, new FrameLayout.LayoutParams(i, i, 17));
            this.r = false;
            if (this.c0 != 0.0f) {
                this.h.getAnimatedDrawable().F(1);
            }
            j();
            Runnable runnable = this.d0;
            this.d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i() {
        if (this.f == null || !this.r || this.y) {
            return;
        }
        setIdleAnimationEnabled(true);
    }

    public final void j() {
        boolean z = !this.s && this.n && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.r != z) {
            this.r = z;
            if (!z) {
                e(false);
            }
            int i = this.l0 + 1;
            this.l0 = i;
            if (this.f == null) {
                ry8 ry8Var = this.h;
                if (ry8Var != null) {
                    if (!z) {
                        this.x = ry8Var.b();
                        this.h.i();
                        return;
                    } else {
                        if (!this.w || this.x) {
                            ry8Var.d();
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
                hnc hncVar = this.k0;
                if (z) {
                    Choreographer.getInstance().removeFrameCallback(hncVar);
                    this.g0 = 0L;
                    Choreographer.getInstance().postFrameCallback(hncVar);
                } else {
                    Choreographer.getInstance().removeFrameCallback(hncVar);
                    this.g0 = 0L;
                    this.e0 = 0.0f;
                }
            } else if (z) {
                uq4 uq4Var = this.f;
                uq4Var.d = 0.0f;
                uq4Var.i = 0.0f;
                m(new on7((Object) this, i, (byte) 26));
            }
            setRendererPaused(!z);
        }
    }

    public final void k() {
        uq4 uq4Var = this.f;
        if (uq4Var != null) {
            uq4Var.f = this.U + this.M;
            return;
        }
        ry8 ry8Var = this.h;
        if (ry8Var != null) {
            ry8Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.d0 = runnable;
        if (this.f != null) {
            m(new inc(this, (byte) 1));
        } else if (runnable != null) {
            post(new inc(this, (byte) 1));
        }
    }

    public final void m(Runnable runnable) {
        knc kncVar = this.d;
        if (kncVar != null) {
            kncVar.w = runnable;
            if (kncVar.s && runnable != null) {
                kncVar.w = null;
                runnable.run();
            }
        }
        jnc jncVar = this.e;
        if (jncVar != null) {
            jncVar.b0 = runnable;
            if (!jncVar.a0 || runnable == null) {
                return;
            }
            jncVar.b0 = null;
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
        yla ylaVar = this.P;
        if (ylaVar != null) {
            ylaVar.d();
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
    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int i3 = this.a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i3, i);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i3, i2);
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
            a(3.0f);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex < 0) {
                    e(true);
                    return true;
                }
                float f = 0.8f / gl.p;
                uq4 uq4Var = this.f;
                uq4Var.d = tb4.A(motionEvent.getX(findPointerIndex), this.F, f, uq4Var.d);
                uq4 uq4Var2 = this.f;
                uq4Var2.i = tb4.A(motionEvent.getY(findPointerIndex), this.G, f, uq4Var2.i);
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
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.E = motionEvent.getPointerId(i);
                    this.F = motionEvent.getX(i);
                    this.G = motionEvent.getY(i);
                }
                return true;
            }
        }
        e(true);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        j();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        j();
    }

    public void setContinuousRotation(float f) {
        this.c0 = f;
        g();
        setEnabled(false);
        ry8 ry8Var = this.h;
        if (ry8Var != null) {
            ry8Var.getAnimatedDrawable().F(1);
        }
    }

    public void setConversionWobble(float f) {
        this.L = f;
        uq4 uq4Var = this.f;
        if (uq4Var != null) {
            uq4Var.g = f + this.N;
            return;
        }
        ry8 ry8Var = this.h;
        if (ry8Var != null) {
            ry8Var.setRotation(f + this.N);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        e(false);
    }

    public void setHeaderTilt(float f) {
        uq4 uq4Var = this.f;
        if (uq4Var != null) {
            uq4Var.j = f;
        }
    }

    public void setIntroProgress(float f) {
        float f2 = 1.0f - f;
        float f3 = (2.0f * f2) + 1.0f;
        this.c.setScaleX(f3);
        this.c.setScaleY(f3);
        if (this.f != null) {
            setRenderScale(f3 > 1.0f ? 3.5f : 1.0f);
        }
        this.M = f2 * (-720.0f);
        this.N = ((float) Math.sin(f * 3.141592653589793d)) * 35.0f;
        k();
        uq4 uq4Var = this.f;
        if (uq4Var != null) {
            uq4Var.g = this.L + this.N;
            return;
        }
        ry8 ry8Var = this.h;
        if (ry8Var != null) {
            ry8Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z) {
        this.s = z;
        j();
    }

    public void setStarParticlesView(cra craVar) {
        knc kncVar = this.d;
        if (kncVar != null) {
            kncVar.setStarParticlesView(craVar);
        }
        jnc jncVar = this.e;
        if (jncVar != null) {
            jncVar.setStarParticlesView(craVar);
        }
    }
}
