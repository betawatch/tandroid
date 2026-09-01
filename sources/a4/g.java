package a4;

import h5.w;
import j3.r1;
import java.io.EOFException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final w g = new w(255);

    public final boolean a(r3.l lVar, boolean z4) {
        boolean z10;
        boolean z11;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        w wVar = this.g;
        wVar.C(27);
        try {
            z10 = lVar.f(wVar.a, 0, 27, z4);
        } catch (EOFException e6) {
            if (!z4) {
                throw e6;
            }
            z10 = false;
        }
        if (z10 && wVar.v() == 1332176723) {
            if (wVar.u() == 0) {
                this.a = wVar.u();
                this.b = wVar.j();
                wVar.l();
                wVar.l();
                wVar.l();
                int u10 = wVar.u();
                this.c = u10;
                this.d = u10 + 27;
                wVar.C(u10);
                try {
                    z11 = lVar.f(wVar.a, 0, this.c, z4);
                } catch (EOFException e10) {
                    if (!z4) {
                        throw e10;
                    }
                    z11 = false;
                }
                if (z11) {
                    for (int i10 = 0; i10 < this.c; i10++) {
                        int u11 = wVar.u();
                        this.f[i10] = u11;
                        this.e += u11;
                    }
                    return true;
                }
            } else if (!z4) {
                throw r1.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(r3.l lVar, long j10) {
        boolean z4;
        h5.a.f(lVar.getPosition() == lVar.g());
        w wVar = this.g;
        wVar.C(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z4 = lVar.f(wVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z4 = false;
            }
            if (!z4) {
                break;
            }
            wVar.F(0);
            if (wVar.v() == 1332176723) {
                lVar.r();
                return true;
            }
            lVar.s(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
