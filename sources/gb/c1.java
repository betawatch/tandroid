package gb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c1 {
    public static final c1 a;
    public static final c1 b;
    public static final /* synthetic */ c1[] c;

    static {
        c1 c1Var = new c1("GENERAL", 0);
        a = c1Var;
        c1 c1Var2 = new c1("FALLBACK", 1);
        b = c1Var2;
        c1[] c1VarArr = {c1Var, c1Var2};
        c = c1VarArr;
        c8.j1.a(c1VarArr);
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) c.clone();
    }
}
