package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.Supplier;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ C(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ E f0(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof D ? ((D) doubleStream).a : new C(doubleStream);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double D(double d, j$.util.function.i iVar) {
        return this.a.reduce(d, j$.util.function.h.a(iVar));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream G(j$.util.function.p pVar) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(j$.util.function.o.a(pVar)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E L(j$.util.function.v vVar) {
        return f0(this.a.map(vVar == null ? null : vVar.a));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ IntStream Q(j$.util.function.r rVar) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(rVar == null ? null : rVar.a));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E S(j$.util.function.q qVar) {
        return f0(this.a.filter(qVar == null ? null : qVar.a));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E a(j$.util.function.m mVar) {
        return f0(this.a.peek(j$.util.function.l.a(mVar)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean a0(j$.util.function.q qVar) {
        return this.a.anyMatch(qVar == null ? null : qVar.a);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j average() {
        return j$.util.A.q(this.a.average());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void c0(j$.util.function.m mVar) {
        this.a.forEachOrdered(j$.util.function.l.a(mVar));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean d0(j$.util.function.q qVar) {
        return this.a.allMatch(qVar == null ? null : qVar.a);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E distinct() {
        return f0(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j findAny() {
        return j$.util.A.q(this.a.findAny());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j findFirst() {
        return j$.util.A.q(this.a.findFirst());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void i(j$.util.function.m mVar) {
        this.a.forEach(j$.util.function.l.a(mVar));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.p iterator() {
        return j$.util.n.b(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean j(j$.util.function.q qVar) {
        return this.a.noneMatch(qVar == null ? null : qVar.a);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E limit(long j) {
        return f0(this.a.limit(j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j max() {
        return j$.util.A.q(this.a.max());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j min() {
        return j$.util.A.q(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.f0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return f.f0(this.a.parallel());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E parallel() {
        return f0(this.a.parallel());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E q(j$.util.function.p pVar) {
        return f0(this.a.flatMap(j$.util.function.o.a(pVar)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ LongStream r(j$.util.function.u uVar) {
        return j0.f0(this.a.mapToLong(j$.util.function.t.a(uVar)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return f.f0(this.a.sequential());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sequential() {
        return f0(this.a.sequential());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E skip(long j) {
        return f0(this.a.skip(j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sorted() {
        return f0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.D spliterator() {
        return j$.util.B.b(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.N.b(this.a.spliterator());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.E
    public final j$.util.f summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.f0(this.a.unordered());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.j x(j$.util.function.i iVar) {
        return j$.util.A.q(this.a.reduce(j$.util.function.h.a(iVar)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Object z(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.q0.a(supplier), j$.util.function.e0.a(f0Var), j$.util.function.a.a(biConsumer));
    }
}
