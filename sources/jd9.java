// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class jd9 extends FrameLayout {
    public ll0 a;
    public final re1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public jd9(Context context) {
        super(context);
        re1 re1Var = new re1();
        re1Var.b = Long.MIN_VALUE;
        re1Var.a = -1;
        this.b = re1Var;
    }

    public final void c(ll0 ll0Var) {
        this.b.a(ll0Var, new h68(this, (byte) 27));
    }

    public int d() {
        return 0;
    }

    public void e(int i) {
        int i2;
        int d = uue.d(this.a);
        int i3 = 0;
        int d2 = (i > 0 || d > 0) ? d() : 0;
        ll0 ll0Var = this.a;
        if (ll0Var == null || !ll0Var.n) {
            i2 = this.e;
        } else {
            i2 = ll0Var.l <= 0 ? 0 : gm.L(((r3 - 1) << 4) + 10);
        }
        ll0 ll0Var2 = this.a;
        if (ll0Var2 == null || !ll0Var2.o) {
            i3 = this.h;
        } else {
            if (ll0Var2.m > 0) {
                i3 = gm.L(((r4 - 1) << 4) + 10);
            }
        }
        int i4 = i + d2;
        int i5 = d + d2;
        int i6 = this.d;
        int i7 = this.f;
        if (jb6.a0) {
            setPadding(i6 + i5, i2, i7 + i4, i3);
        } else {
            setPadding(i6 + i4, i2, i7 + i5, i3);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
        int i5 = this.c;
        if (jb6.a0) {
            setPadding(i, i2, i3 + i5, i4);
        } else {
            setPadding(i + i5, i2, i3, i4);
        }
    }
}
