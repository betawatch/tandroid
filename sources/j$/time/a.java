package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.a1;
import j$.util.b0;
import j$.util.c0;
import j$.util.d0;
import j$.util.e0;
import j$.util.i0;
import j$.util.m0;
import j$.util.u0;
import j$.util.u1;
import j$.util.x0;
import j$.util.y;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static boolean A(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return a1Var.tryAdvance((LongConsumer) consumer);
        }
        if (u1.a) {
            u1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return a1Var.tryAdvance((LongConsumer) new m0(consumer, (byte) 0));
    }

    public static String B(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String C(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Optional D(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static b0 E(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new b0(optionalDouble.getAsDouble()) : b0.c;
    }

    public static c0 F(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? new c0(optionalInt.getAsInt()) : c0.c;
    }

    public static d0 G(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? new d0(optionalLong.getAsLong()) : d0.c;
    }

    public static java.util.Optional H(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static OptionalDouble I(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z = b0Var.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(b0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt J(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z = c0Var.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong K(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        boolean z = d0Var.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(d0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static void L(Iterator it, Consumer consumer) {
        if (it instanceof y) {
            ((y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.a M(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        Object obj = (j$.time.chrono.a) lVar.r(j$.time.temporal.p.b);
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        if (obj == null) {
            obj = Objects.requireNonNull(qVar, "defaultObj");
        }
        return (j$.time.chrono.a) obj;
    }

    public static /* synthetic */ long N(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry O(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ long P(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long Q(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) == 0 || (((j ^ j2) >> 63) | 1) >= 0) ? j3 : j3 - 1;
    }

    public static /* synthetic */ long R(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long S(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String T(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.c(bVar.z(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.time.a.b(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.g] */
    public static j$.util.function.g c(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.g
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.time.a.c(this, longConsumer3);
            }
        };
    }

    public static int d(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.z(), bVar2.z());
        if (compare != 0) {
            return compare;
        }
        return bVar.a().n().compareTo(bVar2.a().n());
    }

    public static int e(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.f().compareTo(chronoLocalDateTime2.f());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b())) == 0) ? chronoLocalDateTime.a().n().compareTo(chronoLocalDateTime2.a().n()) : compareTo;
    }

    public static int f(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.E(), chronoZonedDateTime2.E());
        return (compare == 0 && (compare = chronoZonedDateTime.b().d - chronoZonedDateTime2.b().d) == 0 && (compare = chronoZonedDateTime.p().B(chronoZonedDateTime2.p())) == 0 && (compare = chronoZonedDateTime.getZone().getId().compareTo(chronoZonedDateTime2.getZone().getId())) == 0) ? chronoZonedDateTime.a().n().compareTo(chronoZonedDateTime2.a().n()) : compare;
    }

    public static void g(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void h(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            u0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            u0Var.forEachRemaining((DoubleConsumer) new e0(consumer, (byte) 0));
        }
    }

    public static void i(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            x0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            x0Var.forEachRemaining((IntConsumer) new i0(consumer, (byte) 0));
        }
    }

    public static void j(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a1Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            a1Var.forEachRemaining((LongConsumer) new m0(consumer, (byte) 0));
        }
    }

    public static int k(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.a(chronoZonedDateTime, oVar);
        }
        int i = j$.time.chrono.h.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.p().j(oVar) : chronoZonedDateTime.h().getTotalSeconds();
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int l(j$.time.chrono.k kVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? kVar.getValue() : j$.time.temporal.p.a(kVar, aVar);
    }

    public static long m(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long n(j$.time.chrono.k kVar, j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return kVar.getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
        return oVar.l(kVar);
    }

    public static boolean o(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean p(j$.time.chrono.b bVar, j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isDateBased() : oVar != null && oVar.j(bVar);
    }

    public static boolean q(j$.time.chrono.k kVar, j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(kVar);
    }

    public static Object r(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.g) {
            return null;
        }
        return aVar == j$.time.temporal.p.b ? bVar.a() : aVar == j$.time.temporal.p.c ? ChronoUnit.DAYS : aVar.a(bVar);
    }

    public static Object s(ChronoLocalDateTime chronoLocalDateTime, j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d) {
            return null;
        }
        return aVar == j$.time.temporal.p.g ? chronoLocalDateTime.b() : aVar == j$.time.temporal.p.b ? chronoLocalDateTime.a() : aVar == j$.time.temporal.p.c ? ChronoUnit.NANOS : aVar.a(chronoLocalDateTime);
    }

    public static Object t(ChronoZonedDateTime chronoZonedDateTime, j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.a) ? chronoZonedDateTime.getZone() : aVar == j$.time.temporal.p.d ? chronoZonedDateTime.h() : aVar == j$.time.temporal.p.g ? chronoZonedDateTime.b() : aVar == j$.time.temporal.p.b ? chronoZonedDateTime.a() : aVar == j$.time.temporal.p.c ? ChronoUnit.NANOS : aVar.a(chronoZonedDateTime);
    }

    public static Object u(j$.time.chrono.k kVar, j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.c ? ChronoUnit.ERAS : j$.time.temporal.p.c(kVar, aVar);
    }

    public static long v(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.f().z() * 86400) + chronoLocalDateTime.b().L()) - zoneOffset.getTotalSeconds();
    }

    public static long w(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().z() * 86400) + chronoZonedDateTime.b().L()) - chronoZonedDateTime.h().getTotalSeconds();
    }

    public static Instant x(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.v(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.b().d);
    }

    public static boolean y(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return u0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (u1.a) {
            u1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return u0Var.tryAdvance((DoubleConsumer) new e0(consumer, (byte) 0));
    }

    public static boolean z(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return x0Var.tryAdvance((IntConsumer) consumer);
        }
        if (u1.a) {
            u1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return x0Var.tryAdvance((IntConsumer) new i0(consumer, (byte) 0));
    }

    public final int characteristics() {
        return 16448;
    }

    public final long estimateSize() {
        return 0L;
    }

    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public final Spliterator trySplit() {
        return null;
    }
}
