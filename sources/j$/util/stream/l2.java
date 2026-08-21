package j$.util.stream;

/* loaded from: classes2.dex */
public final class l2 extends b2 {
    public long b;
    public long c;
    public final /* synthetic */ m2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, g2 g2Var) {
        super(g2Var);
        this.d = m2Var;
        this.b = m2Var.m;
        long j = m2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(r1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
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

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
