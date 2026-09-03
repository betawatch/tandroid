package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 a;
    public static final d0 b;
    public static final d0 c;
    public static final d0 d;
    public static final d0 e;
    public static final d0 f;
    public static final d0 h;
    public static final d0 n;
    public static final d0 r;
    public static final d0 s;
    public static final /* synthetic */ d0[] v;

    static {
        d0 d0Var = new d0("VOID", 0);
        a = d0Var;
        d0 d0Var2 = new d0("INT", 1);
        b = d0Var2;
        d0 d0Var3 = new d0("LONG", 2);
        c = d0Var3;
        d0 d0Var4 = new d0("FLOAT", 3);
        d = d0Var4;
        d0 d0Var5 = new d0("DOUBLE", 4);
        e = d0Var5;
        d0 d0Var6 = new d0("BOOLEAN", 5);
        f = d0Var6;
        d0 d0Var7 = new d0("STRING", 6);
        h = d0Var7;
        g gVar = g.c;
        d0 d0Var8 = new d0("BYTE_STRING", 7);
        n = d0Var8;
        d0 d0Var9 = new d0("ENUM", 8);
        r = d0Var9;
        d0 d0Var10 = new d0("MESSAGE", 9);
        s = d0Var10;
        v = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) v.clone();
    }
}
