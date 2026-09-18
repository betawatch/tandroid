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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class na0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final xp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ja0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.f6 a;
    public final ma0 b;
    public final gg.j0 c;
    public final ga0 d;
    public final gg.q1 e;
    public final gg.k1 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public ai.o6 w;
    public ka0 x;
    public final Rect y;

    public na0(Context context, long j3, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new xp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ja0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = o2Var;
        this.a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ma0 ma0Var = new ma0(this, context, f6Var);
        this.b = ma0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 4);
        this.c = j0Var;
        j0Var.j1(1);
        ga0 ga0Var = new ga0(this);
        this.d = ga0Var;
        ga0Var.O = new ha0(this);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 150L;
        jVar.f = 150L;
        jVar.g = 150L;
        jVar.d = 150L;
        jVar.o = qr.f;
        jVar.C = false;
        ma0Var.setItemAnimator(jVar);
        ma0Var.setClipToPadding(false);
        ma0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new ia0(this, o2Var), f6Var, h());
        this.f = k1Var;
        gg.q1 q1Var = new gg.q1();
        q1Var.d = null;
        q1Var.f = false;
        gg.p1 p1Var = new gg.p1(q1Var, 0);
        q1Var.c = k1Var;
        k1Var.B(p1Var);
        this.e = q1Var;
        ma0Var.setAdapter(q1Var);
        ma0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ma0Var, w7.x5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ga0 ga0Var;
        gg.k1 k1Var;
        ma0 ma0Var = this.b;
        if (ma0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        gg.q1 q1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, ma0Var.getTranslationY() + (q1Var.f ? q1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, ma0Var.getTranslationY() + (q1Var.f ? q1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.j.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (ma0Var == null || (ga0Var = this.d) == null || ma0Var.getLayoutManager() != ga0Var || (k1Var = this.f) == null || k1Var.R == null) {
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
        ga0 ga0Var;
        gg.k1 k1Var;
        ma0 ma0Var = this.b;
        if (ma0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (ma0Var == null || (ga0Var = this.d) == null || ma0Var.getLayoutManager() != ga0Var || (k1Var = this.f) == null || k1Var.R == null) ? false : true;
        if (this.R == null) {
            ma0Var.setPadding(0, 0, 0, 0);
        } else {
            ma0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new ai.i(24));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        gg.k1 k1Var = this.f;
        this.s = AndroidUtilities.dp((((k1Var.N() || k1Var.R != null) && (k1Var.x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.n;
        gg.q1 q1Var = this.e;
        ma0 ma0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, ma0Var.getTranslationY() + (q1Var.f ? q1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (ma0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, ma0Var.getTranslationY() + (q1Var.f ? q1Var.e.getBottom() : 0)) - this.s;
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
        gg.j0 j0Var = this.c;
        return layoutManager == j0Var && j0Var.t;
    }

    public gg.k1 getAdapter() {
        return this.f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.b.getLayoutManager();
        gg.j0 j0Var = this.c;
        return layoutManager == j0Var ? j0Var : this.d;
    }

    public ma0 getListView() {
        return this.b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f;
        return ((k1Var.N() || k1Var.R != null) && (k1Var.x0 || k1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof ai.c4;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                ma0 ma0Var = this.b;
                s4.o0 layoutManager = ma0Var.getLayoutManager();
                gg.j0 j0Var = this.c;
                if (layoutManager == j0Var) {
                    j0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    ma0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : ma0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        xp xpVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        AndroidUtilities.runOnUIThread(xpVar, (o2Var == null || !o2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(ka0 ka0Var) {
        this.x = ka0Var;
        ma0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, ka0Var);
        this.w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new vr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.R = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.R.p(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        gg.k1 k1Var = this.f;
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
            gg.k1 k1Var = this.f;
            if (k1Var.L0 != z10) {
                k1Var.L0 = z10;
                int i10 = k1Var.M0;
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
