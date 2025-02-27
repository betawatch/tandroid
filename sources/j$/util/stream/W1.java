package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class W1 extends b implements Stream {
    W1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    W1(b bVar, int i) {
        super(bVar, i);
    }

    @Override // j$.util.stream.b
    final Spliterator B0(b bVar, Supplier supplier, boolean z) {
        return new u3(bVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream N(Consumer consumer) {
        consumer.getClass();
        return new u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final boolean O(Predicate predicate) {
        return ((Boolean) k0(t0.b0(predicate, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final LongStream Q(Function function) {
        function.getClass();
        return new w(this, R2.p | R2.n | R2.t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final boolean X(Predicate predicate) {
        return ((Boolean) k0(t0.b0(predicate, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean a(Predicate predicate) {
        return ((Boolean) k0(t0.b0(predicate, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final D b0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new t(this, R2.p | R2.n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream c(Function function) {
        function.getClass();
        return new v(this, R2.p | R2.n | R2.t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object k0;
        if (isParallel() && collector.characteristics().contains(h.CONCURRENT) && (!s0() || collector.characteristics().contains(h.UNORDERED))) {
            k0 = collector.supplier().get();
            forEach(new k0(6, collector.accumulator(), k0));
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            k0 = k0(new D1(S2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(h.IDENTITY_FINISH) ? k0 : collector.finisher().apply(k0);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((h0) mapToLong(new Q1(1))).sum();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new p(this, R2.m | R2.t);
    }

    public void f(Consumer consumer) {
        consumer.getClass();
        k0(new P(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new u(this, R2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) k0(new F(false, S2.REFERENCE, Optional.empty(), new E(0), new l(5)));
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) k0(new F(true, S2.REFERENCE, Optional.empty(), new E(0), new l(5)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        k0(new P(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final Object g0(Object obj, j$.util.function.f fVar) {
        fVar.getClass();
        return k0(new u1(S2.REFERENCE, fVar, fVar, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object i(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return k0(new u1(S2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final IntStream l(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new v(this, R2.p | R2.n, toIntFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return t0.c0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream m(Function function) {
        function.getClass();
        return new T1(this, R2.p | R2.n | R2.t, function, 1);
    }

    @Override // j$.util.stream.b
    final F0 m0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.E(bVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new T1(this, R2.p | R2.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new w(this, R2.p | R2.n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return p(new j$.util.function.c(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return p(new j$.util.function.c(comparator, 1));
    }

    @Override // j$.util.stream.b
    final void o0(Spliterator spliterator, e2 e2Var) {
        while (!e2Var.q() && spliterator.s(e2Var)) {
        }
    }

    @Override // j$.util.stream.Stream
    public final Optional p(j$.util.function.f fVar) {
        fVar.getClass();
        return (Optional) k0(new y1(S2.REFERENCE, fVar, 1));
    }

    @Override // j$.util.stream.b
    final S2 p0() {
        return S2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.c0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new z2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new z2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new Q1(0));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return t0.N(l0(intFunction), intFunction).s(intFunction);
    }

    @Override // j$.util.stream.b
    final x0 u0(long j, IntFunction intFunction) {
        return t0.D(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !s0() ? this : new S1(this, R2.r);
    }

    @Override // j$.util.stream.Stream
    public final Object v(Object obj, BiFunction biFunction, j$.util.function.f fVar) {
        biFunction.getClass();
        fVar.getClass();
        return k0(new u1(S2.REFERENCE, fVar, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final D x(Function function) {
        function.getClass();
        return new t(this, R2.p | R2.n | R2.t, function, 7);
    }
}
