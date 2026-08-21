package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class w1 extends r1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ w1(T2 t2, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.r1
    public final M1 Z() {
        switch (this.h) {
            case 0:
                return new t1((Supplier) this.i, (ObjLongConsumer) this.k, (o) this.j);
            case 1:
                return new z1((Supplier) this.i, (ObjDoubleConsumer) this.k, (o) this.j);
            case 2:
                return new B1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new F1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new J1((Supplier) this.i, (ObjIntConsumer) this.k, (o) this.j);
        }
    }
}
