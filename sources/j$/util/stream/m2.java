package j$.util.stream;

/* loaded from: classes2.dex */
public final class m2 extends Y1 {
    public long b;
    public long c;
    public final /* synthetic */ n2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 n2Var, f2 f2Var) {
        super(f2Var);
        this.d = n2Var;
        this.b = n2Var.m;
        long j = n2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(q1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.c2, j$.util.stream.f2
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

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
