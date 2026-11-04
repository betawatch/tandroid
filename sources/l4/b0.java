package l4;

import g2.l0;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 implements g0 {
    public final a0 a;
    public final g2.y b = new g2.y(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public b0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // l4.g0
    public final void a() {
        this.f = true;
    }

    @Override // l4.g0
    public final void b(l0 l0Var, e3.q qVar, f0 f0Var) {
        this.a.b(l0Var, qVar, f0Var);
        this.f = true;
    }

    @Override // l4.g0
    public final void c(int i3, g2.y yVar) {
        boolean z10 = (i3 & 1) != 0;
        int A = z10 ? yVar.b + yVar.A() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            yVar.N(A);
            this.d = 0;
        }
        while (yVar.a() > 0) {
            int i10 = this.d;
            g2.y yVar2 = this.b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int A2 = yVar.A();
                    yVar.N(yVar.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.d);
                yVar.k(this.d, min, yVar2.a);
                int i11 = this.d + min;
                this.d = i11;
                if (i11 == 3) {
                    yVar2.N(0);
                    yVar2.M(3);
                    yVar2.O(1);
                    int A3 = yVar2.A();
                    int A4 = yVar2.A();
                    this.e = (A3 & 128) != 0;
                    int i12 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i12;
                    byte[] bArr = yVar2.a;
                    if (bArr.length < i12) {
                        yVar2.c(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.c - this.d);
                yVar.k(this.d, min2, yVar2.a);
                int i13 = this.d + min2;
                this.d = i13;
                int i14 = this.c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.e) {
                        yVar2.M(i14);
                    } else {
                        if (n0.p(0, i14, -1, yVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        yVar2.M(this.c - 4);
                    }
                    yVar2.N(0);
                    this.a.c(yVar2);
                    this.d = 0;
                }
            }
        }
    }
}
