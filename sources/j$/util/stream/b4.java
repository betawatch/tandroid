package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class b4 extends w3 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ b4(c7 c7Var, Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        byte b = this.h;
        Object obj = this.j;
        Object obj2 = this.k;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new y3((Supplier) obj3, (ObjLongConsumer) obj2, (r) obj);
            case 1:
                return new e4((Supplier) obj3, (ObjDoubleConsumer) obj2, (r) obj);
            case 2:
                return new g4(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new k4((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new o4((Supplier) obj3, (ObjIntConsumer) obj2, (r) obj);
        }
    }
}
