package o2;

import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
    public final long f() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.c);
        return this.e + jVar.e + jVar.c;
    }
}
