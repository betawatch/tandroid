package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class l1 extends K2 implements D0, w0 {
    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
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

    @Override // j$.util.stream.w0, j$.util.stream.x0
    public final D0 b() {
        return this;
    }

    @Override // j$.util.stream.x0
    public final F0 b() {
        return this;
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
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

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return t0.m(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.v(this, j, j2);
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
        t0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.M2, j$.util.stream.E0
    public final void d(Object obj, int i) {
        super.d((long[]) obj, i);
    }

    @Override // j$.util.stream.M2, j$.util.stream.E0
    public final void g(Object obj) {
        super.g((j$.util.function.Y) obj);
    }

    @Override // j$.util.stream.K2, j$.util.stream.M2, java.lang.Iterable
    public final j$.util.M spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K2, j$.util.stream.M2, java.lang.Iterable
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
        return (long[]) super.e();
    }
}
