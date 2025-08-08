package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {
    void A(j$.util.function.G g);

    Stream B(IntFunction intFunction);

    IntStream F(j$.util.function.P p);

    int H(int i, j$.util.function.C c);

    IntStream I(IntFunction intFunction);

    void J(j$.util.function.G g);

    IntStream O(j$.util.function.I i);

    boolean R(j$.util.function.I i);

    j$.util.k U(j$.util.function.C c);

    IntStream V(j$.util.function.G g);

    boolean X(j$.util.function.I i);

    boolean Y(j$.util.function.I i);

    D asDoubleStream();

    LongStream asLongStream();

    j$.util.j average();

    Object b0(Supplier supplier, j$.util.function.q0 q0Var, BiConsumer biConsumer);

    Stream boxed();

    long count();

    D d(j$.util.function.K k);

    IntStream distinct();

    LongStream f(j$.util.function.O o);

    j$.util.k findAny();

    j$.util.k findFirst();

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.t iterator();

    IntStream limit(long j);

    j$.util.k max();

    j$.util.k min();

    @Override // j$.util.stream.BaseStream
    IntStream parallel();

    @Override // j$.util.stream.BaseStream
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.G spliterator();

    int sum();

    j$.util.g summaryStatistics();

    int[] toArray();

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.R(j$.util.function.I.a(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.X(j$.util.function.I.a(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C.f0(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream asLongStream() {
            return j0.f0(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return j$.util.A.v(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(java.util.function.Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.b0(j$.util.function.x0.a(supplier), j$.util.function.o0.a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.O(j$.util.function.I.a(intPredicate)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return j$.util.A.w(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return j$.util.A.w(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.I(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.J(j$.util.function.E.a(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.A(j$.util.function.E.a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return j$.util.s.b(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.F(j$.util.function.P.a(intUnaryOperator)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C.f0(IntStream.this.d(j$.util.function.K.a(intToDoubleFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return j0.f0(IntStream.this.f(j$.util.function.M.a(intToLongFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.B(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return j$.util.A.w(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return j$.util.A.w(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.Y(j$.util.function.I.a(intPredicate));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return g.f0(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return g.f0(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.V(j$.util.function.E.a(intConsumer)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.H(i, j$.util.function.A.a(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return j$.util.A.w(IntStream.this.U(j$.util.function.A.a(intBinaryOperator)));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return g.f0(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return j$.util.F.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return g.f0(IntStream.this.unordered());
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream {
        public final /* synthetic */ java.util.stream.IntStream a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void A(j$.util.function.G g) {
            this.a.forEachOrdered(j$.util.function.F.a(g));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream B(IntFunction intFunction) {
            return Stream.VivifiedWrapper.convert(this.a.mapToObj(j$.util.function.H.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream F(j$.util.function.P p) {
            return convert(this.a.map(p == null ? null : p.a));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int H(int i, j$.util.function.C c) {
            return this.a.reduce(i, j$.util.function.B.a(c));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream I(IntFunction intFunction) {
            return convert(this.a.flatMap(j$.util.function.H.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void J(j$.util.function.G g) {
            this.a.forEach(j$.util.function.F.a(g));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream O(j$.util.function.I i) {
            return convert(this.a.filter(i == null ? null : i.a));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean R(j$.util.function.I i) {
            return this.a.allMatch(i == null ? null : i.a);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.k U(j$.util.function.C c) {
            return j$.util.A.r(this.a.reduce(j$.util.function.B.a(c)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream V(j$.util.function.G g) {
            return convert(this.a.peek(j$.util.function.F.a(g)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean X(j$.util.function.I i) {
            return this.a.anyMatch(i == null ? null : i.a);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean Y(j$.util.function.I i) {
            return this.a.noneMatch(i == null ? null : i.a);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ D asDoubleStream() {
            return B.f0(this.a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return i0.f0(this.a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.j average() {
            return j$.util.A.q(this.a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object b0(Supplier supplier, j$.util.function.q0 q0Var, BiConsumer biConsumer) {
            return this.a.collect(j$.util.function.y0.a(supplier), j$.util.function.p0.a(q0Var), j$.util.function.a.a(biConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return Stream.VivifiedWrapper.convert(this.a.boxed());
        }

        @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ D d(j$.util.function.K k) {
            return B.f0(this.a.mapToDouble(k == null ? null : k.a));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.a.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ LongStream f(j$.util.function.O o) {
            return i0.f0(this.a.mapToLong(j$.util.function.N.a(o)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.k findAny() {
            return j$.util.A.r(this.a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.k findFirst() {
            return j$.util.A.r(this.a.findFirst());
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ j$.util.t iterator() {
            return j$.util.r.b(this.a.iterator());
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ Iterator iterator() {
            return this.a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.k max() {
            return j$.util.A.r(this.a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.k min() {
            return j$.util.A.r(this.a.min());
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return f.f0(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return f.f0(this.a.parallel());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        public final /* synthetic */ IntStream parallel() {
            return convert(this.a.parallel());
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return f.f0(this.a.sequential());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        public final /* synthetic */ IntStream sequential() {
            return convert(this.a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.a.sorted());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ j$.util.G spliterator() {
            return j$.util.E.b(this.a.spliterator());
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ j$.util.Spliterator spliterator() {
            return j$.util.N.b(this.a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return f.f0(this.a.unordered());
        }

        @Override // j$.util.stream.IntStream
        public final j$.util.g summaryStatistics() {
            this.a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }
    }
}
