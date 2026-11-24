package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class f5 extends a implements Stream {
    @Override // j$.util.stream.a
    public final h2 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w3.A(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final c7 H() {
        return c7.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final z1 I(long j, IntFunction intFunction) {
        return w3.x(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new f8(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(w3.W(u1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(w3.W(u1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object C;
        if (this.a.k && collector.characteristics().contains(g.CONCURRENT) && (!b7.ORDERED.n(this.f) || collector.characteristics().contains(g.UNORDERED))) {
            C = collector.supplier().get();
            forEach(new j$.util.function.a((Object) collector.accumulator(), C, (byte) 5));
            collector2 = collector;
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            C = C(new i4(c7.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(g.IDENTITY_FINISH) ? C : collector2.finisher().apply(C);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new d4((byte) 2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new s(this, b7.p | b7.n | b7.t, vVar, (byte) 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new o(this, b7.m | b7.t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = z8.a;
        Objects.requireNonNull(predicate);
        return new k8(this, z8.b, predicate, (byte) 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new s(this, b7.t, predicate, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(k0.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(k0.c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new r0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new r0(consumer, true));
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return w3.X(this, 0L, j);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new s(this, b7.p | b7.n, function, (byte) 5);
    }

    @Override // j$.util.stream.Stream
    public final f0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new y(this, b7.p | b7.n, toDoubleFunction, (byte) 2);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new w0(this, b7.p | b7.n, toIntFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new h1(this, b7.p | b7.n, toLongFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, (byte) 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, (byte) 1));
    }

    @Override // j$.util.stream.Stream
    public final LongStream n(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new h1(this, b7.p | b7.n | b7.t, vVar, (byte) 2);
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(w3.W(u1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new s(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new b4(c7.REFERENCE, binaryOperator, biFunction, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final IntStream s(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new w0(this, b7.p | b7.n | b7.t, vVar, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.X(this, j, -1L);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new i6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = z8.a;
        Objects.requireNonNull(predicate);
        return new k8(this, z8.a, predicate, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return w3.I(D(intFunction), intFunction).g(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final f0 u(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new y(this, b7.p | b7.n | b7.t, vVar, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new i6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new d1((byte) 20));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new b4(c7.REFERENCE, binaryOperator, binaryOperator, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) C(new z3(c7.REFERENCE, binaryOperator, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new b4(c7.REFERENCE, biConsumer2, biConsumer, supplier, (byte) 3));
    }
}
