// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lu5 implements Iterator {
    public static final lu5 a;
    public static final /* synthetic */ lu5[] b;

    static {
        lu5 lu5Var = new lu5("INSTANCE", 0);
        a = lu5Var;
        b = new lu5[]{lu5Var};
    }

    public static lu5 valueOf(String str) {
        return (lu5) Enum.valueOf(lu5.class, str);
    }

    public static lu5[] values() {
        return (lu5[]) b.clone();
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
        jte.o("no calls to next() since the last call to remove()", false);
    }
}
