package j$.util.stream;

/* loaded from: classes2.dex */
final class e2 extends Z1 {
    long b;
    long c;
    final /* synthetic */ f2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e2(f2 f2Var, d2 d2Var) {
        super(d2Var);
        this.d = f2Var;
        this.b = f2Var.m;
        long j = f2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void n(long j) {
        this.a.n(t0.z(j, this.d.m, this.c));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.r((d2) obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
