// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class jb9 extends FrameLayout {
    public lk0 a;
    public final jd1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public jb9(Context context) {
        super(context);
        jd1 jd1Var = new jd1();
        jd1Var.b = Long.MIN_VALUE;
        jd1Var.a = -1;
        this.b = jd1Var;
    }

    public final void c(lk0 lk0Var) {
        this.b.a(lk0Var, new k88(this, (byte) 23));
    }

    public int d() {
        return 0;
    }

    public void e(int i) {
        int i2;
        int d = rse.d(this.a);
        int i3 = 0;
        int d2 = (i > 0 || d > 0) ? d() : 0;
        lk0 lk0Var = this.a;
        if (lk0Var == null || !lk0Var.n) {
            i2 = this.e;
        } else {
            i2 = lk0Var.l <= 0 ? 0 : gl.L(((r3 - 1) << 4) + 10);
        }
        lk0 lk0Var2 = this.a;
        if (lk0Var2 == null || !lk0Var2.o) {
            i3 = this.h;
        } else {
            if (lk0Var2.m > 0) {
                i3 = gl.L(((r4 - 1) << 4) + 10);
            }
        }
        int i4 = i + d2;
        int i5 = d + d2;
        int i6 = this.d;
        int i7 = this.f;
        if (k96.a0) {
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
        if (k96.a0) {
            setPadding(i, i2, i3 + i5, i4);
        } else {
            setPadding(i + i5, i2, i3, i4);
        }
    }
}
