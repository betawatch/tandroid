package m2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public j(long j3, long j10, String str) {
        this.c = str == null ? "" : str;
        this.a = j3;
        this.b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        String l4 = e2.a.l(str, this.c);
        if (jVar != null) {
            long j10 = jVar.b;
            if (l4.equals(e2.a.l(str, jVar.c))) {
                long j11 = this.b;
                if (j11 != -1) {
                    j3 = j10;
                    long j12 = this.a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.a) {
                        return new j(j12, j3 == -1 ? -1L : j11 + j3, l4);
                    }
                } else {
                    jVar2 = null;
                    j3 = j10;
                }
                if (j3 == -1) {
                    return jVar2;
                }
                long j13 = jVar.a;
                if (j13 + j3 == this.a) {
                    return new j(j13, j11 == -1 ? -1L : j3 + j11, l4);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c.equals(jVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.c);
        sb2.append(", start=");
        sb2.append(this.a);
        sb2.append(", length=");
        return a4.a.r(sb2, this.b, ")");
    }
}
