package a4;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class j extends z3.i implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        if (isEndOfStream() != jVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j3 = this.e - jVar.e;
        if (j3 == 0) {
            j3 = this.s - jVar.s;
            if (j3 == 0) {
                return 0;
            }
        }
        return j3 > 0 ? 1 : -1;
    }
}
