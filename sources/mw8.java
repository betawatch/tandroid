// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mw8 {
    public static final mw8 a;
    public static final /* synthetic */ mw8[] b;

    static {
        mw8 mw8Var = new mw8("DEFAULT", 0);
        a = mw8Var;
        b = new mw8[]{mw8Var, new mw8("SIGNED", 1), new mw8("FIXED", 2)};
    }

    public static mw8 valueOf(String str) {
        return (mw8) Enum.valueOf(mw8.class, str);
    }

    public static mw8[] values() {
        return (mw8[]) b.clone();
    }
}
