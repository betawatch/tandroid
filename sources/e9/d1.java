package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        t6.o("no calls to next() since the last call to remove()", false);
    }
}
