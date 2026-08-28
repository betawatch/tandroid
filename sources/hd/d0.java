package hd;

import g7.n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 a;
    public static final /* synthetic */ d0[] b;

    static {
        d0 d0Var = new d0("DEFAULT", 0);
        a = d0Var;
        d0[] d0VarArr = {d0Var, new d0("LAZY", 1), new d0("ATOMIC", 2), new d0("UNDISPATCHED", 3)};
        b = d0VarArr;
        n7.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) b.clone();
    }
}
