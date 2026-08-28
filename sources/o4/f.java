package o4;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends l4.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override // l4.l
    public final long c() {
        a();
        return this.e + ((p4.h) this.d.get((int) this.c)).e;
    }

    @Override // l4.l
    public final long p() {
        a();
        p4.h hVar = (p4.h) this.d.get((int) this.c);
        return this.e + hVar.e + hVar.c;
    }
}
