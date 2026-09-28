package o2;

import java.util.List;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
