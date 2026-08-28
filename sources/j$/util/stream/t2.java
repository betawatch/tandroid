package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class t2 extends x2 implements y1 {
    @Override // j$.util.stream.x2, j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.S(this, j10, j11);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.P(this, consumer);
    }

    @Override // j$.util.stream.x2, j$.util.stream.e2
    public final /* bridge */ /* synthetic */ e2 a(int i9) {
        a(i9);
        throw null;
    }

    @Override // j$.util.stream.x2, j$.util.stream.e2
    public final d2 a(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i9) {
        t3.M(this, (Double[]) objArr, i9);
    }

    @Override // j$.util.stream.d2
    public final /* bridge */ /* synthetic */ Object b() {
        return t3.g;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ j$.util.d1 spliterator() {
        return Spliterators.d;
    }
}
