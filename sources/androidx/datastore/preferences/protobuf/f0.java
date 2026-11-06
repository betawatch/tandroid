package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a;
    public static final f0 b;
    public static final f0 c;
    public static final f0 d;
    public static final f0 e;
    public static final f0 f;
    public static final f0 h;
    public static final f0 n;
    public static final f0 r;
    public static final f0 s;
    public static final /* synthetic */ f0[] w;

    static {
        f0 f0Var = new f0("VOID", 0);
        a = f0Var;
        f0 f0Var2 = new f0("INT", 1);
        b = f0Var2;
        f0 f0Var3 = new f0("LONG", 2);
        c = f0Var3;
        f0 f0Var4 = new f0("FLOAT", 3);
        d = f0Var4;
        f0 f0Var5 = new f0("DOUBLE", 4);
        e = f0Var5;
        f0 f0Var6 = new f0("BOOLEAN", 5);
        f = f0Var6;
        f0 f0Var7 = new f0("STRING", 6);
        h = f0Var7;
        h hVar = h.c;
        f0 f0Var8 = new f0("BYTE_STRING", 7);
        n = f0Var8;
        f0 f0Var9 = new f0("ENUM", 8);
        r = f0Var9;
        f0 f0Var10 = new f0("MESSAGE", 9);
        s = f0Var10;
        w = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) w.clone();
    }
}
