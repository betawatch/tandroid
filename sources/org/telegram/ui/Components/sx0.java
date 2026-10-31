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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class sx0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public uo0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public t5 R;
    public t5 S;
    public t5 T;
    public t5 U;
    public org.telegram.messenger.h6 V;
    public float W;
    public final int a;
    public Integer a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public Integer b0;
    public qx0 c;
    public float c0;
    public jg.l0 d;
    public t5 d0;
    public px0 e;
    public t5 e0;
    public fg.j f;
    public t5 f0;
    public int h;
    public int n;
    public ox0 r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public sx0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = 0;
        this.n = org.telegram.messenger.i0.L(10.0f);
        this.N = 0L;
        this.a = i10;
        this.c = mkVar;
        this.b = p6Var;
        postDelayed(new org.telegram.messenger.wd(i10, 9), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.jt getPreviewDelegate() {
        if (this.r == null) {
            this.r = new ox0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.O = new Path();
        this.P = new Path();
        jg.l0 l0Var = new jg.l0(this, getContext(), 27);
        this.d = l0Var;
        gr grVar = gr.h;
        this.R = new t5(l0Var, 120L, 350L, grVar);
        this.S = new t5(this.d, 150L, 600L, grVar);
        new OvershootInterpolator(0.4f);
        this.T = new t5(this.d, 300L, grVar);
        this.U = new t5(this.d, 300L, grVar);
        this.d0 = new t5(this.d, 200L, grVar);
        this.e0 = new t5(this.d, 350L, grVar);
        this.f0 = new t5(this.d, 350L, grVar);
        px0 px0Var = new px0(this, getContext());
        this.e = px0Var;
        fg.j jVar = new fg.j(7, this, this);
        this.f = jVar;
        px0Var.setAdapter(jVar);
        getContext();
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        this.e.setLayoutManager(a0Var);
        s4.j jVar2 = new s4.j();
        jVar2.n(45L);
        jVar2.o = grVar;
        this.e.setItemAnimator(jVar2);
        org.telegram.ui.ActionBar.a7.K(this.e, org.telegram.ui.ActionBar.t6.i6, this.b);
        px0 px0Var2 = this.e;
        k kVar = new k(this, 17);
        px0Var2.setOnItemClickListener(kVar);
        this.e.setOnTouchListener(new org.telegram.ui.ActionBar.d1(3, this, kVar));
        this.d.addView(this.e, w7.b6.c(52.0f, -1));
        addView(this.d, w7.b6.a(-1.0f, 66.66f, 80));
        qx0 qx0Var = this.c;
        if (qx0Var != null) {
            qx0Var.d(new ag.a1(this, 18));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.L2) {
            ArrayList arrayList = this.x;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i10 != org.telegram.messenger.zs.i4 || this.e == null) {
            return;
        }
        for (int i12 = 0; i12 < this.e.getChildCount(); i12++) {
            this.e.getChildAt(i12).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f0.c;
        float f10 = this.e0.c;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + r0.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
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
        uo0 uo0Var = this.H;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
        }
        uo0 uo0Var2 = new uo0(this, 14);
        this.H = uo0Var2;
        org.telegram.messenger.i0.h3(uo0Var2, 16L);
    }

    public final void f() {
        uo0 uo0Var = this.H;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
            this.H = null;
        }
        this.s = false;
        this.w = true;
        jg.l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public qx0 getDelegate() {
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
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.L2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.L2);
    }

    public void setDelegate(qx0 qx0Var) {
        this.c = qx0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.n = i10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qf, p6Var));
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qf, p6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.t6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.t6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.t6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        jg.l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
