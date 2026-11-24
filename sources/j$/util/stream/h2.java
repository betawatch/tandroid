package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public interface h2 {
    h2 a(int i);

    long count();

    h2 e(long j, long j2, IntFunction intFunction);

    void f(Object[] objArr, int i);

    void forEach(Consumer consumer);

    Object[] g(IntFunction intFunction);

    int h();

    Spliterator spliterator();
}
