package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class w2 extends Z {
    @Override // j$.util.stream.b
    public final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (Q2.SORTED.i(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((B0) bVar.h0(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new a1(iArr);
    }

    @Override // j$.util.stream.b
    public final d2 w0(int i, d2 d2Var) {
        d2Var.getClass();
        return Q2.SORTED.i(i) ? d2Var : Q2.SIZED.i(i) ? new B2(d2Var) : new t2(d2Var);
    }
}
