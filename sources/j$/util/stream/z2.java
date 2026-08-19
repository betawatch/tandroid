package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class z2 extends e0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(a aVar, int i, int i2) {
        super(aVar, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.a
    public Spliterator K(a aVar, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Y(28)).spliterator() : new U3((j$.util.Z) aVar.S(spliterator), 1);
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
                long[] jArr = (long[]) ((z0) aVar.B(spliterator, true, intFunction)).d();
                Arrays.sort(jArr);
                return new f1(jArr);
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
                return S2.SIZED.q(i) ? new E2(f2Var) : new w2(f2Var);
            default:
                return new H3(this, f2Var);
        }
    }
}
