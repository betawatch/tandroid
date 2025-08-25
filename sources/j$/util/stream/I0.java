package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
interface I0 {
    I0 b(int i);

    long count();

    void forEach(Consumer consumer);

    I0 h(long j, long j2, IntFunction intFunction);

    void i(Object[] objArr, int i);

    Object[] o(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
