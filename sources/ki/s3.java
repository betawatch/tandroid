package ki;

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
import c8.m9;
import hi.x9;
import hi.z9;
import org.telegram.messenger.i9;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.wt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class s3 extends FrameLayout {
    public static final wt0 c0 = new wt0(new z9(20), new z9(21));
    public Runnable E;
    public Runnable F;
    public r3 G;
    public r1.g H;
    public int I;
    public i9 J;
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
    public final nd0 b;
    public float b0;
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
    public org.telegram.ui.web.s0 y;

    public s3(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.1474836E9f;
        this.J = new z9(22);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = org.telegram.messenger.g0.L(60.0f);
        this.V = true;
        this.b = new nd0(context, new q3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.q;
        this.I = org.telegram.messenger.g0.L(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z10, boolean z11) {
        this.P = z10;
        this.Q = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.s0 s0Var = this.y;
        if (s0Var == null || !s0Var.O) {
            return true;
        }
        return z10 ? this.P : this.Q;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        int i7 = 15;
        org.telegram.messenger.g0.r(new kg.i0(this, i7));
        org.telegram.messenger.g0.g3(new kg.i0(this, i7));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        fc fcVar = fc.w;
        if (fcVar != null) {
            fcVar.l();
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
            RenderNode d = n2.a0.d(obj);
            d.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = d.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode d2 = n2.a0.d(obj2);
            d2.endRecording();
            canvas.drawRenderNode(d2);
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
            boolean onTouchEvent = ((GestureDetector) this.b.b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.c;
                this.d = false;
                this.c = false;
                if (!this.K || this.M) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.N && (!this.O || (this.r != (-this.f) + this.e && b(false)))) {
                        float f10 = this.r;
                        int i7 = this.I;
                        float f11 = -i7;
                        boolean z11 = this.V;
                        if (f10 <= f11) {
                            if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (f10 <= f11 || f10 > i7) {
                            float x10 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            float f12 = this.a0;
                            float f13 = this.b0;
                            Typeface typeface = org.telegram.messenger.g0.a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y10;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.G.b(!z10);
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
        r1.g gVar;
        if (this.K && !z10) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f10 || ((gVar = this.H) != null && ((float) gVar.m.i) == f10)) {
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
        this.n = f10;
        r1.g gVar2 = this.w;
        if (gVar2 != null) {
            gVar2.d();
        }
        r1.g gVar3 = this.H;
        if (gVar3 != null) {
            gVar3.d();
        }
        r1.g gVar4 = new r1.g(this, c0, f10);
        gVar4.m = org.telegram.ui.Cells.c0.p(f10, 1200.0f, 1.0f);
        gVar4.a(new bi.y0(1, this, runnable));
        this.H = gVar4;
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
        this.I = org.telegram.messenger.g0.L(point.x > point.y ? 8.0f : 64.0f);
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
        this.M = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
        }
    }

    public void setDelegate(r3 r3Var) {
        this.G = r3Var;
    }

    public void setForceOffsetY(float f10) {
        this.f = f10;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            if (!z10) {
                e(0.0f);
            } else if (this.L) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(i9 i9Var) {
        this.J = i9Var;
    }

    public void setOffsetY(final float f10) {
        if (this.n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        r1.g gVar = this.w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f;
        final float f12 = f10 - f11;
        final boolean z10 = Math.abs((this.r + f11) - this.e) <= ((float) org.telegram.messenger.g0.L(1.0f));
        if (this.s) {
            this.f = f10;
            if (z10) {
                this.r = m9.a(this.r - Math.max(0.0f, f12), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        r1.g gVar2 = this.w;
        if (gVar2 != null) {
            gVar2.d();
        }
        r1.g gVar3 = new r1.g(new r1.f(f11));
        gVar3.m = org.telegram.ui.Cells.c0.p(f10, 1400.0f, 1.0f);
        gVar3.b(new r1.d() { // from class: ki.p3
            @Override // r1.d
            public final void a(r1.g gVar4, float f13, float f14) {
                s3 s3Var = s3.this;
                s3Var.f = f13;
                float f15 = f12;
                float f16 = f11;
                float f17 = f15 == 0.0f ? 1.0f : (f13 - f16) / f15;
                if (z10) {
                    s3Var.r = m9.a(s3Var.r - (Math.max(0.0f, f15) * f17), (-s3Var.f) + s3Var.e, (s3Var.getHeight() - s3Var.f) + s3Var.e);
                }
                r1.g gVar5 = s3Var.H;
                if (gVar5 != null) {
                    r1.h hVar = gVar5.m;
                    if (((float) hVar.i) == (-f16) + s3Var.e) {
                        hVar.i = (-f10) + r1;
                    }
                }
                s3Var.c();
            }
        });
        gVar3.a(new x9(this, f10, 1));
        this.w = gVar3;
        gVar3.h();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.F = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.O = z10;
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

    public void setWebView(org.telegram.ui.web.s0 s0Var) {
        this.y = s0Var;
    }
}
