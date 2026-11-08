package hi;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import c8.j9;
import fi.f9;
import fi.h9;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public abstract class b4 extends FrameLayout {
    public static final lt0 b0 = new lt0(new g2.c(29), new x3(0));
    public Runnable D;
    public Runnable E;
    public a4 F;
    public r1.g G;
    public int H;
    public k9 I;
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
    public final vy b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public r1.g w;
    public boolean x;
    public org.telegram.ui.web.u0 y;

    public b4(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.I = new x3(1);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = org.telegram.messenger.g0.L(60.0f);
        this.U = true;
        this.b = new vy(context, new z3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.q;
        this.H = org.telegram.messenger.g0.L(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z9, boolean z10) {
        this.O = z9;
        this.P = z10;
    }

    public final boolean b(boolean z9) {
        org.telegram.ui.web.u0 u0Var = this.y;
        if (u0Var == null || !u0Var.N) {
            return true;
        }
        return z9 ? this.O : this.P;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        int i7 = 20;
        org.telegram.messenger.g0.r(new h9(this, i7));
        org.telegram.messenger.g0.h3(new h9(this, i7));
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
        cc ccVar = cc.w;
        if (ccVar != null) {
            ccVar.l();
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
            RenderNode e10 = ni.a.e(obj);
            e10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = e10.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode e11 = ni.a.e(obj2);
            e11.endRecording();
            canvas.drawRenderNode(e11);
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
                boolean z9 = this.c;
                this.d = false;
                this.c = false;
                if (!this.J || this.L) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.M && (!this.N || (this.r != (-this.f) + this.e && b(false)))) {
                        float f10 = this.r;
                        int i7 = this.H;
                        float f11 = -i7;
                        boolean z10 = this.U;
                        if (f10 <= f11) {
                            if (z10) {
                                e((-this.f) + this.e);
                            }
                        } else if (f10 <= f11 || f10 > i7) {
                            float x10 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            float f12 = this.W;
                            float f13 = this.a0;
                            Typeface typeface = org.telegram.messenger.g0.a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y10;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.F.q(!z9);
                            } else if (z10) {
                                e((-this.f) + this.e);
                            }
                        } else if (z10) {
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

    public final void f(float f10, boolean z9, Runnable runnable) {
        r1.g gVar;
        if (this.J && !z9) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f10 || ((gVar = this.G) != null && ((float) gVar.m.i) == f10)) {
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
        this.n = f10;
        r1.g gVar2 = this.w;
        if (gVar2 != null) {
            gVar2.d();
        }
        r1.g gVar3 = this.G;
        if (gVar3 != null) {
            gVar3.d();
        }
        r1.g gVar4 = new r1.g(this, b0, f10);
        gVar4.m = org.telegram.ui.Cells.f1.o(f10, 1200.0f, 1.0f);
        gVar4.a(new y3(0, this, runnable));
        this.G = gVar4;
        gVar4.h();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.w.k();
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
        Point point = org.telegram.messenger.g0.q;
        this.H = org.telegram.messenger.g0.L(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z9) {
        this.L = z9;
    }

    public void setAllowSwipes(boolean z9) {
        if (this.M != z9) {
            this.M = z9;
        }
    }

    public void setDelegate(a4 a4Var) {
        this.F = a4Var;
    }

    public void setForceOffsetY(float f10) {
        this.f = f10;
        c();
    }

    public void setFullSize(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            if (!z9) {
                e(0.0f);
            } else if (this.K) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(k9 k9Var) {
        this.I = k9Var;
    }

    public void setOffsetY(final float f10) {
        if (this.n != -2.14748365E9f) {
            this.h = f10;
            return;
        }
        r1.g gVar = this.w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f;
        final float f12 = f10 - f11;
        final boolean z9 = Math.abs((this.r + f11) - this.e) <= ((float) org.telegram.messenger.g0.L(1.0f));
        if (this.s) {
            this.f = f10;
            if (z9) {
                this.r = j9.a(this.r - Math.max(0.0f, f12), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        r1.g gVar2 = this.w;
        if (gVar2 != null) {
            gVar2.d();
        }
        r1.g gVar3 = new r1.g(new r1.f(f11));
        gVar3.m = org.telegram.ui.Cells.f1.o(f10, 1400.0f, 1.0f);
        gVar3.b(new r1.d() { // from class: hi.w3
            @Override // r1.d
            public final void a(r1.g gVar4, float f13, float f14) {
                b4 b4Var = b4.this;
                b4Var.f = f13;
                float f15 = f12;
                float f16 = f11;
                float f17 = f15 == 0.0f ? 1.0f : (f13 - f16) / f15;
                if (z9) {
                    b4Var.r = j9.a(b4Var.r - (Math.max(0.0f, f15) * f17), (-b4Var.f) + b4Var.e, (b4Var.getHeight() - b4Var.f) + b4Var.e);
                }
                r1.g gVar5 = b4Var.G;
                if (gVar5 != null) {
                    r1.h hVar = gVar5.m;
                    if (((float) hVar.i) == (-f16) + b4Var.e) {
                        hVar.i = (-f10) + r1;
                    }
                }
                b4Var.c();
            }
        });
        gVar3.a(new f9(this, f10, 1));
        this.w = gVar3;
        gVar3.h();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z9) {
        this.N = z9;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z9) {
        this.s = z9;
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

    public void setWebView(org.telegram.ui.web.u0 u0Var) {
        this.y = u0Var;
    }
}
