// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class f30 {
    public static final f30 a;
    public static final f30 b;
    public static final /* synthetic */ f30[] c;

    static {
        f30 f30Var = new f30("DISABLED", 0);
        a = f30Var;
        f30 f30Var2 = new f30("RNNOISE", 1);
        b = f30Var2;
        c = new f30[]{f30Var, f30Var2};
    }

    public static f30 valueOf(String str) {
        return (f30) Enum.valueOf(f30.class, str);
    }

    public static f30[] values() {
        return (f30[]) c.clone();
    }
}
