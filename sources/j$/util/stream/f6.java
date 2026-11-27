package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class f6 extends a0 implements q8 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(a aVar, int i, byte b) {
        super(aVar, i);
        this.l = b;
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                if (b7.SORTED.n(aVar.f)) {
                    return aVar.B(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((b2) aVar.B(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new t2(dArr);
            case 1:
                return (h2) new t8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (h2) new s8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        final byte b = 0;
        final byte b2 = 1;
        switch (this.l) {
            case 1:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.o8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        switch (b) {
                            case 0:
                                return new Double[i];
                            default:
                                return new Double[i];
                        }
                    }
                }).spliterator() : new u8((j$.util.u0) aVar.S(spliterator), b2);
            case 2:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.o8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        switch (b2) {
                            case 0:
                                return new Double[i];
                            default:
                                return new Double[i];
                        }
                    }
                }).spliterator() : new u8((j$.util.u0) aVar.S(spliterator), b);
            default:
                return super.K(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                Objects.requireNonNull(n5Var);
                if (b7.SORTED.n(i)) {
                    return n5Var;
                }
                return b7.SIZED.n(i) ? new k6(n5Var) : new c6(n5Var);
            case 1:
                return new t(this, n5Var, (byte) 4);
            default:
                return new p8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.q8
    public final r8 g(z1 z1Var, boolean z) {
        return new p8(this, z1Var, z);
    }
}
