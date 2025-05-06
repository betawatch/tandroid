package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class X0 extends Z0 implements E0 {
    X0() {
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        u0.p(this, lArr, i);
    }

    @Override // j$.util.stream.F0
    public final Object e() {
        long[] jArr;
        jArr = u0.f;
        return jArr;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        u0.s(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final j$.util.M spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.v(this, j, j2);
    }
}
