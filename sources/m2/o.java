package m2;

import java.util.List;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
