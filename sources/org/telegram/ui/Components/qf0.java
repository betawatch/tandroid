package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qf0 {
    public int a;
    public final mc b;
    public final d6 e;
    public Drawable i;
    public Drawable j;
    public oh0 k;
    public xy0 l;
    public q80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ tf0 y;
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

    public qf0(tf0 tf0Var) {
        this.y = tf0Var;
        this.b = new mc(tf0Var);
        this.e = new d6(tf0Var, 0L, 250L, nr.f);
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
        d6 d6Var = this.e;
        if (z10) {
            return 1.0f - d6Var.e(false, 1.0f);
        }
        if (this.n) {
            return d6Var.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        xy0 xy0Var = new xy0(str, 11.0f, org.telegram.messenger.g0.o());
        xy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        this.l = xy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        tf0 tf0Var = this.y;
        if (i7 != 0) {
            oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            oh0Var.R(tf0Var);
            oh0Var.start();
            this.k = oh0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? tf0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? tf0Var.getResources().getDrawable(i11).mutate() : null;
        oh0 oh0Var2 = this.k;
        Rect rect = this.h;
        if (oh0Var2 != null) {
            oh0Var2.setBounds(rect);
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

    public qf0(tf0 tf0Var, rf0 rf0Var) {
        this.y = tf0Var;
        this.b = new mc(tf0Var);
        this.e = new d6(tf0Var, 0L, 250L, nr.f);
        d(0, rf0Var.b, rf0Var.c);
        c(org.telegram.messenger.hd.N0(rf0Var.a, null));
    }
}
