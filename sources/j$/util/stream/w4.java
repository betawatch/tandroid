package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class w4 extends f5 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(t0 t0Var, j5 j5Var) {
        super(j5Var);
        this.e = t0Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.i0(j5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(v vVar, j5 j5Var) {
        super(j5Var);
        this.e = vVar;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.e0(j5Var2, 1);
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j10) {
        switch (this.b) {
            case 0:
                this.a.o(-1L);
                break;
            case 1:
                this.a.o(-1L);
                break;
            default:
                this.a.o(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        switch (this.b) {
            case 0:
                j$.util.m0 m0Var = (j$.util.m0) this.d;
                LongStream longStream = (LongStream) ((j$.time.t) ((e1) this.e).t).apply((j$.time.t) obj);
                if (longStream != null) {
                    try {
                        if (!this.c) {
                            longStream.sequential().forEach(m0Var);
                        } else {
                            j$.util.a1 spliterator = longStream.sequential().spliterator();
                            while (!this.a.q() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            longStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (longStream != null) {
                    longStream.close();
                    return;
                }
                return;
            case 1:
                j$.util.i0 i0Var = (j$.util.i0) this.d;
                IntStream intStream = (IntStream) ((j$.time.t) ((t0) this.e).t).apply((j$.time.t) obj);
                if (intStream != null) {
                    try {
                        if (!this.c) {
                            intStream.sequential().forEach(i0Var);
                        } else {
                            j$.util.x0 spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.q() && spliterator2.tryAdvance((IntConsumer) i0Var)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.e0 e0Var = (j$.util.e0) this.d;
                c0 c0Var = (c0) ((j$.time.t) ((v) this.e).t).apply((j$.time.t) obj);
                if (c0Var != null) {
                    try {
                        if (!this.c) {
                            c0Var.sequential().forEach(e0Var);
                        } else {
                            j$.util.u0 spliterator3 = c0Var.sequential().spliterator();
                            while (!this.a.q() && spliterator3.tryAdvance((DoubleConsumer) e0Var)) {
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            c0Var.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                if (c0Var != null) {
                    c0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
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
    public w4(e1 e1Var, j5 j5Var) {
        super(j5Var);
        this.e = e1Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.m0(j5Var2, 1);
    }
}
