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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class w90 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final np F;
    public o1.j G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final s90 M;
    public kg.d N;
    public final Path O;
    public final RectF P;
    public final org.telegram.ui.ActionBar.b6 a;
    public final v90 b;
    public final of.g0 c;
    public final p90 d;
    public final of.k1 e;
    public final of.f1 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public bg.b1 w;
    public t90 x;
    public final Rect y;

    public w90(Context context, long j10, long j11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new np(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new s90(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = o2Var;
        this.a = b6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        v90 v90Var = new v90(this, context, b6Var);
        this.b = v90Var;
        of.g0 g0Var = new of.g0((Object) this, 3);
        this.c = g0Var;
        g0Var.j1(1);
        p90 p90Var = new p90(this);
        this.d = p90Var;
        p90Var.O = new q90(this);
        f2.n nVar = new f2.n();
        nVar.c = 150L;
        nVar.e = 150L;
        nVar.f = 150L;
        nVar.g = 150L;
        nVar.d = 150L;
        nVar.o = gr.f;
        nVar.C = false;
        v90Var.setItemAnimator(nVar);
        v90Var.setClipToPadding(false);
        v90Var.setLayoutManager(g0Var);
        of.f1 f1Var = new of.f1(context, j10, j11, new r90(this, o2Var), b6Var, h());
        this.f = f1Var;
        of.k1 k1Var = new of.k1();
        k1Var.d = null;
        k1Var.f = false;
        f2.i1 i1Var = new f2.i1(k1Var, 1);
        k1Var.c = f1Var;
        f1Var.B(i1Var);
        this.e = k1Var;
        v90Var.setAdapter(k1Var);
        v90Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(v90Var, g7.e6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        p90 p90Var;
        of.f1 f1Var;
        v90 v90Var = this.b;
        if (v90Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        of.k1 k1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, v90Var.getTranslationY() + (k1Var.f ? k1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, v90Var.getTranslationY() + (k1Var.f ? k1Var.e.getBottom() : 0)) - this.s, this.I * getHeight());
            this.r = getMeasuredHeight();
        }
        kg.d dVar = this.N;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.O;
            path.rewind();
            Rect rect = this.N.h.m;
            RectF rectF = this.P;
            rectF.set(rect);
            if (v90Var == null || (p90Var = this.d) == null || v90Var.getLayoutManager() != p90Var || (f1Var = this.f) == null || f1Var.N == null) {
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
        p90 p90Var;
        of.f1 f1Var;
        v90 v90Var = this.b;
        if (v90Var == null || this.c == null) {
            return;
        }
        boolean z10 = (v90Var == null || (p90Var = this.d) == null || v90Var.getLayoutManager() != p90Var || (f1Var = this.f) == null || f1Var.N == null) ? false : true;
        if (this.N == null) {
            v90Var.setPadding(0, 0, 0, 0);
        } else {
            v90Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.n;
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new ih.e(8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        kg.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        of.f1 f1Var = this.f;
        this.s = AndroidUtilities.dp((((f1Var.N() || f1Var.N != null) && (f1Var.t0 || f1Var.w0 != null) && f1Var.I() == null && f1Var.Q == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.n;
        of.k1 k1Var = this.e;
        v90 v90Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, v90Var.getTranslationY() + (k1Var.f ? k1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
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
            if (v90Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, v90Var.getTranslationY() + (k1Var.f ? k1Var.e.getBottom() : 0)) - this.s;
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
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sd, this.a));
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
        f2.z0 layoutManager = this.b.getLayoutManager();
        of.g0 g0Var = this.c;
        return layoutManager == g0Var && g0Var.t;
    }

    public of.f1 getAdapter() {
        return this.f;
    }

    public f2.m0 getCurrentLayoutManager() {
        f2.z0 layoutManager = this.b.getLayoutManager();
        of.g0 g0Var = this.c;
        return layoutManager == g0Var ? g0Var : this.d;
    }

    public v90 getListView() {
        return this.b;
    }

    public f2.m0 getNeededLayoutManager() {
        of.f1 f1Var = this.f;
        return ((f1Var.N() || f1Var.N != null) && (f1Var.t0 || f1Var.w0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof ih.r2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.E) {
                this.D = true;
                v90 v90Var = this.b;
                f2.z0 layoutManager = v90Var.getLayoutManager();
                of.g0 g0Var = this.c;
                if (layoutManager == g0Var) {
                    g0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    v90Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : v90Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        np npVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(npVar);
        o1.j jVar = this.G;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        AndroidUtilities.runOnUIThread(npVar, (o2Var == null || !o2Var.getFragmentBeginToShow()) ? 100L : 0L);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        c();
        super.onMeasure(i9, i10);
    }

    public final void p(t90 t90Var) {
        this.x = t90Var;
        v90 listView = getListView();
        bg.b1 b1Var = new bg.b1(14, this, t90Var);
        this.w = b1Var;
        listView.setOnItemClickListener(b1Var);
        getListView().setOnTouchListener(new lr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(kg.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        of.f1 f1Var = this.f;
        if (f1Var.n != j10) {
            f1Var.n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.C = z10;
    }

    public void setOverrideColor(int i9) {
        this.B = Integer.valueOf(i9);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.D = true;
            this.c.k1(z10);
            of.f1 f1Var = this.f;
            if (f1Var.G0 != z10) {
                f1Var.G0 = z10;
                int i9 = f1Var.H0;
                if (i9 > 0) {
                    f1Var.m(0);
                }
                if (i9 > 1) {
                    f1Var.m(i9 - 1);
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
