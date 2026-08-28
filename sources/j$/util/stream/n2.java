package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class n2 extends o2 implements c2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.U(this, j10, j11);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.R(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i9) {
        t3.O(this, (Long[]) objArr, i9);
    }

    @Override // j$.util.stream.d2
    public final Object newArray(int i9) {
        return new long[i9];
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new e3(this);
    }

    @Override // j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        return new e3(this);
    }
}
