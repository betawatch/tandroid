// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class leb {
    public static final leb a;
    public static final leb b;
    public static final leb c;
    public static final /* synthetic */ leb[] d;

    static {
        leb lebVar = new leb("LEFT", 0);
        a = lebVar;
        leb lebVar2 = new leb("CENTER", 1);
        b = lebVar2;
        leb lebVar3 = new leb("RIGHT", 2);
        c = lebVar3;
        d = new leb[]{lebVar, lebVar2, lebVar3};
    }

    public static leb valueOf(String str) {
        return (leb) Enum.valueOf(leb.class, str);
    }

    public static leb[] values() {
        return (leb[]) d.clone();
    }
}
