// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c8d {
    public static final c8d a;
    public static final /* synthetic */ c8d[] b;

    static {
        c8d c8dVar = new c8d("DEFAULT", 0);
        a = c8dVar;
        b = new c8d[]{c8dVar, new c8d("SIGNED", 1), new c8d("FIXED", 2)};
    }

    public static c8d[] values() {
        return (c8d[]) b.clone();
    }
}
