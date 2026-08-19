package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class P0 extends I2 implements v0, q0 {
    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void E(Double d) {
        q1.e(this, d);
    }

    @Override // j$.util.stream.t0
    public final B0 a() {
        return this;
    }

    @Override // j$.util.stream.q0, j$.util.stream.t0
    public final v0 a() {
        return this;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.t(this, j, j2);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return q1.m(this, intFunction);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final void x() {
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ B0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.A0, j$.util.stream.B0
    public final A0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        q1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.O2, j$.util.stream.A0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.O2, j$.util.stream.A0
    public final void j(int i, Object obj) {
        super.j(i, (double[]) obj);
    }

    @Override // j$.util.stream.I2, j$.util.stream.O2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.I2, j$.util.stream.O2, java.lang.Iterable
    public final j$.util.c0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        clear();
        p(j);
    }

    @Override // j$.util.stream.O2, j$.util.stream.A0
    public final Object d() {
        return (double[]) super.d();
    }
}
