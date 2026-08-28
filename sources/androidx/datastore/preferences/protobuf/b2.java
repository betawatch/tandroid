package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b2 {
    public static final b2 a;
    public static final b2 b;
    public static final b2 c;
    public static final b2 d;
    public static final b2 e;
    public static final b2 f;
    public static final b2 h;
    public static final b2 n;
    public static final b2 r;
    public static final /* synthetic */ b2[] s;

    static {
        b2 b2Var = new b2("INT", 0);
        a = b2Var;
        b2 b2Var2 = new b2("LONG", 1);
        b = b2Var2;
        b2 b2Var3 = new b2("FLOAT", 2);
        c = b2Var3;
        b2 b2Var4 = new b2("DOUBLE", 3);
        d = b2Var4;
        b2 b2Var5 = new b2("BOOLEAN", 4);
        e = b2Var5;
        b2 b2Var6 = new b2("STRING", 5);
        f = b2Var6;
        g gVar = g.c;
        b2 b2Var7 = new b2("BYTE_STRING", 6);
        h = b2Var7;
        b2 b2Var8 = new b2("ENUM", 7);
        n = b2Var8;
        b2 b2Var9 = new b2("MESSAGE", 8);
        r = b2Var9;
        s = new b2[]{b2Var, b2Var2, b2Var3, b2Var4, b2Var5, b2Var6, b2Var7, b2Var8, b2Var9};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) s.clone();
    }
}
