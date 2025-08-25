package j$.util.stream;

/* loaded from: classes2.dex */
final class r2 extends h2 {
    long b;
    long c;
    final /* synthetic */ s2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(s2 s2Var, m2 m2Var) {
        super(m2Var);
        this.d = s2Var;
        this.b = s2Var.m;
        long j = s2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(w0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
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

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
