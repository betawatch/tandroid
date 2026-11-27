// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
