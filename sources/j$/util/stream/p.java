package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final class p extends Z1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, g2 g2Var, int i) {
        super(g2Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public void y(long j) {
        switch (this.b) {
            case 4:
                this.a.y(-1L);
                break;
            default:
                super.y(j);
                break;
        }
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((g2) ((DoubleFunction) ((q) this.c).n).apply(d));
                return;
            case 1:
                ((r) this.c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 2:
                ((s) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((t) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                ((r) this.c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                ((DoubleConsumer) ((v) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
