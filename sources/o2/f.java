package o2;

import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
