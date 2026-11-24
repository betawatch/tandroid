// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b02 {
    public static final b02 a;
    public static final b02 b;
    public static final b02 c;
    public static final b02 d;
    public static final b02 e;
    public static final b02 f;
    public static final /* synthetic */ b02[] h;

    static {
        b02 b02Var = new b02("VOICE", 0);
        a = b02Var;
        b02 b02Var2 = new b02("VIDEO", 1);
        b = b02Var2;
        b02 b02Var3 = new b02("STICKER", 2);
        c = b02Var3;
        b02 b02Var4 = new b02("KEYBOARD", 3);
        d = b02Var4;
        b02 b02Var5 = new b02("SMILE", 4);
        e = b02Var5;
        b02 b02Var6 = new b02("GIF", 5);
        f = b02Var6;
        h = new b02[]{b02Var, b02Var2, b02Var3, b02Var4, b02Var5, b02Var6};
    }

    public static b02 valueOf(String str) {
        return (b02) Enum.valueOf(b02.class, str);
    }

    public static b02[] values() {
        return (b02[]) h.clone();
    }
}
