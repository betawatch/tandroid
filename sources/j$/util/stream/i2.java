package j$.util.stream;

/* loaded from: classes2.dex */
final class i2 extends Y1 {
    long b;
    long c;
    final /* synthetic */ j2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i2(j2 j2Var, d2 d2Var) {
        super(d2Var);
        this.d = j2Var;
        this.b = j2Var.m;
        long j = j2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.d2
    public final void n(long j) {
        this.a.n(t0.z(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.d2
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.d2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
