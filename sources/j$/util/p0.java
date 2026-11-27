package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public interface p0 extends q0 {
    @Override // java.util.Iterator, j$.util.y
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
