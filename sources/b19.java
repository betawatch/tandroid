// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b19 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public b19(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final b19 a(b19 b19Var, String str) {
        b19 b19Var2;
        String c = lze.c(str, this.c);
        if (b19Var == null) {
            return null;
        }
        long j = b19Var.b;
        if (!c.equals(lze.c(str, b19Var.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            b19Var2 = null;
            if (j3 + j2 == b19Var.a) {
                return new b19(j3, c, j != -1 ? j2 + j : -1L);
            }
        } else {
            b19Var2 = null;
        }
        if (j != -1) {
            long j4 = b19Var.a;
            if (j4 + j == this.a) {
                return new b19(j4, c, j2 != -1 ? j + j2 : -1L);
            }
        }
        return b19Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b19.class == obj.getClass()) {
            b19 b19Var = (b19) obj;
            if (this.a == b19Var.a && this.b == b19Var.b && this.c.equals(b19Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        this.d = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return kt6.q(sb, this.b, ")");
    }
}
