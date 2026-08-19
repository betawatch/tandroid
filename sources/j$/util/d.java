package j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d implements Comparator {
    public static final d INSTANCE;
    public static final /* synthetic */ d[] a;

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
        Objects.requireNonNull(comparator);
        return new c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        return Comparator$-EL.a(this, Comparator$-CC.comparing(function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingLong(toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator$-EL.a(this, Comparator$-CC.comparingDouble(toDoubleFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return Comparator$-EL.a(this, new c(comparator, function, 1));
    }
}
