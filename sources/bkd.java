// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bkd {
    public static final bkd a;
    public static final /* synthetic */ bkd[] b;

    static {
        bkd bkdVar = new bkd("DEFAULT", 0);
        a = bkdVar;
        b = new bkd[]{bkdVar, new bkd("SIGNED", 1), new bkd("FIXED", 2)};
    }

    public static bkd[] values() {
        return (bkd[]) b.clone();
    }
}
