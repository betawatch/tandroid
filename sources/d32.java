// default package

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
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class d32 extends FrameLayout {
    public static final ika c0 = new ika(new qn0(28), new qn0(29));
    public Runnable E;
    public Runnable F;
    public c32 G;
    public zna H;
    public int I;
    public ku4 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public float S;
    public boolean T;
    public final float U;
    public final boolean V;
    public long W;
    public Object a;
    public float a0;
    public final lj4 b;
    public float b0;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public zna w;
    public boolean x;
    public mw0 y;

    public d32(Context context) {
        super(context);
        this.e = a.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.1474836E9f;
        this.J = new a32((byte) 0);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = gm.L(60.0f);
        this.V = true;
        this.b = new lj4(context, new b32(this, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 0));
        Point point = gm.q;
        this.I = gm.L(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z, boolean z2) {
        this.P = z;
        this.Q = z2;
    }

    public final boolean b(boolean z) {
        mw0 mw0Var = this.y;
        if (mw0Var == null || !mw0Var.O) {
            return true;
        }
        return z ? this.P : this.Q;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        byte b = 19;
        gm.r(new fo1(this, b));
        gm.c3(new fo1(this, b));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        u31 u31Var = u31.x;
        if (u31Var != null) {
            u31Var.l();
        }
    }

    public final void d(float f) {
        e(f, false, null);
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
            RenderNode c = qn0.c(obj);
            c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode c2 = qn0.c(obj2);
            c2.endRecording();
            canvas.drawRenderNode(c2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.a0 = motionEvent.getX();
                this.b0 = motionEvent.getY();
                this.T = false;
                this.S = 0.0f;
                if (this.O) {
                    this.P = false;
                    this.Q = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.b.a).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z = this.c;
                this.d = false;
                this.c = false;
                if (!this.K || this.M) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.N && (!this.O || (this.r != (-this.f) + this.e && b(false)))) {
                        float f = this.r;
                        int i = this.I;
                        float f2 = -i;
                        boolean z2 = this.V;
                        if (f <= f2) {
                            if (z2) {
                                d((-this.f) + this.e);
                            }
                        } else if (f <= f2 || f > i) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float f3 = this.a0;
                            float f4 = this.b0;
                            Typeface typeface = gm.a;
                            float f5 = f3 - x;
                            float f6 = f4 - y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > gm.L(200.0f))) {
                                this.G.e(!z);
                            } else if (z2) {
                                d((-this.f) + this.e);
                            }
                        } else if (z2) {
                            d(0.0f);
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

    public final void e(float f, boolean z, Runnable runnable) {
        zna znaVar;
        if (this.K && !z) {
            f = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f || ((znaVar = this.H) != null && ((float) znaVar.m.i) == f)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.F;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f;
        zna znaVar2 = this.w;
        if (znaVar2 != null) {
            znaVar2.d();
        }
        zna znaVar3 = this.H;
        if (znaVar3 != null) {
            znaVar3.d();
        }
        zna znaVar4 = new zna(this, c0, f);
        znaVar4.m = aq1.j(f, 1200.0f, 1.0f);
        znaVar4.a(new w21(this, runnable, (byte) 3));
        this.H = znaVar4;
        znaVar4.h();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = ul1.c();
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
        Point point = gm.q;
        this.I = gm.L(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z) {
        this.M = z;
    }

    public void setAllowSwipes(boolean z) {
        if (this.N != z) {
            this.N = z;
        }
    }

    public void setDelegate(c32 c32Var) {
        this.G = c32Var;
    }

    public void setForceOffsetY(float f) {
        this.f = f;
        c();
    }

    public void setFullSize(boolean z) {
        if (this.K != z) {
            this.K = z;
            if (!z) {
                d(0.0f);
            } else if (this.L) {
                d(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(ku4 ku4Var) {
        this.J = ku4Var;
    }

    public void setOffsetY(final float f) {
        if (this.n != -2.1474836E9f) {
            this.h = f;
            return;
        }
        zna znaVar = this.w;
        if (znaVar != null) {
            znaVar.d();
        }
        final float f2 = this.f;
        final float f3 = f - f2;
        byte b = 0;
        final boolean z = Math.abs((this.r + f2) - this.e) <= ((float) gm.L(1.0f));
        if (this.s) {
            this.f = f;
            if (z) {
                this.r = pqe.a(this.r - Math.max(0.0f, f3), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        zna znaVar2 = this.w;
        if (znaVar2 != null) {
            znaVar2.d();
        }
        zna znaVar3 = new zna(new xk4(f2));
        znaVar3.m = aq1.j(f, 1400.0f, 1.0f);
        znaVar3.b(new it3() { // from class: y22
            @Override // it3
            public final void a(zna znaVar4, float f4, float f5) {
                d32 d32Var = d32.this;
                d32Var.f = f4;
                float f6 = f3;
                float f7 = f2;
                float f8 = f6 == 0.0f ? 1.0f : (f4 - f7) / f6;
                if (z) {
                    d32Var.r = pqe.a(d32Var.r - (Math.max(0.0f, f6) * f8), (-d32Var.f) + d32Var.e, (d32Var.getHeight() - d32Var.f) + d32Var.e);
                }
                zna znaVar5 = d32Var.H;
                if (znaVar5 != null) {
                    aoa aoaVar = znaVar5.m;
                    if (((float) aoaVar.i) == (-f7) + d32Var.e) {
                        aoaVar.i = (-f) + r1;
                    }
                }
                d32Var.c();
            }
        });
        znaVar3.a(new z22(this, f, b));
        this.w = znaVar3;
        znaVar3.h();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.F = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z) {
        this.O = z;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z) {
        this.s = z;
    }

    public void setSwipeOffsetY(float f) {
        this.r = f;
        c();
    }

    public void setTopActionBarOffsetY(float f) {
        this.e = f;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public void setWebView(mw0 mw0Var) {
        this.y = mw0Var;
    }
}
