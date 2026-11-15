package h9;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s0 extends b0 {
    @Override // h9.c0
    public final /* bridge */ /* synthetic */ c0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final t0 g() {
        int i7 = this.b;
        if (i7 == 0) {
            int i10 = t0.c;
            return z1.s;
        }
        if (i7 != 1) {
            t0 p10 = t0.p(i7, this.a);
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
