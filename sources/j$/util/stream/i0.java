package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    private /* synthetic */ i0(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream h0(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j0 ? ((j0) longStream).a : new i0(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean D(j$.util.function.W w) {
        return this.a.anyMatch(w == null ? null : w.a);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean F(j$.util.function.W w) {
        return this.a.noneMatch(w == null ? null : w.a);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream L(j$.util.function.W w) {
        return h0(this.a.filter(w == null ? null : w.a));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void U(j$.util.function.T t) {
        this.a.forEachOrdered(j$.util.function.S.a(t));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object Y(Supplier supplier, j$.util.function.l0 l0Var, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.q0.a(supplier), j$.util.function.k0.a(l0Var), j$.util.function.a.a(biConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ D asDoubleStream() {
        return B.h0(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.j average() {
        return j$.util.A.q(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void d(j$.util.function.T t) {
        this.a.forEach(j$.util.function.S.a(t));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return h0(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.l findAny() {
        return j$.util.A.t(this.a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.l findFirst() {
        return j$.util.A.t(this.a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.l h(j$.util.function.O o) {
        return j$.util.A.t(this.a.reduce(j$.util.function.N.a(o)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ j$.util.x iterator() {
        return j$.util.v.b(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return h0(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(j$.util.function.V.a(longFunction)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.l max() {
        return j$.util.A.t(this.a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.l min() {
        return j$.util.A.t(this.a.min());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream n(j$.util.function.T t) {
        return h0(this.a.peek(j$.util.function.S.a(t)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream o(LongFunction longFunction) {
        return h0(this.a.flatMap(j$.util.function.V.a(longFunction)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.h0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f.h0(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return h0(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ D q(j$.util.function.X x) {
        return B.h0(this.a.mapToDouble(x == null ? null : x.a));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f.h0(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return h0(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return h0(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return h0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ j$.util.J spliterator() {
        return j$.util.H.b(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.N.b(this.a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.i summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean t(j$.util.function.W w) {
        return this.a.allMatch(w == null ? null : w.a);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream u(j$.util.function.c0 c0Var) {
        return h0(this.a.map(j$.util.function.b0.a(c0Var)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.h0(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long w(long j, j$.util.function.O o) {
        return this.a.reduce(j, j$.util.function.N.a(o));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream z(j$.util.function.Y y) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(y == null ? null : y.a));
    }
}
