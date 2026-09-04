package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface e2 {
    e2 a(int i10);

    long count();

    e2 e(long j3, long j10, IntFunction intFunction);

    void f(Object[] objArr, int i10);

    void forEach(Consumer consumer);

    Object[] g(IntFunction intFunction);

    int h();

    Spliterator spliterator();
}
