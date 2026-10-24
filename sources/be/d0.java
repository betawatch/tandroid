package be;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 a;
    public static final /* synthetic */ d0[] b;

    static {
        d0 d0Var = new d0("DEFAULT", 0);
        a = d0Var;
        d0[] d0VarArr = {d0Var, new d0("LAZY", 1), new d0("ATOMIC", 2), new d0("UNDISPATCHED", 3)};
        b = d0VarArr;
        w7.c0.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) b.clone();
    }
}
