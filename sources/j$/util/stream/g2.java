package j$.util.stream;

/* loaded from: classes2.dex */
final class g2 extends X1 {
    long b;
    long c;
    final /* synthetic */ h2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g2(h2 h2Var, d2 d2Var) {
        super(d2Var);
        this.d = h2Var;
        this.b = h2Var.m;
        long j = h2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final void n(long j) {
        this.a.n(t0.z(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
