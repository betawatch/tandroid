// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class af1 extends rcb implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        af1 af1Var = (af1) obj;
        if (isEndOfStream() != af1Var.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = this.e - af1Var.e;
        if (j == 0) {
            j = this.s - af1Var.s;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
