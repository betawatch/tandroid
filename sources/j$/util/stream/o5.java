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
        long j3 = p5Var.t;
        this.c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j3) {
        this.a.o(t3.W(j3, this.d.s, this.c));
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j3) {
        long j10 = this.b;
        if (j10 == 0) {
            long j11 = this.c;
            if (j11 > 0) {
                this.c = j11 - 1;
                this.a.accept(j3);
                return;
            }
            return;
        }
        this.b = j10 - 1;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
