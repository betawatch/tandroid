// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eu9 {
    public static final eu9 a;
    public static final eu9 b;
    public static final eu9 c;
    public static final /* synthetic */ eu9[] d;

    static {
        eu9 eu9Var = new eu9("NETWORK_UNMETERED", 0);
        a = eu9Var;
        eu9 eu9Var2 = new eu9("DEVICE_IDLE", 1);
        b = eu9Var2;
        eu9 eu9Var3 = new eu9("DEVICE_CHARGING", 2);
        c = eu9Var3;
        d = new eu9[]{eu9Var, eu9Var2, eu9Var3};
    }

    public static eu9 valueOf(String str) {
        return (eu9) Enum.valueOf(eu9.class, str);
    }

    public static eu9[] values() {
        return (eu9[]) d.clone();
    }
}
