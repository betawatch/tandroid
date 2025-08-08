package j$.util;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import j$.util.stream.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public interface Collection<E> extends j$.lang.a {
    @Override // j$.lang.a
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    public final /* synthetic */ class -EL {
        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : -CC.$default$removeIf(collection, predicate);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : -CC.$default$stream(collection);
        }

        public static Spliterator b(java.util.Collection collection) {
            Spliterator spliterator;
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (collection instanceof java.util.SortedSet) {
                java.util.SortedSet sortedSet = (java.util.SortedSet) collection;
                return new z(sortedSet, sortedSet);
            }
            if (collection instanceof java.util.Set) {
                return Spliterators.spliterator((java.util.Set) collection, 1);
            }
            if (!(collection instanceof java.util.List)) {
                return Spliterators.spliterator(collection, 0);
            }
            spliterator = Spliterators.spliterator((java.util.List) collection, 16);
            return spliterator;
        }

        public static void a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            consumer.getClass();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.r(it.next());
            }
        }
    }

    public final /* synthetic */ class -CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            if (!DesugarCollections.a.isInstance(collection)) {
                predicate.getClass();
                Iterator<E> it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (predicate.test(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }
            return DesugarCollections.d(collection, predicate);
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return t0.e0(-EL.b(collection), false);
        }
    }
}
