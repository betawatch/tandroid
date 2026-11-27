package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class z4 extends j5 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(y yVar, n5 n5Var) {
        super(n5Var);
        this.e = yVar;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.e0(n5Var2, (byte) 1);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.b;
        n5 n5Var = this.a;
        a aVar = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                j$.util.m0 m0Var = (j$.util.m0) obj2;
                LongStream longStream = (LongStream) ((j$.time.v) ((h1) aVar).m).apply((j$.time.v) obj);
                if (longStream != null) {
                    try {
                        if (this.c) {
                            j$.util.a1 spliterator = longStream.sequential().spliterator();
                            while (!n5Var.q() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                            }
                        } else {
                            longStream.sequential().forEach(m0Var);
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
                j$.util.i0 i0Var = (j$.util.i0) obj2;
                IntStream intStream = (IntStream) ((j$.time.v) ((w0) aVar).m).apply((j$.time.v) obj);
                if (intStream != null) {
                    try {
                        if (this.c) {
                            j$.util.x0 spliterator2 = intStream.sequential().spliterator();
                            while (!n5Var.q() && spliterator2.tryAdvance((IntConsumer) i0Var)) {
                            }
                        } else {
                            intStream.sequential().forEach(i0Var);
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
                j$.util.e0 e0Var = (j$.util.e0) obj2;
                f0 f0Var = (f0) ((j$.time.v) ((y) aVar).m).apply((j$.time.v) obj);
                if (f0Var != null) {
                    try {
                        if (this.c) {
                            j$.util.u0 spliterator3 = f0Var.sequential().spliterator();
                            while (!n5Var.q() && spliterator3.tryAdvance((DoubleConsumer) e0Var)) {
                            }
                        } else {
                            f0Var.sequential().forEach(e0Var);
                        }
                    } catch (Throwable th5) {
                        try {
                            f0Var.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (f0Var != null) {
                    f0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
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

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean q() {
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
        return this.a.q();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(w0 w0Var, n5 n5Var) {
        super(n5Var);
        this.e = w0Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.i0(n5Var2, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(h1 h1Var, n5 n5Var) {
        super(n5Var);
        this.e = h1Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.m0(n5Var2, (byte) 1);
    }
}
