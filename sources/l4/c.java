package l4;

import g9.i0;
import g9.s1;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements e3.o {
    public final b a = new b(0, 1, null, "audio/ac4");
    public final g2.y b = new g2.y(TLObject.FLAG_14);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(e3.p pVar) {
        e3.l lVar;
        int i3;
        g2.y yVar = new g2.y(10);
        int i10 = 0;
        while (true) {
            lVar = (e3.l) pVar;
            lVar.h(yVar.a, 0, 10, false);
            yVar.N(0);
            if (yVar.D() != 4801587) {
                break;
            }
            yVar.O(3);
            int z10 = yVar.z();
            i10 += z10 + 10;
            lVar.w(z10, false);
        }
        lVar.f = 0;
        lVar.w(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            lVar.h(yVar.a, 0, 7, false);
            yVar.N(0);
            int H = yVar.H();
            if (H == 44096 || H == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.a;
                if (bArr.length < 7) {
                    i3 = -1;
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
                    i3 = i14 + i13;
                }
                if (i3 == -1) {
                    break;
                }
                lVar.w(i3 - 7, false);
            } else {
                lVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.w(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        this.a.f(qVar, new f0(0, 1));
        qVar.L();
        qVar.f(new e3.t(-9223372036854775807L));
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.a();
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(e3.p pVar, e3.s sVar) {
        g2.y yVar = this.b;
        int read = pVar.read(yVar.a, 0, TLObject.FLAG_14);
        if (read == -1) {
            return -1;
        }
        yVar.N(0);
        yVar.M(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(yVar);
        return 0;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
