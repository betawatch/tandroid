// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iy2 {
    public static final iy2 a;
    public static final iy2 b;
    public static final iy2 c;
    public static final iy2 d;
    public static final iy2 e;
    public static final /* synthetic */ iy2[] f;

    static {
        iy2 iy2Var = new iy2("CPU_ACQUIRED", 0);
        a = iy2Var;
        iy2 iy2Var2 = new iy2("BLOCKING", 1);
        b = iy2Var2;
        iy2 iy2Var3 = new iy2("PARKING", 2);
        c = iy2Var3;
        iy2 iy2Var4 = new iy2("DORMANT", 3);
        d = iy2Var4;
        iy2 iy2Var5 = new iy2("TERMINATED", 4);
        e = iy2Var5;
        f = new iy2[]{iy2Var, iy2Var2, iy2Var3, iy2Var4, iy2Var5};
    }

    public static iy2 valueOf(String str) {
        return (iy2) Enum.valueOf(iy2.class, str);
    }

    public static iy2[] values() {
        return (iy2[]) f.clone();
    }
}
