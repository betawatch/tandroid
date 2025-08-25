package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class U extends g2 {
    public final /* synthetic */ int b;
    final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(b bVar, m2 m2Var, int i) {
        super(m2Var);
        this.b = i;
        this.c = bVar;
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public void l(long j) {
        switch (this.b) {
            case 5:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((m2) ((IntFunction) ((s) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((V) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((u) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((v) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((t) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((u) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }
}
