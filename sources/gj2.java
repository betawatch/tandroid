// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gj2 {
    public static final gj2 a;
    public static final /* synthetic */ gj2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gj2 EF0;

    static {
        gj2 gj2Var = new gj2("UNKNOWN", 0);
        gj2 gj2Var2 = new gj2("ANDROID_FIREBASE", 1);
        a = gj2Var2;
        b = new gj2[]{gj2Var, gj2Var2};
    }

    public static gj2 valueOf(String str) {
        return (gj2) Enum.valueOf(gj2.class, str);
    }

    public static gj2[] values() {
        return (gj2[]) b.clone();
    }
}
