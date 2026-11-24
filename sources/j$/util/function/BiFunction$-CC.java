package j$.util.function;

import j$.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiFunction$-CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new a((Object) biFunction, (Object) function, (byte) 1);
    }
}
