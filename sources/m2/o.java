package m2;

import java.util.List;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j3, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j3, j10, j11, j12, list, j13, j14, j15);
        this.j = list2;
    }

    @Override // m2.n
    public final long d(long j3) {
        return this.j.size();
    }

    @Override // m2.n
    public final j h(k kVar, long j3) {
        return (j) this.j.get((int) (j3 - this.d));
    }

    @Override // m2.n
    public final boolean i() {
        return true;
    }
}
