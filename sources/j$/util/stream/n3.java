package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class n3 extends v6 implements f2, y1 {
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
        return (long[]) super.b();
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void c(int i, Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void d(Object obj) {
        super.d((LongConsumer) obj);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.v(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.p(this, (Long[]) objArr, i);
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

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.v6
    /* renamed from: r */
    public final j$.util.a1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.v6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        w3.i(this, l);
    }

    @Override // j$.util.stream.z1
    public final h2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.v6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
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
        x((Long) obj);
    }

    @Override // j$.util.stream.y1, j$.util.stream.z1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
