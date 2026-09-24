package o2;

import java.util.List;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        return this.e + ((p2.j) this.d.get((int) this.c)).e;
    }

    @Override // v2.l
    public final long g() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.c);
        return this.e + jVar.e + jVar.c;
    }
}
