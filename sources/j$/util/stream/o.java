package j$.util.stream;

import j$.util.function.BiFunction$-CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiConsumer b;

    public /* synthetic */ o(BiConsumer biConsumer, int i9) {
        this.a = i9;
        this.b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.accept(obj, obj2);
                break;
            case 1:
                this.b.accept(obj, obj2);
                break;
            default:
                this.b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
