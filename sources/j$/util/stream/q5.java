package j$.util.stream;

/* loaded from: classes2.dex */
public final class q5 extends c5 {
    public long b;
    public long c;
    public final /* synthetic */ r5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, j5 j5Var) {
        super(j5Var);
        this.d = r5Var;
        this.b = r5Var.s;
        long j10 = r5Var.t;
        this.c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(t3.W(j10, this.d.s, this.c));
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        long j10 = this.b;
        if (j10 == 0) {
            long j11 = this.c;
            if (j11 > 0) {
                this.c = j11 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j10 - 1;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
