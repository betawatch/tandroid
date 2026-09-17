package o2;

import java.util.List;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
    public final long d() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.c);
        return this.e + jVar.e + jVar.c;
    }
}
