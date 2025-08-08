package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class v2 extends z {
    @Override // j$.util.stream.b
    public final d2 w0(int i, d2 d2Var) {
        d2Var.getClass();
        return Q2.SORTED.i(i) ? d2Var : Q2.SIZED.i(i) ? new A2(d2Var) : new s2(d2Var);
    }

    @Override // j$.util.stream.b
    public final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (Q2.SORTED.i(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((z0) bVar.h0(spliterator, true, intFunction)).e();
        Arrays.sort(dArr);
        return new R0(dArr);
    }
}
