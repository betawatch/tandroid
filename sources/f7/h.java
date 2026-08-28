package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public static final h a;
    public static final /* synthetic */ h[] b;

    static {
        h hVar = new h("DEFAULT", 0);
        a = hVar;
        b = new h[]{hVar, new h("SIGNED", 1), new h("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) b.clone();
    }
}
