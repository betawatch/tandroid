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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class v90 extends FrameLayout implements org.telegram.messenger.gs {
    public static final /* synthetic */ int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final oo K;
    public r1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final r90 R;
    public fh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.h6 a;
    public final u90 b;
    public final jg.i0 c;
    public final o90 d;
    public final jg.n1 e;
    public final jg.h1 f;
    public final org.telegram.ui.ActionBar.g2 h;
    public float n;
    public float r;
    public float s;
    public float w;
    public fi.g4 x;
    public s90 y;

    public v90(Context context, long j3, long j10, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new oo(this, 27);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new r90(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = g2Var;
        this.a = h6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        u90 u90Var = new u90(this, context, h6Var);
        this.b = u90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.c = i0Var;
        i0Var.j1(1);
        o90 o90Var = new o90(this);
        this.d = o90Var;
        o90Var.O = new p90(this);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 150L;
        kVar.f = 150L;
        kVar.g = 150L;
        kVar.d = 150L;
        kVar.o = nr.f;
        kVar.C = false;
        u90Var.setItemAnimator(kVar);
        u90Var.setClipToPadding(false);
        u90Var.setLayoutManager(i0Var);
        jg.h1 h1Var = new jg.h1(context, j3, j10, new q90(this, g2Var), h6Var, h());
        this.f = h1Var;
        jg.n1 n1Var = new jg.n1();
        n1Var.d = null;
        n1Var.f = false;
        jg.m1 m1Var = new jg.m1(n1Var, 0);
        n1Var.c = h1Var;
        h1Var.B(m1Var);
        this.e = n1Var;
        u90Var.setAdapter(n1Var);
        u90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(u90Var, c8.ma.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        o90 o90Var;
        jg.h1 h1Var;
        u90 u90Var = this.b;
        if (u90Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        jg.n1 n1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, u90Var.getTranslationY() + (n1Var.f ? n1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, u90Var.getTranslationY() + (n1Var.f ? n1Var.e.getBottom() : 0)) - this.s, this.N * getHeight());
            this.r = getMeasuredHeight();
        }
        fh.g gVar = this.S;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.r));
            Path path = this.T;
            path.rewind();
            Rect rect = this.S.R.m;
            RectF rectF = this.U;
            rectF.set(rect);
            if (u90Var == null || (o90Var = this.d) == null || u90Var.getLayoutManager() != o90Var || (h1Var = this.f) == null || h1Var.S == null) {
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
        o90 o90Var;
        jg.h1 h1Var;
        u90 u90Var = this.b;
        if (u90Var == null || this.c == null) {
            return;
        }
        boolean z10 = (u90Var == null || (o90Var = this.d) == null || u90Var.getLayoutManager() != o90Var || (h1Var = this.f) == null || h1Var.S == null) ? false : true;
        if (this.S == null) {
            u90Var.setPadding(0, 0, 0, 0);
        } else {
            u90Var.setPadding(org.telegram.messenger.g0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.g0.L(2.0f) : 0, org.telegram.messenger.g0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.g0.L(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.l4) {
            org.telegram.messenger.g0.d0(this.b, new fi.e(14));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        fh.g gVar = this.S;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        jg.h1 h1Var = this.f;
        this.s = org.telegram.messenger.g0.L((((h1Var.N() || h1Var.S != null) && (h1Var.y0 || h1Var.B0 != null) && h1Var.I() == null && h1Var.V == null) ? 2 : 0) + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.n;
        jg.n1 n1Var = this.e;
        u90 u90Var = this.b;
        Rect rect = this.E;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, u90Var.getTranslationY() + (n1Var.f ? n1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
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
            if (u90Var.getLayoutManager() == this.d) {
                this.s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            float max = Math.max(0.0f, u90Var.getTranslationY() + (n1Var.f ? n1Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.N * getHeight());
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
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.F;
        Integer num = this.G;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Je, this.a));
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
        canvas.drawRoundRect(rectF, f10, f10, this.F);
    }

    public final boolean g() {
        v4.p0 layoutManager = this.b.getLayoutManager();
        jg.i0 i0Var = this.c;
        return layoutManager == i0Var && i0Var.t;
    }

    public jg.h1 getAdapter() {
        return this.f;
    }

    public v4.c0 getCurrentLayoutManager() {
        v4.p0 layoutManager = this.b.getLayoutManager();
        jg.i0 i0Var = this.c;
        return layoutManager == i0Var ? i0Var : this.d;
    }

    public u90 getListView() {
        return this.b;
    }

    public v4.c0 getNeededLayoutManager() {
        jg.h1 h1Var = this.f;
        return ((h1Var.N() || h1Var.S != null) && (h1Var.y0 || h1Var.B0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof fi.k2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.J) {
                this.I = true;
                u90 u90Var = this.b;
                v4.p0 layoutManager = u90Var.getLayoutManager();
                jg.i0 i0Var = this.c;
                if (layoutManager == i0Var) {
                    i0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    u90Var.setTranslationY(g10 ? -(this.w + org.telegram.messenger.g0.L(12.0f)) : u90Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        oo ooVar = this.K;
        org.telegram.messenger.g0.r(ooVar);
        r1.g gVar = this.L;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.h;
        org.telegram.messenger.g0.h3(ooVar, (g2Var == null || !g2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        c();
        super.onMeasure(i7, i10);
    }

    public final void p(s90 s90Var) {
        this.y = s90Var;
        u90 listView = getListView();
        fi.g4 g4Var = new fi.g4(12, this, s90Var);
        this.x = g4Var;
        listView.setOnItemClickListener(g4Var);
        getListView().setOnTouchListener(new qk(this, 4));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.S = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.S.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        jg.h1 h1Var = this.f;
        if (h1Var.n != j3) {
            h1Var.n = j3;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.H = z10;
    }

    public void setOverrideColor(int i7) {
        this.G = Integer.valueOf(i7);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.I = true;
            this.c.k1(z10);
            jg.h1 h1Var = this.f;
            if (h1Var.M0 != z10) {
                h1Var.M0 = z10;
                int i7 = h1Var.N0;
                if (i7 > 0) {
                    h1Var.g(0);
                }
                if (i7 > 1) {
                    h1Var.g(i7 - 1);
                }
            }
        }
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void n(boolean z10) {
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }
}
