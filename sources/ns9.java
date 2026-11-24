// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ns9 {
    public static final ns9 a;
    public static final ns9 b;
    public static final ns9 c;
    public static final /* synthetic */ ns9[] d;

    static {
        ns9 ns9Var = new ns9("NETWORK_UNMETERED", 0);
        a = ns9Var;
        ns9 ns9Var2 = new ns9("DEVICE_IDLE", 1);
        b = ns9Var2;
        ns9 ns9Var3 = new ns9("DEVICE_CHARGING", 2);
        c = ns9Var3;
        d = new ns9[]{ns9Var, ns9Var2, ns9Var3};
    }

    public static ns9 valueOf(String str) {
        return (ns9) Enum.valueOf(ns9.class, str);
    }

    public static ns9[] values() {
        return (ns9[]) d.clone();
    }
}
