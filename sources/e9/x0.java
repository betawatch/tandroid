package e9;

import j$.util.Objects;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
