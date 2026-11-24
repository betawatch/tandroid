// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fl8 {
    public static final fl8 a;
    public static final fl8 b;
    public static final fl8 c;
    public static final /* synthetic */ fl8[] d;

    static {
        fl8 fl8Var = new fl8("DEFAULT", 0);
        a = fl8Var;
        fl8 fl8Var2 = new fl8("VERY_LOW", 1);
        b = fl8Var2;
        fl8 fl8Var3 = new fl8("HIGHEST", 2);
        c = fl8Var3;
        d = new fl8[]{fl8Var, fl8Var2, fl8Var3};
    }

    public static fl8 valueOf(String str) {
        return (fl8) Enum.valueOf(fl8.class, str);
    }

    public static fl8[] values() {
        return (fl8[]) d.clone();
    }
}
