package j$.util.stream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class q5 extends h5 {
    public long b;
    public long c;
    public final /* synthetic */ r5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, n5 n5Var) {
        super(n5Var);
        this.d = r5Var;
        this.b = r5Var.l;
        long j = r5Var.m;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void n(long j) {
        this.a.n(w3.y(j, this.d.l, this.c));
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
