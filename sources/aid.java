// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class aid {
    public static final aid a;
    public static final /* synthetic */ aid[] b;

    static {
        aid aidVar = new aid("DEFAULT", 0);
        a = aidVar;
        b = new aid[]{aidVar, new aid("SIGNED", 1), new aid("FIXED", 2)};
    }

    public static aid[] values() {
        return (aid[]) b.clone();
    }
}
