package a8;

import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class r1 {
    public static boolean a(e0.j0 j0Var, e0.j0 j0Var2) {
        if (j0Var == null && j0Var2 == null) {
            return true;
        }
        if (j0Var == null || j0Var2 == null) {
            return false;
        }
        String str = j0Var.d;
        String str2 = j0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(j0Var.a), Objects.toString(j0Var2.a)) && Objects.equals(j0Var.c, j0Var2.c) && Boolean.valueOf(j0Var.e).equals(Boolean.valueOf(j0Var2.e)) && Boolean.valueOf(j0Var.f).equals(Boolean.valueOf(j0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.j0 j0Var) {
        if (j0Var == null) {
            return 0;
        }
        String str = j0Var.d;
        return str != null ? str.hashCode() : Objects.hash(j0Var.a, j0Var.c, Boolean.valueOf(j0Var.e), Boolean.valueOf(j0Var.f));
    }
}
