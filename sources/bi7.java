// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bi7 implements tf7 {
    public final long a;
    public final long b;
    public final long c;

    public bi7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (!(obj instanceof bi7)) {
            return false;
        }
        bi7 bi7Var = (bi7) obj;
        return this.a == bi7Var.a && this.b == bi7Var.b && this.c == bi7Var.c;
    }

    public final int hashCode() {
        return tse.b(this.c) + ((tse.b(this.b) + ((tse.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
