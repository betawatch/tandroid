// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nn8 {
    public byte a;
    public final u51 b;
    public final ln e;
    public Drawable i;
    public Drawable j;
    public p09 k;
    public uib l;
    public qa6 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public short x;
    public final /* synthetic */ qn8 y;
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
    public short v = 0;

    public nn8(qn8 qn8Var, on8 on8Var) {
        this.y = qn8Var;
        this.b = new u51(qn8Var);
        this.e = new ln(qn8Var, 0L, 250L, d53.f);
        d(0, on8Var.b, on8Var.c);
        c(jb6.M0(on8Var.a, null));
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
        float f = rectF.left;
        RectF rectF2 = this.f;
        float R1 = gm.R1(f, rectF2.left, e);
        RectF rectF3 = this.d;
        rectF3.left = R1;
        rectF3.right = gm.R1(rectF.right, rectF2.right, e);
    }

    public final float b() {
        boolean z = this.o;
        ln lnVar = this.e;
        if (z) {
            return 1.0f - lnVar.e(false, 1.0f);
        }
        if (this.n) {
            return lnVar.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        uib uibVar = new uib(str, 11.0f, gm.o());
        uibVar.l(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar.a();
        this.l = uibVar;
    }

    public final void d(int i, int i2, int i3) {
        qn8 qn8Var = this.y;
        if (i != 0) {
            p09 p09Var = new p09(i, gm.L(56.0f), gm.L(56.0f), false, null);
            p09Var.M(qn8Var);
            p09Var.start();
            this.k = p09Var;
        } else {
            this.k = null;
        }
        this.i = i2 != 0 ? qn8Var.getResources().getDrawable(i2).mutate() : null;
        this.j = i3 != 0 ? qn8Var.getResources().getDrawable(i3).mutate() : null;
        p09 p09Var2 = this.k;
        Rect rect = this.h;
        if (p09Var2 != null) {
            p09Var2.setBounds(rect);
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

    public nn8(qn8 qn8Var) {
        this.y = qn8Var;
        this.b = new u51(qn8Var);
        this.e = new ln(qn8Var, 0L, 250L, d53.f);
    }
}
