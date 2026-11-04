package m4;

import a3.i;
import android.util.Pair;
import b8.zb;
import d2.v0;
import e3.i0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import i2.m;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements o {
    public q a;
    public i0 b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    @Override // e3.o
    public final boolean b(p pVar) {
        return d.a(pVar);
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.a = qVar;
        this.b = qVar.i0(0, 1);
        qVar.L();
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.c = j10 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        byte[] bArr;
        int i3;
        this.b.getClass();
        String str = n0.a;
        int i10 = this.c;
        int i11 = 4;
        if (i10 == 0) {
            zb.p(pVar.getPosition() == 0);
            int i12 = this.f;
            if (i12 != -1) {
                pVar.u(i12);
                this.c = 4;
                return 0;
            }
            if (!d.a(pVar)) {
                throw v0.a(null, "Unsupported or unrecognized wav file type.");
            }
            pVar.u((int) (pVar.k() - pVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j10 = -1;
        if (i10 == 1) {
            y yVar = new y(8);
            i b10 = i.b(pVar, yVar);
            if (b10.a != 1685272116) {
                pVar.o();
            } else {
                pVar.n(8);
                yVar.N(0);
                pVar.c(0, 8, yVar.a);
                j10 = yVar.p();
                pVar.u(((int) b10.b) + 8);
            }
            this.d = j10;
            this.c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                zb.p(this.g != -1);
                long position = this.g - pVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(pVar, position) ? -1 : 0;
            }
            pVar.o();
            i b11 = d.b(1684108385, pVar, new y(8));
            pVar.u(8);
            Pair create = Pair.create(Long.valueOf(pVar.getPosition()), Long.valueOf(b11.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j11 = this.d;
            if (j11 != -1 && longValue == 4294967295L) {
                longValue = j11;
            }
            this.g = this.f + longValue;
            long length = pVar.getLength();
            if (length != -1 && this.g > length) {
                g2.a.l("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        y yVar2 = new y(16);
        long j12 = d.b(1718449184, pVar, yVar2).b;
        zb.p(j12 >= 16);
        pVar.c(0, 16, yVar2.a);
        yVar2.N(0);
        int t10 = yVar2.t();
        int t11 = yVar2.t();
        int s6 = yVar2.s();
        yVar2.s();
        int t12 = yVar2.t();
        int t13 = yVar2.t();
        int i13 = ((int) j12) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            pVar.c(0, i13, bArr);
            if (t10 == 65534 && i13 == 24) {
                y yVar3 = new y(bArr);
                yVar3.t();
                int t14 = yVar3.t();
                if (t14 != 0 && t14 != t13) {
                    throw v0.c("validBits ( " + t14 + ")  != bitsPerSample( " + t13 + ") are not supported");
                }
                int s10 = yVar3.s();
                if ((s10 >> 18) != 0) {
                    throw v0.c("invalid channel mask " + s10);
                }
                if (s10 != 0 && Integer.bitCount(s10) != t11) {
                    throw v0.c("invalid number of channels (" + Integer.bitCount(s10) + ") in channel mask " + s10);
                }
                t10 = yVar3.t();
                byte[] bArr2 = new byte[14];
                yVar3.k(0, 14, bArr2);
                if (!Arrays.equals(bArr2, d.a) && !Arrays.equals(bArr2, d.b)) {
                    throw v0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = n0.b;
        }
        pVar.u((int) (pVar.k() - pVar.getPosition()));
        h2.s sVar2 = new h2.s();
        sVar2.a = t11;
        sVar2.b = s6;
        sVar2.c = t12;
        sVar2.d = t13;
        sVar2.e = bArr;
        if (t10 == 17) {
            this.e = new a(this.a, this.b, sVar2);
        } else if (t10 == 6) {
            this.e = new m(this.a, this.b, sVar2, "audio/g711-alaw", -1);
        } else if (t10 == 7) {
            this.e = new m(this.a, this.b, sVar2, "audio/g711-mlaw", -1);
        } else {
            if (t10 != 1) {
                if (t10 != 3) {
                }
                i3 = 0;
                if (i3 != 0) {
                    throw v0.c("Unsupported WAV format type: " + t10);
                }
                this.e = new m(this.a, this.b, sVar2, "audio/raw", i3);
            }
            i11 = n0.D(t13, ByteOrder.LITTLE_ENDIAN);
            i3 = i11;
            if (i3 != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
