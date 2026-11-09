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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class pw0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public kr0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public w5 R;
    public w5 S;
    public w5 T;
    public w5 U;
    public org.telegram.messenger.f6 V;
    public float W;
    public final int a;
    public Integer a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public Integer b0;
    public nw0 c;
    public float c0;
    public bi.e5 d;
    public w5 d0;
    public mw0 e;
    public w5 e0;
    public org.telegram.ui.l4 f;
    public w5 f0;
    public int h;
    public int n;
    public lw0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public pw0(Context context, int i7, org.telegram.ui.sj sjVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.N = 0L;
        this.a = i7;
        this.c = sjVar;
        this.b = g6Var;
        postDelayed(new hi.j2(i7, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ks getPreviewDelegate() {
        if (this.r == null) {
            this.r = new lw0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.O = new Path();
        this.P = new Path();
        bi.e5 e5Var = new bi.e5(28, getContext(), this);
        this.d = e5Var;
        xq xqVar = xq.h;
        this.R = new w5(e5Var, 120L, 350L, xqVar);
        this.S = new w5(this.d, 150L, 600L, xqVar);
        new OvershootInterpolator(0.4f);
        this.T = new w5(this.d, 300L, xqVar);
        this.U = new w5(this.d, 300L, xqVar);
        this.d0 = new w5(this.d, 200L, xqVar);
        this.e0 = new w5(this.d, 350L, xqVar);
        this.f0 = new w5(this.d, 350L, xqVar);
        mw0 mw0Var = new mw0(this, getContext());
        this.e = mw0Var;
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
        this.f = l4Var;
        mw0Var.setAdapter(l4Var);
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        v4.k kVar = new v4.k();
        kVar.n(45L);
        kVar.o = xqVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.s6.J(this.e, org.telegram.ui.ActionBar.l6.i6, this.b);
        mw0 mw0Var2 = this.e;
        k kVar2 = new k(this, 17);
        mw0Var2.setOnItemClickListener(kVar2);
        this.e.setOnTouchListener(new fi.n1(4, this, kVar2));
        this.d.addView(this.e, c8.ha.c(52.0f, -1));
        addView(this.d, c8.ha.a(-1.0f, 66.66f, 80));
        nw0 nw0Var = this.c;
        if (nw0Var != null) {
            nw0Var.d(new ah.j(this, 23));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i7 != org.telegram.messenger.qs.i4 || this.e == null) {
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
        float f10 = this.f0.c;
        float f11 = this.e0.c;
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
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            org.telegram.messenger.g0.r(kr0Var);
        }
        kr0 kr0Var2 = new kr0(this, 9);
        this.H = kr0Var2;
        org.telegram.messenger.g0.i3(kr0Var2, 16L);
    }

    public final void f() {
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            org.telegram.messenger.g0.r(kr0Var);
            this.H = null;
        }
        this.s = false;
        this.w = true;
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    public nw0 getDelegate() {
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.L2);
    }

    public void setDelegate(nw0 nw0Var) {
        this.c = nw0Var;
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
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, g6Var));
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, g6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.l6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.l6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.l6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.l6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
