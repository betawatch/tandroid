package j$.util.stream;

import j$.util.function.LongFunction;

/* loaded from: classes2.dex */
final class e0 extends Y1 {
    public final /* synthetic */ int b;
    final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(b bVar, d2 d2Var, int i) {
        super(d2Var);
        this.b = i;
        this.c = bVar;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.d2
    public void n(long j) {
        switch (this.b) {
            case 4:
                this.a.n(-1L);
                break;
            case 5:
                this.a.n(-1L);
                break;
            default:
                super.n(j);
                break;
        }
    }

    @Override // j$.util.stream.d2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((j$.util.function.k0) ((w) this.c).n).applyAsLong(j));
                return;
            case 1:
                this.a.r((d2) ((LongFunction) ((u) this.c).n).apply(j));
                return;
            case 2:
                this.a.accept(((j$.util.function.f0) ((v) this.c).n).a.applyAsInt(j));
                return;
            case 3:
                this.a.accept(((j$.util.function.d0) ((t) this.c).n).a.applyAsDouble(j));
                return;
            case 4:
                LongStream longStream = (LongStream) ((LongFunction) ((w) this.c).n).apply(j);
                if (longStream != null) {
                    try {
                        longStream.sequential().c(new b0(1, this));
                    } catch (Throwable th) {
                        try {
                            longStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (longStream != null) {
                    longStream.close();
                    return;
                }
                return;
            case 5:
                if (((j$.util.function.b0) ((w) this.c).n).a.test(j)) {
                    this.a.accept(j);
                    return;
                }
                return;
            default:
                ((j$.util.function.Y) ((w) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
