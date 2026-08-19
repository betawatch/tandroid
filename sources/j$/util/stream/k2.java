package j$.util.stream;

/* loaded from: classes2.dex */
public final class k2 extends a2 {
    public long b;
    public long c;
    public final /* synthetic */ l2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, f2 f2Var) {
        super(f2Var);
        this.d = l2Var;
        this.b = l2Var.m;
        long j = l2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(q1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
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

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
