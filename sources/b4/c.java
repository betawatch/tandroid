package b4;

import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c implements r3.k {
    public final b a = new b(null, 1);
    public final h5.w b = new h5.w(16384);
    public boolean c;

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.b();
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.a.c(mVar, new h0(0, 1));
        mVar.i1();
        mVar.m2(new r3.n(-9223372036854775807L));
    }

    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        h5.w wVar = this.b;
        int read = ((r3.h) lVar).read(wVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        wVar.F(0);
        wVar.E(read);
        boolean z4 = this.c;
        b bVar = this.a;
        if (!z4) {
            bVar.e(4, 0L);
            this.c = true;
        }
        bVar.a(wVar);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r5.f = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return false;
     */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(r3.l lVar) {
        r3.h hVar;
        int i10;
        h5.w wVar = new h5.w(10);
        int i11 = 0;
        while (true) {
            hVar = (r3.h) lVar;
            hVar.f(wVar.a, 0, 10, false);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int t6 = wVar.t();
            i11 += t6 + 10;
            hVar.a(t6, false);
        }
        hVar.f = 0;
        hVar.a(i11, false);
        int i12 = i11;
        loop1: while (true) {
            int i13 = 0;
            while (true) {
                int i14 = 7;
                hVar.f(wVar.a, 0, 7, false);
                wVar.F(0);
                int z4 = wVar.z();
                if (z4 != 44096 && z4 != 44097) {
                    break;
                }
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (z4 == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break loop1;
                }
                hVar.a(i10 - 7, false);
            }
            hVar.a(i12, false);
        }
    }

    @Override // r3.k
    public final void release() {
    }
}
