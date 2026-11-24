package j$.util.function;

import j$.util.Objects;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class Consumer$-CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new a((Object) consumer, (Object) consumer2, (byte) 2);
    }
}
