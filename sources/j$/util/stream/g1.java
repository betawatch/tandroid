package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class g1 extends R2 implements E0, y0 {
    @Override // j$.util.stream.y0, j$.util.stream.A0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.A0
    public final I0 a() {
        return this;
    }

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return w0.u(this, j, j2);
    }

    @Override // j$.util.stream.m2
    public final void k() {
    }

    @Override // j$.util.stream.k2
    public final /* synthetic */ void m(Integer num) {
        w0.g(this, num);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return w0.m(this, intFunction);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        w0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.V2, j$.util.stream.H0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.H0
    public final void r(int i, Object obj) {
        super.r(i, (int[]) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
    public final j$.util.e0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.m2
    public final void l(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.V2, j$.util.stream.H0
    public final Object d() {
        return (int[]) super.d();
    }
}
