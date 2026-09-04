package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final class b1 extends e5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(a aVar, j5 j5Var, int i10) {
        super(j5Var);
        this.b = i10;
        this.c = aVar;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
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

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j3) {
        switch (this.b) {
            case 0:
                this.a.accept((j5) ((LongFunction) ((q) this.c).t).apply(j3));
                return;
            case 1:
                ((t) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j3);
                throw null;
            case 2:
                ((s) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j3);
                throw null;
            case 3:
                ((r) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j3);
                throw null;
            case 4:
                ((t) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j3);
                throw null;
            default:
                ((LongConsumer) ((e1) this.c).t).accept(j3);
                this.a.accept(j3);
                return;
        }
    }
}
