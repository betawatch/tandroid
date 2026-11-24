// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a9d {
    public static final a9d a;
    public static final /* synthetic */ a9d[] b;

    static {
        a9d a9dVar = new a9d("DEFAULT", 0);
        a = a9dVar;
        b = new a9d[]{a9dVar, new a9d("SIGNED", 1), new a9d("FIXED", 2)};
    }

    public static a9d[] values() {
        return (a9d[]) b.clone();
    }
}
