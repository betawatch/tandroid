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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c90 extends FrameLayout implements org.telegram.messenger.cs {
    public static final /* synthetic */ int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final gp K;
    public q1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final y80 R;
    public gh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.e6 a;
    public final b90 b;
    public final kg.f0 c;
    public final v80 d;
    public final kg.k1 e;
    public final kg.e1 f;
    public final org.telegram.ui.ActionBar.d2 h;
    public float n;
    public float r;
    public float s;
    public float w;
    public ei.q4 x;
    public z80 y;

    public c90(Context context, long j10, long j11, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new gp(this, 25);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new y80(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = d2Var;
        this.a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        b90 b90Var = new b90(this, context, e6Var);
        this.b = b90Var;
        kg.f0 f0Var = new kg.f0((Object) this, 3);
        this.c = f0Var;
        f0Var.j1(1);
        v80 v80Var = new v80(this);
        this.d = v80Var;
        v80Var.O = new w80(this);
        u4.k kVar = new u4.k();
        kVar.c = 150L;
        kVar.e = 150L;
        kVar.f = 150L;
        kVar.g = 150L;
        kVar.d = 150L;
        kVar.o = xq.f;
        kVar.C = false;
        b90Var.setItemAnimator(kVar);
        b90Var.setClipToPadding(false);
        b90Var.setLayoutManager(f0Var);
        kg.e1 e1Var = new kg.e1(context, j10, j11, new x80(this, d2Var), e6Var, h());
        this.f = e1Var;
        kg.k1 k1Var = new kg.k1();
        k1Var.d = null;
        k1Var.f = false;
        kg.j1 j1Var = new kg.j1(k1Var, 0);
        k1Var.c = e1Var;
        e1Var.B(j1Var);
        this.e = k1Var;
        b90Var.setAdapter(k1Var);
        b90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(b90Var, b8.mf.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        v80 v80Var;
        kg.e1 e1Var;
        b90 b90Var = this.b;
        if (b90Var == null || this.c == null) {
            return;
        }
        boolean g7 = g();
        this.s = 0.0f;
        kg.k1 k1Var = this.e;
        if (g7) {
            float min = Math.min(Math.max(0.0f, b90Var.getTranslationY() + (k1Var.f ? k1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, b90Var.getTranslationY() + (k1Var.f ? k1Var.e.getBottom() : 0)) - this.s, this.N * getHeight());
            this.r = getMeasuredHeight();
        }
        gh.g gVar = this.S;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.r));
            Path path = this.T;
            path.rewind();
            Rect rect = this.S.R.m;
            RectF rectF = this.U;
            rectF.set(rect);
            if (b90Var == null || (v80Var = this.d) == null || b90Var.getLayoutManager() != v80Var || (e1Var = this.f) == null || e1Var.S == null) {
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
        v80 v80Var;
        kg.e1 e1Var;
        b90 b90Var = this.b;
        if (b90Var == null || this.c == null) {
            return;
        }
        boolean z10 = (b90Var == null || (v80Var = this.d) == null || b90Var.getLayoutManager() != v80Var || (e1Var = this.f) == null || e1Var.S == null) ? false : true;
        if (this.S == null) {
            b90Var.setPadding(0, 0, 0, 0);
        } else {
            b90Var.setPadding(org.telegram.messenger.g0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.g0.L(2.0f) : 0, org.telegram.messenger.g0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.g0.L(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            org.telegram.messenger.g0.d0(this.b, new ei.e(13));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        gh.g gVar = this.S;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g7 = g();
        kg.e1 e1Var = this.f;
        this.s = org.telegram.messenger.g0.L((((e1Var.N() || e1Var.S != null) && (e1Var.y0 || e1Var.B0 != null) && e1Var.I() == null && e1Var.V == null) ? 2 : 0) + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.n;
        kg.k1 k1Var = this.e;
        b90 b90Var = this.b;
        Rect rect = this.E;
        if (g7) {
            float min2 = Math.min(Math.max(0.0f, b90Var.getTranslationY() + (k1Var.f ? k1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
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
            if (b90Var.getLayoutManager() == this.d) {
                this.s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            float max = Math.max(0.0f, b90Var.getTranslationY() + (k1Var.f ? k1Var.e.getBottom() : 0)) - this.s;
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
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, this.a));
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
        u4.o0 layoutManager = this.b.getLayoutManager();
        kg.f0 f0Var = this.c;
        return layoutManager == f0Var && f0Var.t;
    }

    public kg.e1 getAdapter() {
        return this.f;
    }

    public u4.b0 getCurrentLayoutManager() {
        u4.o0 layoutManager = this.b.getLayoutManager();
        kg.f0 f0Var = this.c;
        return layoutManager == f0Var ? f0Var : this.d;
    }

    public b90 getListView() {
        return this.b;
    }

    public u4.b0 getNeededLayoutManager() {
        kg.e1 e1Var = this.f;
        return ((e1Var.N() || e1Var.S != null) && (e1Var.y0 || e1Var.B0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof ei.u2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g7 = g();
            if (!this.J) {
                this.I = true;
                b90 b90Var = this.b;
                u4.o0 layoutManager = b90Var.getLayoutManager();
                kg.f0 f0Var = this.c;
                if (layoutManager == f0Var) {
                    f0Var.h1(0, g7 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    b90Var.setTranslationY(g7 ? -(this.w + org.telegram.messenger.g0.L(12.0f)) : b90Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        gp gpVar = this.K;
        org.telegram.messenger.g0.r(gpVar);
        q1.g gVar = this.L;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        org.telegram.messenger.g0.i3(gpVar, (d2Var == null || !d2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        c();
        super.onMeasure(i3, i10);
    }

    public final void p(z80 z80Var) {
        this.y = z80Var;
        b90 listView = getListView();
        ei.q4 q4Var = new ei.q4(12, this, z80Var);
        this.x = q4Var;
        listView.setOnItemClickListener(q4Var);
        getListView().setOnTouchListener(new yj(this, 4));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(gh.g gVar) {
        this.S = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.S.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        kg.e1 e1Var = this.f;
        if (e1Var.n != j10) {
            e1Var.n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.H = z10;
    }

    public void setOverrideColor(int i3) {
        this.G = Integer.valueOf(i3);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.I = true;
            this.c.k1(z10);
            kg.e1 e1Var = this.f;
            if (e1Var.M0 != z10) {
                e1Var.M0 = z10;
                int i3 = e1Var.N0;
                if (i3 > 0) {
                    e1Var.g(0);
                }
                if (i3 > 1) {
                    e1Var.g(i3 - 1);
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
