package j$.util.stream;

import j$.util.function.Function;

/* loaded from: classes2.dex */
final class Q1 extends Z1 {
    public final /* synthetic */ int b = 2;
    Object c;
    final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(v vVar, d2 d2Var) {
        super(d2Var);
        this.d = vVar;
        this.c = new T(0, d2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(t tVar, d2 d2Var) {
        super(d2Var);
        this.d = tVar;
        this.c = new p(0, d2Var);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void n(long j) {
        switch (this.b) {
            case 0:
                this.a.n(-1L);
                break;
            case 1:
                this.a.n(-1L);
                break;
            default:
                this.a.n(-1L);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        switch (this.b) {
            case 0:
                LongStream longStream = (LongStream) ((Function) ((w) this.d).n).apply(obj);
                if (longStream != null) {
                    try {
                        longStream.sequential().c((b0) this.c);
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
            case 1:
                IntStream intStream = (IntStream) ((Function) ((v) this.d).n).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().J((T) this.c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                D d = (D) ((Function) ((t) this.d).n).apply(obj);
                if (d != null) {
                    try {
                        d.sequential().i((p) this.c);
                    } catch (Throwable th5) {
                        try {
                            d.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (d != null) {
                    d.close();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(w wVar, d2 d2Var) {
        super(d2Var);
        this.d = wVar;
        this.c = new b0(0, d2Var);
    }
}
