// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ai7 implements sf7 {
    public final long a;
    public final long b;
    public final long c;

    public ai7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (!(obj instanceof ai7)) {
            return false;
        }
        ai7 ai7Var = (ai7) obj;
        return this.a == ai7Var.a && this.b == ai7Var.b && this.c == ai7Var.c;
    }

    public final int hashCode() {
        return tse.b(this.c) + ((tse.b(this.b) + ((tse.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
