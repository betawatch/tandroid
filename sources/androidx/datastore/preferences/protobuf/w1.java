package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class w1 {
    public static final w1 a;
    public static final w1 b;
    public static final w1 c;
    public static final w1 d;
    public static final w1 e;
    public static final w1 f;
    public static final w1 h;
    public static final w1 n;
    public static final w1 r;
    public static final /* synthetic */ w1[] s;

    static {
        w1 w1Var = new w1("INT", 0);
        a = w1Var;
        w1 w1Var2 = new w1("LONG", 1);
        b = w1Var2;
        w1 w1Var3 = new w1("FLOAT", 2);
        c = w1Var3;
        w1 w1Var4 = new w1("DOUBLE", 3);
        d = w1Var4;
        w1 w1Var5 = new w1("BOOLEAN", 4);
        e = w1Var5;
        w1 w1Var6 = new w1("STRING", 5);
        f = w1Var6;
        h hVar = h.c;
        w1 w1Var7 = new w1("BYTE_STRING", 6);
        h = w1Var7;
        w1 w1Var8 = new w1("ENUM", 7);
        n = w1Var8;
        w1 w1Var9 = new w1("MESSAGE", 8);
        r = w1Var9;
        s = new w1[]{w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6, w1Var7, w1Var8, w1Var9};
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) s.clone();
    }
}
