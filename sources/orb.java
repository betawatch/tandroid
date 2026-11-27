// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class orb {
    public static final nrb Companion = new nrb();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ orb(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            sve.a(i, 1, mrb.a.d());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof orb) && this.a == ((orb) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public orb(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
