package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class df0 {
    public int a;
    public final gc b;
    public final u5 e;
    public Drawable i;
    public Drawable j;
    public ch0 k;
    public ly0 l;
    public w70 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ gf0 y;
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

    public df0(gf0 gf0Var) {
        this.y = gf0Var;
        this.b = new gc(gf0Var);
        this.e = new u5(gf0Var, 0L, 250L, xq.f);
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
        ly0 ly0Var = new ly0(str, 11.0f, org.telegram.messenger.g0.o());
        ly0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        this.l = ly0Var;
    }

    public final void d(int i3, int i10, int i11) {
        gf0 gf0Var = this.y;
        if (i3 != 0) {
            ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ch0Var.R(gf0Var);
            ch0Var.start();
            this.k = ch0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? gf0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? gf0Var.getResources().getDrawable(i11).mutate() : null;
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

    public df0(gf0 gf0Var, ef0 ef0Var) {
        this.y = gf0Var;
        this.b = new gc(gf0Var);
        this.e = new u5(gf0Var, 0L, 250L, xq.f);
        d(0, ef0Var.b, ef0Var.c);
        c(org.telegram.messenger.bd.M0(ef0Var.a, null));
    }
}
