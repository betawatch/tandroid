// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h54 implements at9 {
    public final ko4 a;
    public long[] c;
    public boolean d;
    public i54 e;
    public boolean f;
    public int h;
    public final qx6 b = new qx6((byte) 25);
    public long n = -9223372036854775807L;

    public h54(i54 i54Var, ko4 ko4Var, boolean z) {
        this.a = ko4Var;
        this.e = i54Var;
        this.c = i54Var.b;
        b(i54Var, z);
    }

    @Override // at9
    public final int a() {
        return 0;
    }

    public final void b(i54 i54Var, boolean z) {
        int i = this.h;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = i54Var;
        long[] jArr = i54Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.h = gcc.b(jArr, j2, false);
            }
        } else {
            int b = gcc.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j = j3;
            }
            this.n = j;
        }
    }

    @Override // at9
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        int i2 = this.h;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            s93Var.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            ym4Var.c = this.a;
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
            byte[] t = this.b.t(this.e.a[i2]);
            s93Var.c(t.length);
            s93Var.c.put(t);
        }
        s93Var.e = this.c[i2];
        s93Var.setFlags(1);
        return -4;
    }

    @Override // at9
    public final boolean k() {
        return true;
    }

    @Override // at9
    public final int o(long j) {
        int max = Math.max(this.h, gcc.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // at9
    public final void g() {
    }
}
