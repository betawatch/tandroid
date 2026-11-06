package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class bf0 {
    public int a;
    public final ic b;
    public final w5 e;
    public Drawable i;
    public Drawable j;
    public zg0 k;
    public my0 l;
    public a80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ ef0 y;
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

    public bf0(ef0 ef0Var) {
        this.y = ef0Var;
        this.b = new ic(ef0Var);
        this.e = new w5(ef0Var, 0L, 250L, xq.f);
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
        my0 my0Var = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        my0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var.a();
        this.l = my0Var;
    }

    public final void d(int i7, int i10, int i11) {
        ef0 ef0Var = this.y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.k = zg0Var;
        } else {
            this.k = null;
        }
        this.i = i10 != 0 ? ef0Var.getResources().getDrawable(i10).mutate() : null;
        this.j = i11 != 0 ? ef0Var.getResources().getDrawable(i11).mutate() : null;
        zg0 zg0Var2 = this.k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
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

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.y = ef0Var;
        this.b = new ic(ef0Var);
        this.e = new w5(ef0Var, 0L, 250L, xq.f);
        d(0, cf0Var.b, cf0Var.c);
        c(org.telegram.messenger.hd.M0(cf0Var.a, null));
    }
}
