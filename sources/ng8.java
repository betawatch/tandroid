// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ng8 extends asb {
    public static final Object j = new Object();
    public final ft6 e;
    public final boolean f;
    public final boolean g;
    public final at6 h;
    public final long i;

    public ng8(og8 og8Var) {
        this.e = og8Var.u();
        this.f = og8Var.c0();
        this.g = og8Var.u0();
        this.h = og8Var.P0() ? at6.f : null;
        this.i = gcc.T(og8Var.z());
    }

    @Override // asb
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        ea eaVar = ea.c;
        Object obj = j;
        xrbVar.h(obj, obj, 0, this.i, 0L, false);
        return xrbVar;
    }

    @Override // asb
    public final int h() {
        return 1;
    }

    @Override // asb
    public final Object l(int i) {
        return j;
    }

    @Override // asb
    public final zrb m(int i, zrb zrbVar, long j2) {
        zrbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        zrbVar.j = false;
        return zrbVar;
    }

    @Override // asb
    public final int o() {
        return 1;
    }
}
