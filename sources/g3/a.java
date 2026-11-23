package g3;

import androidx.car.app.media.b;
import b3.j;
import e2.s0;
import e2.t;
import e2.t0;
import f3.c0;
import f3.j0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.z;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.s1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import p5.c;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public c0 o;
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

    public a(int i7) {
        this.b = i7;
        n nVar = new n();
        this.c = nVar;
        this.n = nVar;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.l = qVar;
        j0 d2 = qVar.d2(0, 1);
        this.m = d2;
        this.n = d2;
        qVar.Z0();
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j10;
        c0 c0Var = this.o;
        if (!(c0Var instanceof z)) {
            if (j3 == 0 || !(c0Var instanceof k)) {
                this.k = 0L;
                return;
            } else {
                this.k = (Math.max(0L, j3 - ((k) c0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        z zVar = (z) c0Var;
        j jVar = zVar.b;
        long m10 = jVar.b == 0 ? -9223372036854775807L : jVar.m(l0.c(zVar.a, j3));
        this.k = m10;
        if (Math.abs(this.q - m10) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        p pVar2;
        int i7;
        this.m.getClass();
        String str = l0.a;
        if (pVar.getPosition() == 0 && !h(pVar)) {
            throw t0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i10 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i11 = z10 ? t[8] : s[7];
            j0 j0Var = this.m;
            t tVar = new t();
            tVar.q = s0.n(str2);
            tVar.r = s0.n(str3);
            tVar.s = i11;
            tVar.J = 1;
            tVar.K = i10;
            c.r(tVar, j0Var);
        }
        int i12 = 0;
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
                c0 c0Var = this.o;
                if (c0Var instanceof z) {
                    z zVar = (z) c0Var;
                    long j3 = this.k + this.e + 20000;
                    long position = pVar.getPosition() + this.f;
                    j jVar = zVar.b;
                    int i13 = jVar.b;
                    if (i13 == 0 || j3 - jVar.m(i13 - 1) >= 100000) {
                        j jVar2 = zVar.a;
                        j jVar3 = zVar.b;
                        if (jVar3.b == 0 && j3 > 0) {
                            jVar2.c(0L);
                            jVar3.c(0L);
                        }
                        jVar2.c(position);
                        jVar3.c(j3);
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
        int e10 = this.n.e(pVar2, this.g, true);
        if (e10 != -1) {
            int i14 = this.g - e10;
            this.g = i14;
            if (i14 <= 0) {
                this.n.c(this.k + this.e, 1, this.f, 0, null);
                this.e += 20000;
            }
            long length = pVar2.getLength();
            if (this.o == null) {
                if ((this.b & 1) == 0 || !((i7 = this.i) == -1 || i7 == this.f)) {
                    this.o = new f3.t(-9223372036854775807L);
                } else if (this.j >= 20 || i12 == -1) {
                    k kVar = new k(length, this.h, (int) ((i7 * 8000000) / 20000), i7, false, true);
                    this.o = kVar;
                    this.m.d(kVar.f);
                }
                c0 c0Var2 = this.o;
                if (c0Var2 != null) {
                    this.l.h(c0Var2);
                }
            }
            if (i12 == -1) {
                c0 c0Var3 = this.o;
                if (c0Var3 instanceof z) {
                    long j10 = this.k + this.e;
                    ((z) c0Var3).c = j10;
                    this.l.h(c0Var3);
                    this.m.d(j10);
                }
            }
            return i12;
        }
        i12 = -1;
        long length2 = pVar2.getLength();
        if (this.o == null) {
        }
        if (i12 == -1) {
        }
        return i12;
    }

    public final int g(p pVar) {
        boolean z10;
        pVar.o();
        byte[] bArr = this.a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw t0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i7 = (b10 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z10 = this.d) && (i7 < 10 || i7 > 13)) || (!z10 && (i7 < 12 || i7 > 14)))) {
            return z10 ? t[i7] : s[i7];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i7);
        throw t0.a(null, sb2.toString());
    }

    public final boolean h(p pVar) {
        pVar.o();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
            return true;
        }
        pVar.o();
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

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
