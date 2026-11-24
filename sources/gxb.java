// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gxb {
    public static final gxb a;
    public static final gxb b;
    public static final gxb c;
    public static final /* synthetic */ gxb[] d;

    static {
        gxb gxbVar = new gxb("TOP", 0);
        a = gxbVar;
        gxb gxbVar2 = new gxb("LEFT", 1);
        b = gxbVar2;
        gxb gxbVar3 = new gxb("BOTTOM", 2);
        c = gxbVar3;
        d = new gxb[]{gxbVar, gxbVar2, gxbVar3};
    }

    public static gxb valueOf(String str) {
        return (gxb) Enum.valueOf(gxb.class, str);
    }

    public static gxb[] values() {
        return (gxb[]) d.clone();
    }
}
