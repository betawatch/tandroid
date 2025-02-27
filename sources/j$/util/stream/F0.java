package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
interface F0 {
    F0 a(int i);

    long count();

    void forEach(Consumer consumer);

    void i(Object[] objArr, int i);

    int p();

    Object[] s(IntFunction intFunction);

    Spliterator spliterator();

    F0 t(long j, long j2, IntFunction intFunction);
}
