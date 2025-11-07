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

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements D {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ B(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ D j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C ? ((C) doubleStream).a : new B(doubleStream);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D a() {
        return j(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A average() {
        return j$.util.S.j(this.a.average());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D b() {
        return j(this.a.filter(null));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D c() {
        return j(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D d() {
        return j(this.a.map(null));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D distinct() {
        return j(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A findAny() {
        return j$.util.S.j(this.a.findAny());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A findFirst() {
        return j$.util.S.j(this.a.findFirst());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean h() {
        return this.a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ LongStream i() {
        return k0.j(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.G iterator() {
        return j$.util.E.a(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A max() {
        return j$.util.S.j(this.a.max());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A min() {
        return j$.util.S.j(this.a.min());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean o() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f.j(this.a.parallel());
    }

    @Override // j$.util.stream.D, j$.util.stream.BaseStream
    public final /* synthetic */ D parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D peek(DoubleConsumer doubleConsumer) {
        return j(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.S.j(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f.j(this.a.sequential());
    }

    @Override // j$.util.stream.D, j$.util.stream.BaseStream
    public final /* synthetic */ D sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D sorted() {
        return j(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.V spliterator() {
        return j$.util.T.a(this.a.spliterator());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.j(this.a.unordered());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean x() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.D
    public final j$.util.w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.D
    public final D e(a aVar) {
        DoubleStream doubleStream = this.a;
        a aVar2 = new a(8);
        aVar2.b = aVar;
        return j(doubleStream.flatMap(aVar2));
    }
}
