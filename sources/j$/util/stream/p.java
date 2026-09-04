package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final class p extends c5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, j5 j5Var, int i10) {
        super(j5Var);
        this.b = i10;
        this.c = aVar;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public void o(long j3) {
        switch (this.b) {
            case 4:
                this.a.o(-1L);
                break;
            default:
                super.o(j3);
                break;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((j5) ((DoubleFunction) ((q) this.c).t).apply(d));
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
                ((DoubleConsumer) ((v) this.c).t).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
