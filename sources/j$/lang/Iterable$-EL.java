package j$.lang;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Iterable$-EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof a) {
            ((a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            Iterable$-CC.$default$forEach(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
