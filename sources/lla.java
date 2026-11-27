// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
