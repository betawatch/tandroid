package m2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        String f7 = e2.e.f(str, this.c);
        if (jVar != null) {
            long j11 = jVar.b;
            if (f7.equals(e2.e.f(str, jVar.c))) {
                long j12 = this.b;
                if (j12 != -1) {
                    j10 = j11;
                    long j13 = this.a;
                    jVar2 = null;
                    if (j13 + j12 == jVar.a) {
                        return new j(j13, j10 != -1 ? j12 + j10 : -1L, f7);
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
                    return new j(j14, j12 != -1 ? j10 + j12 : -1L, f7);
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
        return a1.g.r(sb2, this.b, ")");
    }
}
