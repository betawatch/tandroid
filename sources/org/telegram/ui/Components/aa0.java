package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class aa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final lp F;
    public o1.j G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final w90 M;
    public lg.d N;
    public final Path O;
    public final RectF P;
    public final org.telegram.ui.ActionBar.c6 a;
    public final z90 b;
    public final org.telegram.ui.vq c;
    public final t90 d;
    public final pf.z0 e;
    public final pf.u0 f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public cg.x0 w;
    public x90 x;
    public final Rect y;

    public aa0(Context context, long j10, long j11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new lp(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new w90(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = n2Var;
        this.a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        z90 z90Var = new z90(this, context, c6Var);
        this.b = z90Var;
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((Object) this, 2);
        this.c = vqVar;
        vqVar.j1(1);
        t90 t90Var = new t90(this);
        this.d = t90Var;
        t90Var.O = new u90(this);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 150L;
        lVar.f = 150L;
        lVar.g = 150L;
        lVar.d = 150L;
        lVar.o = er.f;
        lVar.C = false;
        z90Var.setItemAnimator(lVar);
        z90Var.setClipToPadding(false);
        z90Var.setLayoutManager(vqVar);
        pf.u0 u0Var = new pf.u0(context, j10, j11, new v90(this, n2Var), c6Var, h());
        this.f = u0Var;
        pf.z0 z0Var = new pf.z0();
        z0Var.d = null;
        z0Var.f = false;
        f2.g1 g1Var = new f2.g1(z0Var, 2);
        z0Var.c = u0Var;
        u0Var.B(g1Var);
        this.e = z0Var;
        z90Var.setAdapter(z0Var);
        z90Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(z90Var, h7.z5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        t90 t90Var;
        pf.u0 u0Var;
        z90 z90Var = this.b;
        if (z90Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        pf.z0 z0Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s, this.I * getHeight());
            this.r = getMeasuredHeight();
        }
        lg.d dVar = this.N;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.O;
            path.rewind();
            Rect rect = this.N.h.m;
            RectF rectF = this.P;
            rectF.set(rect);
            if (z90Var == null || (t90Var = this.d) == null || z90Var.getLayoutManager() != t90Var || (u0Var = this.f) == null || u0Var.N == null) {
                path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        t90 t90Var;
        pf.u0 u0Var;
        z90 z90Var = this.b;
        if (z90Var == null || this.c == null) {
            return;
        }
        boolean z10 = (z90Var == null || (t90Var = this.d) == null || z90Var.getLayoutManager() != t90Var || (u0Var = this.f) == null || u0Var.N == null) ? false : true;
        if (this.N == null) {
            z90Var.setPadding(0, 0, 0, 0);
        } else {
            z90Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new j4.w0(8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        lg.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        pf.u0 u0Var = this.f;
        this.s = AndroidUtilities.dp((((u0Var.N() || u0Var.N != null) && (u0Var.t0 || u0Var.w0 != null) && u0Var.I() == null && u0Var.Q == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.n;
        pf.z0 z0Var = this.e;
        z90 z90Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
            this.n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (z90Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.I * getHeight());
            this.n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.n) > 0.1f) {
            i();
        }
        if (this.A == null) {
            Paint paint = new Paint(1);
            this.A = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.A;
        Integer num = this.B;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.a));
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.A);
    }

    public final boolean g() {
        f2.x0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.c;
        return layoutManager == vqVar && vqVar.t;
    }

    public pf.u0 getAdapter() {
        return this.f;
    }

    public f2.k0 getCurrentLayoutManager() {
        f2.x0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.c;
        return layoutManager == vqVar ? vqVar : this.d;
    }

    public z90 getListView() {
        return this.b;
    }

    public f2.k0 getNeededLayoutManager() {
        pf.u0 u0Var = this.f;
        return ((u0Var.N() || u0Var.N != null) && (u0Var.t0 || u0Var.w0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof jh.q2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.E) {
                this.D = true;
                z90 z90Var = this.b;
                f2.x0 layoutManager = z90Var.getLayoutManager();
                org.telegram.ui.vq vqVar = this.c;
                if (layoutManager == vqVar) {
                    vqVar.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    z90Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : z90Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        lp lpVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(lpVar);
        o1.j jVar = this.G;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        AndroidUtilities.runOnUIThread(lpVar, (n2Var == null || !n2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
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

    public final void p(x90 x90Var) {
        this.x = x90Var;
        z90 listView = getListView();
        cg.x0 x0Var = new cg.x0(14, this, x90Var);
        this.w = x0Var;
        listView.setOnItemClickListener(x0Var);
        getListView().setOnTouchListener(new jr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(lg.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        pf.u0 u0Var = this.f;
        if (u0Var.n != j10) {
            u0Var.n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.C = z10;
    }

    public void setOverrideColor(int i10) {
        this.B = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.D = true;
            this.c.k1(z10);
            pf.u0 u0Var = this.f;
            if (u0Var.G0 != z10) {
                u0Var.G0 = z10;
                int i10 = u0Var.H0;
                if (i10 > 0) {
                    u0Var.m(0);
                }
                if (i10 > 1) {
                    u0Var.m(i10 - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void m() {
    }

    public void n(boolean z10) {
    }
}
