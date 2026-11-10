package m4;

import h2.k0;
import h2.m0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b0 implements h0 {
    public final a0 a;
    public final h2.x b = new h2.x(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public b0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // m4.h0
    public final void a(int i7, h2.x xVar) {
        boolean z9 = (i7 & 1) != 0;
        int A = z9 ? xVar.b + xVar.A() : -1;
        if (this.f) {
            if (!z9) {
                return;
            }
            this.f = false;
            xVar.N(A);
            this.d = 0;
        }
        while (xVar.a() > 0) {
            int i10 = this.d;
            h2.x xVar2 = this.b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int A2 = xVar.A();
                    xVar.N(xVar.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.a);
                int i11 = this.d + min;
                this.d = i11;
                if (i11 == 3) {
                    xVar2.N(0);
                    xVar2.M(3);
                    xVar2.O(1);
                    int A3 = xVar2.A();
                    int A4 = xVar2.A();
                    this.e = (A3 & 128) != 0;
                    int i12 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i12;
                    byte[] bArr = xVar2.a;
                    if (bArr.length < i12) {
                        xVar2.c(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.c - this.d);
                xVar.k(this.d, min2, xVar2.a);
                int i13 = this.d + min2;
                this.d = i13;
                int i14 = this.c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.e) {
                        xVar2.M(i14);
                    } else {
                        if (m0.p(0, i14, -1, xVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        xVar2.M(this.c - 4);
                    }
                    xVar2.N(0);
                    this.a.c(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // m4.h0
    public final void b(k0 k0Var, f3.q qVar, g0 g0Var) {
        this.a.b(k0Var, qVar, g0Var);
        this.f = true;
    }

    @Override // m4.h0
    public final void d() {
        this.f = true;
    }
}
