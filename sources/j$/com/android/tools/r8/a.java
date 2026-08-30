package j$.com.android.tools.r8;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.f0;
import j$.time.chrono.h;
import j$.time.chrono.k;
import j$.time.chrono.n;
import j$.time.chrono.r;
import j$.time.chrono.u;
import j$.time.chrono.z;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.a1;
import j$.util.b0;
import j$.util.c0;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.d0;
import j$.util.e0;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.f;
import j$.util.i0;
import j$.util.m0;
import j$.util.u0;
import j$.util.u1;
import j$.util.x0;
import j$.util.y;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import org.telegram.messenger.BuildConfig;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long O(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry P(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean Q(Unsafe unsafe, Object obj, long j10, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j11 = j10;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j11, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j11) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j10 = j11;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long R(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    public static /* synthetic */ long S(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    public static /* synthetic */ long T(long j10, long j11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j10 >= 0) | (j11 != Long.MIN_VALUE)) {
                long j12 = j10 * j11;
                if (j10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long U(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j11 ^ j10) >= 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static Optional I(j$.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static j$.util.Optional E(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return j$.util.Optional.of(optional.get());
        }
        return j$.util.Optional.empty();
    }

    public static b0 F(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return b0.c;
        }
        return new b0(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.b(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    public static d c(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.c(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                IntConsumer.this.accept(i10);
                intConsumer2.accept(i10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f d(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.d(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j10) {
                LongConsumer.this.accept(j10);
                longConsumer2.accept(j10);
            }
        };
    }

    public static d0 H(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return d0.c;
        }
        return new d0(optionalLong.getAsLong());
    }

    public static String D(long j10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j10, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static c0 G(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return c0.c;
        }
        return new c0(optionalInt.getAsInt());
    }

    public static void h(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String V(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = BuildConfig.BETA_URL;
        if (obj == null || (str = obj.toString()) == null) {
            str = BuildConfig.BETA_URL;
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

    public static String C(long j10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j10, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void M(Iterator it, Consumer consumer) {
        if (it instanceof y) {
            ((y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static OptionalDouble J(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z4 = b0Var.a;
        if (!z4) {
            return OptionalDouble.empty();
        }
        if (z4) {
            return OptionalDouble.of(b0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt K(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z4 = c0Var.a;
        if (!z4) {
            return OptionalInt.empty();
        }
        if (z4) {
            return OptionalInt.of(c0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong L(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        boolean z4 = d0Var.a;
        if (!z4) {
            return OptionalLong.empty();
        }
        if (z4) {
            return OptionalLong.of(d0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean r(j$.time.chrono.l lVar, o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(lVar);
    }

    public static k N(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        Object obj = (k) lVar.m(p.b);
        r rVar = r.c;
        if (obj == null) {
            obj = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) obj;
    }

    public static int l(ChronoZonedDateTime chronoZonedDateTime, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = h.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return chronoZonedDateTime.h().getTotalSeconds();
            }
            return chronoZonedDateTime.r().j(oVar);
        }
        return p.a(chronoZonedDateTime, oVar);
    }

    public static int m(j$.time.chrono.l lVar, o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        return p.a(lVar, oVar);
    }

    public static long o(j$.time.chrono.l lVar, o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return oVar.m(lVar);
    }

    public static k W(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.a;
            k kVar = (k) concurrentHashMap2.get(str);
            if (kVar == null) {
                kVar = (k) j$.time.chrono.a.b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(k.class).iterator();
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    if (str.equals(kVar2.getId()) || str.equals(kVar2.o())) {
                        return kVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            n nVar = n.l;
            nVar.getClass();
            j$.time.chrono.a.j(nVar, "Hijrah-umalqura");
            u uVar = u.c;
            uVar.getClass();
            j$.time.chrono.a.j(uVar, "Japanese");
            z zVar = z.c;
            zVar.getClass();
            j$.time.chrono.a.j(zVar, "Minguo");
            f0 f0Var = f0.c;
            f0Var.getClass();
            j$.time.chrono.a.j(f0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.getId().equals("ISO")) {
                        j$.time.chrono.a.j(aVar, aVar.getId());
                    }
                }
                r rVar = r.c;
                rVar.getClass();
                j$.time.chrono.a.j(rVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static Object v(j$.time.chrono.l lVar, j$.time.format.a aVar) {
        if (aVar == p.c) {
            return ChronoUnit.ERAS;
        }
        return p.c(lVar, aVar);
    }

    public static Object t(ChronoLocalDateTime chronoLocalDateTime, j$.time.format.a aVar) {
        if (aVar == p.a || aVar == p.e || aVar == p.d) {
            return null;
        }
        if (aVar == p.g) {
            return chronoLocalDateTime.b();
        }
        if (aVar == p.b) {
            return chronoLocalDateTime.a();
        }
        if (aVar == p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(chronoLocalDateTime);
    }

    public static boolean q(j$.time.chrono.b bVar, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).isDateBased();
        }
        return oVar != null && oVar.j(bVar);
    }

    public static long n(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean p(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static Instant y(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.I(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.b().d);
    }

    public static long w(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.f().z() * 86400) + chronoLocalDateTime.b().S()) - zoneOffset.getTotalSeconds();
    }

    public static Object u(ChronoZonedDateTime chronoZonedDateTime, j$.time.format.a aVar) {
        if (aVar == p.e || aVar == p.a) {
            return chronoZonedDateTime.getZone();
        }
        if (aVar == p.d) {
            return chronoZonedDateTime.h();
        }
        if (aVar == p.g) {
            return chronoZonedDateTime.b();
        }
        if (aVar == p.b) {
            return chronoZonedDateTime.a();
        }
        if (aVar == p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(chronoZonedDateTime);
    }

    public static int f(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.f().compareTo(chronoLocalDateTime2.f());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b())) == 0) ? ((j$.time.chrono.a) chronoLocalDateTime.a()).getId().compareTo(chronoLocalDateTime2.a().getId()) : compareTo;
    }

    public static Object s(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == p.a || aVar == p.e || aVar == p.d || aVar == p.g) {
            return null;
        }
        if (aVar == p.b) {
            return bVar.a();
        }
        if (aVar == p.c) {
            return ChronoUnit.DAYS;
        }
        return aVar.a(bVar);
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.c(bVar.z(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long x(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().z() * 86400) + chronoZonedDateTime.b().S()) - chronoZonedDateTime.h().getTotalSeconds();
    }

    public static int g(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.F(), chronoZonedDateTime2.F());
        return (compare == 0 && (compare = chronoZonedDateTime.b().d - chronoZonedDateTime2.b().d) == 0 && (compare = chronoZonedDateTime.r().C(chronoZonedDateTime2.r())) == 0 && (compare = chronoZonedDateTime.getZone().getId().compareTo(chronoZonedDateTime2.getZone().getId())) == 0) ? ((j$.time.chrono.a) chronoZonedDateTime.a()).getId().compareTo(chronoZonedDateTime2.a().getId()) : compare;
    }

    public static boolean A(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return x0Var.tryAdvance((IntConsumer) consumer);
        }
        if (u1.a) {
            u1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return x0Var.tryAdvance((IntConsumer) new i0(consumer, 0));
    }

    public static void j(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            x0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            x0Var.forEachRemaining((IntConsumer) new i0(consumer, 0));
        }
    }

    public static int e(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.z(), bVar2.z());
        if (compare != 0) {
            return compare;
        }
        return ((j$.time.chrono.a) bVar.a()).getId().compareTo(bVar2.a().getId());
    }

    public static boolean B(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return a1Var.tryAdvance((LongConsumer) consumer);
        }
        if (u1.a) {
            u1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return a1Var.tryAdvance((LongConsumer) new m0(consumer, 0));
    }

    public static void k(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a1Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            a1Var.forEachRemaining((LongConsumer) new m0(consumer, 0));
        }
    }

    public static boolean z(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return u0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (u1.a) {
            u1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return u0Var.tryAdvance((DoubleConsumer) new e0(consumer, 0));
    }

    public static void i(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            u0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            u0Var.forEachRemaining((DoubleConsumer) new e0(consumer, 0));
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
