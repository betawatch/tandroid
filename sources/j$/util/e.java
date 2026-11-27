package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Comparator, Serializable {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Function b;

    public /* synthetic */ e(Function function, Comparator comparator) {
        this.a = comparator;
        this.b = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.a;
        Function function = this.b;
        return comparator.compare(function.apply(obj), function.apply(obj2));
    }
}
