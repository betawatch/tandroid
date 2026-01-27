package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class a2 extends i2 {
    public final /* synthetic */ int b = 1;
    boolean c;
    Object d;
    final /* synthetic */ b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(V v, m2 m2Var) {
        super(m2Var);
        this.e = v;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.d = new T(m2Var2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x xVar, m2 m2Var) {
        super(m2Var);
        this.e = xVar;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.d = new p(m2Var2);
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        switch (this.b) {
            case 0:
                LongStream longStream = (LongStream) ((a) ((g0) this.e).n).apply((a) obj);
                if (longStream != null) {
                    try {
                        boolean z = this.c;
                        c0 c0Var = (c0) this.d;
                        if (!z) {
                            longStream.sequential().forEach(c0Var);
                        } else {
                            j$.util.c0 spliterator = longStream.sequential().spliterator();
                            while (!this.a.n() && spliterator.tryAdvance((LongConsumer) c0Var)) {
                            }
                        }
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
                IntStream intStream = (IntStream) ((a) ((V) this.e).n).apply((a) obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        T t = (T) this.d;
                        if (!z2) {
                            intStream.sequential().forEach(t);
                        } else {
                            j$.util.Z spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.n() && spliterator2.tryAdvance((IntConsumer) t)) {
                            }
                        }
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
                D d = (D) ((a) ((x) this.e).n).apply((a) obj);
                if (d != null) {
                    try {
                        boolean z3 = this.c;
                        p pVar = (p) this.d;
                        if (!z3) {
                            d.sequential().forEach(pVar);
                        } else {
                            j$.util.W spliterator3 = d.sequential().spliterator();
                            while (!this.a.n() && spliterator3.tryAdvance((DoubleConsumer) pVar)) {
                            }
                        }
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

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final boolean n() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(g0 g0Var, m2 m2Var) {
        super(m2Var);
        this.e = g0Var;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.d = new c0(m2Var2);
    }
}
