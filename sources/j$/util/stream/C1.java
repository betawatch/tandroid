package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class C1 extends w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ C1(b3 b3Var, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.w0
    public final S1 e0() {
        switch (this.h) {
            case 0:
                return new z1((Supplier) this.i, (ObjLongConsumer) this.k, (q) this.j);
            case 1:
                return new F1((Supplier) this.i, (ObjDoubleConsumer) this.k, (q) this.j);
            case 2:
                return new H1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new L1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new P1((Supplier) this.i, (ObjIntConsumer) this.k, (q) this.j);
        }
    }
}
