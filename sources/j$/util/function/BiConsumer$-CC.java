package j$.util.function;

import j$.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiConsumer$-CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new a((Object) biConsumer, (Object) biConsumer2, (byte) 0);
    }
}
