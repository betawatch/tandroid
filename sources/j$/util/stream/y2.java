package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class y2 extends h0 {
    y2(b bVar) {
        super(bVar, R2.q | R2.o, 0);
    }

    @Override // j$.util.stream.b
    public final G0 t0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.SORTED.d(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((E0) bVar.h0(spliterator, true, intFunction)).e();
        Arrays.sort(jArr);
        return new k1(jArr);
    }

    @Override // j$.util.stream.b
    public final e2 w0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.SORTED.d(i) ? e2Var : R2.SIZED.d(i) ? new D2(e2Var) : new v2(e2Var);
    }
}
