package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class V0 extends Z0 implements A0 {
    V0() {
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
    public final /* synthetic */ void i(Double[] dArr, int i) {
        u0.n(this, dArr, i);
    }

    @Override // j$.util.stream.F0
    public final Object e() {
        double[] dArr;
        dArr = u0.g;
        return dArr;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        u0.q(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final j$.util.M spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.t(this, j, j2);
    }
}
