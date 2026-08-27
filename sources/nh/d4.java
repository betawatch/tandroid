package nh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import lh.da;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.su0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class d4 extends FrameLayout {
    public static final su0 U = new su0(new ng.a(17), new ng.a(18));
    public Runnable A;
    public c4 B;
    public o1.j C;
    public int D;
    public GenericProvider E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public final float P;
    public final boolean Q;
    public long R;
    public float S;
    public float T;
    public Object a;
    public final m5.o b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public o1.j v;
    public boolean w;
    public org.telegram.ui.web.w0 x;
    public Runnable y;

    public d4(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.E = new ng.a(19);
        this.I = true;
        this.N = 0.0f;
        this.O = false;
        this.P = AndroidUtilities.dp(60.0f);
        this.Q = true;
        this.b = new m5.o(context, new b4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = AndroidUtilities.displaySize;
        this.D = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z10, boolean z11) {
        this.K = z10;
        this.L = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.w0 w0Var = this.x;
        if (w0Var == null || !w0Var.J) {
            return true;
        }
        return z10 ? this.K : this.L;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        AndroidUtilities.cancelRunOnUIThread(new f0(this, 8));
        AndroidUtilities.runOnUIThread(new f0(this, 8));
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        ec ecVar = ec.w;
        if (ecVar != null) {
            ecVar.l();
        }
    }

    public final boolean d() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            return;
        }
        Object obj = this.a;
        if (obj != null) {
            RenderNode c10 = org.telegram.messenger.b.c(obj);
            c10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c10.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode c11 = org.telegram.messenger.b.c(obj2);
            c11.endRecording();
            canvas.drawRenderNode(c11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getEventTime();
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.O = false;
                this.N = 0.0f;
                if (this.J) {
                    this.K = false;
                    this.L = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.b.b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.c;
                this.d = false;
                this.c = false;
                if (!this.F || this.H) {
                    if (this.w) {
                        this.w = false;
                    } else if (this.I && (!this.J || (this.r != (-this.f) + this.e && b(false)))) {
                        float f10 = this.r;
                        int i10 = this.D;
                        float f11 = -i10;
                        boolean z11 = this.Q;
                        if (f10 <= f11) {
                            if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (f10 <= f11 || f10 > i10) {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.S, this.T);
                            long eventTime = motionEvent.getEventTime() - this.R;
                            if (this.B != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.B.i(!z10);
                            } else if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (z11) {
                            e(0.0f);
                        }
                    }
                }
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((!dispatchTouchEvent && !onTouchEvent && motionEvent.getAction() == 0) || dispatchTouchEvent || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void e(float f10) {
        f(f10, false, null);
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        o1.j jVar;
        if (this.F && !z10) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f10 || ((jVar = this.C) != null && ((float) jVar.u.i) == f10)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.A;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f10;
        o1.j jVar2 = this.v;
        if (jVar2 != null) {
            jVar2.c();
        }
        o1.j jVar3 = this.C;
        if (jVar3 != null) {
            jVar3.c();
        }
        o1.j jVar4 = new o1.j(this, U, f10);
        jVar4.u = pa.k(f10, 1200.0f, 1.0f);
        jVar4.a(new a4(0, this, runnable));
        this.C = jVar4;
        jVar4.f();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.z.j();
        }
        return this.a;
    }

    public float getSwipeOffsetY() {
        return this.r;
    }

    public float getTopActionBarOffsetY() {
        return this.e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Point point = AndroidUtilities.displaySize;
        this.D = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.H = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
        }
    }

    public void setDelegate(c4 c4Var) {
        this.B = c4Var;
    }

    public void setForceOffsetY(float f10) {
        this.f = f10;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            if (!z10) {
                e(0.0f);
            } else if (this.G) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.E = genericProvider;
    }

    public void setOffsetY(final float f10) {
        if (this.n != -2.14748365E9f) {
            this.h = f10;
            return;
        }
        o1.j jVar = this.v;
        if (jVar != null) {
            jVar.c();
        }
        final float f11 = this.f;
        final float f12 = f10 - f11;
        final boolean z10 = Math.abs((this.r + f11) - this.e) <= ((float) AndroidUtilities.dp(1.0f));
        if (this.s) {
            this.f = f10;
            if (z10) {
                this.r = h7.n.a(this.r - Math.max(0.0f, f12), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        o1.j jVar2 = this.v;
        if (jVar2 != null) {
            jVar2.c();
        }
        o1.j jVar3 = new o1.j(new hb.a(f11));
        jVar3.u = pa.k(f10, 1400.0f, 1.0f);
        jVar3.b(new o1.g() { // from class: nh.z3
            @Override // o1.g
            public final void a(o1.h hVar, float f13, float f14) {
                d4 d4Var = d4.this;
                d4Var.f = f13;
                float f15 = f12;
                float f16 = f11;
                float f17 = f15 == 0.0f ? 1.0f : (f13 - f16) / f15;
                if (z10) {
                    d4Var.r = h7.n.a(d4Var.r - (Math.max(0.0f, f15) * f17), (-d4Var.f) + d4Var.e, (d4Var.getHeight() - d4Var.f) + d4Var.e);
                }
                o1.j jVar4 = d4Var.C;
                if (jVar4 != null) {
                    o1.k kVar = jVar4.u;
                    if (((float) kVar.i) == (-f16) + d4Var.e) {
                        kVar.i = (-f10) + r1;
                    }
                }
                d4Var.c();
            }
        });
        jVar3.a(new da(this, f10, 1));
        this.v = jVar3;
        jVar3.f();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.A = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.J = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.s = z10;
    }

    public void setSwipeOffsetY(float f10) {
        this.r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.e = f10;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.w0 w0Var) {
        this.x = w0Var;
    }
}
