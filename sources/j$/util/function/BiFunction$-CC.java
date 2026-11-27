package j$.util.function;

import j$.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiFunction$-CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new a((Object) biFunction, (Object) function, (byte) 1);
    }
}
