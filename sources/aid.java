// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aid {
    public static final aid a;
    public static final /* synthetic */ aid[] b;

    static {
        aid aidVar = new aid("DEFAULT", 0);
        a = aidVar;
        b = new aid[]{aidVar, new aid("SIGNED", 1), new aid("FIXED", 2)};
    }

    public static aid[] values() {
        return (aid[]) b.clone();
    }
}
