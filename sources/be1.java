// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class be1 extends neb implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        be1 be1Var = (be1) obj;
        if (isEndOfStream() != be1Var.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = this.e - be1Var.e;
        if (j == 0) {
            j = this.s - be1Var.s;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
