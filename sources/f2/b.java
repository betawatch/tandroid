package f2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements l0 {
    public final l0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // f2.l0
    public final void C(int i10, int i11) {
        a();
        this.a.C(i10, i11);
    }

    @Override // f2.l0
    public final void L0(int i10, int i11) {
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

    public final void a() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        l0 l0Var = this.a;
        if (i10 == 1) {
            l0Var.j0(this.c, this.d);
        } else if (i10 == 2) {
            l0Var.L0(this.c, this.d);
        } else if (i10 == 3) {
            l0Var.i1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // f2.l0
    public final void i1(int i10, int i11) {
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

    @Override // f2.l0
    public final void j0(int i10, int i11) {
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
}
