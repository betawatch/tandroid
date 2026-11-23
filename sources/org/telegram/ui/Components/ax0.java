package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ax0 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public cp0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public d6 S;
    public d6 T;
    public d6 U;
    public d6 V;
    public org.telegram.messenger.g6 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public Integer b0;
    public yw0 c;
    public Integer c0;
    public bi.e3 d;
    public float d0;
    public xw0 e;
    public d6 e0;
    public org.telegram.ui.l4 f;
    public d6 f0;
    public d6 g0;
    public int h;
    public int n;
    public ww0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public ax0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.a = i7;
        this.c = rjVar;
        this.b = h6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.r == null) {
            this.r = new ww0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.P = new Path();
        this.Q = new Path();
        bi.e3 e3Var = new bi.e3(29, getContext(), this);
        this.d = e3Var;
        nr nrVar = nr.h;
        this.S = new d6(e3Var, 120L, 350L, nrVar);
        this.T = new d6(this.d, 150L, 600L, nrVar);
        new OvershootInterpolator(0.4f);
        this.U = new d6(this.d, 300L, nrVar);
        this.V = new d6(this.d, 300L, nrVar);
        this.e0 = new d6(this.d, 200L, nrVar);
        this.f0 = new d6(this.d, 350L, nrVar);
        this.g0 = new d6(this.d, 350L, nrVar);
        xw0 xw0Var = new xw0(this, getContext());
        this.e = xw0Var;
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
        this.f = l4Var;
        xw0Var.setAdapter(l4Var);
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        this.e.setLayoutManager(c0Var);
        v4.k kVar = new v4.k();
        kVar.n(45L);
        kVar.o = nrVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.t6.J(this.e, org.telegram.ui.ActionBar.m6.i6, this.b);
        xw0 xw0Var2 = this.e;
        o oVar = new o(this, 17);
        xw0Var2.setOnItemClickListener(oVar);
        this.e.setOnTouchListener(new hi.p1(3, this, oVar));
        this.d.addView(this.e, c8.ma.c(52.0f, -1));
        addView(this.d, c8.ma.a(-1.0f, 66.66f, 80));
        yw0 yw0Var = this.c;
        if (yw0Var != null) {
            yw0Var.e(new ah.j(this, 26));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i7 != org.telegram.messenger.ls.l4 || this.e == null) {
            return;
        }
        for (int i11 = 0; i11 < this.e.getChildCount(); i11++) {
            this.e.getChildAt(i11).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.g0.c;
        float f11 = this.f0.c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f11 - f12) + r0.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f11 + f12 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        cp0 cp0Var = this.I;
        if (cp0Var != null) {
            org.telegram.messenger.g0.r(cp0Var);
        }
        cp0 cp0Var2 = new cp0(this, 12);
        this.I = cp0Var2;
        org.telegram.messenger.g0.h3(cp0Var2, 16L);
    }

    public final void f() {
        cp0 cp0Var = this.I;
        if (cp0Var != null) {
            org.telegram.messenger.g0.r(cp0Var);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        bi.e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public yw0 getDelegate() {
        return this.c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
        org.telegram.messenger.ls.f(this.a).c(this, org.telegram.messenger.ls.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
        org.telegram.messenger.ls.f(this.a).n(this, org.telegram.messenger.ls.L2);
    }

    public void setDelegate(yw0 yw0Var) {
        this.c = yw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.n = i7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tf, h6Var));
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tf, h6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.m6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.m6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.m6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.m6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
