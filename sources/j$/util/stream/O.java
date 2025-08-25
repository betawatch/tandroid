package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class O extends P {
    final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.G3
    public final Object b(b bVar, Spliterator spliterator) {
        bVar.U(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.G3
    public final /* bridge */ /* synthetic */ Object c(b bVar, Spliterator spliterator) {
        e(bVar, spliterator);
        return null;
    }

    O(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
