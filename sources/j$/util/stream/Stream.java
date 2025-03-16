package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    public final /* synthetic */ class VivifiedWrapper implements Stream {
        public final /* synthetic */ java.util.stream.Stream a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.Stream stream) {
            this.a = stream;
        }

        public static /* synthetic */ Stream convert(java.util.stream.Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof Wrapper ? Stream.this : new VivifiedWrapper(stream);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream M(Consumer consumer) {
            return convert(this.a.peek(Consumer.Wrapper.convert(consumer)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean N(Predicate predicate) {
            return this.a.allMatch(j$.util.function.o0.a(predicate));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ LongStream P(Function function) {
            return i0.g0(this.a.flatMapToLong(j$.util.function.x.a(function)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean W(Predicate predicate) {
            return this.a.noneMatch(j$.util.function.o0.a(predicate));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ D a0(ToDoubleFunction toDoubleFunction) {
            return B.g0(this.a.mapToDouble(j$.util.function.s0.a(toDoubleFunction)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(Predicate predicate) {
            return this.a.anyMatch(j$.util.function.o0.a(predicate));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ IntStream b(Function function) {
            return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(j$.util.function.x.a(function)));
        }

        @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return this.a.collect(j.a(collector));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream distinct() {
            return convert(this.a.distinct());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ void e(Consumer consumer) {
            this.a.forEachOrdered(Consumer.Wrapper.convert(consumer));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.Stream stream = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return stream.equals(obj);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object f0(Object obj, j$.util.function.f fVar) {
            return this.a.reduce(obj, j$.util.function.e.a(fVar));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream filter(Predicate predicate) {
            return convert(this.a.filter(j$.util.function.o0.a(predicate)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return j$.util.A.o(this.a.findAny());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return j$.util.A.o(this.a.findFirst());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            this.a.forEach(Consumer.Wrapper.convert(consumer));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object h(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return this.a.collect(j$.util.function.q0.a(supplier), j$.util.function.a.a(biConsumer), j$.util.function.a.a(biConsumer2));
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ Iterator iterator() {
            return this.a.iterator();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ IntStream k(ToIntFunction toIntFunction) {
            return IntStream.VivifiedWrapper.convert(this.a.mapToInt(j$.util.function.u0.a(toIntFunction)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream l(Function function) {
            return convert(this.a.flatMap(j$.util.function.x.a(function)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream map(Function function) {
            return convert(this.a.map(j$.util.function.x.a(function)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return i0.g0(this.a.mapToLong(j$.util.function.w0.a(toLongFunction)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return j$.util.A.o(this.a.max(comparator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return j$.util.A.o(this.a.min(comparator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional o(j$.util.function.f fVar) {
            return j$.util.A.o(this.a.reduce(j$.util.function.e.a(fVar)));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return f.g0(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return f.g0(this.a.parallel());
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return f.g0(this.a.sequential());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream sorted() {
            return convert(this.a.sorted());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream sorted(Comparator comparator) {
            return convert(this.a.sorted(comparator));
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.D
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.N.b(this.a.spliterator());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return this.a.toArray(j$.util.function.F.a(intFunction));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object u(Object obj, BiFunction biFunction, j$.util.function.f fVar) {
            return this.a.reduce(obj, j$.util.function.b.a(biFunction), j$.util.function.e.a(fVar));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return f.g0(this.a.unordered());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ D w(Function function) {
            return B.g0(this.a.flatMapToDouble(j$.util.function.x.a(function)));
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof VivifiedWrapper ? ((VivifiedWrapper) stream).a : new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(java.util.function.Predicate predicate) {
            return Stream.this.N(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.anyMatch(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
            return Stream.this.h(j$.util.function.p0.a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(java.util.stream.Collector collector) {
            return Stream.this.collect(i.a(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.filter(Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findAny() {
            return j$.util.A.u(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findFirst() {
            return j$.util.A.u(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(java.util.function.Function function) {
            return convert(Stream.this.l(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return C.g0(Stream.this.w(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream flatMapToInt(java.util.function.Function function) {
            return IntStream.Wrapper.convert(Stream.this.b(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream flatMapToLong(java.util.function.Function function) {
            return j0.g0(Stream.this.P(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Stream.this.forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.e(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j) {
            return convert(Stream.this.limit(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.map(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
            return C.g0(Stream.this.a0(j$.util.function.r0.a(toDoubleFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.k(j$.util.function.t0.a(toIntFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction toLongFunction) {
            return j0.g0(Stream.this.mapToLong(j$.util.function.v0.a(toLongFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional max(Comparator comparator) {
            return j$.util.A.u(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional min(Comparator comparator) {
            return j$.util.A.u(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.W(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
            return g.g0(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream parallel() {
            return g.g0(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.M(Consumer.VivifiedWrapper.convert(consumer)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, java.util.function.BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.u(obj, BiFunction.VivifiedWrapper.convert(biFunction), j$.util.function.d.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.f0(obj, j$.util.function.d.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional reduce(BinaryOperator binaryOperator) {
            return j$.util.A.u(Stream.this.o(j$.util.function.d.a(binaryOperator)));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream sequential() {
            return g.g0(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Stream.this.toArray(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream unordered() {
            return g.g0(Stream.this.unordered());
        }
    }

    Stream M(Consumer consumer);

    boolean N(Predicate predicate);

    LongStream P(Function function);

    boolean W(Predicate predicate);

    D a0(ToDoubleFunction toDoubleFunction);

    boolean anyMatch(Predicate<? super T> predicate);

    IntStream b(Function function);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> distinct();

    void e(Consumer consumer);

    Object f0(Object obj, j$.util.function.f fVar);

    Stream<T> filter(Predicate<? super T> predicate);

    Optional findAny();

    Optional findFirst();

    void forEach(Consumer<? super T> consumer);

    Object h(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    IntStream k(ToIntFunction toIntFunction);

    Stream l(Function function);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    Optional o(j$.util.function.f fVar);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    Object u(Object obj, BiFunction biFunction, j$.util.function.f fVar);

    D w(Function function);
}
