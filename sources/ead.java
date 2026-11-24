// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ead {
    public static final ead a;
    public static final /* synthetic */ ead[] b;

    static {
        ead eadVar = new ead("DEFAULT", 0);
        a = eadVar;
        b = new ead[]{eadVar, new ead("SIGNED", 1), new ead("FIXED", 2)};
    }

    public static ead[] values() {
        return (ead[]) b.clone();
    }
}
