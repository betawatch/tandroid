// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ef7 implements jd7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ef7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (obj != null && ef7.class == obj.getClass()) {
            ef7 ef7Var = (ef7) obj;
            if (this.a == ef7Var.a && this.b == ef7Var.b && this.c == ef7Var.c && this.d == ef7Var.d && this.e == ef7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zne.b(this.e) + ((zne.b(this.d) + ((zne.b(this.c) + ((zne.b(this.b) + ((zne.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
