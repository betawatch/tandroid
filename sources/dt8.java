// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dt8 {
    public static final dt8 a;
    public static final /* synthetic */ dt8[] b;

    static {
        dt8 dt8Var = new dt8("DEFAULT", 0);
        a = dt8Var;
        b = new dt8[]{dt8Var, new dt8("SIGNED", 1), new dt8("FIXED", 2)};
    }

    public static dt8 valueOf(String str) {
        return (dt8) Enum.valueOf(dt8.class, str);
    }

    public static dt8[] values() {
        return (dt8[]) b.clone();
    }
}
