// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class b27 extends FrameLayout implements fn7 {
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final z96 K;
    public vpa L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final x17 R;
    public jl0 S;
    public final Path T;
    public final RectF U;
    public final vnb a;
    public final a27 b;
    public final of2 c;
    public final u17 d;
    public final uu7 e;
    public final r17 f;
    public final e h;
    public float n;
    public float r;
    public float s;
    public float w;
    public l0 x;
    public y17 y;

    /* JADX WARN: Multi-variable type inference failed */
    public b27(Context context, long j, long j2, e eVar, vnb vnbVar) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new z96(this, (byte) 22);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new x17(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = eVar;
        this.a = vnbVar;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(hl.L(126.0f), hl.q.y * 0.22f);
        a27 a27Var = new a27(this, context, vnbVar);
        this.b = a27Var;
        of2 of2Var = new of2((byte) 3, this, false);
        this.c = of2Var;
        of2Var.i1(1);
        u17 u17Var = new u17(this);
        this.d = u17Var;
        u17Var.O = new v17(this);
        zb3 zb3Var = new zb3();
        zb3Var.c = (short) 150;
        zb3Var.e = (short) 150;
        zb3Var.f = (short) 150;
        zb3Var.g = (short) 150;
        zb3Var.d = (short) 150;
        zb3Var.o = k43.f;
        zb3Var.C = false;
        a27Var.setItemAnimator(zb3Var);
        a27Var.setClipToPadding(false);
        a27Var.setLayoutManager(of2Var);
        r17 r17Var = new r17(context, j, j2, new w17(this, eVar), vnbVar, h());
        this.f = r17Var;
        uu7 uu7Var = new uu7();
        uu7Var.d = null;
        uu7Var.f = false;
        tu7 tu7Var = new tu7(uu7Var, 0 == true ? 1 : 0);
        uu7Var.c = r17Var;
        r17Var.B(tu7Var);
        this.e = uu7Var;
        a27Var.setAdapter(uu7Var);
        a27Var.setTranslationY(hl.L(6.0f));
        addView(a27Var, tre.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        u17 u17Var;
        r17 r17Var;
        a27 a27Var = this.b;
        if (a27Var == null || this.c == null) {
            return;
        }
        boolean g = g();
        this.s = 0.0f;
        uu7 uu7Var = this.e;
        if (g) {
            float min = Math.min(Math.max(0.0f, a27Var.getTranslationY() + (uu7Var.f ? uu7Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, a27Var.getTranslationY() + (uu7Var.f ? uu7Var.e.getBottom() : 0)) - this.s, this.N * getHeight());
            this.r = getMeasuredHeight();
        }
        jl0 jl0Var = this.S;
        if (jl0Var != null) {
            jl0Var.setBounds(0, ((int) this.n) - hl.L(5.0f), getMeasuredWidth(), hl.L(5.0f) + ((int) this.r));
            Path path = this.T;
            path.rewind();
            Rect rect = this.S.S.m;
            RectF rectF = this.U;
            rectF.set(rect);
            if (a27Var == null || (u17Var = this.d) == null || a27Var.getLayoutManager() != u17Var || (r17Var = this.f) == null || r17Var.S == null) {
                path.addRoundRect(rectF, hl.L(22.0f), hl.L(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(hl.L(2.0f), hl.L(2.0f));
                path.addRoundRect(rectF, hl.L(20.0f), hl.L(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        int i;
        u17 u17Var;
        r17 r17Var;
        a27 a27Var = this.b;
        if (a27Var == null || this.c == null) {
            return;
        }
        boolean z = (a27Var == null || (u17Var = this.d) == null || a27Var.getLayoutManager() != u17Var || (r17Var = this.f) == null || r17Var.S == null) ? false : true;
        if (this.S == null) {
            a27Var.setPadding(0, 0, 0, 0);
            return;
        }
        float f = 5.0f;
        int L = hl.L(z ? 7.0f : 5.0f);
        if (z) {
            i = hl.L(2.0f);
            f = 7.0f;
        } else {
            i = 0;
        }
        a27Var.setPadding(L, i, hl.L(f), z ? hl.L(2.0f) : 0);
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.n;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            hl.d0(this.b, new bm0((byte) 18));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        jl0 jl0Var = this.S;
        if (jl0Var != null) {
            jl0Var.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g = g();
        r17 r17Var = this.f;
        this.s = hl.L((((r17Var.N() || r17Var.S != null) && (r17Var.y0 || r17Var.B0 != null) && r17Var.I() == null && r17Var.V == null) ? 2 : 0) + 2);
        canvas.save();
        float L = hl.L(6.0f);
        float f = this.n;
        uu7 uu7Var = this.e;
        a27 a27Var = this.b;
        Rect rect = this.E;
        if (g) {
            float min2 = Math.min(Math.max(0.0f, a27Var.getTranslationY() + (uu7Var.f ? uu7Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.r = min2;
            rect.set(0, 0, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (a27Var.getLayoutManager() == this.d) {
                this.s += hl.L(2.0f);
                L += hl.L(2.0f);
            }
            float max = Math.max(0.0f, a27Var.getTranslationY() + (uu7Var.f ? uu7Var.e.getBottom() : 0)) - this.s;
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
        if (Math.abs(f - this.n) > 0.1f) {
            i();
        }
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setShadowLayer(hl.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.F;
        Integer num = this.G;
        paint2.setColor(num != null ? num.intValue() : aob.v0(aob.Je, this.a));
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

    public void f(Canvas canvas, Rect rect, float f) {
        RectF rectF = hl.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f, f, this.F);
    }

    public final boolean g() {
        q79 layoutManager = this.b.getLayoutManager();
        of2 of2Var = this.c;
        return layoutManager == of2Var && of2Var.t;
    }

    public r17 getAdapter() {
        return this.f;
    }

    public x46 getCurrentLayoutManager() {
        q79 layoutManager = this.b.getLayoutManager();
        of2 of2Var = this.c;
        return layoutManager == of2Var ? of2Var : this.d;
    }

    public a27 getListView() {
        return this.b;
    }

    public x46 getNeededLayoutManager() {
        r17 r17Var = this.f;
        return ((r17Var.N() || r17Var.S != null) && (r17Var.y0 || r17Var.B0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof j58;
    }

    public final void o(boolean z) {
        if (z) {
            boolean g = g();
            if (!this.J) {
                this.I = true;
                a27 a27Var = this.b;
                q79 layoutManager = a27Var.getLayoutManager();
                of2 of2Var = this.c;
                if (layoutManager == of2Var) {
                    of2Var.g1(0, g ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    a27Var.setTranslationY(g ? -(this.w + hl.L(12.0f)) : a27Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z;
        z96 z96Var = this.K;
        hl.r(z96Var);
        vpa vpaVar = this.L;
        if (vpaVar != null) {
            vpaVar.d();
        }
        e eVar = this.h;
        hl.d3(z96Var, (eVar == null || !eVar.getFragmentBeginToShow()) ? 100L : 0L);
        if (z) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }

    public final void p(y17 y17Var) {
        this.y = y17Var;
        a27 listView = getListView();
        l0 l0Var = new l0(this, y17Var, (byte) 16);
        this.x = l0Var;
        listView.setOnItemClickListener(l0Var);
        getListView().setOnTouchListener(new b7(this, (byte) 10));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(jl0 jl0Var) {
        this.S = jl0Var;
        jl0Var.r(hl.L(22.0f));
        this.S.q(hl.L(5.0f));
        c();
    }

    public void setDialogId(long j) {
        r17 r17Var = this.f;
        if (r17Var.n != j) {
            r17Var.n = j;
        }
    }

    public void setIgnoreLayout(boolean z) {
        this.H = z;
    }

    public void setOverrideColor(int i) {
        this.G = Integer.valueOf(i);
        invalidate();
    }

    public void setReversed(boolean z) {
        if (z != g()) {
            this.I = true;
            this.c.j1(z);
            r17 r17Var = this.f;
            if (r17Var.M0 != z) {
                r17Var.M0 = z;
                int i = r17Var.N0;
                if (i > 0) {
                    r17Var.g(0);
                }
                if (i > 1) {
                    r17Var.g(i - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z) {
    }

    public void n(boolean z) {
    }
}
