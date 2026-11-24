// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l44 implements ip9 {
    public final fm4 a;
    public long[] c;
    public boolean d;
    public m44 e;
    public boolean f;
    public int h;
    public final lv6 b = new lv6((byte) 25);
    public long n = -9223372036854775807L;

    public l44(m44 m44Var, fm4 fm4Var, boolean z) {
        this.a = fm4Var;
        this.e = m44Var;
        this.c = m44Var.b;
        c(m44Var, z);
    }

    @Override // ip9
    public final int a() {
        return 0;
    }

    public final void c(m44 m44Var, boolean z) {
        int i = this.h;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = m44Var;
        long[] jArr = m44Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.h = g8c.b(jArr, j2, false);
            }
        } else {
            int b = g8c.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j = j3;
            }
            this.n = j;
        }
    }

    @Override // ip9
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        int i2 = this.h;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            z83Var.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            sk4Var.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.h = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] r = this.b.r(this.e.a[i2]);
            z83Var.c(r.length);
            z83Var.c.put(r);
        }
        z83Var.e = this.c[i2];
        z83Var.setFlags(1);
        return -4;
    }

    @Override // ip9
    public final boolean j() {
        return true;
    }

    @Override // ip9
    public final int n(long j) {
        int max = Math.max(this.h, g8c.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // ip9
    public final void b() {
    }
}
