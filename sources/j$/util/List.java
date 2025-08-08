package j$.util;

import j$.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface List<E> extends Collection<E> {
    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(Comparator<? super E> comparator);

    @Override // j$.util.Collection, java.lang.Iterable
    Spliterator<E> spliterator();

    public final /* synthetic */ class -CC {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (!DesugarCollections.b.isInstance(list)) {
                unaryOperator.getClass();
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(unaryOperator.apply(listIterator.next()));
                }
                return;
            }
            DesugarCollections.e(list, unaryOperator);
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            if (DesugarCollections.b.isInstance(list)) {
                DesugarCollections.f(list, comparator);
                return;
            }
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }
}
