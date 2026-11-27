// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
