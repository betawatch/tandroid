// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bu3 {
    public static final bu3 a;
    public static final bu3 b;
    public static final bu3 c;
    public static final /* synthetic */ bu3[] d;

    static {
        bu3 bu3Var = new bu3("NONE", 0);
        a = bu3Var;
        bu3 bu3Var2 = new bu3("VERTICAL", 1);
        b = bu3Var2;
        bu3 bu3Var3 = new bu3("FULL", 2);
        c = bu3Var3;
        d = new bu3[]{bu3Var, bu3Var2, bu3Var3};
    }

    public static bu3 valueOf(String str) {
        return (bu3) Enum.valueOf(bu3.class, str);
    }

    public static bu3[] values() {
        return (bu3[]) d.clone();
    }
}
