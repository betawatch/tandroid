package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.Supplier;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements D {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ B(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ D f0(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C ? ((C) doubleStream).a : new B(doubleStream);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double D(double d, j$.util.function.h hVar) {
        return this.a.reduce(d, j$.util.function.g.a(hVar));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Stream G(j$.util.function.o oVar) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(j$.util.function.n.a(oVar)));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D L(j$.util.function.w wVar) {
        return f0(this.a.map(wVar == null ? null : wVar.a));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ IntStream Q(j$.util.function.r rVar) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(rVar == null ? null : rVar.a));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D S(j$.util.function.p pVar) {
        return f0(this.a.filter(pVar == null ? null : pVar.a));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D a(j$.util.function.l lVar) {
        return f0(this.a.peek(j$.util.function.k.a(lVar)));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean a0(j$.util.function.p pVar) {
        return this.a.anyMatch(pVar == null ? null : pVar.a);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j average() {
        return j$.util.A.q(this.a.average());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ void c0(j$.util.function.l lVar) {
        this.a.forEachOrdered(j$.util.function.k.a(lVar));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean d0(j$.util.function.p pVar) {
        return this.a.allMatch(pVar == null ? null : pVar.a);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D distinct() {
        return f0(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j findAny() {
        return j$.util.A.q(this.a.findAny());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j findFirst() {
        return j$.util.A.q(this.a.findFirst());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ void i(j$.util.function.l lVar) {
        this.a.forEach(j$.util.function.k.a(lVar));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.p iterator() {
        return j$.util.n.b(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ boolean j(j$.util.function.p pVar) {
        return this.a.noneMatch(pVar == null ? null : pVar.a);
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D limit(long j) {
        return f0(this.a.limit(j));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j max() {
        return j$.util.A.q(this.a.max());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j min() {
        return j$.util.A.q(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.f0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f.f0(this.a.parallel());
    }

    @Override // j$.util.stream.D, j$.util.stream.BaseStream
    public final /* synthetic */ D parallel() {
        return f0(this.a.parallel());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D q(j$.util.function.o oVar) {
        return f0(this.a.flatMap(j$.util.function.n.a(oVar)));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ LongStream r(j$.util.function.v vVar) {
        return i0.f0(this.a.mapToLong(j$.util.function.u.a(vVar)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f.f0(this.a.sequential());
    }

    @Override // j$.util.stream.D, j$.util.stream.BaseStream
    public final /* synthetic */ D sequential() {
        return f0(this.a.sequential());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D skip(long j) {
        return f0(this.a.skip(j));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ D sorted() {
        return f0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.D spliterator() {
        return j$.util.B.b(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.N.b(this.a.spliterator());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.f0(this.a.unordered());
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ j$.util.j x(j$.util.function.h hVar) {
        return j$.util.A.q(this.a.reduce(j$.util.function.g.a(hVar)));
    }

    @Override // j$.util.stream.D
    public final /* synthetic */ Object z(Supplier supplier, j$.util.function.n0 n0Var, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.y0.a(supplier), j$.util.function.m0.a(n0Var), j$.util.function.a.a(biConsumer));
    }

    @Override // j$.util.stream.D
    public final j$.util.f summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }
}
