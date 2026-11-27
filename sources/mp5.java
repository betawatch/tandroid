// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mp5 implements ez9 {
    public final long a;
    public final long b;
    public final int c;
    public final lp5 d;

    public mp5(long j, long j2, long j3) {
        this.d = new lp5(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = cue.a(j3 - j2, j);
    }

    @Override // ez9
    public final long a() {
        return this.b;
    }

    @Override // ez9
    public final long b() {
        return this.a;
    }

    @Override // zy9
    public final boolean c() {
        return this.d.c();
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        return this.d.e(j);
    }

    @Override // ez9
    public final long f(long j) {
        lp5 lp5Var = this.d;
        ed edVar = lp5Var.b;
        if (edVar.b == 0) {
            return -9223372036854775807L;
        }
        return edVar.h0(gcc.c(lp5Var.a, j));
    }

    @Override // ez9
    public final int g() {
        return this.c;
    }

    @Override // zy9
    public final long h() {
        return this.d.c;
    }
}
