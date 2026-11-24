// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class izb {
    public static final izb a;
    public static final izb b;
    public static final izb c;
    public static final /* synthetic */ izb[] d;

    static {
        izb izbVar = new izb("TOP", 0);
        a = izbVar;
        izb izbVar2 = new izb("LEFT", 1);
        b = izbVar2;
        izb izbVar3 = new izb("BOTTOM", 2);
        c = izbVar3;
        d = new izb[]{izbVar, izbVar2, izbVar3};
    }

    public static izb valueOf(String str) {
        return (izb) Enum.valueOf(izb.class, str);
    }

    public static izb[] values() {
        return (izb[]) d.clone();
    }
}
