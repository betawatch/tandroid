package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 1:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 2:
                Set set3 = (Set) obj;
                Set set4 = Collectors.a;
                set3.addAll((Set) obj2);
                return set3;
            case 3:
                return new M0((z0) obj, (z0) obj2);
            case 4:
                return new N0((B0) obj, (B0) obj2);
            case 5:
                return new O0((D0) obj, (D0) obj2);
            default:
                return new Q0((F0) obj, (F0) obj2);
        }
    }
}
