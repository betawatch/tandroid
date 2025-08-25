package j$.util.stream;

/* loaded from: classes2.dex */
final class n2 extends i2 {
    long b;
    long c;
    final /* synthetic */ o2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(o2 o2Var, m2 m2Var) {
        super(m2Var);
        this.d = o2Var;
        this.b = o2Var.m;
        long j = o2Var.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(w0.A(j, this.d.m, this.c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.p((m2) obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
