package f9;

import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s0 extends b0 {
    @Override // f9.c0
    public final /* bridge */ /* synthetic */ c0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final t0 g() {
        int i10 = this.b;
        if (i10 == 0) {
            int i11 = t0.c;
            return z1.s;
        }
        if (i10 != 1) {
            t0 t10 = t0.t(i10, this.a);
            this.b = t10.size();
            this.c = true;
            return t10;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i12 = t0.c;
        return new e2(obj);
    }
}
