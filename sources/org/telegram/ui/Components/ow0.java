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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ow0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public jr0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public v5 R;
    public v5 S;
    public v5 T;
    public v5 U;
    public org.telegram.messenger.f6 V;
    public float W;
    public final int a;
    public Integer a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public Integer b0;
    public mw0 c;
    public float c0;
    public bi.e5 d;
    public v5 d0;
    public lw0 e;
    public v5 e0;
    public org.telegram.ui.l4 f;
    public v5 f0;
    public int h;
    public int n;
    public kw0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public ow0(Context context, int i7, org.telegram.ui.sj sjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.g0.L(10.0f);
        this.N = 0L;
        this.a = i7;
        this.c = sjVar;
        this.b = h6Var;
        postDelayed(new hi.j2(i7, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.r == null) {
            this.r = new kw0(this);
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
        wq wqVar = wq.h;
        this.R = new v5(e5Var, 120L, 350L, wqVar);
        this.S = new v5(this.d, 150L, 600L, wqVar);
        new OvershootInterpolator(0.4f);
        this.T = new v5(this.d, 300L, wqVar);
        this.U = new v5(this.d, 300L, wqVar);
        this.d0 = new v5(this.d, 200L, wqVar);
        this.e0 = new v5(this.d, 350L, wqVar);
        this.f0 = new v5(this.d, 350L, wqVar);
        lw0 lw0Var = new lw0(this, getContext());
        this.e = lw0Var;
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
        this.f = l4Var;
        lw0Var.setAdapter(l4Var);
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        v4.k kVar = new v4.k();
        kVar.n(45L);
        kVar.o = wqVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.t6.J(this.e, org.telegram.ui.ActionBar.m6.i6, this.b);
        lw0 lw0Var2 = this.e;
        j jVar = new j(this, 17);
        lw0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new fi.n1(4, this, jVar));
        this.d.addView(this.e, c8.ha.c(52.0f, -1));
        addView(this.d, c8.ha.a(-1.0f, 66.66f, 80));
        mw0 mw0Var = this.c;
        if (mw0Var != null) {
            mw0Var.d(new ah.j(this, 23));
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
        jr0 jr0Var = this.H;
        if (jr0Var != null) {
            org.telegram.messenger.g0.r(jr0Var);
        }
        jr0 jr0Var2 = new jr0(this, 9);
        this.H = jr0Var2;
        org.telegram.messenger.g0.i3(jr0Var2, 16L);
    }

    public final void f() {
        jr0 jr0Var = this.H;
        if (jr0Var != null) {
            org.telegram.messenger.g0.r(jr0Var);
            this.H = null;
        }
        this.s = false;
        this.w = true;
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.L2);
    }

    public void setDelegate(mw0 mw0Var) {
        this.c = mw0Var;
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
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qf, h6Var));
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qf, h6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.m6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.m6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.m6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.m6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
