package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ b(Comparator comparator, byte b) {
        this.a = b;
        this.b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Comparator comparator = this.b;
        switch (b) {
            case 0:
                if (comparator.compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (comparator.compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }
}
