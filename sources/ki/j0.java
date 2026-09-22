package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class j0 {
    public static final j0 a;
    public static final j0 b;
    public static final j0 c;
    public static final /* synthetic */ j0[] d;

    static {
        j0 j0Var = new j0("HIGH", 0);
        a = j0Var;
        j0 j0Var2 = new j0("MEDIUM", 1);
        b = j0Var2;
        j0 j0Var3 = new j0("LOW", 2);
        c = j0Var3;
        d = new j0[]{j0Var, j0Var2, j0Var3};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) d.clone();
    }
}
