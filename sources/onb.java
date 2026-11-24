// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class onb {
    public static final nnb Companion = new nnb();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ onb(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            are.a(i, 1, mnb.a.d());
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
        return (obj instanceof onb) && this.a == ((onb) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public onb(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
