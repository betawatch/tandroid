// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nv5 {
    public static final nv5 a;
    public static final nv5 b;
    public static final nv5 c;
    public static final nv5 d;
    public static final /* synthetic */ nv5[] e;

    static {
        nv5 nv5Var = new nv5("STATE_FULLY_HIDDEN", 0);
        a = nv5Var;
        nv5 nv5Var2 = new nv5("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = nv5Var2;
        nv5 nv5Var3 = new nv5("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = nv5Var3;
        nv5 nv5Var4 = new nv5("STATE_FULLY_VISIBLE", 3);
        d = nv5Var4;
        e = new nv5[]{nv5Var, nv5Var2, nv5Var3, nv5Var4};
    }

    public static nv5 valueOf(String str) {
        return (nv5) Enum.valueOf(nv5.class, str);
    }

    public static nv5[] values() {
        return (nv5[]) e.clone();
    }
}
