// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jn5 implements kv9 {
    public final long a;
    public final long b;
    public final int c;
    public final in5 d;

    public jn5(long j, long j2, long j3) {
        this.d = new in5(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = gpe.a(j3 - j2, j);
    }

    @Override // kv9
    public final long a() {
        return this.b;
    }

    @Override // kv9
    public final long b() {
        return this.a;
    }

    @Override // fv9
    public final boolean c() {
        return this.d.c();
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // kv9
    public final long e(long j) {
        in5 in5Var = this.d;
        dd ddVar = in5Var.b;
        if (ddVar.b == 0) {
            return -9223372036854775807L;
        }
        return ddVar.f0(g8c.c(in5Var.a, j));
    }

    @Override // fv9
    public final ev9 f(long j) {
        return this.d.f(j);
    }

    @Override // kv9
    public final int g() {
        return this.c;
    }

    @Override // fv9
    public final long h() {
        return this.d.c;
    }
}
