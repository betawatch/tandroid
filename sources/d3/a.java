package d3;

import androidx.car.app.media.b;
import b2.v;
import b2.v0;
import b2.w0;
import c3.b0;
import c3.e0;
import c3.k;
import c3.l0;
import c3.p;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c5.c0;
import e2.m0;
import e9.n0;
import e9.x1;
import i2.o1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a implements q {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final p c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public s l;
    public l0 m;
    public l0 n;
    public e0 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = m0.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.b = i10;
        p pVar = new p();
        this.c = pVar;
        this.n = pVar;
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        return h(rVar);
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.l = sVar;
        l0 j02 = sVar.j0(0, 1);
        this.m = j02;
        this.n = j02;
        sVar.C();
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j11;
        e0 e0Var = this.o;
        if (!(e0Var instanceof b0)) {
            if (j10 == 0 || !(e0Var instanceof k)) {
                this.k = 0L;
                return;
            } else {
                this.k = (Math.max(0L, j10 - ((k) e0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        b0 b0Var = (b0) e0Var;
        c0 c0Var = b0Var.b;
        long n10 = c0Var.b == 0 ? -9223372036854775807L : c0Var.n(m0.c(b0Var.a, j10));
        this.k = n10;
        if (Math.abs(this.q - n10) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // c3.q
    public final List e() {
        e9.l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    @Override // c3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(r rVar, u uVar) {
        r rVar2;
        int i10;
        this.m.getClass();
        String str = m0.a;
        if (rVar.getPosition() == 0 && !h(rVar)) {
            throw w0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i12 = z10 ? t[8] : s[7];
            l0 l0Var = this.m;
            v vVar = new v();
            vVar.q = v0.n(str2);
            vVar.r = v0.n(str3);
            vVar.s = i12;
            vVar.J = 1;
            vVar.K = i11;
            o1.v(vVar, l0Var);
        }
        int i13 = 0;
        if (this.g == 0) {
            try {
                int g10 = g(rVar);
                this.f = g10;
                this.g = g10;
                if (this.i == -1) {
                    this.h = rVar.getPosition();
                    this.i = this.f;
                }
                if (this.i == this.f) {
                    this.j++;
                }
                e0 e0Var = this.o;
                if (e0Var instanceof b0) {
                    b0 b0Var = (b0) e0Var;
                    long j10 = this.k + this.e + 20000;
                    long position = rVar.getPosition() + this.f;
                    c0 c0Var = b0Var.b;
                    int i14 = c0Var.b;
                    if (i14 == 0 || j10 - c0Var.n(i14 - 1) >= 100000) {
                        c0 c0Var2 = b0Var.a;
                        c0 c0Var3 = b0Var.b;
                        if (c0Var3.b == 0 && j10 > 0) {
                            c0Var2.e(0L);
                            c0Var3.e(0L);
                        }
                        c0Var2.e(position);
                        c0Var3.e(j10);
                    }
                    if (this.p && Math.abs(this.q - j10) < 20000) {
                        this.p = false;
                        this.n = this.m;
                    }
                }
            } catch (EOFException unused) {
                rVar2 = rVar;
            }
        }
        rVar2 = rVar;
        int a2 = this.n.a(rVar2, this.g, true);
        if (a2 != -1) {
            int i15 = this.g - a2;
            this.g = i15;
            if (i15 <= 0) {
                this.n.c(this.k + this.e, 1, this.f, 0, null);
                this.e += 20000;
            }
            long length = rVar2.getLength();
            if (this.o == null) {
                if ((this.b & 1) == 0 || !((i10 = this.i) == -1 || i10 == this.f)) {
                    this.o = new c3.v(-9223372036854775807L);
                } else if (this.j >= 20 || i13 == -1) {
                    k kVar = new k(length, this.h, (int) ((i10 * 8000000) / 20000), i10, false, true);
                    this.o = kVar;
                    this.m.e(kVar.f);
                }
                e0 e0Var2 = this.o;
                if (e0Var2 != null) {
                    this.l.g0(e0Var2);
                }
            }
            if (i13 == -1) {
                e0 e0Var3 = this.o;
                if (e0Var3 instanceof b0) {
                    long j11 = this.k + this.e;
                    ((b0) e0Var3).c = j11;
                    this.l.g0(e0Var3);
                    this.m.e(j11);
                }
            }
            return i13;
        }
        i13 = -1;
        long length2 = rVar2.getLength();
        if (this.o == null) {
        }
        if (i13 == -1) {
        }
        return i13;
    }

    public final int g(r rVar) {
        boolean z10;
        rVar.q();
        byte[] bArr = this.a;
        rVar.a(0, 1, bArr);
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

    public final boolean h(r rVar) {
        rVar.q();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        rVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            rVar.r(bArr.length);
            return true;
        }
        rVar.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        rVar.a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        rVar.r(bArr3.length);
        return true;
    }

    @Override // c3.q
    public final q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
