package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eg0 {
    public int a;
    public final dc b;
    public final t5 e;
    public Drawable i;
    public Drawable j;
    public bi0 k;
    public qz0 l;
    public t80 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public int x;
    public final /* synthetic */ hg0 y;
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

    public eg0(hg0 hg0Var) {
        this.y = hg0Var;
        this.b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f);
    }

    public final void a() {
        float e = this.e.e(false, 1.0f);
        if (e == 1.0f) {
            this.n = false;
            if (this.o) {
                this.p = true;
                return;
            }
            return;
        }
        RectF rectF = this.g;
        float f7 = rectF.left;
        RectF rectF2 = this.f;
        float T1 = org.telegram.messenger.i0.T1(f7, rectF2.left, e);
        RectF rectF3 = this.d;
        rectF3.left = T1;
        rectF3.right = org.telegram.messenger.i0.T1(rectF.right, rectF2.right, e);
    }

    public final float b() {
        boolean z10 = this.o;
        t5 t5Var = this.e;
        if (z10) {
            return 1.0f - t5Var.e(false, 1.0f);
        }
        if (this.n) {
            return t5Var.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        qz0 qz0Var = new qz0(str, 11.0f, org.telegram.messenger.i0.o());
        qz0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var.a();
        this.l = qz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        hg0 hg0Var = this.y;
        if (i10 != 0) {
            bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), false, null);
            bi0Var.R(hg0Var);
            bi0Var.start();
            this.k = bi0Var;
        } else {
            this.k = null;
        }
        this.i = i11 != 0 ? hg0Var.getResources().getDrawable(i11).mutate() : null;
        this.j = i12 != 0 ? hg0Var.getResources().getDrawable(i12).mutate() : null;
        bi0 bi0Var2 = this.k;
        Rect rect = this.h;
        if (bi0Var2 != null) {
            bi0Var2.setBounds(rect);
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

    public eg0(hg0 hg0Var, fg0 fg0Var) {
        this.y = hg0Var;
        this.b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f);
        d(0, fg0Var.b, fg0Var.c);
        c(org.telegram.messenger.cd.L0(fg0Var.a, null));
    }
}
