// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gz1 {
    public static final gz1 a;
    public static final gz1 b;
    public static final gz1 c;
    public static final gz1 d;
    public static final gz1 e;
    public static final gz1 f;
    public static final /* synthetic */ gz1[] h;

    static {
        gz1 gz1Var = new gz1("VOICE", 0);
        a = gz1Var;
        gz1 gz1Var2 = new gz1("VIDEO", 1);
        b = gz1Var2;
        gz1 gz1Var3 = new gz1("STICKER", 2);
        c = gz1Var3;
        gz1 gz1Var4 = new gz1("KEYBOARD", 3);
        d = gz1Var4;
        gz1 gz1Var5 = new gz1("SMILE", 4);
        e = gz1Var5;
        gz1 gz1Var6 = new gz1("GIF", 5);
        f = gz1Var6;
        h = new gz1[]{gz1Var, gz1Var2, gz1Var3, gz1Var4, gz1Var5, gz1Var6};
    }

    public static gz1 valueOf(String str) {
        return (gz1) Enum.valueOf(gz1.class, str);
    }

    public static gz1[] values() {
        return (gz1[]) h.clone();
    }
}
