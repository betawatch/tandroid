package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class of0 {
    public int a;
    public final mc b;
    public final c6 e;
    public Drawable i;
    public Drawable j;
    public mh0 k;
    public vy0 l;
    public o80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ rf0 y;
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Rect h = new Rect();
    public float m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public final float q = 1.0f;
    public int v = 0;

    public of0(rf0 rf0Var) {
        this.y = rf0Var;
        this.b = new mc(rf0Var);
        this.e = new c6(rf0Var, 0L, 250L, lr.f);
    }

    public final void a() {
        float e10 = this.e.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.n = false;
            if (this.o) {
                this.p = true;
                return;
            }
            return;
        }
        RectF rectF = this.g;
        float f10 = rectF.left;
        RectF rectF2 = this.f;
        float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
        RectF rectF3 = this.d;
        rectF3.left = T1;
        rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
    }

    public final float b() {
        boolean z10 = this.o;
        c6 c6Var = this.e;
        if (z10) {
            return 1.0f - c6Var.e(false, 1.0f);
        }
        if (this.n) {
            return c6Var.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        vy0 vy0Var = new vy0(str, 11.0f, org.telegram.messenger.g0.o());
        vy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        this.l = vy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        rf0 rf0Var = this.y;
        if (i7 != 0) {
            mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            mh0Var.R(rf0Var);
            mh0Var.start();
            this.k = mh0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? rf0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? rf0Var.getResources().getDrawable(i11).mutate() : null;
        mh0 mh0Var2 = this.k;
        Rect rect = this.h;
        if (mh0Var2 != null) {
            mh0Var2.setBounds(rect);
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public of0(rf0 rf0Var, pf0 pf0Var) {
        this.y = rf0Var;
        this.b = new mc(rf0Var);
        this.e = new c6(rf0Var, 0L, 250L, lr.f);
        d(0, pf0Var.b, pf0Var.c);
        c(org.telegram.messenger.gd.M0(pf0Var.a, null));
    }
}
