package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements i {
    public final g2.y a;
    public final e3.z b;
    public final String c;
    public final int d;
    public final String e;
    public i0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public u(String str, int i3, String str2) {
        g2.y yVar = new g2.y(4);
        this.a = yVar;
        yVar.a[0] = -1;
        this.b = new e3.z();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i3;
        this.e = str2;
    }

    @Override // l4.i
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // l4.i
    public final void c(g2.y yVar) {
        this.f.getClass();
        while (yVar.a() > 0) {
            int i3 = this.h;
            g2.y yVar2 = this.a;
            if (i3 == 0) {
                byte[] bArr = yVar.a;
                int i10 = yVar.b;
                int i11 = yVar.c;
                while (true) {
                    if (i10 >= i11) {
                        yVar.N(i11);
                        break;
                    }
                    byte b10 = bArr[i10];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.k && (b10 & 224) == 224;
                    this.k = z10;
                    if (z11) {
                        yVar.N(i10 + 1);
                        this.k = false;
                        yVar2.a[1] = bArr[i10];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i3 == 1) {
                int min = Math.min(yVar.a(), 4 - this.i);
                yVar.k(this.i, min, yVar2.a);
                int i12 = this.i + min;
                this.i = i12;
                if (i12 >= 4) {
                    yVar2.N(0);
                    int m10 = yVar2.m();
                    e3.z zVar = this.b;
                    if (zVar.a(m10)) {
                        this.m = zVar.b;
                        if (!this.j) {
                            this.l = (zVar.f * 1000000) / zVar.c;
                            d2.u uVar = new d2.u();
                            uVar.a = this.g;
                            uVar.q = u0.n(this.e);
                            uVar.r = u0.n((String) zVar.g);
                            uVar.s = TLObject.FLAG_12;
                            uVar.J = zVar.d;
                            uVar.K = zVar.c;
                            uVar.d = this.c;
                            uVar.f = this.d;
                            this.f.g(new d2.v(uVar));
                            this.j = true;
                        }
                        yVar2.N(0);
                        this.f.e(4, yVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(yVar.a(), this.m - this.i);
                this.f.e(min2, yVar);
                int i13 = this.i + min2;
                this.i = i13;
                if (i13 >= this.m) {
                    zb.p(this.n != -9223372036854775807L);
                    this.f.d(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.n = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.g = (String) f0Var.e;
        f0Var.c();
        this.f = qVar.i0(f0Var.c, 1);
    }

    @Override // l4.i
    public final void d(boolean z10) {
    }
}
