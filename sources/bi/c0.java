package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class c0 extends FrameLayout implements v4 {
    public a a;
    public final d0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public c0(Context context) {
        super(context);
        d0 d0Var = new d0();
        d0Var.b = Long.MIN_VALUE;
        d0Var.a = -1;
        this.b = d0Var;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new a1.c(this, 7));
    }

    public int d() {
        return 0;
    }

    public void e(int i10) {
        int i11;
        int d = v7.a5.d(this.a);
        int i12 = 0;
        int d10 = (i10 > 0 || d > 0) ? d() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : org.telegram.messenger.i0.L(i0.a.e(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = org.telegram.messenger.i0.L(i0.a.e(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + d10;
        int i14 = d + d10;
        int i15 = this.d;
        int i16 = this.f;
        if (cd.X) {
            setPadding(i15 + i14, i11, i16 + i13, i12);
        } else {
            setPadding(i15 + i13, i11, i16 + i14, i12);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
        int i14 = this.c;
        if (cd.X) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
