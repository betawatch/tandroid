package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cf0 {
    public int a;
    public final ic b;
    public final w5 e;
    public Drawable i;
    public Drawable j;
    public ah0 k;
    public ny0 l;
    public b80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ ff0 y;
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

    public cf0(ff0 ff0Var) {
        this.y = ff0Var;
        this.b = new ic(ff0Var);
        this.e = new w5(ff0Var, 0L, 250L, xq.f);
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
        boolean z9 = this.o;
        w5 w5Var = this.e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (this.n) {
            return w5Var.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        ny0 ny0Var = new ny0(str, 11.0f, org.telegram.messenger.g0.o());
        ny0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ny0Var.a();
        this.l = ny0Var;
    }

    public final void d(int i7, int i10, int i11) {
        ff0 ff0Var = this.y;
        if (i7 != 0) {
            ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ah0Var.R(ff0Var);
            ah0Var.start();
            this.k = ah0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? ff0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? ff0Var.getResources().getDrawable(i11).mutate() : null;
        ah0 ah0Var2 = this.k;
        Rect rect = this.h;
        if (ah0Var2 != null) {
            ah0Var2.setBounds(rect);
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

    public cf0(ff0 ff0Var, df0 df0Var) {
        this.y = ff0Var;
        this.b = new ic(ff0Var);
        this.e = new w5(ff0Var, 0L, 250L, xq.f);
        d(0, df0Var.b, df0Var.c);
        c(org.telegram.messenger.id.M0(df0Var.a, null));
    }
}
