package j$.util.function;

import j$.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiConsumer$-CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new a((Object) biConsumer, (Object) biConsumer2, (byte) 0);
    }
}
