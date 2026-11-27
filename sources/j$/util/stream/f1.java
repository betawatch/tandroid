package j$.util.stream;

import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class f1 extends i5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(n5 n5Var) {
        super(n5Var);
        this.b = (byte) 0;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(j);
                return;
            case 1:
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                LongPredicate longPredicate2 = null;
                longPredicate2.test(j);
                throw null;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void n(long j) {
        switch (this.b) {
            case 4:
                this.a.n(-1L);
                break;
            case 5:
                this.a.n(-1L);
                break;
            default:
                super.n(j);
                break;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean q() {
        switch (this.b) {
            case 5:
                return this.a.q();
            default:
                return super.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
    }
}
