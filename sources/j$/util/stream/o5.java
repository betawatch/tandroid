package j$.util.stream;

/* loaded from: classes2.dex */
public final class o5 extends e5 {
    public long b;
    public long c;
    public final /* synthetic */ p5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, j5 j5Var) {
        super(j5Var);
        this.d = p5Var;
        this.b = p5Var.s;
        long j10 = p5Var.t;
        this.c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(t3.W(j10, this.d.s, this.c));
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j10) {
        long j11 = this.b;
        if (j11 == 0) {
            long j12 = this.c;
            if (j12 > 0) {
                this.c = j12 - 1;
                this.a.accept(j10);
                return;
            }
            return;
        }
        this.b = j11 - 1;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
