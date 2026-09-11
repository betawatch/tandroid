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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class oa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final wp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ka0 Q;
    public dh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.f6 a;
    public final na0 b;
    public final hg.j0 c;
    public final ha0 d;
    public final hg.q1 e;
    public final hg.k1 f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public bi.x5 w;
    public la0 x;
    public final Rect y;

    public oa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new wp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ka0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        na0 na0Var = new na0(this, context, f6Var);
        this.b = na0Var;
        hg.j0 j0Var = new hg.j0((Object) this, 3);
        this.c = j0Var;
        j0Var.j1(1);
        ha0 ha0Var = new ha0(this);
        this.d = ha0Var;
        ha0Var.O = new ia0(this);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 150L;
        jVar.f = 150L;
        jVar.g = 150L;
        jVar.d = 150L;
        jVar.o = pr.f;
        jVar.C = false;
        na0Var.setItemAnimator(jVar);
        na0Var.setClipToPadding(false);
        na0Var.setLayoutManager(j0Var);
        hg.k1 k1Var = new hg.k1(context, j3, j10, new ja0(this, n2Var), f6Var, h());
        this.f = k1Var;
        hg.q1 q1Var = new hg.q1();
        q1Var.d = null;
        q1Var.f = false;
        hg.p1 p1Var = new hg.p1(q1Var, 0);
        q1Var.c = k1Var;
        k1Var.B(p1Var);
        this.e = q1Var;
        na0Var.setAdapter(q1Var);
        na0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(na0Var, w7.x5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ha0 ha0Var;
        hg.k1 k1Var;
        na0 na0Var = this.b;
        if (na0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        hg.q1 q1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, na0Var.getTranslationY() + (q1Var.f ? q1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, na0Var.getTranslationY() + (q1Var.f ? q1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        dh.d dVar = this.R;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.h.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (na0Var == null || (ha0Var = this.d) == null || na0Var.getLayoutManager() != ha0Var || (k1Var = this.f) == null || k1Var.R == null) {
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
        ha0 ha0Var;
        hg.k1 k1Var;
        na0 na0Var = this.b;
        if (na0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (na0Var == null || (ha0Var = this.d) == null || na0Var.getLayoutManager() != ha0Var || (k1Var = this.f) == null || k1Var.R == null) ? false : true;
        if (this.R == null) {
            na0Var.setPadding(0, 0, 0, 0);
        } else {
            na0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new bi.f(24));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        dh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        hg.k1 k1Var = this.f;
        this.s = AndroidUtilities.dp((((k1Var.N() || k1Var.R != null) && (k1Var.x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.n;
        hg.q1 q1Var = this.e;
        na0 na0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, na0Var.getTranslationY() + (q1Var.f ? q1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (na0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, na0Var.getTranslationY() + (q1Var.f ? q1Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.M * getHeight());
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
        if (Math.abs(f7 - this.n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.a));
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.b.getLayoutManager();
        hg.j0 j0Var = this.c;
        return layoutManager == j0Var && j0Var.t;
    }

    public hg.k1 getAdapter() {
        return this.f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.b.getLayoutManager();
        hg.j0 j0Var = this.c;
        return layoutManager == j0Var ? j0Var : this.d;
    }

    public na0 getListView() {
        return this.b;
    }

    public s4.c0 getNeededLayoutManager() {
        hg.k1 k1Var = this.f;
        return ((k1Var.N() || k1Var.R != null) && (k1Var.x0 || k1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof bi.p3;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                na0 na0Var = this.b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                hg.j0 j0Var = this.c;
                if (layoutManager == j0Var) {
                    j0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    na0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : na0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        wp wpVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(wpVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        AndroidUtilities.runOnUIThread(wpVar, (n2Var == null || !n2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(la0 la0Var) {
        this.x = la0Var;
        na0 listView = getListView();
        bi.x5 x5Var = new bi.x5(12, this, la0Var);
        this.w = x5Var;
        listView.setOnItemClickListener(x5Var);
        getListView().setOnTouchListener(new ur(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.R = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.R.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        hg.k1 k1Var = this.f;
        if (k1Var.n != j3) {
            k1Var.n = j3;
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
            hg.k1 k1Var = this.f;
            if (k1Var.K0 != z10) {
                k1Var.K0 = z10;
                int i10 = k1Var.L0;
                if (i10 > 0) {
                    k1Var.m(0);
                }
                if (i10 > 1) {
                    k1Var.m(i10 - 1);
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
