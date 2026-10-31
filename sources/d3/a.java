package d3;

import androidx.car.app.media.b;
import b2.v0;
import b2.w;
import b2.w0;
import c3.b0;
import c3.k;
import c3.k0;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.y;
import c5.x;
import e2.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public k0 m;
    public k0 n;
    public b0 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = l0.a;
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

    @Override // c3.o
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.l = qVar;
        k0 I1 = qVar.I1(0, 1);
        this.m = I1;
        this.n = I1;
        qVar.Q0();
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j11;
        b0 b0Var = this.o;
        if (!(b0Var instanceof y)) {
            if (j10 == 0 || !(b0Var instanceof k)) {
                this.k = 0L;
                return;
            } else {
                this.k = (Math.max(0L, j10 - ((k) b0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        y yVar = (y) b0Var;
        x xVar = yVar.b;
        long k10 = xVar.b == 0 ? -9223372036854775807L : xVar.k(l0.c(yVar.a, j10));
        this.k = k10;
        if (Math.abs(this.q - k10) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // c3.o
    public final List e() {
        e9.l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        p pVar2;
        int i10;
        this.m.getClass();
        String str = l0.a;
        if (pVar.getPosition() == 0 && !h(pVar)) {
            throw w0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i12 = z10 ? t[8] : s[7];
            k0 k0Var = this.m;
            w wVar = new w();
            wVar.q = v0.n(str2);
            wVar.r = v0.n(str3);
            wVar.s = i12;
            wVar.J = 1;
            wVar.K = i11;
            i0.a.r(wVar, k0Var);
        }
        int i13 = 0;
        if (this.g == 0) {
            try {
                int g10 = g(pVar);
                this.f = g10;
                this.g = g10;
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
                    long j10 = this.k + this.e + 20000;
                    long position = pVar.getPosition() + this.f;
                    x xVar = yVar.b;
                    int i14 = xVar.b;
                    if (i14 == 0 || j10 - xVar.k(i14 - 1) >= 100000) {
                        x xVar2 = yVar.a;
                        x xVar3 = yVar.b;
                        if (xVar3.b == 0 && j10 > 0) {
                            xVar2.e(0L);
                            xVar3.e(0L);
                        }
                        xVar2.e(position);
                        xVar3.e(j10);
                    }
                    if (this.p && Math.abs(this.q - j10) < 20000) {
                        this.p = false;
                        this.n = this.m;
                    }
                }
            } catch (EOFException unused) {
                pVar2 = pVar;
            }
        }
        pVar2 = pVar;
        int a2 = this.n.a(pVar2, this.g, true);
        if (a2 != -1) {
            int i15 = this.g - a2;
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
                    k kVar = new k(length, this.h, (int) ((i10 * 8000000) / 20000), i10, false, true);
                    this.o = kVar;
                    this.m.e(kVar.f);
                }
                b0 b0Var2 = this.o;
                if (b0Var2 != null) {
                    this.l.G1(b0Var2);
                }
            }
            if (i13 == -1) {
                b0 b0Var3 = this.o;
                if (b0Var3 instanceof y) {
                    long j11 = this.k + this.e;
                    ((y) b0Var3).c = j11;
                    this.l.G1(b0Var3);
                    this.m.e(j11);
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

    public final int g(p pVar) {
        boolean z10;
        pVar.m();
        byte[] bArr = this.a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw w0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? t[i10] : s[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw w0.a(null, sb2.toString());
    }

    public final boolean h(p pVar) {
        pVar.m();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
            return true;
        }
        pVar.m();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.q(bArr3.length);
        return true;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
