package b4;

import b8.od;
import b8.zb;
import d2.u;
import d2.u0;
import d2.v;
import e3.i0;
import e3.q;
import e3.s;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements e3.o {
    public final m a;
    public final v b;
    public final ArrayList c;
    public i0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = n0.b;
    public final y d = new y();

    public h(m mVar, v vVar) {
        v vVar2;
        this.a = mVar;
        if (vVar != null) {
            u a10 = vVar.a();
            a10.r = u0.n("application/x-media3-cues");
            a10.j = vVar.s;
            a10.P = mVar.Y();
            vVar2 = new v(a10);
        } else {
            vVar2 = null;
        }
        this.b = vVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = n0.c;
        this.j = -9223372036854775807L;
    }

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        return true;
    }

    @Override // e3.o
    public final void c(q qVar) {
        zb.p(this.h == 0);
        i0 i02 = qVar.i0(0, 3);
        this.f = i02;
        v vVar = this.b;
        if (vVar != null) {
            i02.g(vVar);
            qVar.L();
            qVar.f(new e3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        int i3 = this.h;
        zb.p((i3 == 0 || i3 == 5) ? false : true);
        this.j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new b4.l(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.F(r20.e, 0, r20.g, r2, new a1.c(r20, 6));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r20.i[r2] = ((b4.g) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        r20.e = g2.n0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = b4.l.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        throw d2.v0.a(r0, "SubtitleParser failed.");
     */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(e3.p pVar, s sVar) {
        int i3;
        int i10 = this.h;
        zb.p((i10 == 0 || i10 == 5) ? false : true);
        if (this.h == 1) {
            int b10 = pVar.getLength() != -1 ? od.b(pVar.getLength()) : 1024;
            if (b10 > this.e.length) {
                this.e = new byte[b10];
            }
            this.g = 0;
            this.h = 2;
        }
        int i11 = this.h;
        ArrayList arrayList = this.c;
        if (i11 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i12 = this.g;
            int read = pVar.read(bArr2, i12, bArr2.length - i12);
            if (read != -1) {
                this.g += read;
            }
            long length = pVar.getLength();
            if (length != -1) {
                i3 = 0;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        if (this.h == 3) {
            if (pVar.skip(pVar.getLength() != -1 ? od.b(pVar.getLength()) : 1024) == -1) {
                long j10 = this.j;
                for (int f10 = j10 == -9223372036854775807L ? i3 : n0.f(this.i, j10, true); f10 < arrayList.size(); f10++) {
                    g((g) arrayList.get(f10));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i3;
    }

    public final void g(g gVar) {
        this.f.getClass();
        byte[] bArr = gVar.b;
        int length = bArr.length;
        y yVar = this.d;
        yVar.getClass();
        yVar.L(bArr.length, bArr);
        this.f.e(length, yVar);
        this.f.d(gVar.a, 1, length, 0, null);
    }

    @Override // e3.o
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }
}
