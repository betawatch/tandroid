package j$.util.stream;

/* loaded from: classes2.dex */
public final class k5 extends f5 {
    public long b;
    public long c;
    public final /* synthetic */ l5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(l5 l5Var, j5 j5Var) {
        super(j5Var);
        this.d = l5Var;
        this.b = l5Var.s;
        long j10 = l5Var.t;
        this.c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(t3.W(j10, this.d.s, this.c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        long j10 = this.b;
        if (j10 == 0) {
            long j11 = this.c;
            if (j11 > 0) {
                this.c = j11 - 1;
                this.a.x((j5) obj);
                return;
            }
            return;
        }
        this.b = j10 - 1;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
