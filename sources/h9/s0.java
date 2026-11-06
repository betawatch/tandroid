package h9;

import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
            return a2.s;
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
        return new f2(obj);
    }
}
