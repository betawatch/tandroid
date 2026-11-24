// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cga {
    public static final cga a;
    public static final cga b;
    public static final /* synthetic */ cga[] c;

    static {
        cga cgaVar = new cga("GENERAL", 0);
        a = cgaVar;
        cga cgaVar2 = new cga("FALLBACK", 1);
        b = cgaVar2;
        c = new cga[]{cgaVar, cgaVar2};
    }

    public static cga valueOf(String str) {
        return (cga) Enum.valueOf(cga.class, str);
    }

    public static cga[] values() {
        return (cga[]) c.clone();
    }
}
