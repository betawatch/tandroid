package a4;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j extends z3.i implements Comparable {
    public long w;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        if (c(4) != jVar.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j3 = this.h - jVar.h;
        if (j3 == 0) {
            j3 = this.w - jVar.w;
            if (j3 == 0) {
                return 0;
            }
        }
        return j3 > 0 ? 1 : -1;
    }
}
