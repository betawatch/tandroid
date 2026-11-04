package g9;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 extends b0 {
    @Override // g9.c0
    public final /* bridge */ /* synthetic */ c0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final t0 g() {
        int i3 = this.b;
        if (i3 == 0) {
            int i10 = t0.c;
            return z1.s;
        }
        if (i3 != 1) {
            t0 p10 = t0.p(i3, this.a);
            this.b = p10.size();
            this.c = true;
            return p10;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i11 = t0.c;
        return new e2(obj);
    }
}
