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
    public final G0 t0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.SORTED.j(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((C0) bVar.h0(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new b1(iArr);
    }

    @Override // j$.util.stream.b
    public final e2 w0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.SORTED.j(i) ? e2Var : R2.SIZED.j(i) ? new C2(e2Var) : new u2(e2Var);
    }
}
