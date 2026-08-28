package f2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements o0 {
    public final o0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public c(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // f2.o0
    public final void I(int i9, int i10) {
        int i11;
        if (this.b == 1 && i9 >= (i11 = this.c)) {
            int i12 = this.d;
            if (i9 <= i11 + i12) {
                this.d = i12 + i10;
                this.c = Math.min(i9, i11);
                return;
            }
        }
        a();
        this.c = i9;
        this.d = i10;
        this.b = 1;
    }

    @Override // f2.o0
    public final void J0(int i9, int i10) {
        int i11;
        if (this.b == 2 && (i11 = this.c) >= i9 && i11 <= i9 + i10) {
            this.d += i10;
            this.c = i9;
        } else {
            a();
            this.c = i9;
            this.d = i10;
            this.b = 2;
        }
    }

    public final void a() {
        int i9 = this.b;
        if (i9 == 0) {
            return;
        }
        o0 o0Var = this.a;
        if (i9 == 1) {
            o0Var.I(this.c, this.d);
        } else if (i9 == 2) {
            o0Var.J0(this.c, this.d);
        } else if (i9 == 3) {
            o0Var.j1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // f2.o0
    public final void j1(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.b == 3 && i9 <= (i12 = this.d + (i11 = this.c)) && (i13 = i9 + i10) >= i11) {
            this.c = Math.min(i9, i11);
            this.d = Math.max(i12, i13) - this.c;
        } else {
            a();
            this.c = i9;
            this.d = i10;
            this.b = 3;
        }
    }

    @Override // f2.o0
    public final void t(int i9, int i10) {
        a();
        this.a.t(i9, i10);
    }
}
