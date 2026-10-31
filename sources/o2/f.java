package o2;

import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends v2.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override // v2.m
    public final long C() {
        a();
        p2.k kVar = (p2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }

    @Override // v2.m
    public final long k() {
        a();
        return this.e + ((p2.k) this.d.get((int) this.c)).e;
    }
}
