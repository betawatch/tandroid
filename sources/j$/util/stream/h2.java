package j$.util.stream;

/* loaded from: classes2.dex */
public final class h2 extends c2 {
    public long b;
    public long c;
    public final /* synthetic */ i2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, g2 g2Var) {
        super(g2Var);
        this.d = i2Var;
        this.b = i2Var.m;
        long j = i2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(r1.x(j, this.d.m, this.c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.s((g2) obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
