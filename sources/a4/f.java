package a4;

import h5.w;
import java.io.EOFException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f {
    public final g a = new g();
    public final w b = new w(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            g gVar = this.a;
            if (i14 >= gVar.c) {
                break;
            }
            int[] iArr = gVar.f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(r3.l lVar) {
        int i10;
        h5.a.i(lVar != null);
        boolean z4 = this.e;
        w wVar = this.b;
        if (z4) {
            this.e = false;
            wVar.C(0);
        }
        while (!this.e) {
            int i11 = this.c;
            g gVar = this.a;
            if (i11 < 0) {
                if (gVar.b(lVar, -1L) && gVar.a(lVar, true)) {
                    int i12 = gVar.d;
                    if ((gVar.a & 1) == 1 && wVar.c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.s(i12);
                        this.c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.c);
            int i13 = this.c + this.d;
            if (a2 > 0) {
                wVar.b(wVar.c + a2);
                try {
                    lVar.readFully(wVar.a, wVar.c, a2);
                    wVar.E(wVar.c + a2);
                    this.e = gVar.f[i13 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == gVar.c) {
                i13 = -1;
            }
            this.c = i13;
        }
        return true;
    }
}
