package a4;

import h5.w;
import j3.n0;
import java.util.Arrays;
import k7.v6;
import k7.w6;
import q5.c0;
import r3.o;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d extends j {
    public o n;
    public c o;

    @Override // a4.j
    public final long b(w wVar) {
        byte[] bArr = wVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            wVar.G(4);
            wVar.A();
        }
        int b10 = v6.b(i10, wVar);
        wVar.F(0);
        return b10;
    }

    @Override // a4.j
    public final boolean c(w wVar, long j10, af.c cVar) {
        byte[] bArr = wVar.a;
        o oVar = this.n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.n = oVar2;
            cVar.b = oVar2.c(Arrays.copyOfRange(bArr, 9, wVar.c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            c cVar2 = this.o;
            if (cVar2 != null) {
                cVar2.a = j10;
                cVar.c = cVar2;
            }
            ((n0) cVar.b).getClass();
            return false;
        }
        c0 b11 = w6.b(wVar);
        o oVar3 = new o(oVar.a, oVar.b, oVar.c, oVar.d, oVar.e, oVar.g, oVar.h, oVar.j, b11, oVar.l);
        this.n = oVar3;
        c cVar3 = new c();
        cVar3.c = oVar3;
        cVar3.d = b11;
        cVar3.a = -1L;
        cVar3.b = -1L;
        this.o = cVar3;
        return true;
    }

    @Override // a4.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.n = null;
            this.o = null;
        }
    }
}
