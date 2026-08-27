package o4;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final long g() {
        a();
        return this.e + ((p4.h) this.d.get((int) this.c)).e;
    }

    @Override // l4.l
    public final long i() {
        a();
        p4.h hVar = (p4.h) this.d.get((int) this.c);
        return this.e + hVar.e + hVar.c;
    }
}
