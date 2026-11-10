package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.s;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class Consumer$-CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new s(3, consumer, consumer2);
    }
}
