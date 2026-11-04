package b8;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class r0 {
    public static boolean a(e0.k0 k0Var, e0.k0 k0Var2) {
        if (k0Var == null && k0Var2 == null) {
            return true;
        }
        if (k0Var == null || k0Var2 == null) {
            return false;
        }
        String str = k0Var.d;
        String str2 = k0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(k0Var.a), Objects.toString(k0Var2.a)) && Objects.equals(k0Var.c, k0Var2.c) && Boolean.valueOf(k0Var.e).equals(Boolean.valueOf(k0Var2.e)) && Boolean.valueOf(k0Var.f).equals(Boolean.valueOf(k0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.k0 k0Var) {
        if (k0Var == null) {
            return 0;
        }
        String str = k0Var.d;
        return str != null ? str.hashCode() : Objects.hash(k0Var.a, k0Var.c, Boolean.valueOf(k0Var.e), Boolean.valueOf(k0Var.f));
    }
}
