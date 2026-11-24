// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oj {
    public static final oj a;
    public static final oj b;
    public static final /* synthetic */ oj[] c;

    static {
        oj ojVar = new oj("STARS", 0);
        a = ojVar;
        oj ojVar2 = new oj("TON", 1);
        b = ojVar2;
        c = new oj[]{ojVar, ojVar2};
    }

    public static oj valueOf(String str) {
        return (oj) Enum.valueOf(oj.class, str);
    }

    public static oj[] values() {
        return (oj[]) c.clone();
    }
}
