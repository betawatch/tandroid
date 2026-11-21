package a4;

import a8.la;
import e2.t0;
import f3.p;
import h2.x;
import java.io.EOFException;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[ks.e4];
    public final x g = new x(ks.e4);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.g;
        xVar.K(27);
        try {
            z11 = pVar.g(xVar.a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            z11 = false;
        }
        if (z11 && xVar.C() == 1332176723) {
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
                    z12 = pVar.g(xVar.a, 0, this.c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i7 = 0; i7 < this.c; i7++) {
                        int A2 = xVar.A();
                        this.f[i7] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw t0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j3) {
        boolean z10;
        la.f(pVar.getPosition() == pVar.l());
        x xVar = this.g;
        xVar.K(4);
        while (true) {
            if (j3 != -1 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z10 = pVar.g(xVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.n();
                return true;
            }
            pVar.r(1);
        }
        do {
            if (j3 != -1 && pVar.getPosition() >= j3) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
