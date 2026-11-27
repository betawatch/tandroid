package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class x0 extends h5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            case 1:
                this.a.accept(i);
                return;
            case 2:
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 3:
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            case 4:
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
            default:
                IntPredicate intPredicate2 = null;
                intPredicate2.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
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

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean q() {
        switch (this.b) {
            case 5:
                return this.a.q();
            default:
                return super.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
    }
}
