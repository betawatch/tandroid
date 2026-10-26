package f9;

import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
