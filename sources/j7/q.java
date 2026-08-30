package j7;

import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(e0.o0 o0Var, e0.o0 o0Var2) {
        if (o0Var == null && o0Var2 == null) {
            return true;
        }
        if (o0Var == null || o0Var2 == null) {
            return false;
        }
        String str = o0Var.d;
        String str2 = o0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(o0Var.a), Objects.toString(o0Var2.a)) && Objects.equals(o0Var.c, o0Var2.c) && Boolean.valueOf(o0Var.e).equals(Boolean.valueOf(o0Var2.e)) && Boolean.valueOf(o0Var.f).equals(Boolean.valueOf(o0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.o0 o0Var) {
        if (o0Var == null) {
            return 0;
        }
        String str = o0Var.d;
        return str != null ? str.hashCode() : Objects.hash(o0Var.a, o0Var.c, Boolean.valueOf(o0Var.e), Boolean.valueOf(o0Var.f));
    }
}
