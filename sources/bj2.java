// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bj2 {
    public static final bj2 a;
    public static final /* synthetic */ bj2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    bj2 EF0;

    static {
        bj2 bj2Var = new bj2("NONE", 0);
        bj2 bj2Var2 = new bj2("ALL_JSON_OBJECTS", 1);
        bj2 bj2Var3 = new bj2("POLYMORPHIC", 2);
        a = bj2Var3;
        b = new bj2[]{bj2Var, bj2Var2, bj2Var3};
    }

    public static bj2 valueOf(String str) {
        return (bj2) Enum.valueOf(bj2.class, str);
    }

    public static bj2[] values() {
        return (bj2[]) b.clone();
    }
}
