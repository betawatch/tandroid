package d3;

import androidx.car.app.media.b;
import b2.w;
import b2.w0;
import b2.x0;
import c3.b0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.y;
import d5.z;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.s1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public j0 m;
    public j0 n;
    public b0 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = n0.a;
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
        j0 F1 = qVar.F1(0, 1);
        this.m = F1;
        this.n = F1;
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
        z zVar = yVar.b;
        long j12 = zVar.b == 0 ? -9223372036854775807L : zVar.j(n0.c(yVar.a, j10));
        this.k = j12;
        if (Math.abs(this.q - j12) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // c3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
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
        String str = n0.a;
        if (pVar.getPosition() == 0 && !h(pVar)) {
            throw x0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i12 = z10 ? t[8] : s[7];
            j0 j0Var = this.m;
            w wVar = new w();
            wVar.q = w0.n(str2);
            wVar.r = w0.n(str3);
            wVar.s = i12;
            wVar.J = 1;
            wVar.K = i11;
            ic.a.u(wVar, j0Var);
        }
        int i13 = 0;
        if (this.g == 0) {
            try {
                int g7 = g(pVar);
                this.f = g7;
                this.g = g7;
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
                    z zVar = yVar.b;
                    int i14 = zVar.b;
                    if (i14 == 0 || j10 - zVar.j(i14 - 1) >= 100000) {
                        z zVar2 = yVar.a;
                        z zVar3 = yVar.b;
                        if (zVar3.b == 0 && j10 > 0) {
                            zVar2.c(0L);
                            zVar3.c(0L);
                        }
                        zVar2.c(position);
                        zVar3.c(j10);
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
                    this.l.D1(b0Var2);
                }
            }
            if (i13 == -1) {
                b0 b0Var3 = this.o;
                if (b0Var3 instanceof y) {
                    long j11 = this.k + this.e;
                    ((y) b0Var3).c = j11;
                    this.l.D1(b0Var3);
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
        pVar.p();
        byte[] bArr = this.a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw x0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? t[i10] : s[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw x0.a(null, sb2.toString());
    }

    public final boolean h(p pVar) {
        pVar.p();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.r(bArr.length);
            return true;
        }
        pVar.p();
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
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
