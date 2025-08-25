package j$.util.stream;

/* loaded from: classes2.dex */
final class t2 extends f2 {
    long b;
    long c;
    final /* synthetic */ u2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t2(u2 u2Var, m2 m2Var) {
        super(m2Var);
        this.d = u2Var;
        this.b = u2Var.m;
        long j = u2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(w0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
