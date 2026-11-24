// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ev8 {
    public static final ev8 a;
    public static final /* synthetic */ ev8[] b;

    static {
        ev8 ev8Var = new ev8("DEFAULT", 0);
        a = ev8Var;
        b = new ev8[]{ev8Var, new ev8("SIGNED", 1), new ev8("FIXED", 2)};
    }

    public static ev8 valueOf(String str) {
        return (ev8) Enum.valueOf(ev8.class, str);
    }

    public static ev8[] values() {
        return (ev8[]) b.clone();
    }
}
