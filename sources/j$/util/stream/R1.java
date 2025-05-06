package j$.util.stream;

import j$.util.function.Function;

/* loaded from: classes2.dex */
final class R1 extends a2 {
    public final /* synthetic */ int b = 2;
    Object c;
    final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(u uVar, e2 e2Var) {
        super(e2Var);
        this.d = uVar;
        this.c = new q(0, e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(w wVar, e2 e2Var) {
        super(e2Var);
        this.d = wVar;
        this.c = new U(0, e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(x xVar, e2 e2Var) {
        super(e2Var);
        this.d = xVar;
        this.c = new c0(0, e2Var);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        switch (this.b) {
            case 0:
                LongStream longStream = (LongStream) ((Function) ((x) this.d).n).apply(obj);
                if (longStream != null) {
                    try {
                        longStream.sequential().c((c0) this.c);
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
                IntStream intStream = (IntStream) ((Function) ((w) this.d).n).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().J((U) this.c);
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
                E e = (E) ((Function) ((u) this.d).n).apply(obj);
                if (e != null) {
                    try {
                        e.sequential().i((q) this.c);
                    } catch (Throwable th5) {
                        try {
                            e.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (e != null) {
                    e.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.a2, j$.util.stream.e2
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
}
