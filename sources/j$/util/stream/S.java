package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class S extends a2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(a aVar, g2 g2Var, int i) {
        super(g2Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public void y(long j) {
        switch (this.b) {
            case 5:
                this.a.y(-1L);
                break;
            default:
                super.y(j);
                break;
        }
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((g2) ((IntFunction) ((q) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((T) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((s) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((t) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((r) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((s) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }
}
