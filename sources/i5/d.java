package i5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d {
    public static final d a;
    public static final d b;
    public static final d c;
    public static final /* synthetic */ d[] d;

    static {
        d dVar = new d("DEFAULT", 0);
        a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        c = dVar3;
        d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
