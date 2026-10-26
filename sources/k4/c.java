package k4;

import a8.yb;
import android.util.Pair;
import b2.x0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.n0;
import e2.x;
import f2.u;
import f9.g0;
import f9.i0;
import f9.s1;
import g2.l;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements o {
    public q a;
    public j0 b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    @Override // c3.o
    public final boolean a(p pVar) {
        return e.a(pVar);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.a = qVar;
        this.b = qVar.F1(0, 1);
        qVar.Q0();
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.c = j10 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // c3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0214, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021b, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        byte[] bArr;
        int i10;
        this.b.getClass();
        String str = n0.a;
        int i11 = this.c;
        int i12 = 4;
        if (i11 == 0) {
            yb.p(pVar.getPosition() == 0);
            int i13 = this.f;
            if (i13 != -1) {
                pVar.q(i13);
                this.c = 4;
                return 0;
            }
            if (!e.a(pVar)) {
                throw x0.a(null, "Unsupported or unrecognized wav file type.");
            }
            pVar.q((int) (pVar.i() - pVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j10 = -1;
        if (i11 == 1) {
            x xVar = new x(8);
            d b10 = d.b(pVar, xVar);
            if (b10.a != 1685272116) {
                pVar.p();
            } else {
                pVar.j(8);
                xVar.N(0);
                pVar.b(0, 8, xVar.a);
                j10 = xVar.p();
                pVar.q(((int) b10.b) + 8);
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
                yb.p(this.g != -1);
                long position = this.g - pVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(pVar, position) ? -1 : 0;
            }
            pVar.p();
            d b11 = e.b(1684108385, pVar, new x(8));
            pVar.q(8);
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
                e2.a.l("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        x xVar2 = new x(16);
        long j12 = e.b(1718449184, pVar, xVar2).b;
        yb.p(j12 >= 16);
        pVar.b(0, 16, xVar2.a);
        xVar2.N(0);
        int t10 = xVar2.t();
        int t11 = xVar2.t();
        int s10 = xVar2.s();
        xVar2.s();
        int t12 = xVar2.t();
        int t13 = xVar2.t();
        int i14 = ((int) j12) - 16;
        if (i14 > 0) {
            bArr = new byte[i14];
            pVar.b(0, i14, bArr);
            if (t10 == 65534 && i14 == 24) {
                x xVar3 = new x(bArr);
                xVar3.t();
                int t14 = xVar3.t();
                if (t14 != 0 && t14 != t13) {
                    throw x0.c("validBits ( " + t14 + ")  != bitsPerSample( " + t13 + ") are not supported");
                }
                int s11 = xVar3.s();
                if ((s11 >> 18) != 0) {
                    throw x0.c("invalid channel mask " + s11);
                }
                if (s11 != 0 && Integer.bitCount(s11) != t11) {
                    throw x0.c("invalid number of channels (" + Integer.bitCount(s11) + ") in channel mask " + s11);
                }
                t10 = xVar3.t();
                byte[] bArr2 = new byte[14];
                xVar3.k(0, 14, bArr2);
                if (!Arrays.equals(bArr2, e.a) && !Arrays.equals(bArr2, e.b)) {
                    throw x0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = n0.b;
        }
        pVar.q((int) (pVar.i() - pVar.getPosition()));
        u uVar = new u();
        uVar.a = t11;
        uVar.b = s10;
        uVar.c = t12;
        uVar.d = t13;
        uVar.e = bArr;
        if (t10 == 17) {
            this.e = new a(this.a, this.b, uVar);
        } else if (t10 == 6) {
            this.e = new l(this.a, this.b, uVar, "audio/g711-alaw", -1);
        } else if (t10 == 7) {
            this.e = new l(this.a, this.b, uVar, "audio/g711-mlaw", -1);
        } else {
            if (t10 != 1) {
                if (t10 != 3) {
                }
                i10 = 0;
                if (i10 != 0) {
                    throw x0.c("Unsupported WAV format type: " + t10);
                }
                this.e = new l(this.a, this.b, uVar, "audio/raw", i10);
            }
            i12 = n0.D(t13, ByteOrder.LITTLE_ENDIAN);
            i10 = i12;
            if (i10 != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
