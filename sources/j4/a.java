package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class a implements c3.q {
    public final b a = new b("audio/ac3");
    public final e2.x b = new e2.x(2786);
    public boolean c;

    @Override // c3.q
    public final boolean a(c3.r rVar) {
        c3.l lVar;
        int e;
        e2.x xVar = new e2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) rVar;
            lVar.j(xVar.a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            lVar.u(z10, false);
        }
        lVar.f = 0;
        lVar.u(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.j(xVar.a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.u(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 6) {
                    e = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e = c3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e == -1) {
                    break;
                }
                lVar.u(e - 6, false);
            }
        }
        return false;
    }

    @Override // c3.q
    public final void c(c3.s sVar) {
        this.a.d(sVar, new f0(0, 1));
        sVar.C();
        sVar.g0(new c3.v(-9223372036854775807L));
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.c();
    }

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(c3.r rVar, c3.u uVar) {
        e2.x xVar = this.b;
        int read = rVar.read(xVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override // c3.q
    public final c3.q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
