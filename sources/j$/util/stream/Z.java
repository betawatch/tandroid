package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final class Z extends a2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a aVar, f2 f2Var, int i) {
        super(f2Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
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

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((f2) ((LongFunction) ((p) this.c).n).apply(j));
                return;
            case 1:
                ((s) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((r) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((q) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((s) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((c0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
