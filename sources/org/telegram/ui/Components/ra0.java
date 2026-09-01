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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class ra0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int R = 0;
    public Paint B;
    public Integer C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final xp G;
    public o1.j H;
    public boolean I;
    public float J;
    public boolean K;
    public int L;
    public ArrayList M;
    public final na0 N;
    public qg.b O;
    public final Path P;
    public final RectF Q;
    public final org.telegram.ui.ActionBar.g6 a;
    public final qa0 b;
    public final org.telegram.ui.cr c;
    public final ka0 d;
    public final uf.z0 e;
    public final uf.u0 f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public hg.v0 w;
    public oa0 x;
    public final Rect y;

    public ra0(Context context, long j10, long j11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.y = new Rect();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new xp(this, 27);
        this.I = false;
        this.J = 0.0f;
        this.K = false;
        this.N = new na0(this);
        this.P = new Path();
        this.Q = new RectF();
        this.h = p2Var;
        this.a = g6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        qa0 qa0Var = new qa0(this, context, g6Var);
        this.b = qa0Var;
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((Object) this, 2);
        this.c = crVar;
        crVar.j1(1);
        ka0 ka0Var = new ka0(this);
        this.d = ka0Var;
        ka0Var.O = new la0(this);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 150L;
        lVar.f = 150L;
        lVar.g = 150L;
        lVar.d = 150L;
        lVar.o = pr.f;
        lVar.C = false;
        qa0Var.setItemAnimator(lVar);
        qa0Var.setClipToPadding(false);
        qa0Var.setLayoutManager(crVar);
        uf.u0 u0Var = new uf.u0(context, j10, j11, new ma0(this, p2Var), g6Var, h());
        this.f = u0Var;
        uf.z0 z0Var = new uf.z0();
        z0Var.d = null;
        z0Var.f = false;
        f2.e1 e1Var = new f2.e1(z0Var, 2);
        z0Var.c = u0Var;
        u0Var.B(e1Var);
        this.e = z0Var;
        qa0Var.setAdapter(z0Var);
        qa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(qa0Var, k7.c6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ka0 ka0Var;
        uf.u0 u0Var;
        qa0 qa0Var = this.b;
        if (qa0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        uf.z0 z0Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, qa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.J) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, qa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s, this.J * getHeight());
            this.r = getMeasuredHeight();
        }
        qg.b bVar = this.O;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.P;
            path.rewind();
            Rect rect = this.O.h.m;
            RectF rectF = this.Q;
            rectF.set(rect);
            if (qa0Var == null || (ka0Var = this.d) == null || qa0Var.getLayoutManager() != ka0Var || (u0Var = this.f) == null || u0Var.O == null) {
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
        ka0 ka0Var;
        uf.u0 u0Var;
        qa0 qa0Var = this.b;
        if (qa0Var == null || this.c == null) {
            return;
        }
        boolean z4 = (qa0Var == null || (ka0Var = this.d) == null || qa0Var.getLayoutManager() != ka0Var || (u0Var = this.f) == null || u0Var.O == null) ? false : true;
        if (this.O == null) {
            qa0Var.setPadding(0, 0, 0, 0);
        } else {
            qa0Var.setPadding(AndroidUtilities.dp(z4 ? 7.0f : 5.0f), z4 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z4 ? 7.0f : 5.0f), z4 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new ag.d(10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        qg.b bVar = this.O;
        if (bVar != null) {
            bVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        uf.u0 u0Var = this.f;
        this.s = AndroidUtilities.dp((((u0Var.N() || u0Var.O != null) && (u0Var.u0 || u0Var.x0 != null) && u0Var.I() == null && u0Var.R == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.n;
        uf.z0 z0Var = this.e;
        qa0 qa0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, qa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.J) * getHeight());
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
            if (qa0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, qa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.J * getHeight());
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
        if (this.B == null) {
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.B;
        Integer num = this.C;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sd, this.a));
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
        canvas.drawRoundRect(rectF, f10, f10, this.B);
    }

    public final boolean g() {
        f2.w0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.cr crVar = this.c;
        return layoutManager == crVar && crVar.t;
    }

    public uf.u0 getAdapter() {
        return this.f;
    }

    public f2.j0 getCurrentLayoutManager() {
        f2.w0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.cr crVar = this.c;
        return layoutManager == crVar ? crVar : this.d;
    }

    public qa0 getListView() {
        return this.b;
    }

    public f2.j0 getNeededLayoutManager() {
        uf.u0 u0Var = this.f;
        return ((u0Var.N() || u0Var.O != null) && (u0Var.u0 || u0Var.x0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof oh.r2;
    }

    public final void o(boolean z4) {
        if (z4) {
            boolean g10 = g();
            if (!this.F) {
                this.E = true;
                qa0 qa0Var = this.b;
                f2.w0 layoutManager = qa0Var.getLayoutManager();
                org.telegram.ui.cr crVar = this.c;
                if (layoutManager == crVar) {
                    crVar.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.J = 1.0f;
                    qa0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : qa0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.E = false;
        }
        this.F = z4;
        xp xpVar = this.G;
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        AndroidUtilities.runOnUIThread(xpVar, (p2Var == null || !p2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z4) {
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(oa0 oa0Var) {
        this.x = oa0Var;
        qa0 listView = getListView();
        hg.v0 v0Var = new hg.v0(12, this, oa0Var);
        this.w = v0Var;
        listView.setOnItemClickListener(v0Var);
        getListView().setOnTouchListener(new vr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(qg.b bVar) {
        this.O = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.O.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        uf.u0 u0Var = this.f;
        if (u0Var.n != j10) {
            u0Var.n = j10;
        }
    }

    public void setIgnoreLayout(boolean z4) {
        this.D = z4;
    }

    public void setOverrideColor(int i10) {
        this.C = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z4) {
        if (z4 != g()) {
            this.E = true;
            this.c.k1(z4);
            uf.u0 u0Var = this.f;
            if (u0Var.H0 != z4) {
                u0Var.H0 = z4;
                int i10 = u0Var.I0;
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

    public void l(boolean z4) {
    }

    public void m() {
    }

    public void n(boolean z4) {
    }
}
