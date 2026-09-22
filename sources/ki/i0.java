package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class i0 {
    public static final i0 a;
    public static final i0 b;
    public static final /* synthetic */ i0[] c;

    static {
        i0 i0Var = new i0("FRONT", 0);
        a = i0Var;
        i0 i0Var2 = new i0("BACK", 1);
        b = i0Var2;
        c = new i0[]{i0Var, i0Var2};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) c.clone();
    }
}
