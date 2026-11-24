// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e79 {
    public final ug0 a;
    public final int b;
    public final ug0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public e79(ug0 ug0Var, ug0 ug0Var2, int i) {
        this.a = ug0Var;
        this.b = i;
        this.c = ug0Var2;
    }

    public static void b(ug0 ug0Var) {
        byte b = ug0Var.n;
        if (b == 2) {
            gre.p(b == 2);
            ug0Var.n = (byte) 1;
            ug0Var.x();
        }
    }

    public static boolean k(ug0 ug0Var) {
        return ug0Var.n != 0;
    }

    public static void o(ug0 ug0Var, long j) {
        ug0Var.E = true;
        if (ug0Var instanceof zhb) {
            zhb zhbVar = (zhb) ug0Var;
            gre.p(zhbVar.E);
            zhbVar.c0 = j;
        }
    }

    public final void a(ug0 ug0Var, mb3 mb3Var) {
        gre.p(this.a == ug0Var || this.c == ug0Var);
        if (k(ug0Var)) {
            if (ug0Var == ((ug0) mb3Var.e)) {
                mb3Var.f = null;
                mb3Var.e = null;
                mb3Var.a = true;
            }
            b(ug0Var);
            gre.p(ug0Var.n == 1);
            ug0Var.c.m();
            ug0Var.n = (byte) 0;
            ug0Var.r = null;
            ug0Var.s = null;
            ug0Var.E = false;
            ug0Var.q();
            ug0Var.H = null;
            ug0Var.I = -9223372036854775807L;
        }
    }

    public final int c() {
        boolean k = k(this.a);
        ug0 ug0Var = this.c;
        return (k ? 1 : 0) + ((ug0Var == null || !k(ug0Var)) ? 0 : 1);
    }

    public final ug0 d(tr6 tr6Var) {
        ip9 ip9Var;
        if (tr6Var == null || (ip9Var = tr6Var.c[this.b]) == null) {
            return null;
        }
        ug0 ug0Var = this.a;
        if (ug0Var.r == ip9Var) {
            return ug0Var;
        }
        ug0 ug0Var2 = this.c;
        if (ug0Var2 == null || ug0Var2.r != ip9Var) {
            return null;
        }
        return ug0Var2;
    }

    public final boolean e(tr6 tr6Var, ug0 ug0Var) {
        if (ug0Var == null) {
            return true;
        }
        ip9[] ip9VarArr = tr6Var.c;
        int i = this.b;
        ip9 ip9Var = ip9VarArr[i];
        ip9 ip9Var2 = ug0Var.r;
        if (ip9Var2 == null) {
            return true;
        }
        if (ip9Var2 == ip9Var) {
            if (ip9Var == null || ug0Var.m()) {
                return true;
            }
            tr6 tr6Var2 = tr6Var.m;
            if (tr6Var.g.f && tr6Var2 != null && tr6Var2.e && ((ug0Var instanceof zhb) || (ug0Var instanceof qd7) || ug0Var.y >= tr6Var2.e())) {
                return true;
            }
        }
        do {
            tr6Var = tr6Var.m;
            if (tr6Var == null) {
                return false;
            }
        } while (!Objects.equals(tr6Var.c[i], ug0Var.r));
        return true;
    }

    public final boolean f() {
        ug0 ug0Var = this.a;
        boolean n = k(ug0Var) ? ug0Var.n() : true;
        ug0 ug0Var2 = this.c;
        return (ug0Var2 == null || ug0Var2.n == 0) ? n : n & ug0Var2.n();
    }

    public final boolean g() {
        byte b = this.d;
        return b == 2 || b == 5 || b == 3 || b == 4;
    }

    public final boolean h(tr6 tr6Var) {
        byte b = this.d;
        boolean z = (b == 2 || b == 5) && d(tr6Var) == this.a;
        byte b2 = this.d;
        return z || ((b2 == 3 || b2 == 4) && d(tr6Var) == this.c);
    }

    public final boolean i(tr6 tr6Var) {
        return d(tr6Var) != null;
    }

    public final boolean j() {
        byte b = this.d;
        if (b == 0 || b == 2 || b == 5) {
            return k(this.a);
        }
        ug0 ug0Var = this.c;
        ug0Var.getClass();
        return ug0Var.n != 0;
    }

    public final void l(boolean z) {
        if (z) {
            if (this.e) {
                ug0 ug0Var = this.a;
                gre.p(ug0Var.n == 0);
                ug0Var.c.m();
                ug0Var.v();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            ug0 ug0Var2 = this.c;
            ug0Var2.getClass();
            gre.p(ug0Var2.n == 0);
            ug0Var2.c.m();
            ug0Var2.v();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(ug0 ug0Var, tr6 tr6Var, cyb cybVar, mb3 mb3Var) {
        ug0 ug0Var2;
        byte b;
        byte b2;
        ip9[] ip9VarArr = tr6Var.c;
        if (ug0Var == null || ug0Var.n == 0 || (ug0Var == (ug0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (ug0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        ip9 ip9Var = ug0Var.r;
        int i = this.b;
        Object[] objArr = ip9Var != ip9VarArr[i];
        boolean q = cybVar.q(i);
        if (!q || objArr != false) {
            if (!ug0Var.E) {
                k64 k64Var = ((k64[]) cybVar.d)[i];
                int length = k64Var != null ? k64Var.length() : 0;
                fm4[] fm4VarArr = new fm4[length];
                for (int i2 = 0; i2 < length; i2++) {
                    k64Var.getClass();
                    fm4VarArr[i2] = k64Var.i(i2);
                }
                ip9 ip9Var2 = ip9VarArr[i];
                ip9Var2.getClass();
                ug0Var.C(fm4VarArr, ip9Var2, tr6Var.e(), tr6Var.p, tr6Var.g.a);
                return 3;
            }
            if (!ug0Var.n()) {
                return 0;
            }
            a(ug0Var, mb3Var);
            if (!q || g()) {
                l(ug0Var == ug0Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void n() {
        if (!k(this.a)) {
            l(true);
        }
        ug0 ug0Var = this.c;
        if (ug0Var == null || ug0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        ug0 ug0Var = this.a;
        byte b2 = ug0Var.n;
        if (b2 == 1 && this.d != 5) {
            gre.p(b2 == 1);
            ug0Var.n = (byte) 2;
            ug0Var.w();
            return;
        }
        ug0 ug0Var2 = this.c;
        if (ug0Var2 == null || (b = ug0Var2.n) != 1 || this.d == 4) {
            return;
        }
        gre.p(b == 1);
        ug0Var2.n = (byte) 2;
        ug0Var2.w();
    }
}
