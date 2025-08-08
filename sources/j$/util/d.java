package j$.util;

import j$.util.function.B0;
import j$.util.function.D0;
import j$.util.function.Function;
import j$.util.function.z0;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class d implements Comparator, c {
    public static final d INSTANCE;
    private static final /* synthetic */ d[] a;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        a = new d[]{dVar};
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Comparator$-CC.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        comparator.getClass();
        return new b(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        convert.getClass();
        comparator.getClass();
        return Comparator$-EL.a(this, new b(comparator, convert, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(java.util.function.Function function) {
        return Comparator$-EL.a(this, Comparator$-CC.comparing(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingInt(B0.a(toIntFunction)));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingLong(D0.a(toLongFunction)));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingDouble(z0.a(toDoubleFunction)));
    }
}
