package n4;

import a8.ia;
import android.util.Pair;
import b3.i;
import e2.t0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j2.l;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c implements o {
    public q a;
    public j0 b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    @Override // f3.o
    public final boolean b(p pVar) {
        return d.a(pVar);
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.a = qVar;
        this.b = qVar.O1(0, 1);
        qVar.U0();
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.c = j3 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j10);
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        byte[] bArr;
        int i7;
        this.b.getClass();
        String str = m0.a;
        int i10 = this.c;
        int i11 = 4;
        if (i10 == 0) {
            ia.p(pVar.getPosition() == 0);
            int i12 = this.f;
            if (i12 != -1) {
                pVar.s(i12);
                this.c = 4;
                return 0;
            }
            if (!d.a(pVar)) {
                throw t0.a(null, "Unsupported or unrecognized wav file type.");
            }
            pVar.s((int) (pVar.l() - pVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j3 = -1;
        if (i10 == 1) {
            x xVar = new x(8);
            i b10 = i.b(pVar, xVar);
            if (b10.a != 1685272116) {
                pVar.q();
            } else {
                pVar.m(8);
                xVar.N(0);
                pVar.b(0, 8, xVar.a);
                j3 = xVar.p();
                pVar.s(((int) b10.b) + 8);
            }
            this.d = j3;
            this.c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                ia.p(this.g != -1);
                long position = this.g - pVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.a(pVar, position) ? -1 : 0;
            }
            pVar.q();
            i b11 = d.b(1684108385, pVar, new x(8));
            pVar.s(8);
            Pair create = Pair.create(Long.valueOf(pVar.getPosition()), Long.valueOf(b11.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j10 = this.d;
            if (j10 != -1 && longValue == 4294967295L) {
                longValue = j10;
            }
            this.g = this.f + longValue;
            long length = pVar.getLength();
            if (length != -1 && this.g > length) {
                h2.a.l("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        x xVar2 = new x(16);
        long j11 = d.b(1718449184, pVar, xVar2).b;
        ia.p(j11 >= 16);
        pVar.b(0, 16, xVar2.a);
        xVar2.N(0);
        int t6 = xVar2.t();
        int t10 = xVar2.t();
        int s5 = xVar2.s();
        xVar2.s();
        int t11 = xVar2.t();
        int t12 = xVar2.t();
        int i13 = ((int) j11) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            pVar.b(0, i13, bArr);
            if (t6 == 65534 && i13 == 24) {
                x xVar3 = new x(bArr);
                xVar3.t();
                int t13 = xVar3.t();
                if (t13 != 0 && t13 != t12) {
                    throw t0.c("validBits ( " + t13 + ")  != bitsPerSample( " + t12 + ") are not supported");
                }
                int s9 = xVar3.s();
                if ((s9 >> 18) != 0) {
                    throw t0.c("invalid channel mask " + s9);
                }
                if (s9 != 0 && Integer.bitCount(s9) != t10) {
                    throw t0.c("invalid number of channels (" + Integer.bitCount(s9) + ") in channel mask " + s9);
                }
                t6 = xVar3.t();
                byte[] bArr2 = new byte[14];
                xVar3.k(0, 14, bArr2);
                if (!Arrays.equals(bArr2, d.a) && !Arrays.equals(bArr2, d.b)) {
                    throw t0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = m0.b;
        }
        pVar.s((int) (pVar.l() - pVar.getPosition()));
        i2.s sVar2 = new i2.s();
        sVar2.a = t10;
        sVar2.b = s5;
        sVar2.c = t11;
        sVar2.d = t12;
        sVar2.e = bArr;
        if (t6 == 17) {
            this.e = new a(this.a, this.b, sVar2);
        } else if (t6 == 6) {
            this.e = new l(this.a, this.b, sVar2, "audio/g711-alaw", -1);
        } else if (t6 == 7) {
            this.e = new l(this.a, this.b, sVar2, "audio/g711-mlaw", -1);
        } else {
            if (t6 != 1) {
                if (t6 != 3) {
                }
                i7 = 0;
                if (i7 != 0) {
                    throw t0.c("Unsupported WAV format type: " + t6);
                }
                this.e = new l(this.a, this.b, sVar2, "audio/raw", i7);
            }
            i11 = m0.D(t12, ByteOrder.LITTLE_ENDIAN);
            i7 = i11;
            if (i7 != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
