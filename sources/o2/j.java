package o2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public j(long j10, String str, long j11) {
        this.c = str == null ? "" : str;
        this.a = j10;
        this.b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = g2.f.f(str, this.c);
        if (jVar != null) {
            long j10 = jVar.b;
            if (f10.equals(g2.f.f(str, jVar.c))) {
                long j11 = this.b;
                if (j11 != -1) {
                    long j12 = this.a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.a) {
                        return new j(j12, f10, j10 != -1 ? j11 + j10 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j13 = jVar.a;
                if (j13 + j10 == this.a) {
                    return new j(j13, f10, j11 != -1 ? j10 + j11 : -1L);
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
