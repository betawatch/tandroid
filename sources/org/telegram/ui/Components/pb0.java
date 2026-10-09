package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class pb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final nq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final lb0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.e6 a;
    public final ob0 b;
    public final gg.i0 c;
    public final ib0 d;
    public final gg.p1 e;
    public final gg.j1 f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public ai.o6 w;
    public mb0 x;
    public final Rect y;

    public pb0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new nq(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new lb0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ob0 ob0Var = new ob0(this, context, e6Var);
        this.b = ob0Var;
        gg.i0 i0Var = new gg.i0((Object) this, 3);
        this.c = i0Var;
        i0Var.j1(1);
        ib0 ib0Var = new ib0(this);
        this.d = ib0Var;
        ib0Var.O = new jb0(this);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 150L;
        jVar.f = 150L;
        jVar.g = 150L;
        jVar.d = 150L;
        jVar.o = hs.f;
        jVar.C = false;
        ob0Var.setItemAnimator(jVar);
        ob0Var.setClipToPadding(false);
        ob0Var.setLayoutManager(i0Var);
        gg.j1 j1Var = new gg.j1(context, j3, j10, new kb0(this, n2Var), e6Var, h());
        this.f = j1Var;
        gg.p1 p1Var = new gg.p1();
        p1Var.d = null;
        p1Var.f = false;
        gg.o1 o1Var = new gg.o1(p1Var, 0);
        p1Var.c = j1Var;
        j1Var.B(o1Var);
        this.e = p1Var;
        ob0Var.setAdapter(p1Var);
        ob0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ob0Var, w7.x5.d(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ib0 ib0Var;
        gg.j1 j1Var;
        ob0 ob0Var = this.b;
        if (ob0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        gg.p1 p1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, ob0Var.getTranslationY() + (p1Var.f ? p1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, ob0Var.getTranslationY() + (p1Var.f ? p1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
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
            if (ob0Var == null || (ib0Var = this.d) == null || ob0Var.getLayoutManager() != ib0Var || (j1Var = this.f) == null || j1Var.R == null) {
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
        ib0 ib0Var;
        gg.j1 j1Var;
        ob0 ob0Var = this.b;
        if (ob0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (ob0Var == null || (ib0Var = this.d) == null || ob0Var.getLayoutManager() != ib0Var || (j1Var = this.f) == null || j1Var.R == null) ? false : true;
        if (this.R == null) {
            ob0Var.setPadding(0, 0, 0, 0);
        } else {
            ob0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ai.i(13));
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
        gg.j1 j1Var = this.f;
        this.s = AndroidUtilities.dp((((j1Var.N() || j1Var.R != null) && (j1Var.x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.n;
        gg.p1 p1Var = this.e;
        ob0 ob0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, ob0Var.getTranslationY() + (p1Var.f ? p1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (ob0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, ob0Var.getTranslationY() + (p1Var.f ? p1Var.e.getBottom() : 0)) - this.s;
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
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sd, this.a));
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
        s4.p0 layoutManager = this.b.getLayoutManager();
        gg.i0 i0Var = this.c;
        return layoutManager == i0Var && i0Var.t;
    }

    public gg.j1 getAdapter() {
        return this.f;
    }

    public s4.d0 getCurrentLayoutManager() {
        s4.p0 layoutManager = this.b.getLayoutManager();
        gg.i0 i0Var = this.c;
        return layoutManager == i0Var ? i0Var : this.d;
    }

    public ob0 getListView() {
        return this.b;
    }

    public s4.d0 getNeededLayoutManager() {
        gg.j1 j1Var = this.f;
        return ((j1Var.N() || j1Var.R != null) && (j1Var.x0 || j1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof ai.d4;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                ob0 ob0Var = this.b;
                s4.p0 layoutManager = ob0Var.getLayoutManager();
                gg.i0 i0Var = this.c;
                if (layoutManager == i0Var) {
                    i0Var.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    ob0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : ob0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        nq nqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(nqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        AndroidUtilities.runOnUIThread(nqVar, (n2Var == null || !n2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(mb0 mb0Var) {
        this.x = mb0Var;
        ob0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, mb0Var);
        this.w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new wk(this, 4));
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
        gg.j1 j1Var = this.f;
        if (j1Var.n != j3) {
            j1Var.n = j3;
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
            gg.j1 j1Var = this.f;
            if (j1Var.L0 != z10) {
                j1Var.L0 = z10;
                int i10 = j1Var.M0;
                if (i10 > 0) {
                    j1Var.m(0);
                }
                if (i10 > 1) {
                    j1Var.m(i10 - 1);
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
