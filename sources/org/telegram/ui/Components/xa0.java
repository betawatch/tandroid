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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class xa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final dq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ta0 Q;
    public bh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.f6 a;
    public final wa0 b;
    public final fg.i0 c;
    public final qa0 d;
    public final fg.r1 e;
    public final fg.l1 f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public ai.b0 w;
    public ua0 x;
    public final Rect y;

    public xa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new dq(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ta0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = p2Var;
        this.a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        wa0 wa0Var = new wa0(this, context, f6Var);
        this.b = wa0Var;
        fg.i0 i0Var = new fg.i0((Object) this, 3);
        this.c = i0Var;
        i0Var.j1(1);
        qa0 qa0Var = new qa0(this);
        this.d = qa0Var;
        qa0Var.O = new ra0(this);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 150L;
        jVar.f = 150L;
        jVar.g = 150L;
        jVar.d = 150L;
        jVar.o = wr.f;
        jVar.C = false;
        wa0Var.setItemAnimator(jVar);
        wa0Var.setClipToPadding(false);
        wa0Var.setLayoutManager(i0Var);
        fg.l1 l1Var = new fg.l1(context, j3, j10, new sa0(this, p2Var), f6Var, h());
        this.f = l1Var;
        fg.r1 r1Var = new fg.r1();
        r1Var.d = null;
        r1Var.f = false;
        fg.q1 q1Var = new fg.q1(r1Var, 0);
        r1Var.c = l1Var;
        l1Var.B(q1Var);
        this.e = r1Var;
        wa0Var.setAdapter(r1Var);
        wa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(wa0Var, w7.a6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        qa0 qa0Var;
        fg.l1 l1Var;
        wa0 wa0Var = this.b;
        if (wa0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        fg.r1 r1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, wa0Var.getTranslationY() + (r1Var.f ? r1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, wa0Var.getTranslationY() + (r1Var.f ? r1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        bh.d dVar = this.R;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.h.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (wa0Var == null || (qa0Var = this.d) == null || wa0Var.getLayoutManager() != qa0Var || (l1Var = this.f) == null || l1Var.R == null) {
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
        qa0 qa0Var;
        fg.l1 l1Var;
        wa0 wa0Var = this.b;
        if (wa0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (wa0Var == null || (qa0Var = this.d) == null || wa0Var.getLayoutManager() != qa0Var || (l1Var = this.f) == null || l1Var.R == null) ? false : true;
        if (this.R == null) {
            wa0Var.setPadding(0, 0, 0, 0);
        } else {
            wa0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new gg.g0(21));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        bh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        fg.l1 l1Var = this.f;
        this.s = AndroidUtilities.dp((((l1Var.N() || l1Var.R != null) && (l1Var.x0 || l1Var.A0 != null) && l1Var.I() == null && l1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.n;
        fg.r1 r1Var = this.e;
        wa0 wa0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, wa0Var.getTranslationY() + (r1Var.f ? r1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (wa0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, wa0Var.getTranslationY() + (r1Var.f ? r1Var.e.getBottom() : 0)) - this.s;
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
        fg.i0 i0Var = this.c;
        return layoutManager == i0Var && i0Var.t;
    }

    public fg.l1 getAdapter() {
        return this.f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.b.getLayoutManager();
        fg.i0 i0Var = this.c;
        return layoutManager == i0Var ? i0Var : this.d;
    }

    public wa0 getListView() {
        return this.b;
    }

    public s4.c0 getNeededLayoutManager() {
        fg.l1 l1Var = this.f;
        return ((l1Var.N() || l1Var.R != null) && (l1Var.x0 || l1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof zh.v1;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                wa0 wa0Var = this.b;
                s4.o0 layoutManager = wa0Var.getLayoutManager();
                fg.i0 i0Var = this.c;
                if (layoutManager == i0Var) {
                    i0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    wa0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : wa0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        dq dqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(dqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        AndroidUtilities.runOnUIThread(dqVar, (p2Var == null || !p2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(ua0 ua0Var) {
        this.x = ua0Var;
        wa0 listView = getListView();
        ai.b0 b0Var = new ai.b0(11, this, ua0Var);
        this.w = b0Var;
        listView.setOnItemClickListener(b0Var);
        getListView().setOnTouchListener(new bs(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(bh.d dVar) {
        this.R = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.R.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        fg.l1 l1Var = this.f;
        if (l1Var.n != j3) {
            l1Var.n = j3;
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
            fg.l1 l1Var = this.f;
            if (l1Var.K0 != z10) {
                l1Var.K0 = z10;
                int i10 = l1Var.L0;
                if (i10 > 0) {
                    l1Var.m(0);
                }
                if (i10 > 1) {
                    l1Var.m(i10 - 1);
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
