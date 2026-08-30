package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class d6 extends g1 implements n8 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.s = i11;
    }

    @Override // j$.util.stream.a
    public Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 1:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(28)).spliterator() : new t8((j$.util.a1) aVar.H0(spliterator), 1);
            case 2:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(29)).spliterator() : new t8((j$.util.a1) aVar.H0(spliterator), 0);
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
                long[] jArr = (long[]) ((c2) t3Var.j0(spliterator, true, intFunction)).b();
                Arrays.sort(jArr);
                return new i3(jArr);
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
                return v6.SIZED.m(i10) ? new i6(j5Var) : new a6(j5Var);
            case 1:
                return new i8(this, j5Var);
            default:
                return new j8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.n8
    public o8 h(w1 w1Var, boolean z4) {
        return new j8(this, w1Var, z4);
    }
}
