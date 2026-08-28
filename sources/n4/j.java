package n4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public j(long j10, long j11, String str) {
        this.c = str == null ? "" : str;
        this.a = j10;
        this.b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String G = d5.a.G(str, this.c);
        if (jVar != null) {
            long j11 = jVar.b;
            if (G.equals(d5.a.G(str, jVar.c))) {
                long j12 = this.b;
                if (j12 != -1) {
                    j10 = j11;
                    long j13 = this.a;
                    jVar2 = null;
                    if (j13 + j12 == jVar.a) {
                        return new j(j13, j10 == -1 ? -1L : j12 + j10, G);
                    }
                } else {
                    jVar2 = null;
                    j10 = j11;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j14 = jVar.a;
                if (j14 + j10 == this.a) {
                    return new j(j14, j12 == -1 ? -1L : j10 + j12, G);
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
        return aa.d.q(sb2, this.b, ")");
    }
}
