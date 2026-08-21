package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class y2 extends x {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(a aVar, int i, int i2) {
        super(aVar, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.a
    public Spliterator K(a aVar, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new K3(0)).spliterator() : new S3((j$.util.T) aVar.S(spliterator), 1);
            default:
                return super.K(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                if (S2.SORTED.q(aVar.f)) {
                    return aVar.B(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((w0) aVar.B(spliterator, true, intFunction)).d();
                Arrays.sort(dArr);
                return new O0(dArr);
            default:
                return (C0) new R3(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                Objects.requireNonNull(g2Var);
                if (S2.SORTED.q(i)) {
                    return g2Var;
                }
                return S2.SIZED.q(i) ? new D2(g2Var) : new v2(g2Var);
            default:
                return new L3(this, g2Var);
        }
    }
}
