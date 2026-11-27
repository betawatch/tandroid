package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
