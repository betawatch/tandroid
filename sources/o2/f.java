package o2;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f extends v2.b {
    public final List d;
    public final long e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.e = j3;
        this.d = list;
    }

    @Override // v2.l
    public final long a() {
        b();
        return this.e + ((p2.k) this.d.get((int) this.c)).e;
    }

    @Override // v2.l
    public final long g() {
        b();
        p2.k kVar = (p2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }
}
