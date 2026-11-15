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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class rw0 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public ro0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public u5 S;
    public u5 T;
    public u5 U;
    public u5 V;
    public org.telegram.messenger.g6 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public Integer b0;
    public pw0 c;
    public Integer c0;
    public bi.g2 d;
    public float d0;
    public ow0 e;
    public u5 e0;
    public org.telegram.ui.l4 f;
    public u5 f0;
    public u5 g0;
    public int h;
    public int n;
    public nw0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public rw0(Context context, int i7, org.telegram.ui.qj qjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.a = i7;
        this.c = qjVar;
        this.b = e6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.r == null) {
            this.r = new nw0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.P = new Path();
        this.Q = new Path();
        bi.g2 g2Var = new bi.g2(29, getContext(), this);
        this.d = g2Var;
        er erVar = er.h;
        this.S = new u5(g2Var, 120L, 350L, erVar);
        this.T = new u5(this.d, 150L, 600L, erVar);
        new OvershootInterpolator(0.4f);
        this.U = new u5(this.d, 300L, erVar);
        this.V = new u5(this.d, 300L, erVar);
        this.e0 = new u5(this.d, 200L, erVar);
        this.f0 = new u5(this.d, 350L, erVar);
        this.g0 = new u5(this.d, 350L, erVar);
        ow0 ow0Var = new ow0(this, getContext());
        this.e = ow0Var;
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
        this.f = l4Var;
        ow0Var.setAdapter(l4Var);
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        v4.k kVar = new v4.k();
        kVar.n(45L);
        kVar.o = erVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.q6.J(this.e, org.telegram.ui.ActionBar.j6.i6, this.b);
        ow0 ow0Var2 = this.e;
        j jVar = new j(this, 17);
        ow0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new hi.p1(4, this, jVar));
        this.d.addView(this.e, c8.ja.c(52.0f, -1));
        addView(this.d, c8.ja.a(-1.0f, 66.66f, 80));
        pw0 pw0Var = this.c;
        if (pw0Var != null) {
            pw0Var.e(new ah.j(this, 25));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i7 != org.telegram.messenger.ns.i4 || this.e == null) {
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
        ro0 ro0Var = this.I;
        if (ro0Var != null) {
            org.telegram.messenger.g0.r(ro0Var);
        }
        ro0 ro0Var2 = new ro0(this, 12);
        this.I = ro0Var2;
        org.telegram.messenger.g0.i3(ro0Var2, 16L);
    }

    public final void f() {
        ro0 ro0Var = this.I;
        if (ro0Var != null) {
            org.telegram.messenger.g0.r(ro0Var);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        bi.g2 g2Var = this.d;
        if (g2Var != null) {
            g2Var.invalidate();
        }
    }

    public pw0 getDelegate() {
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
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.L2);
    }

    public void setDelegate(pw0 pw0Var) {
        this.c = pw0Var;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.tf, e6Var));
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.tf, e6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.j6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.j6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.j6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.j6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.g2 g2Var = this.d;
        if (g2Var != null) {
            g2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
