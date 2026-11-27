package j$.util.function;

import j$.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiConsumer$-CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new a((Object) biConsumer, (Object) biConsumer2, (byte) 0);
    }
}
