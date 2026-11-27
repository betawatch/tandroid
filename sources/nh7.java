// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nh7 implements sf7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public nh7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // sf7
    public final ko4 a() {
        return null;
    }

    @Override // sf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nh7.class == obj.getClass()) {
            nh7 nh7Var = (nh7) obj;
            if (this.a == nh7Var.a && this.b == nh7Var.b && this.c == nh7Var.c && this.d == nh7Var.d && this.e == nh7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tse.b(this.e) + ((tse.b(this.d) + ((tse.b(this.c) + ((tse.b(this.b) + ((tse.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
