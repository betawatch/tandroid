package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class w2 extends a3 implements b2 {
    @Override // j$.util.stream.a3, j$.util.stream.h2
    public final g2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g2
    public final Object b() {
        return w3.g;
    }

    @Override // j$.util.stream.a3, j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.t(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.q(this, consumer);
    }

    @Override // j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.a3, j$.util.stream.h2
    public final h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }
}
