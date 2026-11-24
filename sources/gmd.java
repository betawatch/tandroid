// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gmd {
    public static final gmd a;
    public static final /* synthetic */ gmd[] b;

    static {
        gmd gmdVar = new gmd("DEFAULT", 0);
        a = gmdVar;
        b = new gmd[]{gmdVar, new gmd("SIGNED", 1), new gmd("FIXED", 2)};
    }

    public static gmd[] values() {
        return (gmd[]) b.clone();
    }
}
