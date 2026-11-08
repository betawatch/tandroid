package a4;

import a8.ia;
import f3.p;
import h2.x;
import java.io.EOFException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f {
    public final g a = new g();
    public final x b = new x(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i7) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i7 + i12;
            g gVar = this.a;
            if (i13 >= gVar.c) {
                break;
            }
            int[] iArr = gVar.f;
            this.d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(p pVar) {
        int i7;
        ia.p(pVar != null);
        boolean z9 = this.e;
        x xVar = this.b;
        if (z9) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i10 = this.c;
            g gVar = this.a;
            if (i10 < 0) {
                if (gVar.b(pVar, -1L) && gVar.a(pVar, true)) {
                    int i11 = gVar.d;
                    if ((gVar.a & 1) == 1 && xVar.c == 0) {
                        i11 += a(0);
                        i7 = this.d;
                    } else {
                        i7 = 0;
                    }
                    try {
                        pVar.s(i11);
                        this.c = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a10 = a(this.c);
            int i12 = this.c + this.d;
            if (a10 > 0) {
                xVar.c(xVar.c + a10);
                try {
                    pVar.readFully(xVar.a, xVar.c, a10);
                    xVar.M(xVar.c + a10);
                    this.e = gVar.f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == gVar.c) {
                i12 = -1;
            }
            this.c = i12;
        }
        return true;
    }
}
