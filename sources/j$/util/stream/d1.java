package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class d1 extends J2 implements C0, w0 {
    d1() {
    }

    @Override // j$.util.stream.J2
    /* renamed from: A */
    public final j$.util.G spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.G0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        u0.o(this, numArr, i);
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

    @Override // j$.util.stream.J2, j$.util.function.E
    public final void accept(int i) {
        super.accept(i);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(long j) {
        u0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w0, j$.util.stream.y0
    public final C0 b() {
        return this;
    }

    @Override // j$.util.stream.y0
    public final G0 b() {
        return this;
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final void d(Object obj, int i) {
        super.d((int[]) obj, i);
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final Object e() {
        return (int[]) super.e();
    }

    @Override // j$.util.stream.N2, j$.util.stream.F0
    public final void g(Object obj) {
        super.g((j$.util.function.E) obj);
    }

    @Override // j$.util.stream.e2
    public final void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void o(Integer num) {
        u0.g(this, num);
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

    @Override // j$.util.stream.J2, j$.util.stream.N2, java.lang.Iterable
    public final j$.util.M spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.J2, j$.util.stream.N2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.u(this, j, j2);
    }
}
