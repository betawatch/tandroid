package a8;

import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g1 {
    public static boolean a(e0.l0 l0Var, e0.l0 l0Var2) {
        if (l0Var == null && l0Var2 == null) {
            return true;
        }
        if (l0Var == null || l0Var2 == null) {
            return false;
        }
        String str = l0Var.d;
        String str2 = l0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(l0Var.a), Objects.toString(l0Var2.a)) && Objects.equals(l0Var.c, l0Var2.c) && Boolean.valueOf(l0Var.e).equals(Boolean.valueOf(l0Var2.e)) && Boolean.valueOf(l0Var.f).equals(Boolean.valueOf(l0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.l0 l0Var) {
        if (l0Var == null) {
            return 0;
        }
        String str = l0Var.d;
        return str != null ? str.hashCode() : Objects.hash(l0Var.a, l0Var.c, Boolean.valueOf(l0Var.e), Boolean.valueOf(l0Var.f));
    }
}
