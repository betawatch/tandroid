package j$.util.stream;

/* loaded from: classes2.dex */
public final class i2 extends Z1 {
    public long b;
    public long c;
    public final /* synthetic */ j2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, f2 f2Var) {
        super(f2Var);
        this.d = j2Var;
        this.b = j2Var.m;
        long j = j2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(q1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
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

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
