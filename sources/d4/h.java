package d4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h extends c4.i implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j3 = this.e - hVar.e;
        if (j3 == 0) {
            j3 = this.s - hVar.s;
            if (j3 == 0) {
                return 0;
            }
        }
        return j3 > 0 ? 1 : -1;
    }
}
