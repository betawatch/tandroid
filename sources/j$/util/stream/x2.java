package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class x2 extends a0 {
    x2(b bVar) {
        super(bVar, R2.q | R2.o, 0);
    }

    @Override // j$.util.stream.b
    public final F0 u0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.SORTED.d(bVar.q0())) {
            return bVar.i0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((B0) bVar.i0(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new a1(iArr);
    }

    @Override // j$.util.stream.b
    public final e2 x0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.SORTED.d(i) ? e2Var : R2.SIZED.d(i) ? new C2(e2Var) : new u2(e2Var);
    }
}
