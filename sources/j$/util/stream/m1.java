package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    public /* synthetic */ m1(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream g(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof n1 ? ((n1) longStream).a : new m1(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ f0 asDoubleStream() {
        return d0.g(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 average() {
        return j$.time.a.E(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream b() {
        return g(this.a.filter(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream c() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(j$.time.v vVar) {
        java.util.stream.LongStream longStream = this.a;
        j$.time.v vVar2 = new j$.time.v((byte) 7);
        vVar2.b = vVar;
        return g(longStream.flatMap(vVar2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return g(this.a.distinct());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream e() {
        return g(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof m1) {
            obj = ((m1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.d0 findAny() {
        return j$.time.a.G(this.a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.d0 findFirst() {
        return j$.time.a.G(this.a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ f0 h() {
        return d0.g(this.a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.p0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.o0 ? ((j$.util.o0) it).a : new j$.util.n0(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean j() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean m() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.d0 max() {
        return j$.time.a.G(this.a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.d0 min() {
        return j$.time.a.G(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return g(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.time.a.G(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.g(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return g(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.a1 spliterator() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean t() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.g(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }
}
