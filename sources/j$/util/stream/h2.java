package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
