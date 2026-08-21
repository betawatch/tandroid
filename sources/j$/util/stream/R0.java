package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class R0 extends V0 implements w0 {
    @Override // j$.util.stream.V0, j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.t(this, j, j2);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        r1.q(this, consumer);
    }

    @Override // j$.util.stream.V0, j$.util.stream.C0
    public final /* bridge */ /* synthetic */ C0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.V0, j$.util.stream.C0
    public final B0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        r1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ Object d() {
        return r1.g;
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ j$.util.c0 spliterator() {
        return Spliterators.d;
    }
}
