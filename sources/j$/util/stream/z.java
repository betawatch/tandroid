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
public final /* synthetic */ class z implements B, AutoCloseable {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ z(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ B j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof A ? ((A) doubleStream).a : new z(doubleStream);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B a() {
        return j(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z average() {
        return j$.com.android.tools.r8.a.F(this.a.average());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B b() {
        return j(this.a.filter(null));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B c() {
        return j(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B distinct() {
        return j(this.a.distinct());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B e() {
        return j(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z findAny() {
        return j$.com.android.tools.r8.a.F(this.a.findAny());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z findFirst() {
        return j$.com.android.tools.r8.a.F(this.a.findFirst());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean h() {
        return this.a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ LongStream i() {
        return h0.j(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.B, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.F iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.E ? ((j$.util.E) it).a : new j$.util.D(it);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z max() {
        return j$.com.android.tools.r8.a.F(this.a.max());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z min() {
        return j$.com.android.tools.r8.a.F(this.a.min());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean o() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.B, j$.util.stream.BaseStream
    public final /* synthetic */ B parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.j(this.a.parallel());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B peek(DoubleConsumer doubleConsumer) {
        return j(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.F(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ IntStream s() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.B, j$.util.stream.BaseStream
    public final /* synthetic */ B sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.j(this.a.sequential());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B sorted() {
        return j(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.B, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.T spliterator() {
        return j$.util.Q.a(this.a.spliterator());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.j(this.a.unordered());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean y() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.B
    public final j$.util.u summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.B
    public final B d(j$.time.t tVar) {
        DoubleStream doubleStream = this.a;
        j$.time.t tVar2 = new j$.time.t(6);
        tVar2.b = tVar;
        return j(doubleStream.flatMap(tVar2));
    }
}
