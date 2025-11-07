package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class S {
    public static /* synthetic */ void r(java.util.List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else {
            List.-CC.$default$sort(list, comparator);
        }
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble n(A a) {
        if (a == null) {
            return null;
        }
        if (a.c()) {
            return OptionalDouble.of(a.b());
        }
        return OptionalDouble.empty();
    }

    public static A j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return A.d(optionalDouble.getAsDouble());
        }
        return A.a();
    }

    public static OptionalLong p(C c) {
        if (c == null) {
            return null;
        }
        if (c.c()) {
            return OptionalLong.of(c.b());
        }
        return OptionalLong.empty();
    }

    public static C l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return C.d(optionalLong.getAsLong());
        }
        return C.a();
    }

    public static OptionalInt o(B b) {
        if (b == null) {
            return null;
        }
        if (b.c()) {
            return OptionalInt.of(b.b());
        }
        return OptionalInt.empty();
    }

    public static B k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return B.d(optionalInt.getAsInt());
        }
        return B.a();
    }

    public static void q(Iterator it, Consumer consumer) {
        if (it instanceof y) {
            ((y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean g(Y y, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return y.tryAdvance((IntConsumer) consumer);
        }
        if (v0.a) {
            v0.a(y.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y.tryAdvance((IntConsumer) new H(consumer));
    }

    public static void b(Y y, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            y.forEachRemaining((IntConsumer) consumer);
        } else {
            if (v0.a) {
                v0.a(y.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y.forEachRemaining((IntConsumer) new H(consumer));
        }
    }

    public static boolean h(b0 b0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return b0Var.tryAdvance((LongConsumer) consumer);
        }
        if (v0.a) {
            v0.a(b0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return b0Var.tryAdvance((LongConsumer) new L(consumer));
    }

    public static void c(b0 b0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            b0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (v0.a) {
                v0.a(b0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            b0Var.forEachRemaining((LongConsumer) new L(consumer));
        }
    }

    public static boolean f(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v.tryAdvance((DoubleConsumer) consumer);
        }
        if (v0.a) {
            v0.a(v.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v.tryAdvance((DoubleConsumer) new D(consumer));
    }

    public static void a(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (v0.a) {
                v0.a(v.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v.forEachRemaining((DoubleConsumer) new D(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
