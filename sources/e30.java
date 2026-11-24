// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class e30 {
    public static final e30 a;
    public static final e30 b;
    public static final /* synthetic */ e30[] c;

    static {
        e30 e30Var = new e30("DISABLED", 0);
        a = e30Var;
        e30 e30Var2 = new e30("RNNOISE", 1);
        b = e30Var2;
        c = new e30[]{e30Var, e30Var2};
    }

    public static e30 valueOf(String str) {
        return (e30) Enum.valueOf(e30.class, str);
    }

    public static e30[] values() {
        return (e30[]) c.clone();
    }
}
