package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
