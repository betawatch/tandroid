package oi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ea;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements j4 {
    public a a;
    public final m5.b b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public y(Context context) {
        super(context);
        m5.b bVar = new m5.b();
        bVar.a = Long.MIN_VALUE;
        bVar.b = -1;
        this.b = bVar;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new kg.x1(this, 19));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int i10;
        int d = ea.d(this.a);
        int i11 = 0;
        int d2 = (i7 > 0 || d > 0) ? d() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i10 = this.e;
        } else {
            i10 = aVar.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i11 = this.h;
        } else {
            if (aVar2.m > 0) {
                i11 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r7, 1, 16, 10));
            }
        }
        int i12 = i7 + d2;
        int i13 = d + d2;
        int i14 = this.d;
        int i15 = this.f;
        if (gd.a0) {
            setPadding(i14 + i13, i10, i15 + i12, i11);
        } else {
            setPadding(i14 + i12, i10, i15 + i13, i11);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.e = i10;
        this.f = i11;
        this.h = i12;
        int i13 = this.c;
        if (gd.a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
