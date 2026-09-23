package ii;

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
    }
}
