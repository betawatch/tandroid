package f7;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(e0.p0 p0Var, e0.p0 p0Var2) {
        if (p0Var == null && p0Var2 == null) {
            return true;
        }
        if (p0Var == null || p0Var2 == null) {
            return false;
        }
        String str = p0Var.d;
        String str2 = p0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(p0Var.a), Objects.toString(p0Var2.a)) && Objects.equals(p0Var.c, p0Var2.c) && Boolean.valueOf(p0Var.e).equals(Boolean.valueOf(p0Var2.e)) && Boolean.valueOf(p0Var.f).equals(Boolean.valueOf(p0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.p0 p0Var) {
        if (p0Var == null) {
            return 0;
        }
        String str = p0Var.d;
        return str != null ? str.hashCode() : Objects.hash(p0Var.a, p0Var.c, Boolean.valueOf(p0Var.e), Boolean.valueOf(p0Var.f));
    }
}
