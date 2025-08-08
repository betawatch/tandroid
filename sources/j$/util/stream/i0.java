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

    public static /* synthetic */ LongStream f0(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j0 ? ((j0) longStream).a : new i0(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean C(j$.util.function.b0 b0Var) {
        return this.a.anyMatch(b0Var == null ? null : b0Var.a);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean E(j$.util.function.b0 b0Var) {
        return this.a.noneMatch(b0Var == null ? null : b0Var.a);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream K(j$.util.function.b0 b0Var) {
        return f0(this.a.filter(b0Var == null ? null : b0Var.a));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void T(j$.util.function.Y y) {
        this.a.forEachOrdered(j$.util.function.X.a(y));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object W(Supplier supplier, j$.util.function.t0 t0Var, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.y0.a(supplier), j$.util.function.s0.a(t0Var), j$.util.function.a.a(biConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ D asDoubleStream() {
        return B.f0(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.j average() {
        return j$.util.A.q(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void c(j$.util.function.Y y) {
        this.a.forEach(j$.util.function.X.a(y));
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
    public final /* synthetic */ LongStream distinct() {
        return f0(this.a.distinct());
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
    public final /* synthetic */ j$.util.l g(j$.util.function.U u) {
        return j$.util.A.t(this.a.reduce(j$.util.function.T.a(u)));
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
        return f0(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream m(j$.util.function.Y y) {
        return f0(this.a.peek(j$.util.function.X.a(y)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(j$.util.function.a0.a(longFunction)));
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
    public final /* synthetic */ LongStream n(LongFunction longFunction) {
        return f0(this.a.flatMap(j$.util.function.a0.a(longFunction)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.f0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ D p(j$.util.function.d0 d0Var) {
        return B.f0(this.a.mapToDouble(d0Var == null ? null : d0Var.a));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f.f0(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return f0(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean s(j$.util.function.b0 b0Var) {
        return this.a.allMatch(b0Var == null ? null : b0Var.a);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f.f0(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return f0(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return f0(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return f0(this.a.sorted());
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
    public final /* synthetic */ LongStream t(j$.util.function.k0 k0Var) {
        return f0(this.a.map(j$.util.function.j0.a(k0Var)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.f0(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long v(long j, j$.util.function.U u) {
        return this.a.reduce(j, j$.util.function.T.a(u));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream y(j$.util.function.f0 f0Var) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(f0Var == null ? null : f0Var.a));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.i summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }
}
