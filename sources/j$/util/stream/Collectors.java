package j$.util.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        g gVar = g.CONCURRENT;
        g gVar2 = g.UNORDERED;
        g gVar3 = g.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(gVar, gVar2, gVar3));
        Collections.unmodifiableSet(EnumSet.of(gVar, gVar2));
        a = Collections.unmodifiableSet(EnumSet.of(gVar3));
        b = Collections.unmodifiableSet(EnumSet.of(gVar2, gVar3));
        c = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(gVar2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static Collector<CharSequence, ?, String> joining(final CharSequence charSequence) {
        return new k(new Supplier() { // from class: j$.util.stream.j
            @Override // java.util.function.Supplier
            public final Object get() {
                CharSequence charSequence2 = charSequence;
                Set set = Collectors.a;
                return new j$.util.s1(charSequence2);
            }
        }, new j$.time.format.a((byte) 20), new j$.time.format.a((byte) 21), new j$.time.format.a((byte) 22), c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new k(supplier, new j$.time.format.a((byte) 10), new j$.time.format.a((byte) 11), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new k(new j$.time.format.a((byte) 12), new j$.time.format.a((byte) 13), new j$.time.format.a((byte) 18), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new k(new j$.time.format.a((byte) 15), new j$.time.format.a((byte) 16), new j$.time.format.a((byte) 23), b);
    }
}
