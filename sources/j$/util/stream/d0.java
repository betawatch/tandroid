package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements f0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ d0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ f0 g(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof e0 ? ((e0) doubleStream).a : new d0(doubleStream);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 average() {
        return j$.time.a.E(this.a.average());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 b() {
        return g(this.a.filter(null));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 c() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.f0
    public final f0 d(j$.time.v vVar) {
        DoubleStream doubleStream = this.a;
        j$.time.v vVar2 = new j$.time.v((byte) 5);
        vVar2.b = vVar;
        return g(doubleStream.flatMap(vVar2));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 distinct() {
        return g(this.a.distinct());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 e() {
        return g(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.time.a.E(this.a.findAny());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.time.a.E(this.a.findFirst());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.f0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.h0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.g0 ? ((j$.util.g0) it).a : new j$.util.f0(it);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ boolean k() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 max() {
        return j$.time.a.E(this.a.max());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 min() {
        return j$.time.a.E(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.g(this.a.parallel());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 peek(DoubleConsumer doubleConsumer) {
        return g(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ boolean q() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ LongStream r() {
        return m1.g(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.time.a.E(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.g(this.a.sequential());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ f0 sorted() {
        return g(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.f0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.u0 spliterator() {
        return j$.util.s0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.f0
    public final j$.util.w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.g(this.a.unordered());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ IntStream w() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ boolean y() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.f0, j$.util.stream.BaseStream
    public final /* synthetic */ f0 parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.f0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.f0, j$.util.stream.BaseStream
    public final /* synthetic */ f0 sequential() {
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
