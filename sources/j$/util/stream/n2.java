package j$.util.stream;

/* loaded from: classes2.dex */
public final class n2 extends Z1 {
    public long b;
    public long c;
    public final /* synthetic */ o2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, g2 g2Var) {
        super(g2Var);
        this.d = o2Var;
        this.b = o2Var.m;
        long j = o2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(r1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
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

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
