package f2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements m0 {
    public final m0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // f2.m0
    public final void A(int i10, int i11) {
        a();
        this.a.A(i10, i11);
    }

    @Override // f2.m0
    public final void K0(int i10, int i11) {
        int i12;
        if (this.b == 2 && (i12 = this.c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.c = i10;
        } else {
            a();
            this.c = i10;
            this.d = i11;
            this.b = 2;
        }
    }

    @Override // f2.m0
    public final void S(int i10, int i11) {
        int i12;
        if (this.b == 1 && i10 >= (i12 = this.c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.c = i10;
        this.d = i11;
        this.b = 1;
    }

    public final void a() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        m0 m0Var = this.a;
        if (i10 == 1) {
            m0Var.S(this.c, this.d);
        } else if (i10 == 2) {
            m0Var.K0(this.c, this.d);
        } else if (i10 == 3) {
            m0Var.k1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // f2.m0
    public final void k1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.b == 3 && i10 <= (i13 = this.d + (i12 = this.c)) && (i14 = i10 + i11) >= i12) {
            this.c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.c;
        } else {
            a();
            this.c = i10;
            this.d = i11;
            this.b = 3;
        }
    }
}
