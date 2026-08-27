package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
