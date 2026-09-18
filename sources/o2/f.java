package o2;

import java.util.List;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
