package j$.util.function;

import j$.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
