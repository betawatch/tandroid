package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class s2 extends m6 implements y1, t1 {
    @Override // j$.util.stream.g5
    public final /* synthetic */ void B(Double d) {
        t3.D(this, d);
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        t3.J();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j3) {
        t3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        B((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.t1, j$.util.stream.w1
    public final y1 build() {
        return this;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.S(this, j3, j10);
    }

    @Override // j$.util.stream.j5
    public final void end() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return t3.L(this, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ e2 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final d2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i10) {
        t3.M(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.s6, j$.util.stream.d2
    public final void c(int i10, Object obj) {
        super.c(i10, (double[]) obj);
    }

    @Override // j$.util.stream.s6, j$.util.stream.d2
    public final void d(Object obj) {
        super.d((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.m6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.e2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.m6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.j5
    public final void o(long j3) {
        clear();
        l(j3);
    }

    @Override // j$.util.stream.s6, j$.util.stream.d2
    public final Object b() {
        return (double[]) super.b();
    }
}
