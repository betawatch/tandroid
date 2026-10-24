package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d1 implements Iterator {
    public static final d1 a;
    public static final /* synthetic */ d1[] b;

    static {
        d1 d1Var = new d1("INSTANCE", 0);
        a = d1Var;
        b = new d1[]{d1Var};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        u6.o("no calls to next() since the last call to remove()", false);
    }
}
