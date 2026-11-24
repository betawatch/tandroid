// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g99 {
    public final uh0 a;
    public final int b;
    public final uh0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public g99(uh0 uh0Var, uh0 uh0Var2, int i) {
        this.a = uh0Var;
        this.b = i;
        this.c = uh0Var2;
    }

    public static void b(uh0 uh0Var) {
        byte b = uh0Var.n;
        if (b == 2) {
            jte.p(b == 2);
            uh0Var.n = (byte) 1;
            uh0Var.x();
        }
    }

    public static boolean k(uh0 uh0Var) {
        return uh0Var.n != 0;
    }

    public static void o(uh0 uh0Var, long j) {
        uh0Var.E = true;
        if (uh0Var instanceof bkb) {
            bkb bkbVar = (bkb) uh0Var;
            jte.p(bkbVar.E);
            bkbVar.c0 = j;
        }
    }

    public final void a(uh0 uh0Var, yc3 yc3Var) {
        jte.p(this.a == uh0Var || this.c == uh0Var);
        if (k(uh0Var)) {
            if (uh0Var == ((uh0) yc3Var.e)) {
                yc3Var.f = null;
                yc3Var.e = null;
                yc3Var.a = true;
            }
            b(uh0Var);
            jte.p(uh0Var.n == 1);
            uh0Var.c.i();
            uh0Var.n = (byte) 0;
            uh0Var.r = null;
            uh0Var.s = null;
            uh0Var.E = false;
            uh0Var.q();
            uh0Var.H = null;
            uh0Var.I = -9223372036854775807L;
        }
    }

    public final int c() {
        boolean k = k(this.a);
        uh0 uh0Var = this.c;
        return (k ? 1 : 0) + ((uh0Var == null || !k(uh0Var)) ? 0 : 1);
    }

    public final uh0 d(ut6 ut6Var) {
        jr9 jr9Var;
        if (ut6Var == null || (jr9Var = ut6Var.c[this.b]) == null) {
            return null;
        }
        uh0 uh0Var = this.a;
        if (uh0Var.r == jr9Var) {
            return uh0Var;
        }
        uh0 uh0Var2 = this.c;
        if (uh0Var2 == null || uh0Var2.r != jr9Var) {
            return null;
        }
        return uh0Var2;
    }

    public final boolean e(ut6 ut6Var, uh0 uh0Var) {
        if (uh0Var == null) {
            return true;
        }
        jr9[] jr9VarArr = ut6Var.c;
        int i = this.b;
        jr9 jr9Var = jr9VarArr[i];
        jr9 jr9Var2 = uh0Var.r;
        if (jr9Var2 == null) {
            return true;
        }
        if (jr9Var2 == jr9Var) {
            if (jr9Var == null || uh0Var.m()) {
                return true;
            }
            ut6 ut6Var2 = ut6Var.m;
            if (ut6Var.g.f && ut6Var2 != null && ut6Var2.e && ((uh0Var instanceof bkb) || (uh0Var instanceof sf7) || uh0Var.y >= ut6Var2.e())) {
                return true;
            }
        }
        do {
            ut6Var = ut6Var.m;
            if (ut6Var == null) {
                return false;
            }
        } while (!Objects.equals(ut6Var.c[i], uh0Var.r));
        return true;
    }

    public final boolean f() {
        uh0 uh0Var = this.a;
        boolean n = k(uh0Var) ? uh0Var.n() : true;
        uh0 uh0Var2 = this.c;
        return (uh0Var2 == null || uh0Var2.n == 0) ? n : n & uh0Var2.n();
    }

    public final boolean g() {
        byte b = this.d;
        return b == 2 || b == 5 || b == 3 || b == 4;
    }

    public final boolean h(ut6 ut6Var) {
        byte b = this.d;
        boolean z = (b == 2 || b == 5) && d(ut6Var) == this.a;
        byte b2 = this.d;
        return z || ((b2 == 3 || b2 == 4) && d(ut6Var) == this.c);
    }

    public final boolean i(ut6 ut6Var) {
        return d(ut6Var) != null;
    }

    public final boolean j() {
        byte b = this.d;
        if (b == 0 || b == 2 || b == 5) {
            return k(this.a);
        }
        uh0 uh0Var = this.c;
        uh0Var.getClass();
        return uh0Var.n != 0;
    }

    public final void l(boolean z) {
        if (z) {
            if (this.e) {
                uh0 uh0Var = this.a;
                jte.p(uh0Var.n == 0);
                uh0Var.c.i();
                uh0Var.v();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            uh0 uh0Var2 = this.c;
            uh0Var2.getClass();
            jte.p(uh0Var2.n == 0);
            uh0Var2.c.i();
            uh0Var2.v();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(uh0 uh0Var, ut6 ut6Var, e0c e0cVar, yc3 yc3Var) {
        uh0 uh0Var2;
        byte b;
        byte b2;
        jr9[] jr9VarArr = ut6Var.c;
        if (uh0Var == null || uh0Var.n == 0 || (uh0Var == (uh0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (uh0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        jr9 jr9Var = uh0Var.r;
        int i = this.b;
        Object[] objArr = jr9Var != jr9VarArr[i];
        boolean q = e0cVar.q(i);
        if (!q || objArr != false) {
            if (!uh0Var.E) {
                t74 t74Var = ((t74[]) e0cVar.d)[i];
                int length = t74Var != null ? t74Var.length() : 0;
                go4[] go4VarArr = new go4[length];
                for (int i2 = 0; i2 < length; i2++) {
                    t74Var.getClass();
                    go4VarArr[i2] = t74Var.i(i2);
                }
                jr9 jr9Var2 = jr9VarArr[i];
                jr9Var2.getClass();
                uh0Var.C(go4VarArr, jr9Var2, ut6Var.e(), ut6Var.p, ut6Var.g.a);
                return 3;
            }
            if (!uh0Var.n()) {
                return 0;
            }
            a(uh0Var, yc3Var);
            if (!q || g()) {
                l(uh0Var == uh0Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void n() {
        if (!k(this.a)) {
            l(true);
        }
        uh0 uh0Var = this.c;
        if (uh0Var == null || uh0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        uh0 uh0Var = this.a;
        byte b2 = uh0Var.n;
        if (b2 == 1 && this.d != 5) {
            jte.p(b2 == 1);
            uh0Var.n = (byte) 2;
            uh0Var.w();
            return;
        }
        uh0 uh0Var2 = this.c;
        if (uh0Var2 == null || (b = uh0Var2.n) != 1 || this.d == 4) {
            return;
        }
        jte.p(b == 1);
        uh0Var2.n = (byte) 2;
        uh0Var2.w();
    }
}
