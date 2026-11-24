// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
