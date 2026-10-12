package j$.util.stream;

/* loaded from: classes2.dex */
public final class m5 extends d5 {
    public long b;
    public long c;
    public final /* synthetic */ n5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, j5 j5Var) {
        super(j5Var);
        this.d = n5Var;
        this.b = n5Var.s;
        long j10 = n5Var.t;
        this.c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(t3.W(j10, this.d.s, this.c));
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        long j10 = this.b;
        if (j10 == 0) {
            long j11 = this.c;
            if (j11 > 0) {
                this.c = j11 - 1;
                this.a.accept(i10);
                return;
            }
            return;
        }
        this.b = j10 - 1;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
