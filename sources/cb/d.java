package cb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d {
    public static final d a;
    public static final d b;
    public static final /* synthetic */ d[] c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        b = dVar2;
        c = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) c.clone();
    }
}
