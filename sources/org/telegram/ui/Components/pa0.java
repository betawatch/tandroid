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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class pa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int R = 0;
    public Paint B;
    public Integer C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final vp G;
    public o1.j H;
    public boolean I;
    public float J;
    public boolean K;
    public int L;
    public ArrayList M;
    public final la0 N;
    public pg.b O;
    public final Path P;
    public final RectF Q;
    public final org.telegram.ui.ActionBar.f6 a;
    public final oa0 b;
    public final org.telegram.ui.br c;
    public final ia0 d;
    public final tf.z0 e;
    public final tf.u0 f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public gg.v0 w;
    public ma0 x;
    public final Rect y;

    public pa0(Context context, long j10, long j11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = new Rect();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new vp(this, 27);
        this.I = false;
        this.J = 0.0f;
        this.K = false;
        this.N = new la0(this);
        this.P = new Path();
        this.Q = new RectF();
        this.h = p2Var;
        this.a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        oa0 oa0Var = new oa0(this, context, f6Var);
        this.b = oa0Var;
        org.telegram.ui.br brVar = new org.telegram.ui.br((Object) this, 2);
        this.c = brVar;
        brVar.j1(1);
        ia0 ia0Var = new ia0(this);
        this.d = ia0Var;
        ia0Var.O = new ja0(this);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 150L;
        lVar.f = 150L;
        lVar.g = 150L;
        lVar.d = 150L;
        lVar.o = nr.f;
        lVar.C = false;
        oa0Var.setItemAnimator(lVar);
        oa0Var.setClipToPadding(false);
        oa0Var.setLayoutManager(brVar);
        tf.u0 u0Var = new tf.u0(context, j10, j11, new ka0(this, p2Var), f6Var, h());
        this.f = u0Var;
        tf.z0 z0Var = new tf.z0();
        z0Var.d = null;
        z0Var.f = false;
        f2.d1 d1Var = new f2.d1(z0Var, 2);
        z0Var.c = u0Var;
        u0Var.B(d1Var);
        this.e = z0Var;
        oa0Var.setAdapter(z0Var);
        oa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(oa0Var, k7.b6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ia0 ia0Var;
        tf.u0 u0Var;
        oa0 oa0Var = this.b;
        if (oa0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        tf.z0 z0Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, oa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.J) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, oa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s, this.J * getHeight());
            this.r = getMeasuredHeight();
        }
        pg.b bVar = this.O;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.P;
            path.rewind();
            Rect rect = this.O.h.m;
            RectF rectF = this.Q;
            rectF.set(rect);
            if (oa0Var == null || (ia0Var = this.d) == null || oa0Var.getLayoutManager() != ia0Var || (u0Var = this.f) == null || u0Var.O == null) {
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
        ia0 ia0Var;
        tf.u0 u0Var;
        oa0 oa0Var = this.b;
        if (oa0Var == null || this.c == null) {
            return;
        }
        boolean z4 = (oa0Var == null || (ia0Var = this.d) == null || oa0Var.getLayoutManager() != ia0Var || (u0Var = this.f) == null || u0Var.O == null) ? false : true;
        if (this.O == null) {
            oa0Var.setPadding(0, 0, 0, 0);
        } else {
            oa0Var.setPadding(AndroidUtilities.dp(z4 ? 7.0f : 5.0f), z4 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z4 ? 7.0f : 5.0f), z4 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new nh.e(9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        pg.b bVar = this.O;
        if (bVar != null) {
            bVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        tf.u0 u0Var = this.f;
        this.s = AndroidUtilities.dp((((u0Var.N() || u0Var.O != null) && (u0Var.u0 || u0Var.x0 != null) && u0Var.I() == null && u0Var.R == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.n;
        tf.z0 z0Var = this.e;
        oa0 oa0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, oa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getTop() : getHeight())) + this.s, (1.0f - this.J) * getHeight());
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
            if (oa0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, oa0Var.getTranslationY() + (z0Var.f ? z0Var.e.getBottom() : 0)) - this.s;
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

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.B);
    }

    public final boolean g() {
        f2.v0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.br brVar = this.c;
        return layoutManager == brVar && brVar.t;
    }

    public tf.u0 getAdapter() {
        return this.f;
    }

    public f2.i0 getCurrentLayoutManager() {
        f2.v0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.br brVar = this.c;
        return layoutManager == brVar ? brVar : this.d;
    }

    public oa0 getListView() {
        return this.b;
    }

    public f2.i0 getNeededLayoutManager() {
        tf.u0 u0Var = this.f;
        return ((u0Var.N() || u0Var.O != null) && (u0Var.u0 || u0Var.x0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof nh.q2;
    }

    public final void o(boolean z4) {
        if (z4) {
            boolean g10 = g();
            if (!this.F) {
                this.E = true;
                oa0 oa0Var = this.b;
                f2.v0 layoutManager = oa0Var.getLayoutManager();
                org.telegram.ui.br brVar = this.c;
                if (layoutManager == brVar) {
                    brVar.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.J = 1.0f;
                    oa0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : oa0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.E = false;
        }
        this.F = z4;
        vp vpVar = this.G;
        AndroidUtilities.cancelRunOnUIThread(vpVar);
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        AndroidUtilities.runOnUIThread(vpVar, (p2Var == null || !p2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(ma0 ma0Var) {
        this.x = ma0Var;
        oa0 listView = getListView();
        gg.v0 v0Var = new gg.v0(13, this, ma0Var);
        this.w = v0Var;
        listView.setOnItemClickListener(v0Var);
        getListView().setOnTouchListener(new tr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(pg.b bVar) {
        this.O = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.O.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        tf.u0 u0Var = this.f;
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
            tf.u0 u0Var = this.f;
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
