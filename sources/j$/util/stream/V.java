package j$.util.stream;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class V extends X1 {
    public final /* synthetic */ int b;
    final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(b bVar, d2 d2Var, int i) {
        super(d2Var);
        this.b = i;
        this.c = bVar;
    }

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public void n(long j) {
        switch (this.b) {
            case 5:
                this.a.n(-1L);
                break;
            case 6:
                this.a.n(-1L);
                break;
            default:
                super.n(j);
                break;
        }
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                ((j$.util.function.G) ((v) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 1:
                this.a.accept(((j$.util.function.P) ((v) this.c).n).a.applyAsInt(i));
                return;
            case 2:
                this.a.r((d2) ((IntFunction) ((u) this.c).n).apply(i));
                return;
            case 3:
                this.a.accept(((j$.util.function.O) ((w) this.c).n).applyAsLong(i));
                return;
            case 4:
                this.a.accept(((j$.util.function.K) ((t) this.c).n).a.applyAsDouble(i));
                return;
            case 5:
                IntStream intStream = (IntStream) ((IntFunction) ((v) this.c).n).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().J(new T(1, this));
                    } catch (Throwable th) {
                        try {
                            intStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((j$.util.function.I) ((v) this.c).n).a.test(i)) {
                    this.a.accept(i);
                    return;
                }
                return;
        }
    }
}
