// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class iaa {
    public static final iaa a;
    public static final iaa b;
    public static final /* synthetic */ iaa[] c;

    static {
        iaa iaaVar = new iaa("CRASHLYTICS", 0);
        a = iaaVar;
        iaa iaaVar2 = new iaa("PERFORMANCE", 1);
        b = iaaVar2;
        c = new iaa[]{iaaVar, iaaVar2, new iaa("MATT_SAYS_HI", 2)};
    }

    public static iaa valueOf(String str) {
        return (iaa) Enum.valueOf(iaa.class, str);
    }

    public static iaa[] values() {
        return (iaa[]) c.clone();
    }
}
