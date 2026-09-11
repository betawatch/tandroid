package d3;

import androidx.car.app.media.b;
import b2.r;
import b2.r0;
import b2.s0;
import c3.b0;
import c3.h0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.y;
import e2.d;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import i2.g;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a implements o {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final n c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public q l;
    public h0 m;
    public h0 n;
    public b0 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = d0.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.b = i10;
        n nVar = new n();
        this.c = nVar;
        this.n = nVar;
    }

    public final int a(p pVar) {
        boolean z10;
        pVar.q();
        byte[] bArr = this.a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw s0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? t[i10] : s[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw s0.a(null, sb2.toString());
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        return d(pVar);
    }

    public final boolean d(p pVar) {
        pVar.q();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.r(bArr.length);
            return true;
        }
        pVar.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.r(bArr3.length);
        return true;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.l = qVar;
        h0 R1 = qVar.R1(0, 1);
        this.m = R1;
        this.n = R1;
        qVar.Z0();
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j10;
        b0 b0Var = this.o;
        if (!(b0Var instanceof y)) {
            if (j3 == 0 || !(b0Var instanceof k)) {
                this.k = 0L;
                return;
            } else {
                this.k = (Math.max(0L, j3 - ((k) b0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        y yVar = (y) b0Var;
        c5.b0 b0Var2 = yVar.b;
        long f7 = b0Var2.b == 0 ? -9223372036854775807L : b0Var2.f(d0.b(yVar.a, j3));
        this.k = f7;
        if (Math.abs(this.q - f7) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        p pVar2;
        int i10;
        d.h(this.m);
        String str = d0.a;
        if (pVar.getPosition() == 0 && !d(pVar)) {
            throw s0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i12 = z10 ? t[8] : s[7];
            h0 h0Var = this.m;
            r rVar = new r();
            rVar.p = r0.n(str2);
            rVar.q = r0.n(str3);
            rVar.r = i12;
            rVar.I = 1;
            rVar.J = i11;
            g.u(rVar, h0Var);
        }
        int i13 = 0;
        if (this.g == 0) {
            try {
                int a2 = a(pVar);
                this.f = a2;
                this.g = a2;
                if (this.i == -1) {
                    this.h = pVar.getPosition();
                    this.i = this.f;
                }
                if (this.i == this.f) {
                    this.j++;
                }
                b0 b0Var = this.o;
                if (b0Var instanceof y) {
                    y yVar = (y) b0Var;
                    long j3 = this.k + this.e + 20000;
                    long position = pVar.getPosition() + this.f;
                    c5.b0 b0Var2 = yVar.b;
                    int i14 = b0Var2.b;
                    if (i14 == 0 || j3 - b0Var2.f(i14 - 1) >= 100000) {
                        c5.b0 b0Var3 = yVar.a;
                        c5.b0 b0Var4 = yVar.b;
                        if (b0Var4.b == 0 && j3 > 0) {
                            b0Var3.c(0L);
                            b0Var4.c(0L);
                        }
                        b0Var3.c(position);
                        b0Var4.c(j3);
                    }
                    if (this.p && Math.abs(this.q - j3) < 20000) {
                        this.p = false;
                        this.n = this.m;
                    }
                }
            } catch (EOFException unused) {
                pVar2 = pVar;
            }
        }
        pVar2 = pVar;
        int a10 = this.n.a(pVar2, this.g, true);
        if (a10 != -1) {
            int i15 = this.g - a10;
            this.g = i15;
            if (i15 <= 0) {
                this.n.c(this.k + this.e, 1, this.f, 0, null);
                this.e += 20000;
            }
            long length = pVar2.getLength();
            if (this.o == null) {
                if ((this.b & 1) == 0 || !((i10 = this.i) == -1 || i10 == this.f)) {
                    this.o = new t(-9223372036854775807L);
                } else if (this.j >= 20 || i13 == -1) {
                    this.o = new k(length, (int) ((i10 * 8000000) / 20000), i10, false, this.h);
                    this.m.getClass();
                }
                b0 b0Var5 = this.o;
                if (b0Var5 != null) {
                    this.l.P1(b0Var5);
                }
            }
            if (i13 == -1) {
                b0 b0Var6 = this.o;
                if (b0Var6 instanceof y) {
                    ((y) b0Var6).c = this.k + this.e;
                    this.l.P1(b0Var6);
                    this.m.getClass();
                }
            }
            return i13;
        }
        i13 = -1;
        long length2 = pVar2.getLength();
        if (this.o == null) {
        }
        if (i13 == -1) {
        }
        return i13;
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
