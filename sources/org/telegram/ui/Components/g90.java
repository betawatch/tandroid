package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class g90 extends FrameLayout implements org.telegram.messenger.ls {
    public static final /* synthetic */ int U = 0;
    public final Rect D;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final gp J;
    public r1.g K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final c90 Q;
    public fh.g R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.h6 a;
    public final f90 b;
    public final jg.i0 c;
    public final z80 d;
    public final jg.o1 e;
    public final jg.i1 f;
    public final org.telegram.ui.ActionBar.f2 h;
    public float n;
    public float r;
    public float s;
    public float w;
    public di.q4 x;
    public d90 y;

    public g90(Context context, long j3, long j10, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.D = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new gp(this, 25);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new c90(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = f2Var;
        this.a = h6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        f90 f90Var = new f90(this, context, h6Var);
        this.b = f90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.c = i0Var;
        i0Var.j1(1);
        z80 z80Var = new z80(this);
        this.d = z80Var;
        z80Var.O = new a90(this);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 150L;
        kVar.f = 150L;
        kVar.g = 150L;
        kVar.d = 150L;
        kVar.o = wq.f;
        kVar.C = false;
        f90Var.setItemAnimator(kVar);
        f90Var.setClipToPadding(false);
        f90Var.setLayoutManager(i0Var);
        jg.i1 i1Var = new jg.i1(context, j3, j10, new b90(this, f2Var), h6Var, h());
        this.f = i1Var;
        jg.o1 o1Var = new jg.o1();
        o1Var.d = null;
        o1Var.f = false;
        jg.n1 n1Var = new jg.n1(o1Var, 0);
        o1Var.c = i1Var;
        i1Var.B(n1Var);
        this.e = o1Var;
        f90Var.setAdapter(o1Var);
        f90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(f90Var, c8.ha.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        z80 z80Var;
        jg.i1 i1Var;
        f90 f90Var = this.b;
        if (f90Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        jg.o1 o1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, f90Var.getTranslationY() + (o1Var.f ? o1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, f90Var.getTranslationY() + (o1Var.f ? o1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        fh.g gVar = this.R;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.Q.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (f90Var == null || (z80Var = this.d) == null || f90Var.getLayoutManager() != z80Var || (i1Var = this.f) == null || i1Var.R == null) {
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        z80 z80Var;
        jg.i1 i1Var;
        f90 f90Var = this.b;
        if (f90Var == null || this.c == null) {
            return;
        }
        boolean z9 = (f90Var == null || (z80Var = this.d) == null || f90Var.getLayoutManager() != z80Var || (i1Var = this.f) == null || i1Var.R == null) ? false : true;
        if (this.R == null) {
            f90Var.setPadding(0, 0, 0, 0);
        } else {
            f90Var.setPadding(org.telegram.messenger.g0.L(z9 ? 7.0f : 5.0f), z9 ? org.telegram.messenger.g0.L(2.0f) : 0, org.telegram.messenger.g0.L(z9 ? 7.0f : 5.0f), z9 ? org.telegram.messenger.g0.L(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.messenger.g0.d0(this.b, new di.e(14));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        fh.g gVar = this.R;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        jg.i1 i1Var = this.f;
        this.s = org.telegram.messenger.g0.L((((i1Var.N() || i1Var.R != null) && (i1Var.x0 || i1Var.A0 != null) && i1Var.I() == null && i1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.n;
        jg.o1 o1Var = this.e;
        f90 f90Var = this.b;
        Rect rect = this.D;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, f90Var.getTranslationY() + (o1Var.f ? o1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (f90Var.getLayoutManager() == this.d) {
                this.s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            float max = Math.max(0.0f, f90Var.getTranslationY() + (o1Var.f ? o1Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ge, this.a));
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.E);
    }

    public final boolean g() {
        v4.n0 layoutManager = this.b.getLayoutManager();
        jg.i0 i0Var = this.c;
        return layoutManager == i0Var && i0Var.t;
    }

    public jg.i1 getAdapter() {
        return this.f;
    }

    public v4.b0 getCurrentLayoutManager() {
        v4.n0 layoutManager = this.b.getLayoutManager();
        jg.i0 i0Var = this.c;
        return layoutManager == i0Var ? i0Var : this.d;
    }

    public f90 getListView() {
        return this.b;
    }

    public v4.b0 getNeededLayoutManager() {
        jg.i1 i1Var = this.f;
        return ((i1Var.N() || i1Var.R != null) && (i1Var.x0 || i1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof di.q2;
    }

    public final void o(boolean z9) {
        if (z9) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                f90 f90Var = this.b;
                v4.n0 layoutManager = f90Var.getLayoutManager();
                jg.i0 i0Var = this.c;
                if (layoutManager == i0Var) {
                    i0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    f90Var.setTranslationY(g10 ? -(this.w + org.telegram.messenger.g0.L(12.0f)) : f90Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z9;
        gp gpVar = this.J;
        org.telegram.messenger.g0.r(gpVar);
        r1.g gVar = this.K;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.h;
        org.telegram.messenger.g0.i3(gpVar, (f2Var == null || !f2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z9) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        c();
        super.onMeasure(i7, i10);
    }

    public final void p(d90 d90Var) {
        this.y = d90Var;
        f90 listView = getListView();
        di.q4 q4Var = new di.q4(12, this, d90Var);
        this.x = q4Var;
        listView.setOnItemClickListener(q4Var);
        getListView().setOnTouchListener(new yj(this, 4));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.R = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.R.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        jg.i1 i1Var = this.f;
        if (i1Var.n != j3) {
            i1Var.n = j3;
        }
    }

    public void setIgnoreLayout(boolean z9) {
        this.G = z9;
    }

    public void setOverrideColor(int i7) {
        this.F = Integer.valueOf(i7);
        invalidate();
    }

    public void setReversed(boolean z9) {
        if (z9 != g()) {
            this.H = true;
            this.c.k1(z9);
            jg.i1 i1Var = this.f;
            if (i1Var.L0 != z9) {
                i1Var.L0 = z9;
                int i7 = i1Var.M0;
                if (i7 > 0) {
                    i1Var.g(0);
                }
                if (i7 > 1) {
                    i1Var.g(i7 - 1);
                }
            }
        }
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z9) {
    }

    public void n(boolean z9) {
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }
}
