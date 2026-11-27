package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class h6 extends j1 implements q8 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(a aVar, int i, byte b) {
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
                long[] jArr = (long[]) ((f2) aVar.B(spliterator, true, intFunction)).b();
                Arrays.sort(jArr);
                return new l3(jArr);
            case 1:
                return (h2) new t8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (h2) new s8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        switch (this.l) {
            case 1:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new d1((byte) 28)).spliterator() : new w8((j$.util.a1) aVar.S(spliterator), (byte) 1);
            case 2:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new d1((byte) 29)).spliterator() : new w8((j$.util.a1) aVar.S(spliterator), (byte) 0);
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
                return b7.SIZED.n(i) ? new m6(n5Var) : new e6(n5Var);
            case 1:
                return new f1(this, n5Var, (byte) 5);
            default:
                return new n8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.q8
    public final r8 g(z1 z1Var, boolean z) {
        return new n8(this, z1Var, z);
    }
}
