// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kj1 implements ij1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final sw5 d;

    public kj1(long j, long j2, boolean z, sw5 sw5Var) {
        gre.f(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = sw5Var;
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj1.class != obj.getClass()) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.a == kj1Var.a && this.b == kj1Var.b && this.c == kj1Var.c && Objects.equals(this.d, kj1Var.d);
    }

    public final int hashCode() {
        int b = (((zne.b(this.b) + ((zne.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        sw5 sw5Var = this.d;
        return b + (sw5Var != null ? sw5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str = "";
        sb.append(j2 == -9223372036854775807L ? "" : ls6.n(j2, ", endTimeMs="));
        sb.append(this.c ? ", hidden" : "");
        sw5 sw5Var = this.d;
        if (sw5Var != null) {
            str = ", title=" + sw5Var;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
