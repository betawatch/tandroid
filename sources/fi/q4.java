package fi;

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
import di.nb;
import di.va;
import di.w9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class q4 extends FrameLayout {
    public static final hv0 b0 = new hv0(new w9(21), new w9(22));
    public Runnable E;
    public p4 F;
    public o1.k G;
    public int H;
    public GenericProvider I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public final float T;
    public final boolean U;
    public long V;
    public float W;
    public Object a;
    public float a0;
    public final l.d b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public o1.k v;
    public boolean w;
    public org.telegram.ui.web.z0 x;
    public Runnable y;

    public q4(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.I = new w9(23);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = AndroidUtilities.dp(60.0f);
        this.U = true;
        this.b = new l.d(context, new o4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = AndroidUtilities.displaySize;
        this.H = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z10, boolean z11) {
        this.O = z10;
        this.P = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.z0 z0Var = this.x;
        if (z0Var == null || !z0Var.N) {
            return true;
        }
        return z10 ? this.O : this.P;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        AndroidUtilities.cancelRunOnUIThread(new nb(this, 19));
        AndroidUtilities.runOnUIThread(new nb(this, 19));
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        qc qcVar = qc.w;
        if (qcVar != null) {
            qcVar.l();
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
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.a0 = motionEvent.getY();
                this.S = false;
                this.R = 0.0f;
                if (this.N) {
                    this.O = false;
                    this.P = false;
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
                if (!this.J || this.L) {
                    if (this.w) {
                        this.w = false;
                    } else if (this.M && (!this.N || (this.r != (-this.f) + this.e && b(false)))) {
                        float f7 = this.r;
                        int i10 = this.H;
                        float f10 = -i10;
                        boolean z11 = this.U;
                        if (f7 <= f10) {
                            if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (f7 <= f10 || f7 > i10) {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.W, this.a0);
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.F.f(!z10);
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

    public final void e(float f7) {
        f(f7, false, null);
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        o1.k kVar;
        if (this.J && !z10) {
            f7 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f7 || ((kVar = this.G) != null && ((float) kVar.u.i) == f7)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.E;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f7;
        o1.k kVar2 = this.v;
        if (kVar2 != null) {
            kVar2.c();
        }
        o1.k kVar3 = this.G;
        if (kVar3 != null) {
            kVar3.c();
        }
        o1.k kVar4 = new o1.k(this, b0, f7);
        kVar4.u = p6.l(f7, 1200.0f, 1.0f);
        kVar4.a(new n4(0, this, runnable));
        this.G = kVar4;
        kVar4.f();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.y.k();
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
        this.H = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
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
        this.L = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
        }
    }

    public void setDelegate(p4 p4Var) {
        this.F = p4Var;
    }

    public void setForceOffsetY(float f7) {
        this.f = f7;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10) {
                e(0.0f);
            } else if (this.K) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.I = genericProvider;
    }

    public void setOffsetY(final float f7) {
        if (this.n != -2.14748365E9f) {
            this.h = f7;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f;
        final float f11 = f7 - f10;
        final boolean z10 = Math.abs((this.r + f10) - this.e) <= ((float) AndroidUtilities.dp(1.0f));
        if (this.s) {
            this.f = f7;
            if (z10) {
                this.r = w7.p.a(this.r - Math.max(0.0f, f11), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        o1.k kVar2 = this.v;
        if (kVar2 != null) {
            kVar2.c();
        }
        o1.k kVar3 = new o1.k(new o1.j(f10));
        kVar3.u = p6.l(f7, 1400.0f, 1.0f);
        kVar3.b(new o1.g() { // from class: fi.m4
            @Override // o1.g
            public final void a(o1.h hVar, float f12, float f13) {
                q4 q4Var = q4.this;
                q4Var.f = f12;
                float f14 = f11;
                float f15 = f10;
                float f16 = f14 == 0.0f ? 1.0f : (f12 - f15) / f14;
                if (z10) {
                    q4Var.r = w7.p.a(q4Var.r - (Math.max(0.0f, f14) * f16), (-q4Var.f) + q4Var.e, (q4Var.getHeight() - q4Var.f) + q4Var.e);
                }
                o1.k kVar4 = q4Var.G;
                if (kVar4 != null) {
                    o1.l lVar = kVar4.u;
                    if (((float) lVar.i) == (-f15) + q4Var.e) {
                        lVar.i = (-f7) + r1;
                    }
                }
                q4Var.c();
            }
        });
        kVar3.a(new va(this, f7, 1));
        this.v = kVar3;
        kVar3.f();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.r = f7;
        c();
    }

    public void setTopActionBarOffsetY(float f7) {
        this.e = f7;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
    }

    public void setWebView(org.telegram.ui.web.z0 z0Var) {
        this.x = z0Var;
    }
}
