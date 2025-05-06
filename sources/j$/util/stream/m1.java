package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class m1 extends L2 implements E0, x0 {
    m1() {
    }

    @Override // j$.util.stream.L2
    /* renamed from: A */
    public final j$.util.J spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.G0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        u0.p(this, lArr, i);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public final /* synthetic */ void accept(double d) {
        u0.b();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(int i) {
        u0.k();
        throw null;
    }

    @Override // j$.util.stream.L2, j$.util.function.T
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x0, j$.util.stream.y0
    public final E0 b() {
        return this;
    }

    @Override // j$.util.stream.y0
    public final G0 b() {
        return this;
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final void d(Object obj, int i) {
        super.d((long[]) obj, i);
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final Object e() {
        return (long[]) super.e();
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final void g(Object obj) {
        super.g((j$.util.function.T) obj);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void j(Long l) {
        u0.i(this, l);
    }

    @Override // j$.util.stream.e2
    public final void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return u0.m(this, intFunction);
    }

    @Override // j$.util.stream.L2, j$.util.stream.N2, java.lang.Iterable
    public final j$.util.M spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.L2, j$.util.stream.N2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.v(this, j, j2);
    }
}
