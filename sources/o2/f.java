package o2;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public final long b() {
        a();
        return this.e + ((p2.j) this.d.get((int) this.c)).e;
    }

    @Override // v2.l
    public final long d() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.c);
        return this.e + jVar.e + jVar.c;
    }
}
