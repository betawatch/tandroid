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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class hb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final xa0 J;
    public o1.j K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final db0 Q;
    public eh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.u6 a;
    public final gb0 b;
    public final ig.j0 c;
    public final ab0 d;
    public final ig.p1 e;
    public final ig.j1 f;
    public final org.telegram.ui.ActionBar.r2 h;
    public float n;
    public float r;
    public float s;
    public float v;
    public di.x4 w;
    public eb0 x;
    public final Rect y;

    public hb0(Context context, long j10, long j11, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new xa0(this, 0);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new db0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = r2Var;
        this.a = u6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        gb0 gb0Var = new gb0(this, context, u6Var);
        this.b = gb0Var;
        ig.j0 j0Var = new ig.j0((Object) this, 3);
        this.c = j0Var;
        j0Var.k1(1);
        ab0 ab0Var = new ab0(this);
        this.d = ab0Var;
        ab0Var.O = new bb0(this);
        s4.l lVar = new s4.l();
        lVar.c = 150L;
        lVar.e = 150L;
        lVar.f = 150L;
        lVar.g = 150L;
        lVar.d = 150L;
        lVar.o = ds.f;
        lVar.C = false;
        gb0Var.setItemAnimator(lVar);
        gb0Var.setClipToPadding(false);
        gb0Var.setLayoutManager(j0Var);
        ig.j1 j1Var = new ig.j1(context, j10, j11, new cb0(this, r2Var), u6Var, h());
        this.f = j1Var;
        ig.p1 p1Var = new ig.p1();
        p1Var.d = null;
        p1Var.f = false;
        ig.o1 o1Var = new ig.o1(p1Var, 0);
        p1Var.c = j1Var;
        j1Var.B(o1Var);
        this.e = p1Var;
        gb0Var.setAdapter(p1Var);
        gb0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(gb0Var, kb1.g(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        ab0 ab0Var;
        ig.j1 j1Var;
        gb0 gb0Var = this.b;
        if (gb0Var == null || this.c == null) {
            return;
        }
        boolean g7 = g();
        this.s = 0.0f;
        ig.p1 p1Var = this.e;
        if (g7) {
            float min = Math.min(Math.max(0.0f, gb0Var.getTranslationY() + (p1Var.f ? p1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, gb0Var.getTranslationY() + (p1Var.f ? p1Var.e.getBottom() : 0)) - this.s, this.M * getHeight());
            this.r = getMeasuredHeight();
        }
        eh.d dVar = this.R;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.r));
            Path path = this.S;
            path.rewind();
            Rect rect = this.R.x.m;
            RectF rectF = this.T;
            rectF.set(rect);
            if (gb0Var == null || (ab0Var = this.d) == null || gb0Var.getLayoutManager() != ab0Var || (j1Var = this.f) == null || j1Var.R == null) {
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
        ab0 ab0Var;
        ig.j1 j1Var;
        gb0 gb0Var = this.b;
        if (gb0Var == null || this.c == null) {
            return;
        }
        boolean z10 = (gb0Var == null || (ab0Var = this.d) == null || gb0Var.getLayoutManager() != ab0Var || (j1Var = this.f) == null || j1Var.R == null) ? false : true;
        if (this.R == null) {
            gb0Var.setPadding(0, 0, 0, 0);
        } else {
            gb0Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new di.e(13));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        eh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g7 = g();
        ig.j1 j1Var = this.f;
        this.s = AndroidUtilities.dp((((j1Var.N() || j1Var.R != null) && (j1Var.x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null) ? 2 : 0) + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.n;
        ig.p1 p1Var = this.e;
        gb0 gb0Var = this.b;
        Rect rect = this.y;
        if (g7) {
            float min2 = Math.min(Math.max(0.0f, gb0Var.getTranslationY() + (p1Var.f ? p1Var.e.getTop() : getHeight())) + this.s, (1.0f - this.M) * getHeight());
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
            if (gb0Var.getLayoutManager() == this.d) {
                this.s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, gb0Var.getTranslationY() + (p1Var.f ? p1Var.e.getBottom() : 0)) - this.s;
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
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sd, this.a));
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
        ig.j0 j0Var = this.c;
        return layoutManager == j0Var && j0Var.t;
    }

    public ig.j1 getAdapter() {
        return this.f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.p0 layoutManager = this.b.getLayoutManager();
        ig.j0 j0Var = this.c;
        return layoutManager == j0Var ? j0Var : this.d;
    }

    public gb0 getListView() {
        return this.b;
    }

    public s4.c0 getNeededLayoutManager() {
        ig.j1 j1Var = this.f;
        return ((j1Var.N() || j1Var.R != null) && (j1Var.x0 || j1Var.A0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof di.w2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean g7 = g();
            if (!this.I) {
                this.H = true;
                gb0 gb0Var = this.b;
                s4.p0 layoutManager = gb0Var.getLayoutManager();
                ig.j0 j0Var = this.c;
                if (layoutManager == j0Var) {
                    j0Var.h1(0, g7 ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    gb0Var.setTranslationY(g7 ? -(this.v + AndroidUtilities.dp(12.0f)) : gb0Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        xa0 xa0Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        o1.j jVar = this.K;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.h;
        AndroidUtilities.runOnUIThread(xa0Var, (r2Var == null || !r2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
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

    public final void p(eb0 eb0Var) {
        this.x = eb0Var;
        gb0 listView = getListView();
        di.x4 x4Var = new di.x4(12, this, eb0Var);
        this.w = x4Var;
        listView.setOnItemClickListener(x4Var);
        getListView().setOnTouchListener(new rk(this, 4));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(eh.d dVar) {
        this.R = dVar;
        dVar.x(AndroidUtilities.dp(22.0f));
        this.R.w(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        ig.j1 j1Var = this.f;
        if (j1Var.n != j10) {
            j1Var.n = j10;
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
            this.c.l1(z10);
            ig.j1 j1Var = this.f;
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

    public void m() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void n(boolean z10) {
    }
}
