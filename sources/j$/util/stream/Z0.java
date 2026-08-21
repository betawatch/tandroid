package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class Z0 extends L2 implements y0, s0 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ void A(Integer num) {
        r1.g(this, num);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.u0
    public final C0 a() {
        return this;
    }

    @Override // j$.util.stream.s0, j$.util.stream.u0
    public final y0 a() {
        return this;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.u(this, j, j2);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return r1.m(this, intFunction);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.g2
    public final void x() {
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ C0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final B0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        r1.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.P2, j$.util.stream.B0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.P2, j$.util.stream.B0
    public final void j(int i, Object obj) {
        super.j(i, (int[]) obj);
    }

    @Override // j$.util.stream.L2, j$.util.stream.P2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.L2, j$.util.stream.P2, java.lang.Iterable
    public final j$.util.c0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        clear();
        p(j);
    }

    @Override // j$.util.stream.P2, j$.util.stream.B0
    public final Object d() {
        return (int[]) super.d();
    }
}
