package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class b3 extends o6 implements a2, u1 {
    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
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
        p((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.u1, j$.util.stream.w1
    public final a2 build() {
        return this;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.T(this, j3, j10);
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

    @Override // j$.util.stream.h5
    public final /* synthetic */ void p(Integer num) {
        t3.F(this, num);
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
        t3.N(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.s6, j$.util.stream.d2
    public final void c(int i10, Object obj) {
        super.c(i10, (int[]) obj);
    }

    @Override // j$.util.stream.s6, j$.util.stream.d2
    public final void d(Object obj) {
        super.d((IntConsumer) obj);
    }

    @Override // j$.util.stream.o6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.e2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.o6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.e2
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
        return (int[]) super.b();
    }
}
