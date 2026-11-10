package m4;

import h9.i0;
import h9.t1;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c implements f3.o {
    public final b a = new b(0, 1, null, "audio/ac4");
    public final h2.x b = new h2.x(TLObject.FLAG_14);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(f3.p pVar) {
        f3.l lVar;
        int i7;
        h2.x xVar = new h2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (f3.l) pVar;
            lVar.k(xVar.a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z9 = xVar.z();
            i10 += z9 + 10;
            lVar.v(z9, false);
        }
        lVar.f = 0;
        lVar.v(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            lVar.k(xVar.a, 0, 7, false);
            xVar.N(0);
            int H = xVar.H();
            if (H == 44096 || H == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (H == 44097) {
                        i13 += 2;
                    }
                    i7 = i14 + i13;
                }
                if (i7 == -1) {
                    break;
                }
                lVar.v(i7 - 7, false);
            } else {
                lVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.v(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        this.a.g(qVar, new g0(0, 1));
        qVar.U0();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.c = false;
        this.a.d();
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.b;
        int read = pVar.read(xVar.a, 0, TLObject.FLAG_14);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z9 = this.c;
        b bVar = this.a;
        if (!z9) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(xVar);
        return 0;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
