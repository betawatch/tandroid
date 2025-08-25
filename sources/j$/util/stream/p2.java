package j$.util.stream;

/* loaded from: classes2.dex */
final class p2 extends g2 {
    long b;
    long c;
    final /* synthetic */ q2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(q2 q2Var, m2 m2Var) {
        super(m2Var);
        this.d = q2Var;
        this.b = q2Var.m;
        long j = q2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(w0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
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

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
