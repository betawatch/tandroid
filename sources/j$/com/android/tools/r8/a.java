package j$.com.android.tools.r8;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.F;
import j$.time.chrono.h;
import j$.time.chrono.k;
import j$.time.chrono.n;
import j$.time.chrono.r;
import j$.time.chrono.u;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.util.A;
import j$.util.B;
import j$.util.C;
import j$.util.G;
import j$.util.K;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.T;
import j$.util.W;
import j$.util.Z;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.e;
import j$.util.t0;
import j$.util.w;
import j$.util.z;
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
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long O(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry P(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ boolean Q(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long R(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long S(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long T(long j, long j2) {
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

    public static /* synthetic */ long U(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
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

    public static OptionalDouble J(z zVar) {
        if (zVar == null) {
            return null;
        }
        boolean z = zVar.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(zVar.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static z F(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return z.c;
        }
        return new z(optionalDouble.getAsDouble());
    }

    public static OptionalLong L(B b) {
        if (b == null) {
            return null;
        }
        boolean z = b.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(b.b);
        }
        throw new NoSuchElementException("No value present");
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
            public final void accept(int i) {
                IntConsumer.this.accept(i);
                intConsumer2.accept(i);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e d(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.d(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static B H(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return B.c;
        }
        return new B(optionalLong.getAsLong());
    }

    public static String D(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static OptionalInt K(A a) {
        if (a == null) {
            return null;
        }
        boolean z = a.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(a.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static A G(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return A.c;
        }
        return new A(optionalInt.getAsInt());
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

    public static String C(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void M(Iterator it, Consumer consumer) {
        if (it instanceof w) {
            ((w) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static boolean r(j$.time.chrono.l lVar, o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.ERA : oVar != null && oVar.p(lVar);
    }

    public static k N(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        Object obj = (k) lVar.r(p.b);
        r rVar = r.c;
        if (obj == null) {
            obj = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) obj;
    }

    public static int l(ChronoZonedDateTime chronoZonedDateTime, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = h.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return chronoZonedDateTime.i().getTotalSeconds();
            }
            return chronoZonedDateTime.B().o(oVar);
        }
        return p.a(chronoZonedDateTime, oVar);
    }

    public static int m(j$.time.chrono.l lVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        return p.a(lVar, aVar);
    }

    public static long o(j$.time.chrono.l lVar, o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return oVar.o(lVar);
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
                    if (str.equals(kVar2.getId()) || str.equals(kVar2.m())) {
                        return kVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            n nVar = n.l;
            j$.time.chrono.a.l(nVar, nVar.getId());
            u uVar = u.c;
            j$.time.chrono.a.l(uVar, uVar.getId());
            j$.time.chrono.z zVar = j$.time.chrono.z.c;
            j$.time.chrono.a.l(zVar, zVar.getId());
            F f = F.c;
            j$.time.chrono.a.l(f, f.getId());
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.getId().equals("ISO")) {
                        j$.time.chrono.a.l(aVar, aVar.getId());
                    }
                }
                r rVar = r.c;
                j$.time.chrono.a.l(rVar, rVar.getId());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
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
            return chronoLocalDateTime.c();
        }
        if (aVar == p.b) {
            return chronoLocalDateTime.b();
        }
        if (aVar == p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(chronoLocalDateTime);
    }

    public static boolean q(j$.time.chrono.b bVar, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).u();
        }
        return oVar != null && oVar.p(bVar);
    }

    public static long n(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean p(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static Instant y(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.I(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.c().d);
    }

    public static long w(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.d().v() * 86400) + chronoLocalDateTime.c().S()) - zoneOffset.getTotalSeconds();
    }

    public static Object u(ChronoZonedDateTime chronoZonedDateTime, j$.time.format.a aVar) {
        if (aVar == p.e || aVar == p.a) {
            return chronoZonedDateTime.getZone();
        }
        if (aVar == p.d) {
            return chronoZonedDateTime.i();
        }
        if (aVar == p.g) {
            return chronoZonedDateTime.c();
        }
        if (aVar == p.b) {
            return chronoZonedDateTime.b();
        }
        if (aVar == p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(chronoZonedDateTime);
    }

    public static int f(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.d().compareTo(chronoLocalDateTime2.d());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.c().compareTo(chronoLocalDateTime2.c())) == 0) ? ((j$.time.chrono.a) chronoLocalDateTime.b()).getId().compareTo(chronoLocalDateTime2.b().getId()) : compareTo;
    }

    public static Object s(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == p.a || aVar == p.e || aVar == p.d || aVar == p.g) {
            return null;
        }
        if (aVar == p.b) {
            return bVar.b();
        }
        if (aVar == p.c) {
            return ChronoUnit.DAYS;
        }
        return aVar.a(bVar);
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.e(bVar.v(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long x(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.d().v() * 86400) + chronoZonedDateTime.c().S()) - chronoZonedDateTime.i().getTotalSeconds();
    }

    public static int g(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.G(), chronoZonedDateTime2.G());
        return (compare == 0 && (compare = chronoZonedDateTime.c().d - chronoZonedDateTime2.c().d) == 0 && (compare = chronoZonedDateTime.B().z(chronoZonedDateTime2.B())) == 0 && (compare = chronoZonedDateTime.getZone().getId().compareTo(chronoZonedDateTime2.getZone().getId())) == 0) ? ((j$.time.chrono.a) chronoZonedDateTime.b()).getId().compareTo(chronoZonedDateTime2.b().getId()) : compare;
    }

    public static boolean A(W w, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return w.tryAdvance((IntConsumer) consumer);
        }
        if (t0.a) {
            t0.a(w.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w.tryAdvance((IntConsumer) new G(consumer, 0));
    }

    public static void j(W w, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            w.forEachRemaining((IntConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(w.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w.forEachRemaining((IntConsumer) new G(consumer, 0));
        }
    }

    public static int e(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.v(), bVar2.v());
        if (compare != 0) {
            return compare;
        }
        return ((j$.time.chrono.a) bVar.b()).getId().compareTo(bVar2.b().getId());
    }

    public static boolean B(Z z, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return z.tryAdvance((LongConsumer) consumer);
        }
        if (t0.a) {
            t0.a(z.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z.tryAdvance((LongConsumer) new K(consumer, 0));
    }

    public static void k(Z z, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            z.forEachRemaining((LongConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(z.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z.forEachRemaining((LongConsumer) new K(consumer, 0));
        }
    }

    public static boolean z(T t, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return t.tryAdvance((DoubleConsumer) consumer);
        }
        if (t0.a) {
            t0.a(t.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return t.tryAdvance((DoubleConsumer) new C(consumer, 0));
    }

    public static void i(T t, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            t.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(t.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            t.forEachRemaining((DoubleConsumer) new C(consumer, 0));
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
