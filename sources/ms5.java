// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ms5 implements Iterator {
    public static final ms5 a;
    public static final /* synthetic */ ms5[] b;

    static {
        ms5 ms5Var = new ms5("INSTANCE", 0);
        a = ms5Var;
        b = new ms5[]{ms5Var};
    }

    public static ms5 valueOf(String str) {
        return (ms5) Enum.valueOf(ms5.class, str);
    }

    public static ms5[] values() {
        return (ms5[]) b.clone();
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
        gre.o("no calls to next() since the last call to remove()", false);
    }
}
