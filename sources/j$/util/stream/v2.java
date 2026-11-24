package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class v2 extends r6 implements b2, w1 {
    @Override // j$.util.stream.k5
    public final /* synthetic */ void C(Double d) {
        w3.e(this, d);
    }

    @Override // j$.util.stream.g2, j$.util.stream.h2
    public final g2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void c(int i, Object obj) {
        super.c(i, (double[]) obj);
    }

    @Override // j$.util.stream.x6, j$.util.stream.g2
    public final void d(Object obj) {
        super.d((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.t(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.n(this, (Double[]) objArr, i);
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

    @Override // j$.util.stream.r6
    /* renamed from: r */
    public final j$.util.u0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.r6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
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

    @Override // j$.util.stream.r6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
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
        C((Double) obj);
    }

    @Override // j$.util.stream.w1, j$.util.stream.z1
    public final b2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
