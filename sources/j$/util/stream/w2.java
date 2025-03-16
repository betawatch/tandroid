package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class w2 extends z {
    w2(b bVar) {
        super(bVar, R2.q | R2.o, 0);
    }

    @Override // j$.util.stream.b
    public final F0 u0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.SORTED.d(bVar.q0())) {
            return bVar.i0(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((z0) bVar.i0(spliterator, true, intFunction)).e();
        Arrays.sort(dArr);
        return new R0(dArr);
    }

    @Override // j$.util.stream.b
    public final e2 x0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.SORTED.d(i) ? e2Var : R2.SIZED.d(i) ? new B2(e2Var) : new t2(e2Var);
    }
}
