package j$.util.function;

import j$.util.Objects;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class Consumer$-CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new a((Object) consumer, (Object) consumer2, (byte) 2);
    }
}
