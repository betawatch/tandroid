package j4;

import e2.k0;
import e2.m0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b0 implements g0 {
    public final a0 a;
    public final e2.x b = new e2.x(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public b0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // j4.g0
    public final void a(int i10, e2.x xVar) {
        boolean z10 = (i10 & 1) != 0;
        int A = z10 ? xVar.b + xVar.A() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            xVar.N(A);
            this.d = 0;
        }
        while (xVar.a() > 0) {
            int i11 = this.d;
            e2.x xVar2 = this.b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int A2 = xVar.A();
                    xVar.N(xVar.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    xVar2.N(0);
                    xVar2.M(3);
                    xVar2.O(1);
                    int A3 = xVar2.A();
                    int A4 = xVar2.A();
                    this.e = (A3 & 128) != 0;
                    int i13 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i13;
                    byte[] bArr = xVar2.a;
                    if (bArr.length < i13) {
                        xVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.c - this.d);
                xVar.k(this.d, min2, xVar2.a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.e) {
                        xVar2.M(i15);
                    } else {
                        if (m0.p(0, i15, -1, xVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        xVar2.M(this.c - 4);
                    }
                    xVar2.N(0);
                    this.a.a(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // j4.g0
    public final void b(k0 k0Var, c3.s sVar, f0 f0Var) {
        this.a.b(k0Var, sVar, f0Var);
        this.f = true;
    }

    @Override // j4.g0
    public final void c() {
        this.f = true;
    }
}
