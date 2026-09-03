package c4;

import android.util.Pair;
import c2.a1;
import h5.d0;
import h5.w;
import j3.r1;
import j7.k0;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements k {
    public m a;
    public v b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.c = j10 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.a = mVar;
        this.b = mVar.i2(0, 1);
        mVar.i1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r9 != 65534) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        byte[] bArr;
        int v;
        h5.a.j(this.b);
        int i10 = d0.a;
        int i11 = this.c;
        if (i11 == 0) {
            h5.a.i(((h) lVar).d == 0);
            int i12 = this.f;
            if (i12 != -1) {
                ((h) lVar).s(i12);
                this.c = 4;
                return 0;
            }
            if (!k0.a(lVar)) {
                throw r1.a("Unsupported or unrecognized wav file type.", null);
            }
            h hVar = (h) lVar;
            hVar.s((int) (hVar.g() - hVar.d));
            this.c = 1;
            return 0;
        }
        long j10 = -1;
        if (i11 == 1) {
            w wVar = new w(8);
            e b10 = e.b(lVar, wVar);
            if (b10.a != 1685272116) {
                ((h) lVar).f = 0;
            } else {
                h hVar2 = (h) lVar;
                hVar2.a(8, false);
                wVar.F(0);
                hVar2.f(wVar.a, 0, 8, false);
                j10 = wVar.j();
                hVar2.s(((int) b10.b) + 8);
            }
            this.d = j10;
            this.c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                h5.a.i(this.g != -1);
                long j11 = this.g - ((h) lVar).d;
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(lVar, j11) ? -1 : 0;
            }
            ((h) lVar).f = 0;
            e b11 = k0.b(1684108385, lVar, new w(8));
            h hVar3 = (h) lVar;
            hVar3.s(8);
            Pair create = Pair.create(Long.valueOf(hVar3.d), Long.valueOf(b11.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j12 = this.d;
            if (j12 != -1 && longValue == 4294967295L) {
                longValue = j12;
            }
            long j13 = this.f + longValue;
            this.g = j13;
            long j14 = hVar3.c;
            if (j14 != -1 && j13 > j14) {
                h5.a.K("WavExtractor", "Data exceeds input length: " + this.g + ", " + j14);
                this.g = j14;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        w wVar2 = new w(16);
        long j15 = k0.b(1718449184, lVar, wVar2).b;
        h5.a.i(j15 >= 16);
        h hVar4 = (h) lVar;
        hVar4.f(wVar2.a, 0, 16, false);
        wVar2.F(0);
        int n10 = wVar2.n();
        int n11 = wVar2.n();
        int m9 = wVar2.m();
        wVar2.m();
        int n12 = wVar2.n();
        int n13 = wVar2.n();
        int i13 = ((int) j15) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            hVar4.f(bArr, 0, i13, false);
        } else {
            bArr = d0.f;
        }
        hVar4.s((int) (hVar4.g() - hVar4.d));
        a1 a1Var = new a1();
        a1Var.a = n11;
        a1Var.b = m9;
        a1Var.c = n12;
        a1Var.d = n13;
        a1Var.e = bArr;
        if (n10 == 17) {
            this.e = new a(this.a, this.b, a1Var);
        } else if (n10 == 6) {
            this.e = new c(this.a, this.b, a1Var, "audio/g711-alaw", -1);
        } else if (n10 == 7) {
            this.e = new c(this.a, this.b, a1Var, "audio/g711-mlaw", -1);
        } else {
            if (n10 != 1) {
                if (n10 == 3) {
                    if (n13 == 32) {
                        v = 4;
                        if (v == 0) {
                            throw r1.c("Unsupported WAV format type: " + n10);
                        }
                        this.e = new c(this.a, this.b, a1Var, "audio/raw", v);
                    }
                }
                v = 0;
                if (v == 0) {
                }
            }
            v = d0.v(n13);
            if (v == 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        return k0.a(lVar);
    }

    @Override // r3.k
    public final void release() {
    }
}
