// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oh7 implements tf7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public oh7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oh7.class == obj.getClass()) {
            oh7 oh7Var = (oh7) obj;
            if (this.a == oh7Var.a && this.b == oh7Var.b && this.c == oh7Var.c && this.d == oh7Var.d && this.e == oh7Var.e) {
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

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
