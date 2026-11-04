package f3;

import androidx.car.app.media.b;
import d2.u0;
import d2.v0;
import e3.b0;
import e3.i0;
import e3.k;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import e3.y;
import e5.u;
import g2.n0;
import g9.g0;
import g9.s1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public i0 m;
    public i0 n;
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

    public a(int i3) {
        this.b = i3;
        n nVar = new n();
        this.c = nVar;
        this.n = nVar;
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.l = qVar;
        i0 i02 = qVar.i0(0, 1);
        this.m = i02;
        this.n = i02;
        qVar.L();
    }

    @Override // e3.o
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
        u uVar = yVar.b;
        long j12 = uVar.b == 0 ? -9223372036854775807L : uVar.j(n0.c(yVar.a, j10));
        this.k = j12;
        if (Math.abs(this.q - j12) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        p pVar2;
        int i3;
        this.m.getClass();
        String str = n0.a;
        if (pVar.getPosition() == 0 && !h(pVar)) {
            throw v0.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z10 = this.d;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i10 = z10 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i11 = z10 ? t[8] : s[7];
            i0 i0Var = this.m;
            d2.u uVar = new d2.u();
            uVar.q = u0.n(str2);
            uVar.r = u0.n(str3);
            uVar.s = i11;
            uVar.J = 1;
            uVar.K = i10;
            f1.w(uVar, i0Var);
        }
        int i12 = 0;
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
                    u uVar2 = yVar.b;
                    int i13 = uVar2.b;
                    if (i13 == 0 || j10 - uVar2.j(i13 - 1) >= 100000) {
                        u uVar3 = yVar.a;
                        u uVar4 = yVar.b;
                        if (uVar4.b == 0 && j10 > 0) {
                            uVar3.c(0L);
                            uVar4.c(0L);
                        }
                        uVar3.c(position);
                        uVar4.c(j10);
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
        int a10 = this.n.a(pVar2, this.g, true);
        if (a10 != -1) {
            int i14 = this.g - a10;
            this.g = i14;
            if (i14 <= 0) {
                this.n.d(this.k + this.e, 1, this.f, 0, null);
                this.e += 20000;
            }
            long length = pVar2.getLength();
            if (this.o == null) {
                if ((this.b & 1) == 0 || !((i3 = this.i) == -1 || i3 == this.f)) {
                    this.o = new t(-9223372036854775807L);
                } else if (this.j >= 20 || i12 == -1) {
                    k kVar = new k(length, this.h, (int) ((i3 * 8000000) / 20000), i3, false, true);
                    this.o = kVar;
                    this.m.b(kVar.f);
                }
                b0 b0Var2 = this.o;
                if (b0Var2 != null) {
                    this.l.f(b0Var2);
                }
            }
            if (i12 == -1) {
                b0 b0Var3 = this.o;
                if (b0Var3 instanceof y) {
                    long j11 = this.k + this.e;
                    ((y) b0Var3).c = j11;
                    this.l.f(b0Var3);
                    this.m.b(j11);
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
        pVar.c(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw v0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i3 = (b10 >> 3) & 15;
        if (i3 >= 0 && i3 <= 15 && (((z10 = this.d) && (i3 < 10 || i3 > 13)) || (!z10 && (i3 < 12 || i3 > 14)))) {
            return z10 ? t[i3] : s[i3];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i3);
        throw v0.a(null, sb2.toString());
    }

    public final boolean h(p pVar) {
        pVar.o();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.c(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.u(bArr.length);
            return true;
        }
        pVar.o();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.c(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.u(bArr3.length);
        return true;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
