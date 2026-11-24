// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m39 {
    public static final m39 a;
    public static final m39 b;
    public static final /* synthetic */ m39[] c;

    /* JADX INFO: Fake field, exist only in values array */
    m39 EF0;

    static {
        m39 m39Var = new m39("FULL_BACKGROUND", 0);
        m39 m39Var2 = new m39("SECTION_COLOR_BACKGROUND", 1);
        m39 m39Var3 = new m39("OPTIMIZED_BACKGROUND", 2);
        a = m39Var3;
        m39 m39Var4 = new m39("DRAW_VERTICES", 3);
        b = m39Var4;
        c = new m39[]{m39Var, m39Var2, m39Var3, m39Var4};
    }

    public static m39 valueOf(String str) {
        return (m39) Enum.valueOf(m39.class, str);
    }

    public static m39[] values() {
        return (m39[]) c.clone();
    }
}
