package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class t extends g5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 1:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 2:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 3:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void n(long j) {
        switch (this.b) {
            case 3:
                this.a.n(-1L);
                break;
            case 4:
                this.a.n(-1L);
                break;
            default:
                super.n(j);
                break;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean q() {
        switch (this.b) {
            case 4:
                return this.a.q();
            default:
                return super.q();
        }
    }
}
