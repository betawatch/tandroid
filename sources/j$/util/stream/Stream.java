package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.DoubleStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    long count();

    Stream d(j$.time.v vVar);

    Stream<T> distinct();

    Stream dropWhile(Predicate predicate);

    Stream<T> filter(Predicate<? super T> predicate);

    Optional findAny();

    Optional<T> findFirst();

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    f0 mapToDouble(ToDoubleFunction toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    LongStream n(j$.time.v vVar);

    boolean noneMatch(Predicate<? super T> predicate);

    Stream peek(Consumer consumer);

    Optional reduce(BinaryOperator binaryOperator);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    IntStream s(j$.time.v vVar);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Stream takeWhile(Predicate predicate);

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);

    List toList();

    f0 u(j$.time.v vVar);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public final /* synthetic */ class VivifiedWrapper implements Stream {
        public final /* synthetic */ java.util.stream.Stream a;

        public /* synthetic */ VivifiedWrapper(java.util.stream.Stream stream) {
            this.a = stream;
        }

        public static /* synthetic */ Stream convert(java.util.stream.Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof Wrapper ? Stream.this : new VivifiedWrapper(stream);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return this.a.allMatch(predicate);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(Predicate predicate) {
            return this.a.anyMatch(predicate);
        }

        @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return this.a.collect(collector == null ? null : collector instanceof h ? ((h) collector).a : new i(collector));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream d(j$.time.v vVar) {
            return convert(this.a.flatMap(w3.N(vVar)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream distinct() {
            return convert(this.a.distinct());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream dropWhile(Predicate predicate) {
            return convert(this.a.dropWhile(predicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.Stream stream = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return stream.equals(obj);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream filter(Predicate predicate) {
            return convert(this.a.filter(predicate));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return j$.time.a.D(this.a.findAny());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return j$.time.a.D(this.a.findFirst());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            this.a.forEach(consumer);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(Consumer consumer) {
            this.a.forEachOrdered(consumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return this.a.iterator();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream map(Function function) {
            return convert(this.a.map(function));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ f0 mapToDouble(ToDoubleFunction toDoubleFunction) {
            return d0.g(this.a.mapToDouble(toDoubleFunction));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return m1.g(this.a.mapToLong(toLongFunction));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return j$.time.a.D(this.a.max(comparator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return j$.time.a.D(this.a.min(comparator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ LongStream n(j$.time.v vVar) {
            return m1.g(this.a.flatMapToLong(w3.N(vVar)));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(Predicate predicate) {
            return this.a.noneMatch(predicate);
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return e.g(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return e.g(this.a.parallel());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream peek(Consumer consumer) {
            return convert(this.a.peek(consumer));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return j$.time.a.D(this.a.reduce(binaryOperator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ IntStream s(j$.time.v vVar) {
            return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(w3.N(vVar)));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return e.g(this.a.sequential());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream sorted() {
            return convert(this.a.sorted());
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.e1.a(this.a.spliterator());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream takeWhile(Predicate predicate) {
            return convert(this.a.takeWhile(predicate));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ List toList() {
            return this.a.toList();
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ f0 u(j$.time.v vVar) {
            return d0.g(this.a.flatMapToDouble(w3.N(vVar)));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return e.g(this.a.unordered());
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return this.a.toArray(intFunction);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return this.a.reduce(obj, biFunction, binaryOperator);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Stream sorted(Comparator comparator) {
            return convert(this.a.sorted(comparator));
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return this.a.reduce(obj, binaryOperator);
        }

        @Override // j$.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return this.a.collect(supplier, biConsumer, biConsumer2);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        public /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof VivifiedWrapper ? ((VivifiedWrapper) stream).a : new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.allMatch(predicate);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(Predicate predicate) {
            return Stream.this.anyMatch(predicate);
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(java.util.stream.Collector collector) {
            return Stream.this.collect(collector == null ? null : collector instanceof i ? ((i) collector).a : new h(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream dropWhile(Predicate predicate) {
            return convert(Stream.this.dropWhile(predicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
            return convert(Stream.this.filter(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findAny() {
            return j$.time.a.H(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findFirst() {
            return j$.time.a.H(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.d(w3.N(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
            return e0.g(Stream.this.u(w3.N(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream flatMapToInt(Function function) {
            return IntStream.Wrapper.convert(Stream.this.s(w3.N(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream flatMapToLong(Function function) {
            return n1.g(Stream.this.n(w3.N(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(consumer);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(Consumer consumer) {
            Stream.this.forEachOrdered(consumer);
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
        public final /* synthetic */ java.util.stream.Stream map(Function function) {
            return convert(Stream.this.map(function));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return e0.g(Stream.this.mapToDouble(toDoubleFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.mapToInt(toIntFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(ToLongFunction toLongFunction) {
            return n1.g(Stream.this.mapToLong(toLongFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional max(Comparator comparator) {
            return j$.time.a.H(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional min(Comparator comparator) {
            return j$.time.a.H(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(Predicate predicate) {
            return Stream.this.noneMatch(predicate);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
            return f.g(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream parallel() {
            return f.g(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
            return convert(Stream.this.peek(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional reduce(BinaryOperator binaryOperator) {
            return j$.time.a.H(Stream.this.reduce(binaryOperator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream sequential() {
            return f.g(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream takeWhile(Predicate predicate) {
            return convert(Stream.this.takeWhile(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ List toList() {
            return Stream.this.toList();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream unordered() {
            return f.g(Stream.this.unordered());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(intFunction);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.reduce(obj, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.reduce(obj, biFunction, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.collect(supplier, biConsumer, biConsumer2);
        }
    }
}
