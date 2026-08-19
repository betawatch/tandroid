package j$.util.stream;

/* loaded from: classes2.dex */
public final class g2 extends b2 {
    public long b;
    public long c;
    public final /* synthetic */ h2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, f2 f2Var) {
        super(f2Var);
        this.d = h2Var;
        this.b = h2Var.m;
        long j = h2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(q1.x(j, this.d.m, this.c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.s((f2) obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final boolean C() {
        return this.c == 0 || this.a.C();
    }
}
