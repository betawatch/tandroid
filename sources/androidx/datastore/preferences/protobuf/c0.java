package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 {
    public static final c0 a;
    public static final c0 b;
    public static final c0 c;
    public static final c0 d;
    public static final c0 e;
    public static final c0 f;
    public static final c0 h;
    public static final c0 n;
    public static final c0 r;
    public static final c0 s;
    public static final /* synthetic */ c0[] v;

    static {
        c0 c0Var = new c0("VOID", 0);
        a = c0Var;
        c0 c0Var2 = new c0("INT", 1);
        b = c0Var2;
        c0 c0Var3 = new c0("LONG", 2);
        c = c0Var3;
        c0 c0Var4 = new c0("FLOAT", 3);
        d = c0Var4;
        c0 c0Var5 = new c0("DOUBLE", 4);
        e = c0Var5;
        c0 c0Var6 = new c0("BOOLEAN", 5);
        f = c0Var6;
        c0 c0Var7 = new c0("STRING", 6);
        h = c0Var7;
        g gVar = g.c;
        c0 c0Var8 = new c0("BYTE_STRING", 7);
        n = c0Var8;
        c0 c0Var9 = new c0("ENUM", 8);
        r = c0Var9;
        c0 c0Var10 = new c0("MESSAGE", 9);
        s = c0Var10;
        v = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) v.clone();
    }
}
