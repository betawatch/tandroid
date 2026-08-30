package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class c6 extends x0 implements n8 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.s = i11;
    }

    @Override // j$.util.stream.a
    public Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 1:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(26)).spliterator() : new s8((j$.util.x0) aVar.H0(spliterator), 1);
            case 2:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(27)).spliterator() : new s8((j$.util.x0) aVar.H0(spliterator), 0);
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
                int[] iArr = (int[]) ((a2) t3Var.j0(spliterator, true, intFunction)).b();
                Arrays.sort(iArr);
                return new z2(iArr);
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
                return v6.SIZED.m(i10) ? new h6(j5Var) : new z5(j5Var);
            case 1:
                return new g8(this, j5Var);
            default:
                return new h8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.n8
    public o8 h(w1 w1Var, boolean z4) {
        return new h8(this, w1Var, z4);
    }
}
