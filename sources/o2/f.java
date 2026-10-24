package o2;

import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public final long b() {
        a();
        return this.e + ((p2.l) this.d.get((int) this.c)).e;
    }

    @Override // v2.m
    public final long r() {
        a();
        p2.l lVar = (p2.l) this.d.get((int) this.c);
        return this.e + lVar.e + lVar.c;
    }
}
