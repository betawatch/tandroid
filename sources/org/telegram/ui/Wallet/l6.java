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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.fc1;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
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
    public final h6 a0;
    public final int b;
    public float b0;
    public View c;
    public Runnable c0;
    public k6 d;
    public float d0;
    public j6 e;
    public double e0;
    public ug.g f;
    public long f0;
    public float g0;
    public ak0 h;
    public float h0;
    public float i0;
    public final h6 j0;
    public int k0;
    public final i6 l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.h6] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.h6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l6(int i10, Context context, boolean z10) {
        super(context);
        ug.g gVar;
        this.y = -1;
        final int i11 = 0;
        this.a0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.h6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i11) {
                    case 0:
                        l6 l6Var = this.b;
                        if (l6Var.n) {
                            float min = l6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            l6Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = l6Var.T;
                            float f10 = l6Var.U;
                            l6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            l6Var.U = f10 * exp;
                            l6Var.k();
                            if (Math.abs(l6Var.U) <= 0.5f) {
                                l6Var.U = 0.0f;
                                l6Var.W = false;
                                l6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(l6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        l6 l6Var2 = this.b;
                        if (l6Var2.r && l6Var2.x && l6Var2.f != null) {
                            float min2 = l6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            l6Var2.f0 = j10;
                            if (l6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = l6Var2.G;
                                float f12 = l6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = l6Var2.d0;
                                l6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                l6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + l6Var2.e0) % 6.283185307179586d;
                                l6Var2.e0 = d;
                                l6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                l6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(l6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.i0 = 1.0f;
        final int i12 = 1;
        this.j0 = new Choreographer.FrameCallback(this) { // from class: org.telegram.ui.Wallet.h6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                switch (i12) {
                    case 0:
                        l6 l6Var = this.b;
                        if (l6Var.n) {
                            float min = l6Var.V == 0 ? 0.016666668f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            l6Var.V = j10;
                            float exp = (float) Math.exp((-min) / 0.55f);
                            float f7 = l6Var.T;
                            float f10 = l6Var.U;
                            l6Var.T = (((1.0f - exp) * (0.55f * f10)) + f7) % 360.0f;
                            l6Var.U = f10 * exp;
                            l6Var.k();
                            if (Math.abs(l6Var.U) <= 0.5f) {
                                l6Var.U = 0.0f;
                                l6Var.W = false;
                                l6Var.V = 0L;
                                break;
                            } else {
                                Choreographer.getInstance().postFrameCallback(l6Var.a0);
                                break;
                            }
                        }
                        break;
                    default:
                        l6 l6Var2 = this.b;
                        if (l6Var2.r && l6Var2.x && l6Var2.f != null) {
                            float min2 = l6Var2.f0 == 0 ? 0.0f : Math.min(0.05f, (j10 - r1) / 1.0E9f);
                            l6Var2.f0 = j10;
                            if (l6Var2.y == -1) {
                                float exp2 = (float) Math.exp((-min2) / 0.75f);
                                float f11 = l6Var2.G;
                                float f12 = l6Var2.b0;
                                if (f12 == 0.0f) {
                                    f12 = -18.0f;
                                }
                                float f13 = (f12 * min2) + f11;
                                float f14 = l6Var2.d0;
                                l6Var2.G = (((1.0f - exp2) * (0.75f * f14)) + f13) % 360.0f;
                                l6Var2.d0 = f14 * exp2;
                                double d = ((((min2 * 3.141592653589793d) * 2.0d) / 8.0d) + l6Var2.e0) % 6.283185307179586d;
                                l6Var2.e0 = d;
                                l6Var2.H = ((float) Math.sin(d)) * 9.0f;
                                l6Var2.e();
                            }
                            Choreographer.getInstance().postFrameCallback(l6Var2.j0);
                            break;
                        }
                        break;
                }
            }
        };
        this.l0 = new i6(this, 0);
        int dp = AndroidUtilities.dp(i10);
        this.a = dp;
        this.b = i10;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ((powerManager == null || !powerManager.isPowerSaveMode()) && SharedConfig.getDevicePerformanceClass() != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager == null ? null : activityManager.getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null && deviceConfigurationInfo.reqGlEsVersion >= 196608) {
                if (z10) {
                    j6 j6Var = new j6(this, context);
                    this.e = j6Var;
                    ug.g gVar2 = j6Var.b;
                    this.f = gVar2;
                    gVar2.h = 0.2857143f;
                    this.c = this.e;
                } else {
                    k6 k6Var = new k6(this, context);
                    this.d = k6Var;
                    this.f = k6Var.a;
                    this.c = k6Var;
                }
                gVar = this.f;
                if (gVar != null) {
                    gVar.z = org.telegram.ui.ActionBar.y6.fk;
                    gVar.A = org.telegram.ui.ActionBar.y6.gk;
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

    public static void a(l6 l6Var) {
        if (l6Var.f == null || !l6Var.r || l6Var.x) {
            return;
        }
        l6Var.setIdleAnimationEnabled(true);
    }

    public static /* synthetic */ void b(l6 l6Var, boolean z10, float f7) {
        if (z10 || f7 > 1.001f || l6Var.f == null) {
            return;
        }
        l6Var.setRenderScale(1.0f);
    }

    public static void c(l6 l6Var) {
        if (l6Var.f == null) {
            return;
        }
        l6Var.h(false);
        l6Var.k0++;
        l6Var.removeCallbacks(l6Var.l0);
        Choreographer.getInstance().removeFrameCallback(l6Var.j0);
        l6Var.f0 = 0L;
        l6Var.d0 = 0.0f;
        l6Var.m(null);
        l6Var.setIdleAnimationEnabled(false);
        l6Var.setRendererPaused(true);
        k6 k6Var = l6Var.d;
        if (k6Var != null) {
            k6Var.setPaused(true);
            k6Var.onPause();
        }
        j6 j6Var = l6Var.e;
        if (j6Var != null) {
            j6Var.o();
        }
        l6Var.removeView(l6Var.c);
        l6Var.d = null;
        l6Var.e = null;
        l6Var.f = null;
        l6Var.g();
        View view = l6Var.c;
        int i10 = l6Var.a;
        l6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
        l6Var.r = false;
        if (l6Var.b0 != 0.0f) {
            l6Var.h.getAnimatedDrawable().K(1);
        }
        l6Var.j();
        Runnable runnable = l6Var.c0;
        l6Var.c0 = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setIdleAnimationEnabled(z10);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setPaused(z10);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.j jVar = new o1.j(new ac.a(this.c.getScaleX()));
            this.J = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.u = kVar;
            this.J.e(0.001f);
            this.J.b(new f6(this, 0));
            this.J.a(new g6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        ug.g gVar = this.f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.g0;
        float f11 = this.i0;
        gVar.d = c3.h0.z(1.0f, f11, f10, f7);
        gVar.i = c3.h0.z(1.0f, f11, this.h0, this.H);
    }

    public final void f(l6 l6Var) {
        ug.g gVar;
        if (l6Var == null || (gVar = l6Var.f) == null || this.f == null) {
            return;
        }
        this.G = gVar.d;
        this.H = gVar.i;
        e();
    }

    public final void g() {
        ak0 ak0Var = new ak0(getContext());
        this.h = ak0Var;
        ak0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ak0 ak0Var2 = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.b;
        ak0Var2.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.c = this.h;
        setOnClickListener(new s2(this, 4));
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
                    this.I.setInterpolator(ds.h);
                    this.I.addUpdateListener(new a3(this, 4));
                    this.I.addListener(new fc1(this, 10));
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
            jVar.c();
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
            k6 k6Var = this.d;
            if (k6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                k6Var.J = max;
                k6Var.a.h = k6Var.I / max;
                k6Var.f();
            }
            setIdleAnimationEnabled(false);
            ug.g gVar = this.f;
            this.G = gVar.d;
            this.H = gVar.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                h6 h6Var = this.j0;
                choreographer.removeFrameCallback(h6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(h6Var);
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
            ak0 ak0Var = this.h;
            if (ak0Var != null) {
                if (!z10) {
                    this.w = ak0Var.b();
                    this.h.i();
                    return;
                } else {
                    if (!this.v || this.w) {
                        ak0Var.d();
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
            h6 h6Var = this.j0;
            if (z10) {
                Choreographer.getInstance().removeFrameCallback(h6Var);
                this.f0 = 0L;
                Choreographer.getInstance().postFrameCallback(h6Var);
            } else {
                Choreographer.getInstance().removeFrameCallback(h6Var);
                this.f0 = 0L;
                this.d0 = 0.0f;
            }
        } else if (z10) {
            ug.g gVar = this.f;
            gVar.d = 0.0f;
            gVar.i = 0.0f;
            m(new wg1(this, i10, 4));
        }
        setRendererPaused(!z10);
    }

    public final void k() {
        ug.g gVar = this.f;
        if (gVar != null) {
            gVar.f = this.T + this.L;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.c0 = runnable;
        if (this.f != null) {
            m(new i6(this, 1));
        } else if (runnable != null) {
            post(new i6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.v = runnable;
            if (k6Var.s && runnable != null) {
                k6Var.v = null;
                runnable.run();
            }
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.a0 = runnable;
            if (!j6Var.W || runnable == null) {
                return;
            }
            j6Var.a0 = null;
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
            jVar.c();
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
                ug.g gVar = this.f;
                gVar.d = c3.h0.z(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                ug.g gVar2 = this.f;
                gVar2.i = c3.h0.z(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.i);
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
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        ug.g gVar = this.f;
        if (gVar != null) {
            gVar.g = f7 + this.M;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotation(f7 + this.M);
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
        ug.g gVar = this.f;
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
        ug.g gVar = this.f;
        if (gVar != null) {
            gVar.g = this.K + this.M;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.s = z10;
        j();
    }

    public void setStarParticlesView(tg.x1 x1Var) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setStarParticlesView(x1Var);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setStarParticlesView(x1Var);
        }
    }
}
