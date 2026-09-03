package b4;

import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements r3.k {
    public final b a = new b(null, 0);
    public final h5.w b = new h5.w(2786);
    public boolean c;

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.b();
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.a.c(mVar, new h0(0, 1));
        mVar.j1();
        mVar.h2(new r3.n(-9223372036854775807L));
    }

    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        h5.w wVar = this.b;
        int read = ((r3.h) lVar).read(wVar.a, 0, 2786);
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r5.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(r3.l lVar) {
        r3.h hVar;
        int b10;
        h5.w wVar = new h5.w(10);
        int i10 = 0;
        while (true) {
            hVar = (r3.h) lVar;
            hVar.f(wVar.a, 0, 10, false);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int t6 = wVar.t();
            i10 += t6 + 10;
            hVar.a(t6, false);
        }
        hVar.f = 0;
        hVar.a(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                hVar.f(wVar.a, 0, 6, false);
                wVar.F(0);
                if (wVar.z() != 2935) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.a;
                if (bArr.length < 6) {
                    b10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    b10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b11 = bArr[4];
                    b10 = l3.a.b((b11 & 192) >> 6, b11 & 63);
                }
                if (b10 == -1) {
                    break loop1;
                }
                hVar.a(b10 - 6, false);
            }
            hVar.a(i11, false);
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}
