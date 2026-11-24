// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eia {
    public static final eia a;
    public static final eia b;
    public static final /* synthetic */ eia[] c;

    static {
        eia eiaVar = new eia("GENERAL", 0);
        a = eiaVar;
        eia eiaVar2 = new eia("FALLBACK", 1);
        b = eiaVar2;
        c = new eia[]{eiaVar, eiaVar2};
    }

    public static eia valueOf(String str) {
        return (eia) Enum.valueOf(eia.class, str);
    }

    public static eia[] values() {
        return (eia[]) c.clone();
    }
}
