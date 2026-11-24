// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ny2 {
    public static final ny2 a;
    public static final ny2 b;
    public static final /* synthetic */ ny2[] c;

    static {
        ny2 ny2Var = new ny2("DEFAULT", 0);
        a = ny2Var;
        ny2 ny2Var2 = new ny2("LAZY", 1);
        ny2 ny2Var3 = new ny2("ATOMIC", 2);
        b = ny2Var3;
        c = new ny2[]{ny2Var, ny2Var2, ny2Var3, new ny2("UNDISPATCHED", 3)};
    }

    public static ny2 valueOf(String str) {
        return (ny2) Enum.valueOf(ny2.class, str);
    }

    public static ny2[] values() {
        return (ny2[]) c.clone();
    }
}
