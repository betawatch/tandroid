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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class zw0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public bp0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public c6 S;
    public c6 T;
    public c6 U;
    public c6 V;
    public org.telegram.messenger.g6 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public Integer b0;
    public xw0 c;
    public Integer c0;
    public bi.g3 d;
    public float d0;
    public ww0 e;
    public c6 e0;
    public org.telegram.ui.l4 f;
    public c6 f0;
    public c6 g0;
    public int h;
    public int n;
    public vw0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public zw0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.a = i7;
        this.c = rjVar;
        this.b = i6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.r == null) {
            this.r = new vw0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.P = new Path();
        this.Q = new Path();
        bi.g3 g3Var = new bi.g3(29, getContext(), this);
        this.d = g3Var;
        kr krVar = kr.h;
        this.S = new c6(g3Var, 120L, 350L, krVar);
        this.T = new c6(this.d, 150L, 600L, krVar);
        new OvershootInterpolator(0.4f);
        this.U = new c6(this.d, 300L, krVar);
        this.V = new c6(this.d, 300L, krVar);
        this.e0 = new c6(this.d, 200L, krVar);
        this.f0 = new c6(this.d, 350L, krVar);
        this.g0 = new c6(this.d, 350L, krVar);
        ww0 ww0Var = new ww0(this, getContext());
        this.e = ww0Var;
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
        this.f = l4Var;
        ww0Var.setAdapter(l4Var);
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        this.e.setLayoutManager(c0Var);
        v4.l lVar = new v4.l();
        lVar.n(45L);
        lVar.o = krVar;
        this.e.setItemAnimator(lVar);
        org.telegram.ui.ActionBar.u6.J(this.e, org.telegram.ui.ActionBar.n6.i6, this.b);
        ww0 ww0Var2 = this.e;
        n nVar = new n(this, 17);
        ww0Var2.setOnItemClickListener(nVar);
        this.e.setOnTouchListener(new hi.x1(3, this, nVar));
        this.d.addView(this.e, c8.na.c(52.0f, -1));
        addView(this.d, c8.na.a(-1.0f, 66.66f, 80));
        xw0 xw0Var = this.c;
        if (xw0Var != null) {
            xw0Var.e(new ah.j(this, 26));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i7 != org.telegram.messenger.ks.l4 || this.e == null) {
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
        bp0 bp0Var = this.I;
        if (bp0Var != null) {
            org.telegram.messenger.g0.r(bp0Var);
        }
        bp0 bp0Var2 = new bp0(this, 12);
        this.I = bp0Var2;
        org.telegram.messenger.g0.h3(bp0Var2, 16L);
    }

    public final void f() {
        bp0 bp0Var = this.I;
        if (bp0Var != null) {
            org.telegram.messenger.g0.r(bp0Var);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        bi.g3 g3Var = this.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
    }

    public xw0 getDelegate() {
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
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.L2);
    }

    public void setDelegate(xw0 xw0Var) {
        this.c = xw0Var;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.tf, i6Var));
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.tf, i6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.n6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.n6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.n6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.n6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.g3 g3Var = this.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
