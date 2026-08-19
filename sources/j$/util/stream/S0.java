package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class S0 extends U0 implements z0 {
    @Override // j$.util.stream.U0, j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.v(this, j, j2);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void forEach(Consumer consumer) {
        q1.s(this, consumer);
    }

    @Override // j$.util.stream.U0, j$.util.stream.B0
    public final /* bridge */ /* synthetic */ B0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.U0, j$.util.stream.B0
    public final A0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        q1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.A0
    public final /* bridge */ /* synthetic */ Object d() {
        return q1.f;
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ j$.util.c0 spliterator() {
        return Spliterators.c;
    }
}
