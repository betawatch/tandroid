package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class T0 extends G2 implements z0, u0 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x0
    public final F0 b() {
        return this;
    }

    @Override // j$.util.stream.u0, j$.util.stream.x0
    public final z0 b() {
        return this;
    }

    @Override // j$.util.stream.d2
    public final void m() {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.a2
    public final /* synthetic */ void r(Double d) {
        t0.e(this, d);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return t0.m(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.t(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        t0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.M2, j$.util.stream.E0
    public final void d(Object obj, int i) {
        super.d((double[]) obj, i);
    }

    @Override // j$.util.stream.M2, j$.util.stream.E0
    public final void g(Object obj) {
        super.g((j$.util.function.l) obj);
    }

    @Override // j$.util.stream.G2, j$.util.stream.M2, java.lang.Iterable
    public final j$.util.M spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.G2, j$.util.stream.M2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.M2, j$.util.stream.E0
    public final Object e() {
        return (double[]) super.e();
    }
}
