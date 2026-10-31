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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class y90 extends FrameLayout implements org.telegram.messenger.us {
    public static final /* synthetic */ int U = 0;
    public final Rect D;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ho J;
    public o1.j K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final u90 Q;
    public vg.f R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.p6 a;
    public final x90 b;
    public final org.telegram.ui.br c;
    public final r90 d;
    public final zf.c1 e;
    public final zf.x0 f;
    public final org.telegram.ui.ActionBar.k2 h;
    public float n;
    public float r;
    public float s;
    public float w;
    public mg.q0 x;
    public v90 y;

    public y90(Context context, long j10, long j11, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new ho(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new u90(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = k2Var;
        this.a = p6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(org.telegram.messenger.i0.L(126.0f), org.telegram.messenger.i0.q.y * 0.22f);
        x90 x90Var = new x90(this, context, p6Var);
        this.b = x90Var;
        org.telegram.ui.br brVar = new org.telegram.ui.br(2, this, false);
        this.c = brVar;
        brVar.j1(1);
        r90 r90Var = new r90(this);
        this.d = r90Var;
        r90Var.O = new s90(this);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 150L;
        jVar.f = 150L;
        jVar.g = 150L;
        jVar.d = 150L;
        jVar.o = gr.f;
        jVar.C = false;
        x90Var.setItemAnimator(jVar);
        x90Var.setClipToPadding(false);
        x90Var.setLayoutManager(brVar);
        zf.x0 x0Var = new zf.x0(context, j10, j11, new t90(this, k2Var), p6Var, h());
        this.f = x0Var;
        zf.c1 c1Var = new zf.c1();
        c1Var.d = null;
        c1Var.f = false;
        xj0 xj0Var = new xj0(c1Var, 2);
        c1Var.c = x0Var;
        x0Var.B(xj0Var);
        this.e = c1Var;
        x90Var.setAdapter(c1Var);
        x90Var.setTranslationY(org.telegram.messenger.i0.L(6.0f));
        addView(x90Var, w7.b6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        r90 r90Var;
        zf.x0 x0Var;
        x90 x90Var = this.b;
        if (x90Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        zf.c1 c1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, x90Var.getTranslationY() + (c1Var.f ? c1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, x90Var.getTranslationY() + (c1Var.f ? c1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        vg.f fVar = this.R;
        if (fVar != null) {
            fVar.setBounds(0, ((int) this.n) - org.telegram.messenger.i0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.M.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (x90Var == null || (r90Var = this.d) == null || x90Var.getLayoutManager() != r90Var || (x0Var = this.f) == null || x0Var.R == null) {
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        r90 r90Var;
        zf.x0 x0Var;
        x90 x90Var = this.b;
        if (x90Var == null || this.c == null) {
            return;
        }
        boolean z10 = (x90Var == null || (r90Var = this.d) == null || x90Var.getLayoutManager() != r90Var || (x0Var = this.f) == null || x0Var.R == null) ? false : true;
        if (this.R == null) {
            x90Var.setPadding(0, 0, 0, 0);
        } else {
            x90Var.setPadding(org.telegram.messenger.i0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.i0.L(2.0f) : 0, org.telegram.messenger.i0.L(z10 ? 7.0f : 5.0f), z10 ? org.telegram.messenger.i0.L(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            org.telegram.messenger.i0.d0(this.b, new ag.z0(12));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        vg.f fVar = this.R;
        if (fVar != null) {
            fVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        zf.x0 x0Var = this.f;
        this.s = org.telegram.messenger.i0.L((((x0Var.N() || x0Var.R != null) && (x0Var.x0 || x0Var.A0 != null) && x0Var.I() == null && x0Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float L = org.telegram.messenger.i0.L(6.0f);
        float f7 = this.n;
        zf.c1 c1Var = this.e;
        x90 x90Var = this.b;
        Rect rect = this.D;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, x90Var.getTranslationY() + (c1Var.f ? c1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (x90Var.getLayoutManager() == this.d) {
                this.s += org.telegram.messenger.i0.L(2.0f);
                L += org.telegram.messenger.i0.L(2.0f);
            }
            float max = Math.max(0.0f, x90Var.getTranslationY() + (c1Var.f ? c1Var.e.getBottom() : 0)) - this.s;
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
        if (Math.abs(f7 - this.n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.a));
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

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.n0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.br brVar = this.c;
        return layoutManager == brVar && brVar.t;
    }

    public zf.x0 getAdapter() {
        return this.f;
    }

    public s4.a0 getCurrentLayoutManager() {
        s4.n0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.br brVar = this.c;
        return layoutManager == brVar ? brVar : this.d;
    }

    public x90 getListView() {
        return this.b;
    }

    public s4.a0 getNeededLayoutManager() {
        zf.x0 x0Var = this.f;
        return ((x0Var.N() || x0Var.R != null) && (x0Var.x0 || x0Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof th.v1;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                x90 x90Var = this.b;
                s4.n0 layoutManager = x90Var.getLayoutManager();
                org.telegram.ui.br brVar = this.c;
                if (layoutManager == brVar) {
                    brVar.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    x90Var.setTranslationY(g10 ? -(this.w + org.telegram.messenger.i0.L(12.0f)) : x90Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        ho hoVar = this.J;
        org.telegram.messenger.i0.r(hoVar);
        o1.j jVar = this.K;
        if (jVar != null) {
            jVar.d();
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.h;
        org.telegram.messenger.i0.h3(hoVar, (k2Var == null || !k2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(v90 v90Var) {
        this.y = v90Var;
        x90 listView = getListView();
        mg.q0 q0Var = new mg.q0(11, this, v90Var);
        this.x = q0Var;
        listView.setOnItemClickListener(q0Var);
        getListView().setOnTouchListener(new bk(this, 4));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(vg.f fVar) {
        this.R = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.R.p(org.telegram.messenger.i0.L(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        zf.x0 x0Var = this.f;
        if (x0Var.n != j10) {
            x0Var.n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.G = z10;
    }

    public void setOverrideColor(int i10) {
        this.F = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.H = true;
            this.c.k1(z10);
            zf.x0 x0Var = this.f;
            if (x0Var.L0 != z10) {
                x0Var.L0 = z10;
                int i10 = x0Var.M0;
                if (i10 > 0) {
                    x0Var.g(0);
                }
                if (i10 > 1) {
                    x0Var.g(i10 - 1);
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
