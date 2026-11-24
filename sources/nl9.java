// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nl9 {
    public static final nl9 a;
    public static final nl9 b;
    public static final /* synthetic */ nl9[] c;

    static {
        nl9 nl9Var = new nl9("FRONT", 0);
        a = nl9Var;
        nl9 nl9Var2 = new nl9("BACK", 1);
        b = nl9Var2;
        c = new nl9[]{nl9Var, nl9Var2};
    }

    public static nl9 valueOf(String str) {
        return (nl9) Enum.valueOf(nl9.class, str);
    }

    public static nl9[] values() {
        return (nl9[]) c.clone();
    }
}
