package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a2 {
    public static final a2 a;
    public static final a2 b;
    public static final a2 c;
    public static final a2 d;
    public static final a2 e;
    public static final a2 f;
    public static final a2 h;
    public static final a2 n;
    public static final a2 r;
    public static final /* synthetic */ a2[] s;

    static {
        a2 a2Var = new a2("INT", 0);
        a = a2Var;
        a2 a2Var2 = new a2("LONG", 1);
        b = a2Var2;
        a2 a2Var3 = new a2("FLOAT", 2);
        c = a2Var3;
        a2 a2Var4 = new a2("DOUBLE", 3);
        d = a2Var4;
        a2 a2Var5 = new a2("BOOLEAN", 4);
        e = a2Var5;
        a2 a2Var6 = new a2("STRING", 5);
        f = a2Var6;
        g gVar = g.c;
        a2 a2Var7 = new a2("BYTE_STRING", 6);
        h = a2Var7;
        a2 a2Var8 = new a2("ENUM", 7);
        n = a2Var8;
        a2 a2Var9 = new a2("MESSAGE", 8);
        r = a2Var9;
        s = new a2[]{a2Var, a2Var2, a2Var3, a2Var4, a2Var5, a2Var6, a2Var7, a2Var8, a2Var9};
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) s.clone();
    }
}
