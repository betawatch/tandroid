// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nve {
    public static boolean a(b78 b78Var, b78 b78Var2) {
        if (b78Var == null) {
            if (b78Var2 == null) {
                return true;
            }
        } else if (b78Var2 != null) {
            String str = b78Var.d;
            String str2 = b78Var2.d;
            return (str == null && str2 == null) ? Objects.equals(Objects.toString(b78Var.a), Objects.toString(b78Var2.a)) && Objects.equals(b78Var.c, b78Var2.c) && Boolean.valueOf(b78Var.e).equals(Boolean.valueOf(b78Var2.e)) && Boolean.valueOf(b78Var.f).equals(Boolean.valueOf(b78Var2.f)) : Objects.equals(str, str2);
        }
        return false;
    }

    public static int b(b78 b78Var) {
        if (b78Var == null) {
            return 0;
        }
        String str = b78Var.d;
        return str != null ? str.hashCode() : Objects.hash(b78Var.a, b78Var.c, Boolean.valueOf(b78Var.e), Boolean.valueOf(b78Var.f));
    }
}
