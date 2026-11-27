// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
