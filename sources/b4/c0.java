package b4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c0 implements i0 {
    public final b0 a;
    public final h5.w b = new h5.w(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public c0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // b4.i0
    public final void a(int i10, h5.w wVar) {
        boolean z4 = (i10 & 1) != 0;
        int u10 = z4 ? wVar.b + wVar.u() : -1;
        if (this.f) {
            if (!z4) {
                return;
            }
            this.f = false;
            wVar.F(u10);
            this.d = 0;
        }
        while (wVar.a() > 0) {
            int i11 = this.d;
            h5.w wVar2 = this.b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int u11 = wVar.u();
                    wVar.F(wVar.b - 1);
                    if (u11 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(wVar.a(), 3 - this.d);
                wVar.e(this.d, min, wVar2.a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    wVar2.F(0);
                    wVar2.E(3);
                    wVar2.G(1);
                    int u12 = wVar2.u();
                    int u13 = wVar2.u();
                    this.e = (u12 & 128) != 0;
                    int i13 = (((u12 & 15) << 8) | u13) + 3;
                    this.c = i13;
                    byte[] bArr = wVar2.a;
                    if (bArr.length < i13) {
                        wVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(wVar.a(), this.c - this.d);
                wVar.e(this.d, min2, wVar2.a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.e) {
                        wVar2.E(i15);
                    } else {
                        if (h5.d0.k(0, i15, -1, wVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        wVar2.E(this.c - 4);
                    }
                    wVar2.F(0);
                    this.a.a(wVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // b4.i0
    public final void b() {
        this.f = true;
    }

    @Override // b4.i0
    public final void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
        this.a.c(c0Var, mVar, h0Var);
        this.f = true;
    }
}
