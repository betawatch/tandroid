package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
