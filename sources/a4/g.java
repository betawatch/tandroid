package a4;

import a8.ia;
import e2.t0;
import f3.p;
import h2.x;
import java.io.EOFException;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[qs.e4];
    public final x g = new x(qs.e4);

    public final boolean a(p pVar, boolean z9) {
        boolean z10;
        boolean z11;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.g;
        xVar.K(27);
        try {
            z10 = pVar.k(xVar.a, 0, 27, z9);
        } catch (EOFException e10) {
            if (!z9) {
                throw e10;
            }
            z10 = false;
        }
        if (z10 && xVar.C() == 1332176723) {
            if (xVar.A() == 0) {
                this.a = xVar.A();
                this.b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z11 = pVar.k(xVar.a, 0, this.c, z9);
                } catch (EOFException e11) {
                    if (!z9) {
                        throw e11;
                    }
                    z11 = false;
                }
                if (z11) {
                    for (int i7 = 0; i7 < this.c; i7++) {
                        int A2 = xVar.A();
                        this.f[i7] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z9) {
                throw t0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j3) {
        boolean z9;
        ia.f(pVar.getPosition() == pVar.l());
        x xVar = this.g;
        xVar.K(4);
        while (true) {
            if (j3 != -1 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z9 = pVar.k(xVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.q();
                return true;
            }
            pVar.s(1);
        }
        do {
            if (j3 != -1 && pVar.getPosition() >= j3) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
