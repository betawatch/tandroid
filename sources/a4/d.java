package a4;

import e2.s0;
import e2.t;
import f3.u;
import h2.x;
import java.util.Arrays;
import q4.q;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d extends j {
    public u n;
    public c o;

    @Override // a4.j
    public final long b(x xVar) {
        byte[] bArr = xVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            xVar.O(4);
            xVar.I();
        }
        int s5 = f3.b.s(i7, xVar);
        xVar.N(0);
        return s5;
    }

    @Override // a4.j
    public final boolean c(x xVar, long j3, q qVar) {
        byte[] bArr = xVar.a;
        u uVar = this.n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.n = uVar2;
            t a10 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.c), null).a();
            a10.q = s0.n("audio/ogg");
            qVar.b = new e2.u(a10);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            c cVar = this.o;
            if (cVar != null) {
                cVar.a = j3;
                qVar.c = cVar;
            }
            ((e2.u) qVar.b).getClass();
            return false;
        }
        q t6 = f3.b.t(xVar);
        u uVar3 = new u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, uVar.g, uVar.h, uVar.j, t6, uVar.l);
        this.n = uVar3;
        c cVar2 = new c();
        cVar2.c = uVar3;
        cVar2.d = t6;
        cVar2.a = -1L;
        cVar2.b = -1L;
        this.o = cVar2;
        return true;
    }

    @Override // a4.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.n = null;
            this.o = null;
        }
    }
}
