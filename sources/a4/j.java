package a4;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
