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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ka0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final rp F;
    public o1.k G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final ga0 M;
    public ng.d N;
    public final Path O;
    public final RectF P;
    public final org.telegram.ui.ActionBar.c6 a;
    public final ja0 b;
    public final org.telegram.ui.vq c;
    public final da0 d;
    public final rf.a1 e;
    public final rf.v0 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public eg.w0 w;
    public ha0 x;
    public final Rect y;

    public ka0(Context context, long j10, long j11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new rp(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new ga0(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = o2Var;
        this.a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ja0 ja0Var = new ja0(this, context, c6Var);
        this.b = ja0Var;
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((Object) this, 2);
        this.c = vqVar;
        vqVar.j1(1);
        da0 da0Var = new da0(this);
        this.d = da0Var;
        da0Var.O = new ea0(this);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 150L;
        lVar.f = 150L;
        lVar.g = 150L;
        lVar.d = 150L;
        lVar.o = jr.f;
        lVar.C = false;
        ja0Var.setItemAnimator(lVar);
        ja0Var.setClipToPadding(false);
        ja0Var.setLayoutManager(vqVar);
        rf.v0 v0Var = new rf.v0(context, j10, j11, new fa0(this, o2Var), c6Var, h());
        this.f = v0Var;
        rf.a1 a1Var = new rf.a1();
        a1Var.d = null;
        a1Var.f = false;
        f2.f1 f1Var = new f2.f1(a1Var, 2);
        a1Var.c = v0Var;
        v0Var.B(f1Var);
        this.e = a1Var;
        ja0Var.setAdapter(a1Var);
        ja0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ja0Var, i7.f6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        da0 da0Var;
        rf.v0 v0Var;
        ja0 ja0Var = this.b;
        if (ja0Var == null || this.c == null) {
            return;
        }
        boolean g10 = g();
        this.s = 0.0f;
        rf.a1 a1Var = this.e;
        if (g10) {
            float min = Math.min(Math.max(0.0f, ja0Var.getTranslationY() + (a1Var.f ? a1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, ja0Var.getTranslationY() + (a1Var.f ? a1Var.e.getBottom() : 0)) - this.s, this.I * getHeight());
            this.r = getMeasuredHeight();
        }
        ng.d dVar = this.N;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.O;
            path.rewind();
            Rect rect = this.N.h.m;
            RectF rectF = this.P;
            rectF.set(rect);
            if (ja0Var == null || (da0Var = this.d) == null || ja0Var.getLayoutManager() != da0Var || (v0Var = this.f) == null || v0Var.N == null) {
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
        da0 da0Var;
        rf.v0 v0Var;
        ja0 ja0Var = this.b;
        if (ja0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (ja0Var == null || (da0Var = this.d) == null || ja0Var.getLayoutManager() != da0Var || (v0Var = this.f) == null || v0Var.N == null) ? false : true;
        if (this.N == null) {
            ja0Var.setPadding(0, 0, 0, 0);
        } else {
            ja0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new l4.x0(8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        ng.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        rf.v0 v0Var = this.f;
        this.s = AndroidUtilities.dp((((v0Var.N() || v0Var.N != null) && (v0Var.t0 || v0Var.w0 != null) && v0Var.I() == null && v0Var.Q == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f9 = this.n;
        rf.a1 a1Var = this.e;
        ja0 ja0Var = this.b;
        Rect rect = this.y;
        if (g10) {
            float min2 = Math.min(Math.max(0.0f, ja0Var.getTranslationY() + (a1Var.f ? a1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.I) * getHeight());
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
            if (ja0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, ja0Var.getTranslationY() + (a1Var.f ? a1Var.e.getBottom() : 0)) - this.s;
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
        if (Math.abs(f9 - this.n) > 0.1f) {
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

    public void f(Canvas canvas, Rect rect, float f9) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f9, f9, this.A);
    }

    public final boolean g() {
        f2.w0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.c;
        return layoutManager == vqVar && vqVar.t;
    }

    public rf.v0 getAdapter() {
        return this.f;
    }

    public f2.j0 getCurrentLayoutManager() {
        f2.w0 layoutManager = this.b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.c;
        return layoutManager == vqVar ? vqVar : this.d;
    }

    public ja0 getListView() {
        return this.b;
    }

    public f2.j0 getNeededLayoutManager() {
        rf.v0 v0Var = this.f;
        return ((v0Var.N() || v0Var.N != null) && (v0Var.t0 || v0Var.w0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof lh.p2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g10 = g();
            if (!this.E) {
                this.D = true;
                ja0 ja0Var = this.b;
                f2.w0 layoutManager = ja0Var.getLayoutManager();
                org.telegram.ui.vq vqVar = this.c;
                if (layoutManager == vqVar) {
                    vqVar.h1(0, g10 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    ja0Var.setTranslationY(g10 ? -(this.v + AndroidUtilities.dp(12.0f)) : ja0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        rp rpVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(rpVar);
        o1.k kVar = this.G;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        AndroidUtilities.runOnUIThread(rpVar, (o2Var == null || !o2Var.getFragmentBeginToShow()) ? 100L : 0L);
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

    public final void p(ha0 ha0Var) {
        this.x = ha0Var;
        ja0 listView = getListView();
        eg.w0 w0Var = new eg.w0(13, this, ha0Var);
        this.w = w0Var;
        listView.setOnItemClickListener(w0Var);
        getListView().setOnTouchListener(new pr(this, 2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(ng.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        rf.v0 v0Var = this.f;
        if (v0Var.n != j10) {
            v0Var.n = j10;
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
            rf.v0 v0Var = this.f;
            if (v0Var.G0 != z10) {
                v0Var.G0 = z10;
                int i10 = v0Var.H0;
                if (i10 > 0) {
                    v0Var.m(0);
                }
                if (i10 > 1) {
                    v0Var.m(i10 - 1);
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
