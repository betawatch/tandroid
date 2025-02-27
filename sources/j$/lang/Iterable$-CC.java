package j$.lang;

import j$.util.DesugarCollections;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Iterable$-CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        if (DesugarCollections.a.isInstance(iterable)) {
            DesugarCollections.c(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.r(it.next());
        }
    }
}
