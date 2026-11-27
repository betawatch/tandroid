// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kj2 implements at9 {
    public final at9 a;
    public final boolean b;
    public boolean c;
    public final /* synthetic */ lj2 d;

    public kj2(lj2 lj2Var, at9 at9Var, boolean z) {
        this.d = lj2Var;
        this.a = at9Var;
        this.b = z;
    }

    @Override // at9
    public final int a() {
        int a = this.a.a();
        if (this.d.r != Long.MIN_VALUE) {
            a |= 1;
        }
        return this.b ? (a & (-3)) | 4 : a;
    }

    @Override // at9
    public final void g() {
        this.a.g();
    }

    @Override // at9
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        lj2 lj2Var = this.d;
        if (lj2Var.b()) {
            return -3;
        }
        if (this.c) {
            s93Var.setFlags(4);
            return -4;
        }
        long t = lj2Var.t();
        int i2 = this.a.i(ym4Var, s93Var, i);
        if (lj2Var.h != -9223372036854775807L && i2 != -3) {
            lj2Var.h = -9223372036854775807L;
        }
        if (i2 != -5) {
            long j = lj2Var.r;
            if (j == Long.MIN_VALUE || ((i2 != -4 || s93Var.e < j) && !(i2 == -3 && t == Long.MIN_VALUE && !s93Var.d))) {
                return i2;
            }
            s93Var.clear();
            s93Var.setFlags(4);
            this.c = true;
            return -4;
        }
        long j2 = lj2Var.n;
        long j3 = lj2Var.r;
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        int i3 = ko4Var.S;
        int i4 = ko4Var.R;
        if (i4 != 0 || i3 != 0) {
            if (j2 != 0) {
                i4 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i3 = 0;
            }
            jo4 a = ko4Var.a();
            a.Q = i4;
            a.R = i3;
            ym4Var.c = new ko4(a);
        }
        return -5;
    }

    @Override // at9
    public final boolean k() {
        return !this.d.b() && this.a.k();
    }

    @Override // at9
    public final int o(long j) {
        if (this.d.b()) {
            return -3;
        }
        return this.a.o(j);
    }
}
