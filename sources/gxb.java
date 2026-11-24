// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
