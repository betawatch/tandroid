package j$.lang;

import j$.util.Objects;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class Iterable$-CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        Objects.requireNonNull(consumer);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
