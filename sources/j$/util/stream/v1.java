package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class v1 extends q1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ v1(T2 t2, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.q1
    public final L1 Y() {
        switch (this.h) {
            case 0:
                return new s1((Supplier) this.i, (ObjLongConsumer) this.k, (n) this.j);
            case 1:
                return new y1((Supplier) this.i, (ObjDoubleConsumer) this.k, (n) this.j);
            case 2:
                return new A1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new E1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new I1((Supplier) this.i, (ObjIntConsumer) this.k, (n) this.j);
        }
    }
}
