package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface B0 {
    B0 b(int i);

    long count();

    B0 f(long j, long j2, IntFunction intFunction);

    void forEach(Consumer consumer);

    void g(Object[] objArr, int i);

    Object[] h(IntFunction intFunction);

    int i();

    Spliterator spliterator();
}
