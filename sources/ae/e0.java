package ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e0 {
    public static final e0 a;
    public static final /* synthetic */ e0[] b;

    static {
        e0 e0Var = new e0("DEFAULT", 0);
        a = e0Var;
        e0[] e0VarArr = {e0Var, new e0("LAZY", 1), new e0("ATOMIC", 2), new e0("UNDISPATCHED", 3)};
        b = e0VarArr;
        w7.v.a(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) b.clone();
    }
}
