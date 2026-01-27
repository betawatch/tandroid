package j$.util;

import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class T {
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

    public static OptionalDouble n(B b) {
        if (b == null) {
            return null;
        }
        if (b.c()) {
            return OptionalDouble.of(b.b());
        }
        return OptionalDouble.empty();
    }

    public static B j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return B.d(optionalDouble.getAsDouble());
        }
        return B.a();
    }

    public static OptionalLong p(D d) {
        if (d == null) {
            return null;
        }
        if (d.c()) {
            return OptionalLong.of(d.b());
        }
        return OptionalLong.empty();
    }

    public static D l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return D.d(optionalLong.getAsLong());
        }
        return D.a();
    }

    public static OptionalInt o(C c) {
        if (c == null) {
            return null;
        }
        if (c.c()) {
            return OptionalInt.of(c.b());
        }
        return OptionalInt.empty();
    }

    public static C k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return C.d(optionalInt.getAsInt());
        }
        return C.a();
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

    public static boolean g(Z z, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return z.tryAdvance((IntConsumer) consumer);
        }
        if (w0.a) {
            w0.a(z.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z.tryAdvance((IntConsumer) new I(consumer));
    }

    public static void b(Z z, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z.forEachRemaining((IntConsumer) consumer);
        } else {
            if (w0.a) {
                w0.a(z.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z.forEachRemaining((IntConsumer) new I(consumer));
        }
    }

    public static boolean h(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return c0Var.tryAdvance((LongConsumer) consumer);
        }
        if (w0.a) {
            w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return c0Var.tryAdvance((LongConsumer) new M(consumer));
    }

    public static void c(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (w0.a) {
                w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            c0Var.forEachRemaining((LongConsumer) new M(consumer));
        }
    }

    public static boolean f(W w, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return w.tryAdvance((DoubleConsumer) consumer);
        }
        if (w0.a) {
            w0.a(w.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w.tryAdvance((DoubleConsumer) new E(consumer));
    }

    public static void a(W w, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            w.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (w0.a) {
                w0.a(w.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w.forEachRemaining((DoubleConsumer) new E(consumer));
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
