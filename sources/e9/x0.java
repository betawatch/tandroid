package e9;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x0 extends g0 {
    @Override // e9.h0
    public final /* bridge */ /* synthetic */ h0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final y0 g() {
        int i10 = this.b;
        if (i10 == 0) {
            int i11 = y0.c;
            return e2.s;
        }
        if (i10 != 1) {
            y0 t10 = y0.t(i10, this.a);
            this.b = t10.size();
            this.c = true;
            return t10;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i12 = y0.c;
        return new k2(obj);
    }
}
