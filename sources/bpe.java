// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class bpe {
    public static io a(xu7 xu7Var) {
        int m = xu7Var.m();
        if (xu7Var.m() != 1684108385) {
            lad.f("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m2 = xu7Var.m();
        byte[] bArr = ry0.a;
        int i = m2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            b00.o(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        xu7Var.O(4);
        int i2 = m - 16;
        byte[] bArr2 = new byte[i2];
        xu7Var.k(0, i2, bArr2);
        return new io(3, str, null, bArr2);
    }

    public static nhb b(int i, xu7 xu7Var, String str) {
        int m = xu7Var.m();
        if (xu7Var.m() == 1684108385 && m >= 22) {
            xu7Var.O(10);
            int H = xu7Var.H();
            if (H > 0) {
                String valueOf = String.valueOf(H);
                int H2 = xu7Var.H();
                if (H2 > 0) {
                    valueOf = valueOf + "/" + H2;
                }
                return new nhb(str, null, mm5.u(valueOf));
            }
        }
        lad.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(fs5.e(i)));
        return null;
    }

    public static int c(xu7 xu7Var) {
        int m = xu7Var.m();
        if (xu7Var.m() == 1684108385) {
            xu7Var.O(8);
            int i = m - 16;
            if (i == 1) {
                return xu7Var.A();
            }
            if (i == 2) {
                return xu7Var.H();
            }
            if (i == 3) {
                return xu7Var.D();
            }
            if (i == 4 && (xu7Var.j() & 128) == 0) {
                return xu7Var.E();
            }
        }
        lad.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static uj5 d(int i, String str, xu7 xu7Var, boolean z, boolean z2) {
        int c = c(xu7Var);
        if (z2) {
            c = Math.min(1, c);
        }
        if (c >= 0) {
            return z ? new nhb(str, null, mm5.u(Integer.toString(c))) : new km2("und", str, Integer.toString(c));
        }
        lad.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(fs5.e(i)));
        return null;
    }

    public static nhb e(int i, xu7 xu7Var, String str) {
        int m = xu7Var.m();
        if (xu7Var.m() == 1684108385) {
            xu7Var.O(8);
            return new nhb(str, null, mm5.u(xu7Var.w(m - 16)));
        }
        lad.f("MetadataUtil", "Failed to parse text attribute: ".concat(fs5.e(i)));
        return null;
    }

    public static void f(int i, ld7 ld7Var, em4 em4Var, ld7 ld7Var2, ld7... ld7VarArr) {
        if (ld7Var2 == null) {
            ld7Var2 = new ld7(new jd7[0]);
        }
        if (ld7Var != null) {
            jm5 p = mm5.p();
            for (jd7 jd7Var : ld7Var.a) {
                if (sj6.class.isAssignableFrom(jd7Var.getClass())) {
                    p.c((jd7) sj6.class.cast(jd7Var));
                }
            }
            km5 listIterator = p.f().listIterator(0);
            while (listIterator.hasNext()) {
                sj6 sj6Var = (sj6) listIterator.next();
                if (!sj6Var.a.equals("com.android.capture.fps") || i == 2) {
                    ld7Var2 = ld7Var2.a(sj6Var);
                }
            }
        }
        for (ld7 ld7Var3 : ld7VarArr) {
            ld7Var2 = ld7Var2.b(ld7Var3);
        }
        if (ld7Var2.a.length > 0) {
            em4Var.l = ld7Var2;
        }
    }
}
