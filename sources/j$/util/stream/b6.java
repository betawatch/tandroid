package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class b6 extends x implements n8 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.s = i11;
    }

    @Override // j$.util.stream.a
    public Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 1:
                if (!v6.ORDERED.m(aVar.m)) {
                    return new r8((j$.util.u0) aVar.H0(spliterator), 1);
                }
                final int i10 = 0;
                return N0(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.k8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i11) {
                        switch (i10) {
                            case 0:
                                return new Double[i11];
                            default:
                                return new Double[i11];
                        }
                    }
                }).spliterator();
            case 2:
                if (!v6.ORDERED.m(aVar.m)) {
                    return new r8((j$.util.u0) aVar.H0(spliterator), 0);
                }
                final int i11 = 1;
                return N0(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.k8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i112) {
                        switch (i11) {
                            case 0:
                                return new Double[i112];
                            default:
                                return new Double[i112];
                        }
                    }
                }).spliterator();
            default:
                return super.O0(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                if (v6.SORTED.m(((a) t3Var).m)) {
                    return t3Var.j0(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((y1) t3Var.j0(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new q2(dArr);
            case 1:
                return (e2) new q8(this, t3Var, spliterator, intFunction).invoke();
            default:
                return (e2) new p8(this, t3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                Objects.requireNonNull(j5Var);
                if (v6.SORTED.m(i10)) {
                    return j5Var;
                }
                return v6.SIZED.m(i10) ? new g6(j5Var) : new y5(j5Var);
            case 1:
                return new l8(this, j5Var);
            default:
                return new m8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.n8
    public o8 h(w1 w1Var, boolean z4) {
        return new m8(this, w1Var, z4);
    }
}
