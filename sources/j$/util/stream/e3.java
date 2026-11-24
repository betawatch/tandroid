package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class e3 extends t6 implements d2, x1 {
    @Override // j$.util.stream.g2, j$.util.stream.h2
    public final g2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void c(int i, Object obj) {
        super.c(i, (int[]) obj);
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void d(Object obj) {
        super.d((IntConsumer) obj);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.u(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    @Override // j$.util.stream.h2
    public final int h() {
        return 0;
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        clear();
        l(j);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.t6
    /* renamed from: r */
    public final j$.util.x0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.t6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.z1
    public final h2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.t6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.h2
    public final h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.stream.x1, j$.util.stream.z1
    public final d2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
