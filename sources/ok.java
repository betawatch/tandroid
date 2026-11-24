// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ok {
    public static final ok a;
    public static final ok b;
    public static final /* synthetic */ ok[] c;

    static {
        ok okVar = new ok("STARS", 0);
        a = okVar;
        ok okVar2 = new ok("TON", 1);
        b = okVar2;
        c = new ok[]{okVar, okVar2};
    }

    public static ok valueOf(String str) {
        return (ok) Enum.valueOf(ok.class, str);
    }

    public static ok[] values() {
        return (ok[]) c.clone();
    }
}
