package j$.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public interface List<E> extends Collection<E> {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public final /* synthetic */ class -CC {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            Objects.requireNonNull(unaryOperator);
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public final /* synthetic */ class -EL {
        public static /* synthetic */ void sort(java.util.List list, Comparator comparator) {
            if (list instanceof List) {
                ((List) list).sort(comparator);
            } else {
                -CC.$default$sort(list, comparator);
            }
        }
    }

    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(Comparator<? super E> comparator);
}
