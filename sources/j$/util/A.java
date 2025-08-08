package j$.util;

import j$.util.function.Consumer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class A {
    public static java.util.Optional u(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional o(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble v(j jVar) {
        if (jVar == null) {
            return null;
        }
        if (jVar.c()) {
            return OptionalDouble.of(jVar.b());
        }
        return OptionalDouble.empty();
    }

    public static j q(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return j.d(optionalDouble.getAsDouble());
        }
        return j.a();
    }

    public static OptionalLong x(l lVar) {
        if (lVar == null) {
            return null;
        }
        if (lVar.c()) {
            return OptionalLong.of(lVar.b());
        }
        return OptionalLong.empty();
    }

    public static boolean y(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static l t(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return l.d(optionalLong.getAsLong());
        }
        return l.a();
    }

    public static OptionalInt w(k kVar) {
        if (kVar == null) {
            return null;
        }
        if (kVar.c()) {
            return OptionalInt.of(kVar.b());
        }
        return OptionalInt.empty();
    }

    public static k r(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return k.d(optionalInt.getAsInt());
        }
        return k.a();
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public static void z(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static long j(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean k(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean m(G g, Consumer consumer) {
        if (consumer instanceof j$.util.function.G) {
            return g.tryAdvance((j$.util.function.G) consumer);
        }
        if (!d0.a) {
            consumer.getClass();
            return g.tryAdvance(new q(consumer));
        }
        d0.a(g.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static void f(G g, Consumer consumer) {
        if (consumer instanceof j$.util.function.G) {
            g.forEachRemaining((j$.util.function.G) consumer);
        } else if (!d0.a) {
            consumer.getClass();
            g.forEachRemaining(new q(consumer));
        } else {
            d0.a(g.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static boolean n(J j, Consumer consumer) {
        if (consumer instanceof j$.util.function.Y) {
            return j.tryAdvance((j$.util.function.Y) consumer);
        }
        if (!d0.a) {
            consumer.getClass();
            return j.tryAdvance(new u(consumer));
        }
        d0.a(j.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static void h(J j, Consumer consumer) {
        if (consumer instanceof j$.util.function.Y) {
            j.forEachRemaining((j$.util.function.Y) consumer);
        } else if (!d0.a) {
            consumer.getClass();
            j.forEachRemaining(new u(consumer));
        } else {
            d0.a(j.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    public static boolean l(D d, Consumer consumer) {
        if (consumer instanceof j$.util.function.l) {
            return d.tryAdvance((j$.util.function.l) consumer);
        }
        if (!d0.a) {
            consumer.getClass();
            return d.tryAdvance(new m(consumer));
        }
        d0.a(d.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static void b(D d, Consumer consumer) {
        if (consumer instanceof j$.util.function.l) {
            d.forEachRemaining((j$.util.function.l) consumer);
        } else if (!d0.a) {
            consumer.getClass();
            d.forEachRemaining(new m(consumer));
        } else {
            d0.a(d.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
