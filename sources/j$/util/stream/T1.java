package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class T1 extends b2 {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(S s, f2 f2Var) {
        super(f2Var);
        this.e = s;
        f2 f2Var2 = this.a;
        Objects.requireNonNull(f2Var2);
        this.d = new j$.util.G(f2Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(u uVar, f2 f2Var) {
        super(f2Var);
        this.e = uVar;
        f2 f2Var2 = this.a;
        Objects.requireNonNull(f2Var2);
        this.d = new j$.util.C(f2Var2, 1);
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final void y(long j) {
        switch (this.b) {
            case 0:
                this.a.y(-1L);
                break;
            case 1:
                this.a.y(-1L);
                break;
            default:
                this.a.y(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        switch (this.b) {
            case 0:
                LongStream longStream = (LongStream) ((j$.time.t) ((c0) this.e).n).apply((j$.time.t) obj);
                if (longStream != null) {
                    try {
                        boolean z = this.c;
                        j$.util.K k = (j$.util.K) this.d;
                        if (!z) {
                            longStream.sequential().forEach(k);
                        } else {
                            j$.util.Z spliterator = longStream.sequential().spliterator();
                            while (!this.a.C() && spliterator.tryAdvance((LongConsumer) k)) {
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
                IntStream intStream = (IntStream) ((j$.time.t) ((S) this.e).n).apply((j$.time.t) obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        j$.util.G g = (j$.util.G) this.d;
                        if (!z2) {
                            intStream.sequential().forEach(g);
                        } else {
                            j$.util.W spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.C() && spliterator2.tryAdvance((IntConsumer) g)) {
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
                A a = (A) ((j$.time.t) ((u) this.e).n).apply((j$.time.t) obj);
                if (a != null) {
                    try {
                        boolean z3 = this.c;
                        j$.util.C c = (j$.util.C) this.d;
                        if (!z3) {
                            a.sequential().forEach(c);
                        } else {
                            j$.util.T spliterator3 = a.sequential().spliterator();
                            while (!this.a.C() && spliterator3.tryAdvance((DoubleConsumer) c)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            a.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (a != null) {
                    a.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final boolean C() {
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
        return this.a.C();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(c0 c0Var, f2 f2Var) {
        super(f2Var);
        this.e = c0Var;
        f2 f2Var2 = this.a;
        Objects.requireNonNull(f2Var2);
        this.d = new j$.util.K(f2Var2, 1);
    }
}
