package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class s0 extends d5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(a aVar, j5 j5Var, int i3) {
        super(j5Var);
        this.b = i3;
        this.c = aVar;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public void o(long j10) {
        switch (this.b) {
            case 5:
                this.a.o(-1L);
                break;
            default:
                super.o(j10);
                break;
        }
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i3) {
        switch (this.b) {
            case 0:
                this.a.accept((j5) ((IntFunction) ((q) this.c).t).apply(i3));
                return;
            case 1:
                ((IntConsumer) ((t0) this.c).t).accept(i3);
                this.a.accept(i3);
                return;
            case 2:
                this.a.accept(((IntUnaryOperator) ((t0) this.c).t).applyAsInt(i3));
                return;
            case 3:
                ((t) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i3);
                throw null;
            case 4:
                ((r) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i3);
                throw null;
            default:
                ((s) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i3);
                throw null;
        }
    }
}
