package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class y3 extends t3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ y3(w6 w6Var, Object obj, Object obj2, Object obj3, int i10) {
        this.h = i10;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.t3
    public final o4 D0() {
        switch (this.h) {
            case 0:
                return new v3((Supplier) this.i, (ObjLongConsumer) this.k, (o) this.j);
            case 1:
                return new b4((Supplier) this.i, (ObjDoubleConsumer) this.k, (o) this.j);
            case 2:
                return new d4(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new h4((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new l4((Supplier) this.i, (ObjIntConsumer) this.k, (o) this.j);
        }
    }
}
