package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class g {
    public static final g CONCURRENT;
    public static final g IDENTITY_FINISH;
    public static final g UNORDERED;
    public static final /* synthetic */ g[] a;

    static {
        g gVar = new g("CONCURRENT", 0);
        CONCURRENT = gVar;
        g gVar2 = new g("UNORDERED", 1);
        UNORDERED = gVar2;
        g gVar3 = new g("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = gVar3;
        a = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) a.clone();
    }
}
