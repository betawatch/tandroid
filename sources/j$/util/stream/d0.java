package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
final class d0 extends h2 {
    public final /* synthetic */ int b;
    final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(b bVar, m2 m2Var, int i) {
        super(m2Var);
        this.b = i;
        this.c = bVar;
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public void l(long j) {
        switch (this.b) {
            case 4:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((m2) ((LongFunction) ((s) this.c).n).apply(j));
                return;
            case 1:
                ((v) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((u) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((t) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((v) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((g0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
