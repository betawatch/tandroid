package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class x2 extends w {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(a aVar, int i, int i2) {
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
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                if (S2.SORTED.q(aVar.f)) {
                    return aVar.B(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((v0) aVar.B(spliterator, true, intFunction)).d();
                Arrays.sort(dArr);
                return new N0(dArr);
            default:
                return (B0) new R3(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                Objects.requireNonNull(f2Var);
                if (S2.SORTED.q(i)) {
                    return f2Var;
                }
                return S2.SIZED.q(i) ? new C2(f2Var) : new u2(f2Var);
            default:
                return new L3(this, f2Var);
        }
    }
}
