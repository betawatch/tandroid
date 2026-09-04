package k4;

import android.util.Pair;
import b2.s0;
import c3.h0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import g2.l;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c implements o {
    public q a;
    public h0 b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    @Override // c3.o
    public final boolean b(p pVar) {
        return e.a(pVar);
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.a = qVar;
        this.b = qVar.R1(0, 1);
        qVar.Z0();
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.c = j3 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0214, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        byte[] bArr;
        int B;
        e2.d.h(this.b);
        String str = d0.a;
        int i10 = this.c;
        if (i10 == 0) {
            e2.d.g(pVar.getPosition() == 0);
            int i11 = this.f;
            if (i11 != -1) {
                pVar.r(i11);
                this.c = 4;
                return 0;
            }
            if (!e.a(pVar)) {
                throw s0.a(null, "Unsupported or unrecognized wav file type.");
            }
            pVar.r((int) (pVar.k() - pVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j3 = -1;
        if (i10 == 1) {
            v vVar = new v(8);
            d b10 = d.b(pVar, vVar);
            if (b10.a != 1685272116) {
                pVar.q();
            } else {
                pVar.l(8);
                vVar.J(0);
                pVar.b(0, 8, vVar.a);
                j3 = vVar.m();
                pVar.r(((int) b10.b) + 8);
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
                e2.d.g(this.g != -1);
                long position = this.g - pVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(pVar, position) ? -1 : 0;
            }
            pVar.q();
            d b11 = e.b(1684108385, pVar, new v(8));
            pVar.r(8);
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
                e2.a.n("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        v vVar2 = new v(16);
        long j11 = e.b(1718449184, pVar, vVar2).b;
        e2.d.g(j11 >= 16);
        pVar.b(0, 16, vVar2.a);
        vVar2.J(0);
        int q6 = vVar2.q();
        int q10 = vVar2.q();
        int p5 = vVar2.p();
        vVar2.p();
        int q11 = vVar2.q();
        int q12 = vVar2.q();
        int i12 = ((int) j11) - 16;
        if (i12 > 0) {
            bArr = new byte[i12];
            pVar.b(0, i12, bArr);
            if (q6 == 65534 && i12 == 24) {
                v vVar3 = new v(bArr);
                vVar3.q();
                int q13 = vVar3.q();
                if (q13 != 0 && q13 != q12) {
                    throw s0.c("validBits ( " + q13 + ")  != bitsPerSample( " + q12 + ") are not supported");
                }
                int p10 = vVar3.p();
                if ((p10 >> 18) != 0) {
                    throw s0.c("invalid channel mask " + p10);
                }
                if (p10 != 0 && Integer.bitCount(p10) != q10) {
                    throw s0.c("invalid number of channels (" + Integer.bitCount(p10) + ") in channel mask " + p10);
                }
                q6 = vVar3.q();
                byte[] bArr2 = new byte[14];
                vVar3.h(0, 14, bArr2);
                if (!Arrays.equals(bArr2, e.a) && !Arrays.equals(bArr2, e.b)) {
                    throw s0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = d0.b;
        }
        pVar.r((int) (pVar.k() - pVar.getPosition()));
        e2.q qVar = new e2.q();
        qVar.a = q10;
        qVar.b = p5;
        qVar.c = q11;
        qVar.d = q12;
        qVar.e = bArr;
        if (q6 == 17) {
            this.e = new a(this.a, this.b, qVar);
        } else if (q6 == 6) {
            this.e = new l(this.a, this.b, qVar, "audio/g711-alaw", -1);
        } else if (q6 == 7) {
            this.e = new l(this.a, this.b, qVar, "audio/g711-mlaw", -1);
        } else {
            if (q6 != 1) {
                if (q6 == 3) {
                    if (q12 == 32) {
                        B = 4;
                        if (B == 0) {
                            throw s0.c("Unsupported WAV format type: " + q6);
                        }
                        this.e = new l(this.a, this.b, qVar, "audio/raw", B);
                    }
                }
                B = 0;
                if (B == 0) {
                }
            }
            B = d0.B(q12, ByteOrder.LITTLE_ENDIAN);
            if (B == 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
