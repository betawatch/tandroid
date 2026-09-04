package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class n2 extends o2 implements c2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.U(this, j3, j10);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.R(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i10) {
        t3.O(this, (Long[]) objArr, i10);
    }

    @Override // j$.util.stream.d2
    public final Object newArray(int i10) {
        return new long[i10];
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
