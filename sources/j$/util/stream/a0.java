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
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ a0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ c0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof b0 ? ((b0) doubleStream).a : new a0(doubleStream);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean B() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 a() {
        return f(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 average() {
        return j$.com.android.tools.r8.a.F(this.a.average());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 b() {
        return f(this.a.filter(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 c() {
        return f(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 distinct() {
        return f(this.a.distinct());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 e() {
        return f(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.com.android.tools.r8.a.F(this.a.findAny());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.com.android.tools.r8.a.F(this.a.findFirst());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.c0
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.h0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.g0 ? ((j$.util.g0) it).a : new j$.util.f0(it);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 limit(long j3) {
        return f(this.a.limit(j3));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean m() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 max() {
        return j$.com.android.tools.r8.a.F(this.a.max());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 min() {
        return j$.com.android.tools.r8.a.F(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.c0, j$.util.stream.BaseStream
    public final /* synthetic */ c0 parallel() {
        return f(this.a.parallel());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 peek(DoubleConsumer doubleConsumer) {
        return f(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.F(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean s() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.c0, j$.util.stream.BaseStream
    public final /* synthetic */ c0 sequential() {
        return f(this.a.sequential());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 skip(long j3) {
        return f(this.a.skip(j3));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e1.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.u0 spliterator() {
        return j$.util.s0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ LongStream t() {
        return j1.f(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.f(this.a.unordered());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ IntStream z() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.c0
    public final j$.util.w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.c0
    public final c0 d(j$.time.t tVar) {
        DoubleStream doubleStream = this.a;
        j$.time.t tVar2 = new j$.time.t(6);
        tVar2.b = tVar;
        return f(doubleStream.flatMap(tVar2));
    }
}
