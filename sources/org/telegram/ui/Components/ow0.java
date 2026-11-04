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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ow0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public sp0 I;
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
    public org.telegram.messenger.f6 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public Integer b0;
    public mw0 c;
    public Integer c0;
    public kw0 d;
    public float d0;
    public lw0 e;
    public u5 e0;
    public org.telegram.ui.n4 f;
    public u5 f0;
    public u5 g0;
    public int h;
    public int n;
    public jw0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public ow0(Context context, int i3, org.telegram.ui.mj mjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.a = i3;
        this.c = mjVar;
        this.b = e6Var;
        postDelayed(new ii.i2(i3, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.gs getPreviewDelegate() {
        if (this.r == null) {
            this.r = new jw0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.P = new Path();
        this.Q = new Path();
        kw0 kw0Var = new kw0(0, getContext(), this);
        this.d = kw0Var;
        xq xqVar = xq.h;
        this.S = new u5(kw0Var, 120L, 350L, xqVar);
        this.T = new u5(this.d, 150L, 600L, xqVar);
        new OvershootInterpolator(0.4f);
        this.U = new u5(this.d, 300L, xqVar);
        this.V = new u5(this.d, 300L, xqVar);
        this.e0 = new u5(this.d, 200L, xqVar);
        this.f0 = new u5(this.d, 350L, xqVar);
        this.g0 = new u5(this.d, 350L, xqVar);
        lw0 lw0Var = new lw0(this, getContext());
        this.e = lw0Var;
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(6, this, this);
        this.f = n4Var;
        lw0Var.setAdapter(n4Var);
        getContext();
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        u4.k kVar = new u4.k();
        kVar.n(45L);
        kVar.o = xqVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.r6.K(this.e, org.telegram.ui.ActionBar.k6.i6, this.b);
        lw0 lw0Var2 = this.e;
        k kVar2 = new k(this, 17);
        lw0Var2.setOnItemClickListener(kVar2);
        this.e.setOnTouchListener(new gi.n1(4, this, kVar2));
        this.d.addView(this.e, b8.mf.c(52.0f, -1));
        addView(this.d, b8.mf.a(-1.0f, 66.66f, 80));
        mw0 mw0Var = this.c;
        if (mw0Var != null) {
            mw0Var.d(new bh.h(this, 23));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i3 != org.telegram.messenger.hs.i4 || this.e == null) {
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
        sp0 sp0Var = this.I;
        if (sp0Var != null) {
            org.telegram.messenger.g0.r(sp0Var);
        }
        sp0 sp0Var2 = new sp0(this, 11);
        this.I = sp0Var2;
        org.telegram.messenger.g0.i3(sp0Var2, 16L);
    }

    public final void f() {
        sp0 sp0Var = this.I;
        if (sp0Var != null) {
            org.telegram.messenger.g0.r(sp0Var);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        kw0 kw0Var = this.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    public mw0 getDelegate() {
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
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.L2);
    }

    public void setDelegate(mw0 mw0Var) {
        this.c = mw0Var;
    }

    public void setDirection(int i3) {
        if (this.h != i3) {
            this.h = i3;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i3) {
        this.n = i3;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qf, e6Var));
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qf, e6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.k6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.k6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        kw0 kw0Var = this.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
