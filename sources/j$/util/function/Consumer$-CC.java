package j$.util.function;

import j$.util.Objects;
import java.util.function.Consumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final /* synthetic */ class Consumer$-CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new a((Object) consumer, (Object) consumer2, (byte) 2);
    }
}
