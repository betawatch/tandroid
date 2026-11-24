// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bx2 {
    public static final bx2 a;
    public static final /* synthetic */ bx2[] b;

    static {
        bx2 bx2Var = new bx2("COROUTINE_SUSPENDED", 0);
        a = bx2Var;
        b = new bx2[]{bx2Var, new bx2("UNDECIDED", 1), new bx2("RESUMED", 2)};
    }

    public static bx2 valueOf(String str) {
        return (bx2) Enum.valueOf(bx2.class, str);
    }

    public static bx2[] values() {
        return (bx2[]) b.clone();
    }
}
