package a4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends z3.i implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        if (isEndOfStream() != iVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j10 = this.e - iVar.e;
        if (j10 == 0) {
            j10 = this.s - iVar.s;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
