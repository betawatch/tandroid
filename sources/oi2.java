// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oi2 implements ip9 {
    public final ip9 a;
    public final boolean b;
    public boolean c;
    public final /* synthetic */ pi2 d;

    public oi2(pi2 pi2Var, ip9 ip9Var, boolean z) {
        this.d = pi2Var;
        this.a = ip9Var;
        this.b = z;
    }

    @Override // ip9
    public final int a() {
        int a = this.a.a();
        if (this.d.r != Long.MIN_VALUE) {
            a |= 1;
        }
        return this.b ? (a & (-3)) | 4 : a;
    }

    @Override // ip9
    public final void b() {
        this.a.b();
    }

    @Override // ip9
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        pi2 pi2Var = this.d;
        if (pi2Var.c()) {
            return -3;
        }
        if (this.c) {
            z83Var.setFlags(4);
            return -4;
        }
        long s = pi2Var.s();
        int h = this.a.h(sk4Var, z83Var, i);
        if (pi2Var.h != -9223372036854775807L && h != -3) {
            pi2Var.h = -9223372036854775807L;
        }
        if (h != -5) {
            long j = pi2Var.r;
            if (j == Long.MIN_VALUE || ((h != -4 || z83Var.e < j) && !(h == -3 && s == Long.MIN_VALUE && !z83Var.d))) {
                return h;
            }
            z83Var.clear();
            z83Var.setFlags(4);
            this.c = true;
            return -4;
        }
        long j2 = pi2Var.n;
        long j3 = pi2Var.r;
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        int i2 = fm4Var.S;
        int i3 = fm4Var.R;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            em4 a = fm4Var.a();
            a.Q = i3;
            a.R = i2;
            sk4Var.c = new fm4(a);
        }
        return -5;
    }

    @Override // ip9
    public final boolean j() {
        return !this.d.c() && this.a.j();
    }

    @Override // ip9
    public final int n(long j) {
        if (this.d.c()) {
            return -3;
        }
        return this.a.n(j);
    }
}
