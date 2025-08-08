package j$.util.stream;

/* loaded from: classes2.dex */
final class k2 extends W1 {
    long b;
    long c;
    final /* synthetic */ l2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k2(l2 l2Var, d2 d2Var) {
        super(d2Var);
        this.d = l2Var;
        this.b = l2Var.m;
        long j = l2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.W1, j$.util.stream.d2
    public final void n(long j) {
        this.a.n(t0.z(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.d2, j$.util.function.l
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

    @Override // j$.util.stream.W1, j$.util.stream.d2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
