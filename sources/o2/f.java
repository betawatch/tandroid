package o2;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final long k() {
        a();
        return this.e + ((p2.k) this.d.get((int) this.c)).e;
    }

    @Override // v2.m
    public final long y() {
        a();
        p2.k kVar = (p2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }
}
