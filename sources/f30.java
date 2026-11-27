// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
