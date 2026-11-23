package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pf0 {
    public int a;
    public final lc b;
    public final c6 e;
    public Drawable i;
    public Drawable j;
    public nh0 k;
    public wy0 l;
    public n80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ sf0 y;
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

    public pf0(sf0 sf0Var) {
        this.y = sf0Var;
        this.b = new lc(sf0Var);
        this.e = new c6(sf0Var, 0L, 250L, kr.f);
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
        wy0 wy0Var = new wy0(str, 11.0f, org.telegram.messenger.g0.o());
        wy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var.a();
        this.l = wy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        sf0 sf0Var = this.y;
        if (i7 != 0) {
            nh0 nh0Var = new nh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            nh0Var.R(sf0Var);
            nh0Var.start();
            this.k = nh0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? sf0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? sf0Var.getResources().getDrawable(i11).mutate() : null;
        nh0 nh0Var2 = this.k;
        Rect rect = this.h;
        if (nh0Var2 != null) {
            nh0Var2.setBounds(rect);
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

    public pf0(sf0 sf0Var, qf0 qf0Var) {
        this.y = sf0Var;
        this.b = new lc(sf0Var);
        this.e = new c6(sf0Var, 0L, 250L, kr.f);
        d(0, qf0Var.b, qf0Var.c);
        c(org.telegram.messenger.gd.N0(qf0Var.a, null));
    }
}
