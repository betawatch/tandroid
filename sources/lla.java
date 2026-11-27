// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lla {
    public static final lla a;
    public static final lla b;
    public static final /* synthetic */ lla[] c;

    static {
        lla llaVar = new lla("ICON", 0);
        a = llaVar;
        lla llaVar2 = new lla("TEXT", 1);
        b = llaVar2;
        c = new lla[]{llaVar, llaVar2};
    }

    public static lla valueOf(String str) {
        return (lla) Enum.valueOf(lla.class, str);
    }

    public static lla[] values() {
        return (lla[]) c.clone();
    }
}
