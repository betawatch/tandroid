package n3;

import androidx.car.app.media.b;
import d5.g0;
import h3.s0;
import h3.t0;
import h3.t1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import m3.g;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import o8.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements k {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public m l;
    public w m;
    public t n;
    public boolean o;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i10 = g0.a;
        Charset charset = d.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public a(int i10) {
        this.b = i10;
    }

    public final int a(l lVar) {
        boolean z10;
        lVar.q();
        byte[] bArr = this.a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw t1.a("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? q[i10] : p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw t1.a(sb2.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        int i10;
        int i11;
        d5.a.j(this.m);
        int i12 = g0.a;
        if (((h) lVar).d == 0 && !d(lVar)) {
            throw t1.a("Could not find AMR header.", null);
        }
        if (!this.o) {
            this.o = true;
            boolean z10 = this.c;
            String str = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i13 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            w wVar = this.m;
            s0 s0Var = new s0();
            s0Var.o = str;
            s0Var.p = t;
            s0Var.B = 1;
            s0Var.C = i13;
            wVar.c(new t0(s0Var));
        }
        if (this.f == 0) {
            try {
                int a2 = a(lVar);
                this.e = a2;
                this.f = a2;
                if (this.i == -1) {
                    this.h = ((h) lVar).d;
                    this.i = a2;
                }
                if (this.i == a2) {
                    this.j++;
                }
            } catch (EOFException unused) {
            }
        }
        int b10 = this.m.b(lVar, this.f, true);
        if (b10 != -1) {
            int i14 = this.f - b10;
            this.f = i14;
            i10 = 0;
            if (i14 <= 0) {
                this.m.e(this.k + this.d, 1, this.e, 0, null);
                this.d += 20000;
            }
            long j10 = ((h) lVar).c;
            if (!this.g) {
                if ((this.b & 1) == 0 || j10 == -1 || !((i11 = this.i) == -1 || i11 == this.e)) {
                    o oVar = new o(-9223372036854775807L);
                    this.n = oVar;
                    this.l.n(oVar);
                    this.g = true;
                } else if (this.j >= 20 || i10 == -1) {
                    g gVar = new g(j10, (int) ((i11 * 8000000) / 20000), i11, false, this.h);
                    this.n = gVar;
                    this.l.n(gVar);
                    this.g = true;
                }
            }
            return i10;
        }
        i10 = -1;
        long j102 = ((h) lVar).c;
        if (!this.g) {
        }
        return i10;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.l = mVar;
        this.m = mVar.C(0, 1);
        mVar.A();
    }

    public final boolean d(l lVar) {
        lVar.q();
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            lVar.t(bArr.length);
            return true;
        }
        lVar.q();
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        lVar.t(bArr3.length);
        return true;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        return d(lVar);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j10 != 0) {
            t tVar = this.n;
            if (tVar instanceof g) {
                this.k = (Math.max(0L, j10 - ((g) tVar).b) * 8000000) / r0.e;
                return;
            }
        }
        this.k = 0L;
    }

    @Override // m3.k
    public final void release() {
    }
}
