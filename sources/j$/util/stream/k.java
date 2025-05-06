package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements j$.util.function.f {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.a(this, function);
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
                return new N0((A0) obj, (A0) obj2);
            case 4:
                return new O0((C0) obj, (C0) obj2);
            case 5:
                return new P0((E0) obj, (E0) obj2);
            default:
                return new R0((G0) obj, (G0) obj2);
        }
    }
}
