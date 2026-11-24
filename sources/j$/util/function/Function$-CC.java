package j$.util.function;

import j$.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class Function$-CC {
    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, (byte) 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, (byte) 1);
    }
}
