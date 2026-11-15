package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ef0 {
    public int a;
    public final dc b;
    public final u5 e;
    public Drawable i;
    public Drawable j;
    public ch0 k;
    public oy0 l;
    public d80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ hf0 y;
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

    public ef0(hf0 hf0Var) {
        this.y = hf0Var;
        this.b = new dc(hf0Var);
        this.e = new u5(hf0Var, 0L, 250L, er.f);
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
        u5 u5Var = this.e;
        if (z10) {
            return 1.0f - u5Var.e(false, 1.0f);
        }
        if (this.n) {
            return u5Var.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        oy0 oy0Var = new oy0(str, 11.0f, org.telegram.messenger.g0.o());
        oy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        oy0Var.a();
        this.l = oy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        hf0 hf0Var = this.y;
        if (i7 != 0) {
            ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ch0Var.R(hf0Var);
            ch0Var.start();
            this.k = ch0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? hf0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? hf0Var.getResources().getDrawable(i11).mutate() : null;
        ch0 ch0Var2 = this.k;
        Rect rect = this.h;
        if (ch0Var2 != null) {
            ch0Var2.setBounds(rect);
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

    public ef0(hf0 hf0Var, ff0 ff0Var) {
        this.y = hf0Var;
        this.b = new dc(hf0Var);
        this.e = new u5(hf0Var, 0L, 250L, er.f);
        d(0, ff0Var.b, ff0Var.c);
        c(org.telegram.messenger.hd.M0(ff0Var.a, null));
    }
}
