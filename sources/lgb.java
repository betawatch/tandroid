// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lgb {
    public static final lgb a;
    public static final lgb b;
    public static final lgb c;
    public static final /* synthetic */ lgb[] d;

    static {
        lgb lgbVar = new lgb("LEFT", 0);
        a = lgbVar;
        lgb lgbVar2 = new lgb("CENTER", 1);
        b = lgbVar2;
        lgb lgbVar3 = new lgb("RIGHT", 2);
        c = lgbVar3;
        d = new lgb[]{lgbVar, lgbVar2, lgbVar3};
    }

    public static lgb valueOf(String str) {
        return (lgb) Enum.valueOf(lgb.class, str);
    }

    public static lgb[] values() {
        return (lgb[]) d.clone();
    }
}
