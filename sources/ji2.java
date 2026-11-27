// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ji2 {
    public static final ji2 a;
    public static final /* synthetic */ ji2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ji2 EF0;

    static {
        ji2 ji2Var = new ji2("NONE", 0);
        ji2 ji2Var2 = new ji2("ALL_JSON_OBJECTS", 1);
        ji2 ji2Var3 = new ji2("POLYMORPHIC", 2);
        a = ji2Var3;
        b = new ji2[]{ji2Var, ji2Var2, ji2Var3};
    }

    public static ji2 valueOf(String str) {
        return (ji2) Enum.valueOf(ji2.class, str);
    }

    public static ji2[] values() {
        return (ji2[]) b.clone();
    }
}
